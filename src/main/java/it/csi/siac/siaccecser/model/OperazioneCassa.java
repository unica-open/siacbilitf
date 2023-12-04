/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.13
 */

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class OperazioneCassa extends EntitaEnte {

	private static final long serialVersionUID = -1255893040563363315L;
	
	/**
	 * Assegnato dal sistema all'inserimento dell'operazione, il numero &eacute; annualizzato.
	 */
	private Integer numeroOperazione;
	private Date dataOperazione;
	private BigDecimal importo;
	private String note;
	private ModalitaPagamentoCassa modalitaPagamentoCassa;
	private CassaEconomale cassaEconomale;
	private TipoOperazioneCassa tipoOperazioneCassa;
	private AttoAmministrativo attoAmministrativo;
	private StatoOperativoOperazioneCassa statoOperativoOperazioneCassa;
	private Bilancio bilancio;
	/**
	 * @return the numeroOperazione
	 */
	public Integer getNumeroOperazione() {
		return numeroOperazione;
	}
	/**
	 * @param numeroOperazione the numeroOperazione to set
	 */
	public void setNumeroOperazione(Integer numeroOperazione) {
		this.numeroOperazione = numeroOperazione;
	}
	/**
	 * @return the dataOperazione
	 */
	public Date getDataOperazione() {
		return dataOperazione;
	}
	/**
	 * @param dataOperazione the dataOperazione to set
	 */
	public void setDataOperazione(Date dataOperazione) {
		this.dataOperazione = dataOperazione;
	}
	/**
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}
	/**
	 * @return the importo, not null
	 */
	public BigDecimal getImportoNotNull() {
		return importo == null ? BigDecimal.ZERO : importo;
	}
	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}
	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * @return the modalitaPagamentoCassa
	 */
	public ModalitaPagamentoCassa getModalitaPagamentoCassa() {
		return modalitaPagamentoCassa;
	}
	/**
	 * @param modalitaPagamentoCassa the modalitaPagamentoCassa to set
	 */
	public void setModalitaPagamentoCassa(ModalitaPagamentoCassa modalitaPagamentoCassa) {
		this.modalitaPagamentoCassa = modalitaPagamentoCassa;
	}
	/**
	 * @return the cassaEconomale
	 */
	public CassaEconomale getCassaEconomale() {
		return cassaEconomale;
	}
	/**
	 * @param cassaEconomale the cassaEconomale to set
	 */
	public void setCassaEconomale(CassaEconomale cassaEconomale) {
		this.cassaEconomale = cassaEconomale;
	}
	/**
	 * @return the tipoOperazioneCassa
	 */
	public TipoOperazioneCassa getTipoOperazioneCassa() {
		return tipoOperazioneCassa;
	}
	/**
	 * @param tipoOperazioneCassa the tipoOperazioneCassa to set
	 */
	public void setTipoOperazioneCassa(TipoOperazioneCassa tipoOperazioneCassa) {
		this.tipoOperazioneCassa = tipoOperazioneCassa;
	}
	/**
	 * @return the attoAmministrativo
	 */
	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}
	/**
	 * @param attoAmministrativo the attoAmministrativo to set
	 */
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}
	/**
	 * @return the statoOperativoOperazioneCassa
	 */
	public StatoOperativoOperazioneCassa getStatoOperativoOperazioneCassa() {
		return statoOperativoOperazioneCassa;
	}
	/**
	 * @param statoOperativoOperazioneCassa the statoOperativoOperazioneCassa to set
	 */
	public void setStatoOperativoOperazioneCassa(StatoOperativoOperazioneCassa statoOperativoOperazioneCassa) {
		this.statoOperativoOperazioneCassa = statoOperativoOperazioneCassa;
	}
	
	
	
	
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	
	
}