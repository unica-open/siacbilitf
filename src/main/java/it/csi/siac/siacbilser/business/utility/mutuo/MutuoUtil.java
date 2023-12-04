/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.business.utility.mutuo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

import it.csi.siac.siacbilser.model.mutuo.PeriodoRimborsoMutuo;
import it.csi.siac.siacbilser.model.mutuo.RipartizioneMutuo;
import it.csi.siac.siacbilser.model.mutuo.TipoRipartizioneMutuo;
import it.csi.siac.siaccommon.util.collections.CollectionUtil;
import it.csi.siac.siaccommon.util.collections.Filter;
import it.csi.siac.siaccommon.util.date.DateUtil;
import it.csi.siac.siaccommon.util.number.BigDecimalUtil;
import it.csi.siac.siaccommon.util.number.NumberUtil;

public class MutuoUtil {

	private static final MathContext MC = MathContext.DECIMAL128;
	private static final BigDecimal ONE = BigDecimal.ONE;
	
	private MutuoUtil() {}
	
	public static int calcNumeroRataAnno(Date dataScadenzaRata, int numeroRataPiano, PeriodoRimborsoMutuo periodoRimborsoMutuo) {
		return Math.min(numeroRataPiano, 1 + (int) (DateUtil.getMonth(dataScadenzaRata) - 1) / periodoRimborsoMutuo.getNumeroMesi());
	}

	public static int calcNumeroRataAnno(Date dataScadenzaRata, int numeroRataPiano, int numeroRateAnnue) {
		return Math.min(numeroRataPiano, 1 + (int) (DateUtil.getMonth(dataScadenzaRata) - 1) * numeroRateAnnue / 12);
	}

	private static int calcNumeroRateNellAnno(Date data, PeriodoRimborsoMutuo periodoRimborsoMutuo) {
		return (int) (12 - DateUtil.getMonth(data)) / periodoRimborsoMutuo.getNumeroMesi() + 1;
	}

	public static int calcNumeroRateAnnue(PeriodoRimborsoMutuo periodoRimborsoMutuo) {
		return 12 / periodoRimborsoMutuo.getNumeroMesi();
	}
	
	public static int calcNumeroRate(PeriodoRimborsoMutuo periodoRimborsoMutuo, int durataAnni) {
		return calcNumeroRateAnnue(periodoRimborsoMutuo) * durataAnni;
	}

	public static int calcNumeroRataPiano(Integer anno, Integer numeroRataAnno, Date dataScadenzaPrimaRata, PeriodoRimborsoMutuo periodoRimborso) {
		return calcNumeroRateNellAnno(dataScadenzaPrimaRata, periodoRimborso) + (anno - DateUtil.getYear(dataScadenzaPrimaRata) - 1) * calcNumeroRateAnnue(periodoRimborso) + numeroRataAnno;
	}

	public static BigDecimal calcImportoQuotaInteressi(BigDecimal debitoResiduo, BigDecimal tasso, int numeroRateAnnue) {
		return calcImportoTotaleRataTassoZero(debitoResiduo, numeroRateAnnue).multiply(tasso);
	}

	public static BigDecimal calcImportoTotaleRata(BigDecimal debitoResiduo, BigDecimal tasso, int numeroRateAnnue, int numeroRateResidue) {
		if (tasso.compareTo(BigDecimal.ZERO) == 0) {
			return calcImportoTotaleRataTassoZero(debitoResiduo, numeroRateResidue);
		}
		
		BigDecimal coeffExp = calcCoeffExp(tasso, numeroRateAnnue, numeroRateResidue);
		
		return calcImportoQuotaInteressi(debitoResiduo, tasso, numeroRateAnnue).multiply(coeffExp, MC).divide(coeffExp.subtract(ONE), MC);
	}

	public static BigDecimal calcImportoTotaleRataTassoZero(BigDecimal debitoResiduo, int numeroRateResidue) {
		return debitoResiduo.divide(BigDecimal.valueOf(numeroRateResidue), MC);
	}
	
	private static BigDecimal calcCoeffExp(BigDecimal tasso, int numeroRateAnnue, int numeroRateResidue) {
		return calcImportoTotaleRataTassoZero(tasso, numeroRateAnnue).add(ONE).pow(numeroRateResidue, MC);
	}
	
