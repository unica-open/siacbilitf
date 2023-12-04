/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siacbilser.business.utility.BilUtilities;
import it.csi.siac.siaccorser.model.EntitaEnte;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class AliquotaSubdocumentoIva extends EntitaEnte {
	
	// siac_t_ivamov
	
	private static final long serialVersionUID = -6913577773451657219L;
	
	private BigDecimal imponibile = BigDecimal.ZERO;
	private BigDecimal imposta = BigDecimal.ZERO;
	private BigDecimal totale = BigDecimal.ZERO;
	
	// Derivato
	private BigDecimal impostaDetraibile = BigDecimal.ZERO;
	private BigDecimal impostaIndetraibile = BigDecimal.ZERO;
	
	private AliquotaIva aliquotaIva;
	

	/**
	 * @return the imponibile
	 */
	public BigDecimal getImponibile() {
		return imponibile;
	}

	/**
	 * @param imponibile the imponibile to set
	 */
	public void setImponibile(BigDecimal imponibile) {
		this.imponibile = imponibile != null ? imponibile : BigDecimal.ZERO;
	}

	/**
	 * @return the imposta
	 */
	public BigDecimal getImposta() {
		return imposta;
	}

	/**
	 * @param imposta the imposta to set
	 */
	public void setImposta(BigDecimal imposta) {
		this.imposta = imposta != null ? imposta : BigDecimal.ZERO;
	}

	/**
	 * @return the totale
	 */
	public BigDecimal getTotale() {
		return totale;
	}

	/**
	 * @param totale the totale to set
	 */
	public void setTotale(BigDecimal totale) {
		this.totale = totale != null ? totale : BigDecimal.ZERO;
	}

	/**
	 * @return the impostaDetraibile
	 */
	public BigDecimal getImpostaDetraibile() {
		if(impostaDetraibile != null && !impostaDetraibile.equals(BigDecimal.ZERO)){
			return impostaDetraibile;
		}
		return getImposta().subtract(getImpostaIndetraibile());
	}
	

	/**
	 * @param impostaDetraibile the impostaDetraibile to set
	 */
	public void setImpostaDetraibile(BigDecimal impostaDetraibile) {
		this.impostaDetraibile = impostaDetraibile;
	}

	/**
	 * @return the impostaIndetraibile
	 */
	public BigDecimal getImpostaIndetraibile() {
		if(impostaIndetraibile != null && !impostaIndetraibile.equals(BigDecimal.ZERO)){
			return impostaIndetraibile;
		}
		final BigDecimal percentualeIndetraibile = getAliquotaIva() != null ? getAliquotaIva().getPercentualeIndetraibilita() : BigDecimal.ZERO;
		return getImposta().multiply(percentualeIndetraibile).divide(BilUtilities.BIG_DECIMAL_ONE_HUNDRED).setScale(2, RoundingMode.HALF_DOWN);
	}
	

	/**
	 * @param impostaIndetraibile the impostaIndetraibile to set
	 */
	public void setImpostaIndetraibile(BigDecimal impostaIndetraibile) {
		this.impostaIndetraibile = impostaIndetraibile;
	}

	/**
	 * @return the aliquotaIva
	 */
	public AliquotaIva getAliquotaIva() {
		return aliquotaIva;
	}

	/**
	 * @param aliquotaIva the aliquotaIva to set
	 */
	public void setAliquotaIva(AliquotaIva aliquotaIva) {
		this.aliquotaIva = aliquotaIva;
	}

	
	

	
	
	
	
	
}
