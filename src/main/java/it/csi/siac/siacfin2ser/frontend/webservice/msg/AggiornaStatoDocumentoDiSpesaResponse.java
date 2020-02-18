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
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacfin2ser.model.RegistroComunicazioniPCC;
import it.csi.siac.siacfin2ser.model.StatoOperativoDocumento;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;

/**
 * The Class AggiornaStatoDocumentoDiSpesaResponse.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaStatoDocumentoDiSpesaResponse extends ServiceResponse {

	private DocumentoSpesa documentoSpesa;
	
	private StatoOperativoDocumento statoOperativoDocumentoPrecedente;
	private StatoOperativoDocumento statoOperativoDocumentoNuovo;
	
	private Boolean sommaCongruente;
	private Boolean tutteLeQuoteSonoAssociateAImpegnoOSubImpegno;
	
	private BigDecimal totaleQuoteENoteCreditoMenoImportiDaDedurre;

	//Elenco delle registrazioni che sono state inserite (nuove) o reinserite in seguito a precedente annullamento (aggiornate)
	private List<RegistrazioneMovFin> registrazioniMovFinInserite = new ArrayList<RegistrazioneMovFin>();
	private List<RegistrazioneMovFin> registrazioniMovCECInserite = new ArrayList<RegistrazioneMovFin>();
	private List<RegistrazioneMovFin> registrazioniMovGSAInserite = new ArrayList<RegistrazioneMovFin>();
	private List<RegistrazioneMovFin> registrazioniMovFinNNcdInserite = new ArrayList<RegistrazioneMovFin>();
	private List<RegistrazioneMovFin> registrazioniMovFinNcdGSAInserite = new ArrayList<RegistrazioneMovFin>();
	private List<RegistrazioneMovFin> registrazioniMovFinNcdCECInserite = new ArrayList<RegistrazioneMovFin>();
	
	//Elenco delle registrazioni che non hanno subito annullamento e reinserimento (NON aggiornate)
	private List<RegistrazioneMovFin> registrazioniMovFinPrecedenti = new ArrayList<RegistrazioneMovFin>();
	private List<RegistrazioneMovFin> registrazioniMovCECPrecedenti = new ArrayList<RegistrazioneMovFin>();
	private List<RegistrazioneMovFin> registrazioniMovGSAPrecedenti = new ArrayList<RegistrazioneMovFin>();
	
	
	private List<RegistroComunicazioniPCC> registrazioniComunicazioniPCC = new ArrayList<RegistroComunicazioniPCC>();
	
	private Boolean condizioneDiAttivazioneGENSoddisfatta;
	private Boolean condizioneDiAttivazionePCCSoddisfatta;

	private boolean primaNotaPrecedenteAnnullata;

	/**
	 * Gets the documento spesa.
	 *
	 * @return the documentoSpesa
	 */
	public DocumentoSpesa getDocumentoSpesa() {
		return documentoSpesa;
	}

	/**
	 * Sets the documento spesa.
	 *
	 * @param documentoSpesa the documentoSpesa to set
	 */
	public void setDocumentoSpesa(DocumentoSpesa documentoSpesa) {
		this.documentoSpesa = documentoSpesa;
	}

	/**
	 * Gets the somma congruente.
	 *
	 * @return the sommaCongruente
	 */
	public Boolean getSommaCongruente() {
		return sommaCongruente;
	}

	/**
	 * Sets the somma congruente.
	 *
	 * @param sommaCongruente the sommaCongruente to set
	 */
	public void setSommaCongruente(Boolean sommaCongruente) {
		this.sommaCongruente = sommaCongruente;
	}

	/**
	 * Gets the totale quote e note credito meno importi da dedurre.
	 *
	 * @return the totaleQuoteENoteCreditoMenoImportiDaDedurre
	 */
	public BigDecimal getTotaleQuoteENoteCreditoMenoImportiDaDedurre() {
		return totaleQuoteENoteCreditoMenoImportiDaDedurre;
	}

	/**
	 * Sets the totale quote e note credito meno importi da dedurre.
	 *
	 * @param totaleQuoteENoteCreditoMenoImportiDaDedurre the totaleQuoteENoteCreditoMenoImportiDaDedurre to set
	 */
	public void setTotaleQuoteENoteCreditoMenoImportiDaDedurre(BigDecimal totaleQuoteENoteCreditoMenoImportiDaDedurre) {
		this.totaleQuoteENoteCreditoMenoImportiDaDedurre = totaleQuoteENoteCreditoMenoImportiDaDedurre;
	}

	/**
	 * Sets the stato operativo documento attuale.
	 *
	 * @param statoOperativoDocumentoAttuale the new stato operativo documento attuale
	 */
	public void setStatoOperativoDocumentoPrecedente(StatoOperativoDocumento statoOperativoDocumentoAttuale) {
		this.statoOperativoDocumentoPrecedente = statoOperativoDocumentoAttuale;
	}

	/**
	 * Sets the stato operativo documento nuovo.
	 *
	 * @param statoOperativoDocumentoNuovo the new stato operativo documento nuovo
	 */
	public void setStatoOperativoDocumentoNuovo(StatoOperativoDocumento statoOperativoDocumentoNuovo) {
		this.statoOperativoDocumentoNuovo = statoOperativoDocumentoNuovo;
	}

	/**
	 * Gets the stato operativo documento attuale.
	 *
	 * @return the statoOperativoDocumentoAttuale
	 */
	public StatoOperativoDocumento getStatoOperativoDocumentoPrecedente() {
		return statoOperativoDocumentoPrecedente;
	}

	/**
	 * Gets the stato operativo documento nuovo.
	 *
	 * @return the statoOperativoDocumentoNuovo
	 */
	public StatoOperativoDocumento getStatoOperativoDocumentoNuovo() {
		return statoOperativoDocumentoNuovo;
	}

	/**
	 * Sets the tutte le quote sono associate a impegno o sub impegno.
	 *
	 * @param tutteLeQuoteSonoAssociateAImpegnoOSubImpegno the new tutte le quote sono associate a impegno o sub impegno
	 */
	public void setTutteLeQuoteSonoAssociateAImpegnoOSubImpegno(Boolean tutteLeQuoteSonoAssociateAImpegnoOSubImpegno) {
		this.tutteLeQuoteSonoAssociateAImpegnoOSubImpegno = tutteLeQuoteSonoAssociateAImpegnoOSubImpegno;
		
	}

	/**
	 * Gets the tutte le quote sono associate a impegno o sub impegno.
	 *
	 * @return the tutteLeQuoteSonoAssociateAImpegnoOSubImpegno
	 */
	public Boolean getTutteLeQuoteSonoAssociateAImpegnoOSubImpegno() {
		return tutteLeQuoteSonoAssociateAImpegnoOSubImpegno;
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
	 * Gets the registrazioni mov fin inserite.
	 *
	 * @return the registrazioniMovFinInserite
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFinInserite() {
		return registrazioniMovFinInserite;
	}
	
	/**
	 * Gets the registrazioni mov cec inserite.
	 *
	 * @return the registrazioniMovCECInserite
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovCECInserite() {
		return registrazioniMovCECInserite;
	}

	/**
	 * Sets the registrazioni mov cec inserite.
	 *
	 * @param registrazioniMovCECInserite the registrazioniMovCECInserite to set
	 */
	public void setRegistrazioniMovCECInserite(List<RegistrazioneMovFin> registrazioniMovCECInserite) {
		this.registrazioniMovCECInserite = registrazioniMovCECInserite != null ? registrazioniMovCECInserite : new ArrayList<RegistrazioneMovFin>();
	}

	/**
	 * Gets the registrazioni mov gsa inserite.
	 *
	 * @return the registrazioniMovGSAInserite
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovGSAInserite() {
		return registrazioniMovGSAInserite;
	}

	/**
	 * Sets the registrazioni mov gsa inserite.
	 *
	 * @param registrazioniMovGSAInserite the registrazioniMovGSAInserite to set
	 */
	public void setRegistrazioniMovGSAInserite(List<RegistrazioneMovFin> registrazioniMovGSAInserite) {
		this.registrazioniMovGSAInserite = registrazioniMovGSAInserite != null ? registrazioniMovGSAInserite : new ArrayList<RegistrazioneMovFin>();
	}

	/**
	 * Gets the registrazioni mov fin n ncd inserite.
	 *
	 * @return the registrazioniMovFinNNcdInserite
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFinNNcdInserite() {
		return registrazioniMovFinNNcdInserite;
	}

	/**
	 * Sets the registrazioni mov fin n ncd inserite.
	 *
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
	 * @return the registrazioniMovFinNcdCECInserite
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFinNcdCECInserite() {
		return registrazioniMovFinNcdCECInserite;
	}

	/**
	 * @param registrazioniMovFinNcdCECInserite the registrazioniMovFinNcdCECInserite to set
	 */
	public void setRegistrazioniMovFinNcdCECInserite(List<RegistrazioneMovFin> registrazioniMovFinNcdCECInserite) {
		this.registrazioniMovFinNcdCECInserite = registrazioniMovFinNcdCECInserite != null ? registrazioniMovFinNcdCECInserite : new ArrayList<RegistrazioneMovFin>();
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
	 * @return the registrazioniMovCECPrecedenti
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovCECPrecedenti() {
		return registrazioniMovCECPrecedenti;
	}

	/**
	 * @param registrazioniMovCECPrecedenti the registrazioniMovCECPrecedenti to set
	 */
	public void setRegistrazioniMovCECPrecedenti(List<RegistrazioneMovFin> registrazioniMovCECPrecedenti) {
		this.registrazioniMovCECPrecedenti = registrazioniMovCECPrecedenti != null ? registrazioniMovCECPrecedenti : new ArrayList<RegistrazioneMovFin>();
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
	 * Gets the registrazioni comunicazioni pcc.
	 *
	 * @return the registrazioniComunicazioniPCC
	 */
	public List<RegistroComunicazioniPCC> getRegistrazioniComunicazioniPCC() {
		return registrazioniComunicazioniPCC;
	}

	/**
	 * Sets the registrazioni comunicazioni pcc.
	 *
	 * @param registrazioniComunicazioniPCC the registrazioniComunicazioniPCC to set
	 */
	public void setRegistrazioniComunicazioniPCC(List<RegistroComunicazioniPCC> registrazioniComunicazioniPCC) {
		this.registrazioniComunicazioniPCC = registrazioniComunicazioniPCC != null ? registrazioniComunicazioniPCC : new ArrayList<RegistroComunicazioniPCC>();
	}
	
	/**
	 * Adds the registrazione comunicazioni pcc.
	 *
	 * @param registroComunicazioniPCC the registro comunicazioni pcc
	 */
	public void addRegistrazioneComunicazioniPCC(RegistroComunicazioniPCC registroComunicazioniPCC) {
		getRegistrazioniComunicazioniPCC().add(registroComunicazioniPCC);
	}

	/**
	 * Gets the condizione di attivazione gen soddisfatta.
	 *
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
	 * Sets the condizione di attivazione gen soddisfatta.
	 *
	 * @param condizioneDiAttivazioneGENSoddisfatta the condizioneDiAttivazioneGENSoddisfatta to set
	 */
	public void setCondizioneDiAttivazioneGENSoddisfatta(Boolean condizioneDiAttivazioneGENSoddisfatta) {
		this.condizioneDiAttivazioneGENSoddisfatta = condizioneDiAttivazioneGENSoddisfatta;
	}

	/**
	 * Gets the condizione di attivazione pcc soddisfatta.
	 *
	 * @return the condizioneDiAttivazionePCCSoddisfatta
	 */
	public Boolean getCondizioneDiAttivazionePCCSoddisfatta() {
		return condizioneDiAttivazionePCCSoddisfatta;
	}
	
	/**
	 * Checks if is condizione di attivazione pcc soddisfatta.
	 *
	 * @return true, if is condizione di attivazione pcc soddisfatta
	 */
	public boolean isCondizioneDiAttivazionePCCSoddisfatta() {
		return Boolean.TRUE.equals(condizioneDiAttivazionePCCSoddisfatta);
	}

	/**
	 * Sets the condizione di attivazione pcc soddisfatta.
	 *
	 * @param condizioneDiAttivazionePCCSoddisfatta the condizioneDiAttivazionePCCSoddisfatta to set
	 */
	public void setCondizioneDiAttivazionePCCSoddisfatta(Boolean condizioneDiAttivazionePCCSoddisfatta) {
		this.condizioneDiAttivazionePCCSoddisfatta = condizioneDiAttivazionePCCSoddisfatta;
	}

	

	/**
	 * Ottiene le registrazioni FIN per cui e' necessario inserire la prima nota.
	 * Nel caso in cui non sia necessario inserire la prima nota (nessuna regisrazione inserita) restituisce una lista vuota.
	 * 
	 * @return lista delle registrazioni
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFinPrimaNota(){
		final List<RegistrazioneMovFin> result = new ArrayList<RegistrazioneMovFin>();
		if(!registrazioniMovFinInserite.isEmpty() || primaNotaPrecedenteAnnullata){
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
		if(!registrazioniMovGSAInserite.isEmpty() || primaNotaPrecedenteAnnullata){
			result.addAll(registrazioniMovGSAInserite);
			result.addAll(registrazioniMovGSAPrecedenti);
		}
		return result;
	}
	
	/**
	 * Ottiene le registrazioni CEC per cui e' necessario inserire la prima nota.
	 * Nel caso in cui non sia necessario inserire la prima nota (nessuna regisrazione inserita) restituisce una lista vuota.
	 * 
	 * @return lista delle registrazioni
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovCECPrimaNota(){
		final List<RegistrazioneMovFin> result = new ArrayList<RegistrazioneMovFin>();
		if(!registrazioniMovCECInserite.isEmpty() || primaNotaPrecedenteAnnullata){
			result.addAll(registrazioniMovCECInserite);
			result.addAll(registrazioniMovCECPrecedenti);
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