	/**
	 * Calcola il tasso d'interesse a partire dall'importo della rata, con metodo delle tangenti - https://it.wikipedia.org/wiki/Metodo_delle_tangenti
	 * @param importoTotaleRata Importo della rata
	 * @param debitoIniziale
	 * @param numeroRateAnnue
	 * @param numeroRate
	 * @param decimali Numero di decimali desiderati per il calcolo
	 * @return tasso d'interesse
	 */
	public static BigDecimal calcTassoInteresse(BigDecimal importoTotaleRata, BigDecimal debitoIniziale, PeriodoRimborsoMutuo periodoRimborsoMutuo, int numeroRate) {
		
		final BigDecimal TOLERANCE = BigDecimal.valueOf(1E-6);
		
		int numeroRateAnnue = MutuoUtil.calcNumeroRateAnnue(periodoRimborsoMutuo);
				
		BigDecimal result = importoTotaleRata.multiply(BigDecimal.valueOf(numeroRate)).divide(debitoIniziale, MC).subtract(ONE, MC);
		
		if (result.compareTo(BigDecimal.ZERO) == 0) {
			return BigDecimal.ZERO;
		}
		
		BigDecimal coeffExp = null;
		BigDecimal f = null;
		
		do {
			coeffExp = calcCoeffExp(result, numeroRateAnnue, numeroRate);
			f = f(importoTotaleRata, debitoIniziale, numeroRateAnnue, result, coeffExp);
			result = result.subtract(f.divide(df(importoTotaleRata, debitoIniziale, numeroRateAnnue, numeroRate, result, coeffExp), MC), MC);

			//System.out.println(result); 
			try { Thread.sleep(250); } catch (InterruptedException e) {}
		} while (f.abs(MC).compareTo(TOLERANCE) > 0);

		return result;
	}

	// F(r) = C*r/n*Q/(Q-1)-R;
	private static BigDecimal f(BigDecimal R, BigDecimal C, int n, BigDecimal r, BigDecimal Q) {
		return C.multiply(r, MC).divide(BigDecimal.valueOf(n), MC).multiply(Q, MC)
						.divide(Q.subtract(ONE, MC), MC)
						.subtract(R, MC);
	}
	
	// dF(r)/dr = CQ(nQ+rQ-n-Nr-r)/(n(n+r)(Q-1)^2)  ->  CQ[(Q-1)n+(Q-N-1)r]/...
	private static BigDecimal df(BigDecimal R, BigDecimal C, int n, int N, BigDecimal r, BigDecimal Q) {
		return Q.subtract(ONE).multiply(BigDecimal.valueOf(n), MC)
				 .add(Q.subtract(BigDecimal.valueOf(N)).subtract(ONE).multiply(r, MC))
				 .multiply(C, MC).multiply(Q, MC)
				 .divide(Q.subtract(ONE).pow(2, MC).multiply(BigDecimal.valueOf(n).multiply(BigDecimal.valueOf(n).add(r), MC), MC), MC);
	}
	
	
	public static List<RipartizioneMutuo> getRipartizioneMutuoListFiltered (List<RipartizioneMutuo> listRipartizioneMutuo, TipoRipartizioneMutuo tipoRipartizioneMutuo){
		return CollectionUtil.filter(listRipartizioneMutuo, new Filter<RipartizioneMutuo>() {
			@Override
			public boolean isAcceptable(RipartizioneMutuo source) {
				return tipoRipartizioneMutuo.equals(source.getTipoRipartizioneMutuo());
			};});
	}
	
	public static BigDecimal calcPercentualeRipartizione(TipoRipartizioneMutuo tipoRipartizioneMutuo, BigDecimal ripartizioneImporto, BigDecimal sommaMutuata) {
		if (tipoRipartizioneMutuo.isCapitale()) {
			return new BigDecimal(100);
		}
//		return  BigDecimalUtil.roundHalfUp(ripartizioneImporto.multiply(BigDecimal.valueOf(100), MC).divide(sommaMutuata),7);
		return  ripartizioneImporto.multiply(BigDecimal.valueOf(100), MC).divide(sommaMutuata,7,RoundingMode.HALF_UP);
	}	
}

