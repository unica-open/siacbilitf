/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.EntitaEnteExt;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * 
 * @author sviluppo1
 * @version 1.0
 * @created 08-set-2014 17.51.35
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class AllegatoAtto extends EntitaEnteExt  {
	//SiacTAttoAllegato
	
	private static final long serialVersionUID = 7665626335405461954L;
	
	
	
	// Obbligatorii	
	
	/**
	 * Viene usata per la descrizione di documento e quota creati nella gestione
	 * dell'allegato atto, ovvero per quei documenti di tipo documento = ALLEGATO ATTO
	 */
	//attoalCausale
	private String causale;
	
	
	// Standard

	private Date dataScadenza;
	/**
	 * Veniva utilizzato sulla stampa cartacea, per avere le intestazioni alle righe
	 * di firma. Firma che poi potevano non coincidere con il nominativo.
	 */
	private String responsabileContabile;
	private String annotazioni;
	/**
	 * Veniva utilizzato sulla stampa cartacea, per avere le intestazioni alle righe
	 * di firma. Firma che poi potevano non coincidere con il nominativo.
	 */
	private String responsabileAmministrativo;
	private String note;
	/**
	 * Serve per indicare se l'atto ha degli allegati e di che tipo, fatture, etc...
	 * <br>
	 * Serve per atti di liquidazione per dire che l'atto avr&agrave;  degli allegati e quindi
	 * la documentazine &eacute; completa solo a pervenire degli allegati.
	 */
	private String altriAllegati;
	/**
	 * Indica se nell'allegato sono contenuti dati sensibili.
	 * <br>
	 * L'informazione potr&agrave; essere usata nei sistemi di archiviazione (se prevista
	 * l'integrazione) per  definire le policy di accesso ai documenti archiviati.
	 */
	//attoalDatiSensibili
	private Boolean datiSensibili;
	//attoalPratica
	private String pratica;
	
//	private String utenteCreazione; //EntitaExt
//	private String utenteModifca; //EntitaExt
//	private String utenteCancellazione; //EntitaExt
	
	private Date dataInizioValiditaStato;
	
	//siacTAttoAmm //obbligatorio
	private AttoAmministrativo attoAmministrativo;
	//siacRAttoAllegatoStatos //obbligatorio
	private StatoOperativoAllegatoAtto statoOperativoAllegatoAtto;
	//siacRAttoAllegatoSog //facoltativo
	private List<DatiSoggettoAllegato> datiSoggettiAllegati = new ArrayList<DatiSoggettoAllegato>();
	//obbligatorio
	private List<ElencoDocumentiAllegato> elenchiDocumentiAllegato = new ArrayList<ElencoDocumentiAllegato>();
	
	// SIAC-6261
	private List<Soggetto> elencoSoggettiDurc = new ArrayList<Soggetto>();

	// Lotto L
	private Integer annoTitolario;
	private String titolario;
	private Integer versioneInvioFirma;
	
	//CR-2996 (gestione condizioni per azioni di stampa invio e completa)
	private Boolean isAssociatoAdAlmenoUnDocumento;
	private Boolean isAssociatoAdAlmenoUnaQuotaSpesa;
	
	//CR-2206
	private Date dataVersioneInvioFirma;
	private String utenteVersioneInvioFirma;
	
	// CR-4276
	private Boolean flagRitenute;
	// SIAC-5021
	private Boolean isAssociatoAdUnSubdocumentoSospeso;
	
	// SIAC-5043
	private Date dataCompletamento;
	private Boolean isAssociatoAdUnSubdocumentoConOrdinativo;
	
	//SIAC-6261
	private Boolean hasImpegnoConfermaDurc;
	private Date dataFineValiditaDurc;
	
	public DatiSoggettoAllegato datiSoggettoAllegatoBySoggetto(Soggetto soggetto) {
		for (DatiSoggettoAllegato dsa : datiSoggettiAllegati) {
			if (soggetto.getUid() != 0 && soggetto.getUid() == dsa.getUid()) {
				return dsa;
			}
		}

		return null;
	}
	
	public Long countQuoteInElenco(){
		long result = 0;
		for(ElencoDocumentiAllegato elenco : elenchiDocumentiAllegato){
			if(elenco.getNumeroQuoteInElenco()==null){
				throw new IllegalStateException("Numero di quote non valorizzato per gli elenchi. Impossibile ottenere il numero totale delle quote nell'AllegatoAtto.");
			}
			result = result + elenco.getNumeroQuoteInElenco().longValue();
		}
		
		return Long.valueOf(result);
	}
	
	/**
	 * @return the causale
	 */
	public String getCausale() {
		return causale;
	}
	/**
	 * @param causale the causale to set
	 */
	public void setCausale(String causale) {
		this.causale = causale;
	}
	/**
	 * @return the dataScadenza
	 */
	public Date getDataScadenza() {
		return dataScadenza;
	}
	/**
	 * @param dataScadenza the dataScadenza to set
	 */
	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	/**
	 * @return the responsabileContabile
	 */
	public String getResponsabileContabile() {
		return responsabileContabile;
	}
	/**
	 * @param responsabileContabile the responsabileContabile to set
	 */
	public void setResponsabileContabile(String responsabileContabile) {
		this.responsabileContabile = responsabileContabile;
	}
	/**
	 * @return the annotazioni
	 */
	public String getAnnotazioni() {
		return annotazioni;
	}
	/**
	 * @param annotazioni the annotazioni to set
	 */
	public void setAnnotazioni(String annotazioni) {
		this.annotazioni = annotazioni;
	}
	/**
	 * @return the responsabileAmministrativo
	 */
	public String getResponsabileAmministrativo() {
		return responsabileAmministrativo;
	}
	/**
	 * @param responsabileAmministrativo the responsabileAmministrativo to set
	 */
	public void setResponsabileAmministrativo(String responsabileAmministrativo) {
		this.responsabileAmministrativo = responsabileAmministrativo;
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
	 * @return the altriAllegati
	 */
	public String getAltriAllegati() {
		return altriAllegati;
	}
	/**
	 * @param altriAllegati the altriAllegati to set
	 */
	public void setAltriAllegati(String altriAllegati) {
		this.altriAllegati = altriAllegati;
	}
	/**
	 * @return the datiSensibili
	 */
	public Boolean getDatiSensibili() {
		return datiSensibili;
	}
	/**
	 * @param datiSensibili the datiSensibili to set
	 */
	public void setDatiSensibili(Boolean datiSensibili) {
		this.datiSensibili = datiSensibili;
	}
	/**
	 * @return the pratica
	 */
	public String getPratica() {
		return pratica;
	}
	/**
	 * @param pratica the pratica to set
	 */
	public void setPratica(String pratica) {
		this.pratica = pratica;
	}
	/**
	 * @return the dataInizioValiditaStato
	 */
	public Date getDataInizioValiditaStato() {
		return dataInizioValiditaStato;
	}
	/**
	 * @param dataInizioValiditaStato the dataInizioValiditaStato to set
	 */
	public void setDataInizioValiditaStato(Date dataInizioValiditaStato) {
		this.dataInizioValiditaStato = dataInizioValiditaStato;
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
	 * @return the statoOperativoAllegatoAtto
	 */
	public StatoOperativoAllegatoAtto getStatoOperativoAllegatoAtto() {
		return statoOperativoAllegatoAtto;
	}
	/**
	 * @param statoOperativoAllegatoAtto the statoOperativoAllegatoAtto to set
	 */
	public void setStatoOperativoAllegatoAtto(StatoOperativoAllegatoAtto statoOperativoAllegatoAtto) {
		this.statoOperativoAllegatoAtto = statoOperativoAllegatoAtto;
	}
	/**
	 * @return the datiSoggettoAllegato
	 */
	public List<DatiSoggettoAllegato> getDatiSoggettiAllegati() {
		return datiSoggettiAllegati;
	}
	/**
	 * @param datiSoggettoAllegato the datiSoggettoAllegato to set
	 */
	public void setDatiSoggettiAllegati(List<DatiSoggettoAllegato> datiSoggettiAllegati) {
		this.datiSoggettiAllegati = datiSoggettiAllegati != null ? datiSoggettiAllegati : new ArrayList<DatiSoggettoAllegato>();
	}
	/**
	 * @see List#add(Object)
	 */
	public boolean addDatiSoggettoAllegato(DatiSoggettoAllegato datiSoggettoAllegato) {
		datiSoggettiAllegati = (datiSoggettiAllegati == null ? new ArrayList<DatiSoggettoAllegato>() : datiSoggettiAllegati);
		return datiSoggettiAllegati.add(datiSoggettoAllegato);
	}
	/**
	 * @return the elenchiDocumentiAllegato
	 */
	public List<ElencoDocumentiAllegato> getElenchiDocumentiAllegato() {
		return elenchiDocumentiAllegato;
	}
	/**
	 * @param elenchiDocumentiAllegato the elenchiDocumentiAllegato to set
	 */
	public void setElenchiDocumentiAllegato(List<ElencoDocumentiAllegato> elenchiDocumentiAllegato) {
		this.elenchiDocumentiAllegato = elenchiDocumentiAllegato != null ? elenchiDocumentiAllegato : new ArrayList<ElencoDocumentiAllegato>();
	}
	/**
	 * @see List#add(Object)
	 */
	public boolean addElencoDocumentiAllegato(ElencoDocumentiAllegato elencoDocumentiAllegato) {
		elenchiDocumentiAllegato = (elenchiDocumentiAllegato == null ? new ArrayList<ElencoDocumentiAllegato>() : elenchiDocumentiAllegato);
		return elenchiDocumentiAllegato.add(elencoDocumentiAllegato);
	}
	/**
	 * @return the annoTitolario
	 */
	public Integer getAnnoTitolario() {
		return annoTitolario;
	}

	/**
	 * @param annoTitolario the annoTitolario to set
	 */
	public void setAnnoTitolario(Integer annoTitolario) {
		this.annoTitolario = annoTitolario;
	}

	/**
	 * @return the titolario
	 */
	public String getTitolario() {
		return titolario;
	}

	/**
	 * @param titolario the titolario to set
	 */
	public void setTitolario(String titolario) {
		this.titolario = titolario;
	}

	/**
	 * @return the versioneInvioFirma
	 */
	public Integer getVersioneInvioFirma() {
		return versioneInvioFirma;
	}
	
	/**
	 * @return the versioneInvioFirma
	 */
	public Integer getVersioneInvioFirmaNotNull() {
		final Integer v = getVersioneInvioFirma();
		return v!= null ? v : Integer.valueOf(0);
	}

	/**
	 * @param versioneInvioFirma the versioneInvioFirma to set
	 */
	public void setVersioneInvioFirma(Integer versioneInvioFirma) {
		this.versioneInvioFirma = versioneInvioFirma;
	}

	
	
	
	

	/**
	 * @return the isAssociatoAdAlmenoUnaquotaSpesa
	 */
	public Boolean getIsAssociatoAdAlmenoUnaQuotaSpesa() {
		return isAssociatoAdAlmenoUnaQuotaSpesa;
	}

	/**
	 * @param isAssociatoAdAlmenoUnaquotaSpesa the isAssociatoAdAlmenoUnaquotaSpesa to set
	 */
	public void setIsAssociatoAdAlmenoUnaQuotaSpesa(Boolean isAssociatoAdAlmenoUnaquotaSpesa) {
		this.isAssociatoAdAlmenoUnaQuotaSpesa = isAssociatoAdAlmenoUnaquotaSpesa;
	}

	/**
	 * @return the isAssociatoAdAlmenoUnDocumento
	 */
	public Boolean getIsAssociatoAdAlmenoUnDocumento() {
		return isAssociatoAdAlmenoUnDocumento;
	}

	/**
	 * @param isAssociatoAdAlmenoUnDocumento the isAssociatoAdAlmenoUnDocumento to set
	 */
	public void setIsAssociatoAdAlmenoUnDocumento(Boolean isAssociatoAdAlmenoUnDocumento) {
		this.isAssociatoAdAlmenoUnDocumento = isAssociatoAdAlmenoUnDocumento;
	}

	/**
	 * @return the dataVersioneInvioFirma
	 */
	public Date getDataVersioneInvioFirma() {
		return dataVersioneInvioFirma;
	}

	/**
	 * @param dataVersioneInvioFirma the dataVersioneInvioFirma to set
	 */
	public void setDataVersioneInvioFirma(Date dataVersioneInvioFirma) {
		this.dataVersioneInvioFirma = dataVersioneInvioFirma;
	}

	/**
	 * @return the utenteVersioneInvioFirma
	 */
	public String getUtenteVersioneInvioFirma() {
		return utenteVersioneInvioFirma;
	}

	/**
	 * @param utenteVersioneInvioFirma the utenteVersioneInvioFirma to set
	 */
	public void setUtenteVersioneInvioFirma(String utenteVersioneInvioFirma) {
		this.utenteVersioneInvioFirma = utenteVersioneInvioFirma;
	}

	/**
	 * @return the flagRitenute
	 */
	public Boolean getFlagRitenute() {
		return flagRitenute;
	}

	/**
	 * @param flagRitenute the flagRitenute to set
	 */
	public void setFlagRitenute(Boolean flagRitenute) {
		this.flagRitenute = flagRitenute;
	}

	/**
	 * @return the isAssociatoAdUnSubdocumentoSospeso
	 */
	public Boolean getIsAssociatoAdUnSubdocumentoSospeso() {
		return isAssociatoAdUnSubdocumentoSospeso;
	}

	/**
	 * @param isAssociatoAdUnSubdocumentoSospeso the isAssociatoAdUnSubdocumentoSospeso to set
	 */
	public void setIsAssociatoAdUnSubdocumentoSospeso(Boolean isAssociatoAdUnSubdocumentoSospeso) {
		this.isAssociatoAdUnSubdocumentoSospeso = isAssociatoAdUnSubdocumentoSospeso;
	}

	/**
	 * @return the dataCompletamento
	 */
	public Date getDataCompletamento() {
		return dataCompletamento;
	}

	/**
	 * @param dataCompletamento the dataCompletamento to set
	 */
	public void setDataCompletamento(Date dataCompletamento) {
		this.dataCompletamento = dataCompletamento;
	}

	/**
	 * @return the isAssociatoAdUnSubdocumentoConOrdinativo
	 */
	public Boolean getIsAssociatoAdUnSubdocumentoConOrdinativo() {
		return isAssociatoAdUnSubdocumentoConOrdinativo;
	}

	/**
	 * @param isAssociatoAdUnSubdocumentoConOrdinativo the isAssociatoAdUnSubdocumentoConOrdinativo to set
	 */
	public void setIsAssociatoAdUnSubdocumentoConOrdinativo(Boolean isAssociatoAdUnSubdocumentoConOrdinativo) {
		this.isAssociatoAdUnSubdocumentoConOrdinativo = isAssociatoAdUnSubdocumentoConOrdinativo;
	}

	public List<Soggetto> getElencoSoggettiDurc() {
		return elencoSoggettiDurc;
	}

	public void setElencoSoggettiDurc(List<Soggetto> elencoSoggettiDurc) {
		this.elencoSoggettiDurc = elencoSoggettiDurc;
	}


	/**
	 * @return the hasImpegnoConfermaDurc
	 */
	public Boolean getHasImpegnoConfermaDurc() {
		return hasImpegnoConfermaDurc;
	}

	/**
	 * @param hasImpegnoConfermaDurc the hasImpegnoConfermaDurc to set
	 */
	public void setHasImpegnoConfermaDurc(Boolean hasImpegnoConfermaDurc) {
		this.hasImpegnoConfermaDurc = hasImpegnoConfermaDurc;
	}

	/**
	 * @return the dataFineValiditaDurc
	 */
	public Date getDataFineValiditaDurc() {
		return dataFineValiditaDurc;
	}

	/**
	 * @param dataFineValiditaDurc the dataFineValiditaDurc to set
	 */
	public void setDataFineValiditaDurc(Date dataFineValiditaDurc) {
		this.dataFineValiditaDurc = dataFineValiditaDurc;
	}


}