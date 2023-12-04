/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import it.csi.siac.siacbilser.model.Ambito;
import it.csi.siac.siaccorser.model.EntitaEnte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

/**

 * @version 1.0
 * @created 14-apr-2015
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class MovimentoEP extends EntitaEnte{


	/**
	 * 
	 */
	private static final long serialVersionUID = 4955128507162908428L;
	
	
	private Integer numero;
	private String descrizione;
//	private String note;
	
	private PrimaNota primaNota;
	private CausaleEP causaleEP;
	private RegistrazioneMovFin registrazioneMovFin;
	private List<MovimentoDettaglio> listaMovimentoDettaglio = new ArrayList<MovimentoDettaglio>();
	
	// Lotto N
	private Ambito ambito;
	
	
	
	
	
	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
//	 * @return the note
//	 */
//	public String getNote() {
//		return note;
//	}
//	/**
//	 * @param note the note to set
//	 */
//	public void setNote(String note) {
//		this.note = note;
//	}
	
	/**
	 * @return the causaleEP
	 */
	public CausaleEP getCausaleEP() {
		return causaleEP;
	}
	/**
	 * @return the primaNota
	 */
	public PrimaNota getPrimaNota() {
		return primaNota;
	}
	/**
	 * @param primaNota the primaNota to set
	 */
	public void setPrimaNota(PrimaNota primaNota) {
		this.primaNota = primaNota;
	}
	/**
	 * @param causaleEP the causaleEP to set
	 */
	public void setCausaleEP(CausaleEP causaleEP) {
		this.causaleEP = causaleEP;
	}
	
	/**
	 * @return the registrazioneMovFin
	 */
	public RegistrazioneMovFin getRegistrazioneMovFin() {
		return registrazioneMovFin;
	}
	/**
	 * @param registrazioneMovFin the registrazioneMovFin to set
	 */
	public void setRegistrazioneMovFin(RegistrazioneMovFin registrazioneMovFin) {
		this.registrazioneMovFin = registrazioneMovFin;
	}
	/**
	 * @return the listaMovimentoDettaglio
	 */
	public List<MovimentoDettaglio> getListaMovimentoDettaglio() {
		return listaMovimentoDettaglio;
	}
	/**
	 * @param listaMovimentoDettaglio the listaMovimentoDettaglio to set
	 */
	public void setListaMovimentoDettaglio(List<MovimentoDettaglio> listaMovimentoDettaglio) {
		this.listaMovimentoDettaglio = listaMovimentoDettaglio != null ? listaMovimentoDettaglio : new ArrayList<MovimentoDettaglio>();
	}
	
	/**
	 * @return the dataCreazioneMovimentoEP
	 */
	public Date getDataCreazioneMovimentoEP() {
		return getDataCreazione();
	}
	
	/**
	 * @param dataCreazioneMovimentoEP the dataCreazioneMovimentoEP to set
	 */
	public void setDataCreazioneMovimentoEP(Date dataCreazioneMovimentoEP) {
		setDataCreazione(dataCreazioneMovimentoEP);
	}
	
	/**
	 * @return the dataFineValiditaMovimentoEP
	 */
	public Date getDataFineValiditaMovimentoEP() {
		return getDataFineValidita();
	}
	
	/**
	 * @param dataFineValiditaMovimentoEP the dataFineValiditaMovimentoEP to set
	 */
	public void setDataFineValiditaMovimentoEP(Date dataFineValiditaMovimentoEP) {
		setDataFineValidita(dataFineValiditaMovimentoEP);
	}
	
	/**
	 * @return the dataInizioValiditaMovimentoEP
	 */
	public Date getDataInizioValiditaMovimentoEP() {
		return getDataInizioValidita();
	}
	
	/**
	 * @param dataInizioValiditaMovimentoEP the dataInizioValiditaMovimentoEP to set
	 */
	public void setDataInizioValiditaMovimentoEP(Date dataInizioValiditaMovimentoEP) {
		setDataInizioValidita(dataInizioValiditaMovimentoEP);
	}
	
	/**
	 * @return the dataModificaMovimentoEP
	 */
	public Date getDataModificaMovimentoEP() {
		return getDataModifica();
	}
	
	/**
	 * @param dataModificaMovimentoEP the dataModificaMovimentoEP to set
	 */
	public void setDataModificaMovimentoEP(Date dataModificaMovimentoEP) {
		setDataModifica(dataModificaMovimentoEP);
	}
	
	/**
	 * @return the dataCancellazioneMovimentoEP
	 */
	public Date getDataCancellazioneMovimentoEP() {
		return getDataCancellazione();
	}
	
	/**
	 * @param dataCancellazioneMovimentoEP the dataCancellazioneMovimentoEP to set
	 */
	public void setDataCancellazioneMovimentoEP(Date dataCancellazioneMovimentoEP) {
		setDataCancellazione(dataCancellazioneMovimentoEP);
	}
	/**
	 * @return the ambito
	 */
	public Ambito getAmbito() {
		return ambito;
	}
	/**
	 * @param ambito the ambito to set
	 */
	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}
	
}