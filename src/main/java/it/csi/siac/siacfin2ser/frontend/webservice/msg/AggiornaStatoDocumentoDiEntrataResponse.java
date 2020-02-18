/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacfin2ser.model.StatoOperativoDocumento;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaStatoDocumentoDiEntrataResponse extends ServiceResponse {

	private DocumentoEntrata documentoEntrata;

	private StatoOperativoDocumento statoOperativoDocumentoPrecedente;
	private StatoOperativoDocumento statoOperativoDocumentoNuovo;
	
	private Boolean sommaCongruente;
	private Boolean tutteLeQuoteSonoAssociateAdAccertamentoOSubAccertamento;
	
	private BigDecimal totaleQuoteENoteCreditoMenoImportiDaDedurre;
	
	//Elenco delle registrazioni che sono state inserite (nuove) o reinserite in seguito a precedente annullamento (aggiornate)
	private List<RegistrazioneMovFin> registrazioniMovFinInserite = new ArrayList<RegistrazioneMovFin>();
	private List<RegistrazioneMovFin> registrazioniMovGSAInserite = new ArrayList<RegistrazioneMovFin>();
	private List<RegistrazioneMovFin> registrazioniMovFinNNcdInserite = new ArrayList<RegistrazioneMovFin>();
	private List<RegistrazioneMovFin> registrazioniMovFinNcdGSAInserite = new ArrayList<RegistrazioneMovFin>();
	
	//Elenco delle registrazioni che non hanno subito annullamento e reinserimento (NON aggiornate)
	private List<RegistrazioneMovFin> registrazioniMovFinPrecedenti = new ArrayList<RegistrazioneMovFin>();
	private List<RegistrazioneMovFin> registrazioniMovGSAPrecedenti = new ArrayList<RegistrazioneMovFin>();
	
	
	private Boolean condizioneDiAttivazioneGENSoddisfatta;
	
	private boolean primaNotaPrecedenteAnnullata;
	
	/**
	 * @return the documentoEntrata
	 */
	public DocumentoEntrata getDocumentoEntrata() {
		return documentoEntrata;
	}

	/**
	 * @param documentoEntrata the documentoEntrata to set
	 */
	public void setDocumentoEntrata(DocumentoEntrata documentoEntrata) {
		this.documentoEntrata = documentoEntrata;
	}

	/**
	 * @return the statoOperativoDocumentoPrecedente
	 */
	public StatoOperativoDocumento getStatoOperativoDocumentoPrecedente() {
		return statoOperativoDocumentoPrecedente;
	}

	/**
	 * @param statoOperativoDocumentoPrecedente the statoOperativoDocumentoPrecedente to set
	 */
	public void setStatoOperativoDocumentoPrecedente(StatoOperativoDocumento statoOperativoDocumentoPrecedente) {
		this.statoOperativoDocumentoPrecedente = statoOperativoDocumentoPrecedente;
	}

	/**
	 * @return the statoOperativoDocumentoNuovo
	 */
	public StatoOperativoDocumento getStatoOperativoDocumentoNuovo() {
		return statoOperativoDocumentoNuovo;
	}

	/**
	 * @param statoOperativoDocumentoNuovo the statoOperativoDocumentoNuovo to set
	 */
	public void setStatoOperativoDocumentoNuovo(StatoOperativoDocumento statoOperativoDocumentoNuovo) {
		this.statoOperativoDocumentoNuovo = statoOperativoDocumentoNuovo;
	}

	/**
	 * @return the sommaCongruente
	 */
	public Boolean getSommaCongruente() {
		return sommaCongruente;
	}

	/**
	 * @param sommaCongruente the sommaCongruente to set
	 */
	public void setSommaCongruente(Boolean sommaCongruente) {
		this.sommaCongruente = sommaCongruente;
	}

	/**
	 * @return the tutteLeQuoteSonoAssociateAdAccertamentoOSubAccertamento
	 */
	public Boolean getTutteLeQuoteSonoAssociateAdAccertamentoOSubAccertamento() {
		return tutteLeQuoteSonoAssociateAdAccertamentoOSubAccertamento;
	}

	/**
	 * @param tutteLeQuoteSonoAssociateAdAccertamentoOSubAccertamento the tutteLeQuoteSonoAssociateAdAccertamentoOSubAccertamento to set
	 */
	public void setTutteLeQuoteSonoAssociateAdAccertamentoOSubAccertamento(Boolean tutteLeQuoteSonoAssociateAdAccertamentoOSubAccertamento) {
		this.tutteLeQuoteSonoAssociateAdAccertamentoOSubAccertamento = tutteLeQuoteSonoAssociateAdAccertamentoOSubAccertamento;
	}

	/**
	 * @return the totaleQuoteENoteCreditoMenoImportiDaDedurre
	 */
	public BigDecimal getTotaleQuoteENoteCreditoMenoImportiDaDedurre() {
		return totaleQuoteENoteCreditoMenoImportiDaDedurre;
	}

	/**
	 * @param totaleQuoteENoteCreditoMenoImportiDaDedurre the totaleQuoteENoteCreditoMenoImportiDaDedurre to set
	 */
	public void setTotaleQuoteENoteCreditoMenoImportiDaDedurre(BigDecimal totaleQuoteENoteCreditoMenoImportiDaDedurre) {
		this.totaleQuoteENoteCreditoMenoImportiDaDedurre = totaleQuoteENoteCreditoMenoImportiDaDedurre;
	}

	/**
	 * Sets the registrazioni mov fin inserite.
	 *
	 * @param registrazioniMovFinInserite the new registrazioni mov fin inserite
	 */
	public void setRegistrazioniMovFinInserite(List<RegistrazioneMovFin> registrazioniMovFinInserite) {
		this.registrazioniMovFinInserite = registrazioniMovFinInserite != null ? registrazioniMovFinInserite : new ArrayList<RegistrazioneMovFin>();
	}

	/**
	 * @return the registrazioniMovFinInserite
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFinInserite() {
		return registrazioniMovFinInserite;
	}

	/**
	 * @return the registrazioniMovGSAInserite
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovGSAInserite() {
		return registrazioniMovGSAInserite;
	}

	/**
	 * @param registrazioniMovGSAInserite the registrazioniMovGSAInserite to set
	 */
	public void setRegistrazioniMovGSAInserite(List<RegistrazioneMovFin> registrazioniMovGSAInserite) {
		this.registrazioniMovGSAInserite = registrazioniMovGSAInserite != null ? registrazioniMovGSAInserite : new ArrayList<RegistrazioneMovFin>();
	}
	
	/**
	 * @return the registrazioniMovFinNNcdInserite
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFinNNcdInserite() {
		return registrazioniMovFinNNcdInserite;
	}

	/**
	 * @param registrazioniMovFinNNcdInserite the registrazioniMovFinNNcdInserite to set
	 */
	public void setRegistrazioniMovFinNNcdInserite(List<RegistrazioneMovFin> registrazioniMovFinNNcdInserite) {
		this.registrazioniMovFinNNcdInserite = registrazioniMovFinNNcdInserite != null ? registrazioniMovFinNNcdInserite : new ArrayList<RegistrazioneMovFin>();
	}
	
	/**
	 * Gets the registrazioni mov fin n ncd inserite.
	 *
	 * @return the registrazioniMovFinNNcdInserite
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFinNcdGSAInserite() {
		return registrazioniMovFinNcdGSAInserite;
	}

	/**
	 * Sets the registrazioni mov fin n ncd inserite.
	 *
	 * @param registrazioniMovFinNcdGSAInserite the registrazioniMovFinNNcdInserite to set
	 */
	public void setRegistrazioniMovFinNcdGSAInserite(List<RegistrazioneMovFin> registrazioniMovFinNcdGSAInserite) {
		this.registrazioniMovFinNcdGSAInserite = registrazioniMovFinNcdGSAInserite != null ? registrazioniMovFinNcdGSAInserite : new ArrayList<RegistrazioneMovFin>();
	}
	
	/**
	 * @return the registrazioniMovFinPrecedenti
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFinPrecedenti() {
		return registrazioniMovFinPrecedenti;
	}

	/**
	 * @param registrazioniMovFinPrecedenti the registrazioniMovFinPrecedenti to set
	 */
	public void setRegistrazioniMovFinPrecedenti(List<RegistrazioneMovFin> registrazioniMovFINPrecedenti) {
		this.registrazioniMovFinPrecedenti = registrazioniMovFinPrecedenti != null ? registrazioniMovFinPrecedenti : new ArrayList<RegistrazioneMovFin>();
	}


	/**
	 * @return the registrazioniMovGSAPrecedenti
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovGSAPrecedenti() {
		return registrazioniMovGSAPrecedenti;
	}

	/**
	 * @param registrazioniMovGSAPrecedenti the registrazioniMovGSAPrecedenti to set
	 */
	public void setRegistrazioniMovGSAPrecedenti(List<RegistrazioneMovFin> registrazioniMovGSAPrecedenti) {
		this.registrazioniMovGSAPrecedenti = registrazioniMovGSAPrecedenti != null ? registrazioniMovGSAPrecedenti : new ArrayList<RegistrazioneMovFin>();
	}

	/**
	 * @return the condizioneDiAttivazioneGENSoddisfatta
	 */
	public Boolean getCondizioneDiAttivazioneGENSoddisfatta() {
		return condizioneDiAttivazioneGENSoddisfatta;
	}
	
	/**
	 * Checks if is condizione di attivazione gen soddisfatta.
	 *
	 * @return true, if is condizione di attivazione gen soddisfatta
	 */
	public boolean isCondizioneDiAttivazioneGENSoddisfatta() {
		return Boolean.TRUE.equals(condizioneDiAttivazioneGENSoddisfatta);
	}
	
	/**
	 * @param condizioneDiAttivazioneGENSoddisfatta the condizioneDiAttivazioneGENSoddisfatta to set
	 */
	public void setCondizioneDiAttivazioneGENSoddisfatta(Boolean condizioneDiAttivazioneGENSoddisfatta) {
		this.condizioneDiAttivazioneGENSoddisfatta = condizioneDiAttivazioneGENSoddisfatta;
	}
	

	/**
	 * Ottiene le registrazioni FIN per cui e' necessario inserire la prima nota.
	 * Nel caso in cui non sia necessario inserire la prima nota (nessuna regisrazione inserita) restituisce una lista vuota.
	 * 
	 * @return lista delle registrazioni
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFinPrimaNota(){
		final List<RegistrazioneMovFin> result = new ArrayList<RegistrazioneMovFin>();
		if(!registrazioniMovFinInserite.isEmpty()|| primaNotaPrecedenteAnnullata){
			result.addAll(registrazioniMovFinInserite);
			result.addAll(registrazioniMovFinPrecedenti);
		}
		return result;
	}
	
	/**
	 * Ottiene le registrazioni GSA per cui e' necessario inserire la prima nota.
	 * Nel caso in cui non sia necessario inserire la prima nota (nessuna regisrazione inserita) restituisce una lista vuota.
	 * 
	 * @return lista delle registrazioni
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovGSAPrimaNota(){
		final List<RegistrazioneMovFin> result = new ArrayList<RegistrazioneMovFin>();
		if(!registrazioniMovGSAInserite.isEmpty()|| primaNotaPrecedenteAnnullata){
			result.addAll(registrazioniMovGSAInserite);
			result.addAll(registrazioniMovGSAPrecedenti);
		}
		return result;
	}
	
	public void setPrimaNotaPrecedenteAnnullata(boolean primaNotaPrecedenteAnnullata) {
		this.primaNotaPrecedenteAnnullata = primaNotaPrecedenteAnnullata;
	}

	/**
	 * @return the primaNotaPrecedenteAnnullata
	 */
	public boolean isPrimaNotaPrecedenteAnnullata() {
		return primaNotaPrecedenteAnnullata;
	}

}
