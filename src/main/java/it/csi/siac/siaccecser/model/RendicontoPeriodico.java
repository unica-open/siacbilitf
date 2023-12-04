/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.14
 */

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class RendicontoPeriodico extends EntitaEnte {

	private static final long serialVersionUID = -8721642719294522218L;
	
	/**
	 * &Eacute; un numero annualizzato che viene assegnato al rendiconto quando viene stampato in definitivo.
	 */
	private Long numeroRendiconto;
	private Date dataApprovazione;
	private BigDecimal importoContoCorrente;
	private BigDecimal importoContanti;
	/**
	 * @return the numeroRendiconto
	 */
	public Long getNumeroRendiconto() {
		return numeroRendiconto;
	}
	/**
	 * @param numeroRendiconto the numeroRendiconto to set
	 */
	public void setNumeroRendiconto(Long numeroRendiconto) {
		this.numeroRendiconto = numeroRendiconto;
	}
	/**
	 * @return the dataApprovazione
	 */
	public Date getDataApprovazione() {
		return dataApprovazione;
	}
	/**
	 * @param dataApprovazione the dataApprovazione to set
	 */
	public void setDataApprovazione(Date dataApprovazione) {
		this.dataApprovazione = dataApprovazione;
	}
	/**
	 * @return the importoContoCorrente
	 */
	public BigDecimal getImportoContoCorrente() {
		return importoContoCorrente;
	}
	/**
	 * @return the importoContoCorrente, not null
	 */
	public BigDecimal getImportoContoCorrenteNotNull() {
		return importoContoCorrente == null ? BigDecimal.ZERO : importoContoCorrente;
	}
	/**
	 * @param importoContoCorrente the importoContoCorrente to set
	 */
	public void setImportoContoCorrente(BigDecimal importoContoCorrente) {
		this.importoContoCorrente = importoContoCorrente;
	}
	/**
	 * @return the importoContanti
	 */
	public BigDecimal getImportoContanti() {
		return importoContanti;
	}
	/**
	 * @return the importoContanti, not null
	 */
	public BigDecimal getImportoContantiNotNull() {
		return importoContanti == null ? BigDecimal.ZERO : importoContanti;
	}
	/**
	 * @param importoContanti the importoContanti to set
	 */
	public void setImportoContanti(BigDecimal importoContanti) {
		this.importoContanti = importoContanti;
	}
	
}