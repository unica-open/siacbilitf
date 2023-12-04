/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;

/**
 * The Class RicercaQuotaSpesa.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaQuoteDaAssociarePredocumento extends BaseRicercaQuoteDaAssociare {

	//SIAC-6780
		private boolean ricercaPerAssociaPreDoc = Boolean.FALSE;
		private BigDecimal importoPerRicercaQuote = BigDecimal.ZERO;
		private BigDecimal numeroProvvisorioCassaRicercaQuote = BigDecimal.ZERO;
	/**
	 * @return the ricercaPerAssociaPreDoc
	 */
	public boolean isRicercaPerAssociaPreDoc() {
		return ricercaPerAssociaPreDoc;
	}

	/**
	 * @param ricercaPerAssociaPreDoc the ricercaPerAssociaPreDoc to set
	 */
	public void setRicercaPerAssociaPreDoc(boolean ricercaPerAssociaPreDoc) {
		this.ricercaPerAssociaPreDoc = ricercaPerAssociaPreDoc;
	}

	/**
	 * @return the importoPerRicercaQuote
	 */
	public BigDecimal getImportoPerRicercaQuote() {
		return importoPerRicercaQuote;
	}

	/**
	 * @param importoPerRicercaQuote the importoPerRicercaQuote to set
	 */
	public void setImportoPerRicercaQuote(BigDecimal importoPerRicercaQuote) {
		this.importoPerRicercaQuote = importoPerRicercaQuote;
	}

	/**
	 * @return the numeroProvvisorioCassaRicercaQuote
	 */
	public BigDecimal getNumeroProvvisorioCassaRicercaQuote() {
		return numeroProvvisorioCassaRicercaQuote;
	}

	/**
	 * @param numeroProvvisorioCassaRicercaQuote the numeroProvvisorioCassaRicercaQuote to set
	 */
	public void setNumeroProvvisorioCassaRicercaQuote(BigDecimal numeroProvvisorioCassaRicercaQuote) {
		this.numeroProvvisorioCassaRicercaQuote = numeroProvvisorioCassaRicercaQuote;
	}

}
