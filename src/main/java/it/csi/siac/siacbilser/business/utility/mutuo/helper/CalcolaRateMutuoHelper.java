/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/


package it.csi.siac.siacbilser.business.utility.mutuo.helper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;

import it.csi.siac.siacbilser.business.utility.mutuo.MutuoUtil;
import it.csi.siac.siacbilser.model.mutuo.PeriodoRimborsoMutuo;
import it.csi.siac.siacbilser.model.mutuo.RataMutuo;
import it.csi.siac.siaccommon.util.date.DateUtil;

public class CalcolaRateMutuoHelper {
	
	private CalcolaRateMutuoHelper() {}
	
	public static CalcolaRateMutuoHelper getInstance() {
		return new CalcolaRateMutuoHelper(); 
	}
	
	public List<RataMutuo> calcolaRate(int numeroRata, Date dataScadenzaRata, int numeroRataFinale, BigDecimal importoTotaleRata, BigDecimal debitoIniziale, BigDecimal tasso, 
			PeriodoRimborsoMutuo periodoRimborso, BigDecimal quotaOneri)  { 
		
		int numeroRateAnnue = MutuoUtil.calcNumeroRateAnnue(periodoRimborso);
		if (importoTotaleRata == null) {
			importoTotaleRata = (MutuoUtil.calcImportoTotaleRata(debitoIniziale, tasso, numeroRateAnnue, numeroRataFinale - numeroRata + 1));
		}
		
		List<RataMutuo> elencoRate = new ArrayList<RataMutuo>();
		
		for (int nr = numeroRata; nr <= numeroRataFinale; nr++) {
			RataMutuo rataMutuo = calcRataMutuo(nr, importoTotaleRata, debitoIniziale, tasso, numeroRateAnnue, quotaOneri, 
					DateUtils.addMonths(dataScadenzaRata, (nr - numeroRata) * periodoRimborso.getNumeroMesi()));
			elencoRate.add(rataMutuo);
			debitoIniziale = rataMutuo.getDebitoResiduo();
		}
		
		return elencoRate;
	}

	private RataMutuo calcRataMutuo(int numeroRataPiano, BigDecimal importoTotaleRata, BigDecimal debitoIniziale, BigDecimal tasso, 
			int numeroRateAnnue, BigDecimal quotaOneri, Date dataScadenzaRata) {
		RataMutuo rataMutuo = new RataMutuo();
		
		rataMutuo.setNumeroRataPiano(numeroRataPiano);
		rataMutuo.setNumeroRataAnno(MutuoUtil.calcNumeroRataAnno(dataScadenzaRata, numeroRataPiano, numeroRateAnnue));
		rataMutuo.setAnno(DateUtil.getYear(dataScadenzaRata));
		rataMutuo.setImportoTotale(importoTotaleRata);
		rataMutuo.setImportoQuotaInteressi((MutuoUtil.calcImportoQuotaInteressi(debitoIniziale, tasso, numeroRateAnnue)));
		rataMutuo.setImportoQuotaCapitale(rataMutuo.getImportoTotale().subtract(rataMutuo.getImportoQuotaInteressi()));
		rataMutuo.setDebitoIniziale(debitoIniziale);
		rataMutuo.calcDebitoResiduo();
		rataMutuo.setImportoQuotaOneri(quotaOneri);
		rataMutuo.setDataScadenza(dataScadenzaRata);
		
		return rataMutuo;
	}

	
}
