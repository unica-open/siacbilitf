/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.EntitaExt;
import it.csi.siac.siacfinser.model.MovimentoGestione;
import it.csi.siac.siacfinser.model.ordinativo.Ordinativo;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa;
import it.csi.siac.siacfinser.model.soggetto.sedesecondaria.SedeSecondariaSoggetto;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class Subdocumento<D extends Documento<?,?>, SDI extends SubdocumentoIva<?,?,?>> extends EntitaExt {
	
	private static final long serialVersionUID = -5735532428814796186L;
	
	//@SuppressWarnings("rawtypes")
	
	@XmlElements({
		@XmlElement(name="documentoSpesa", type=DocumentoSpesa.class),
		@XmlElement(name="documentoEntrata", type=DocumentoEntrata.class),
		@XmlElement(name="documento", type=Documento.class)
	})
	private D documento;
	private Ente ente;
	
	//Fields su siac_t_subdoc
	private Integer numero;	
	private String descrizione;
	private BigDecimal importo = BigDecimal.ZERO;	
	private BigDecimal importoDaDedurre = BigDecimal.ZERO;
	private Date dataScadenza;
	private Boolean flagConvalidaManuale;
	private String numeroRegistrazioneIVA;
	
	//Legami con tabella di codifica
	private NoteTesoriere noteTesoriere;
	
	//Fields su siac_r_subdoc_attr
	private Boolean flagAvviso;
	private Boolean flagEsproprio;
	private Boolean flagOrdinativoManuale;
	private Boolean flagOrdinativoSingolo;
	// Modificato dall'originale si' da evitare un problema con i framework utilizzanti Commons BeanUtils (Cfr. https://issues.apache.org/jira/browse/BEANUTILS-369)
	private Boolean flagRilevanteIVA;
	private String note;
	/*
	annotazione (stringa) (Dati Decreto 35-2013)
	dataCertificazione (stringa) (Dati Decreto 35-2013)
	flagCertificabile (boolean) (Dati Decreto 35-2013)
	noteDL (stringa) (Dati Decreto 35-2013)
	numeroCertificazione (stringa) (Dati Decreto 35-2013)
	 */
	
	// siac_r_subdoc_sogg
	private SedeSecondariaSoggetto sedeSecondariaSoggetto;
	
	//campi provvisori, solo funzionali allo sviluppo
//	private Integer numeroOrdinativo;
//	private Date dataOrdinativo;
	
	private Ordinativo ordinativo;

	//Fields derivati da calcoli
	private Boolean flagACopertura; 
	
	//Fields su siac_r_subdoc_class	
	private TipoAvviso tipoAvviso;
	
	private ElencoDocumentiAllegato elencoDocumenti;
	
	//siac_r_subdoc_atto_amm
	private AttoAmministrativo attoAmministrativo;
	//siac_r_subdoc_movgest_ts
	//private MG movimentoGestione;
	
	private ProvvisorioDiCassa provvisorioCassa;
//	private QuotaNoteCredito quotaNoteCredito;
	@XmlElements({
		@XmlElement(name="subdocumentoIvaSpesa", type=SubdocumentoIvaSpesa.class),
		@XmlElement(name="subdocumentoIvaEntrata", type=SubdocumentoIvaEntrata.class),
		@XmlElement(name="subdocumentoIva", type=SubdocumentoIva.class) 
	})
	private SDI subdocumentoIva;
	
	//dati aggiuntivi per allegato atto
	private Boolean hasSubordinati;
	private Boolean isSubordinato;
	
	// SIAC-4675
	private Boolean hasSubordinatiPNL;
		
	
	//private Boolean flagNoData;
	
	/**
	 * @param the getFlagNoData to set
	 */
//	public Boolean getFlagNoData() {
//		return flagNoData;
//	}
	/**
	 * 
	 * @param flagNoData
	 */
//	public void setFlagNoData(Boolean flagNoData) {
//		this.flagNoData = flagNoData;
//	}
	/**
	 * Restituisce il Documento di appartenenza di questo Subdocumento
	 * 
	 * @return the documento
	 */
	//@SuppressWarnings("rawtypes")
	@XmlTransient
	public D getDocumento() {
		return documento;
	}
	/**
	 * @param documento the documento to set
	 */
	//@SuppressWarnings("rawtypes")
	public void setDocumento(D documento) {
		this.documento = documento;
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
	 * @return the flagOrdinativoManuale
	 */
	public Boolean getFlagOrdinativoManuale() {
		return flagOrdinativoManuale;
	}
	/**
	 * @param flagOrdinativoManuale the flagOrdinativoManuale to set
	 */
	public void setFlagOrdinativoManuale(Boolean flagOrdinativoManuale) {
		this.flagOrdinativoManuale = flagOrdinativoManuale;
	}
	/**
	 * @return the flagAvviso
	 */
	public Boolean getFlagAvviso() {
		return flagAvviso;
	}
	/**
	 * @param flagAvviso the flagAvviso to set
	 */
	public void setFlagAvviso(Boolean flagAvviso) {
		this.flagAvviso = flagAvviso;
	}
	/**
	 * @return the flagEsproprio
	 */
	public Boolean getFlagEsproprio() {
		return flagEsproprio;
	}
	/**
	 * @param flagEsproprio the flagEsproprio to set
	 */
	public void setFlagEsproprio(Boolean flagEsproprio) {
		this.flagEsproprio = flagEsproprio;
	}
	/**
	 * @return the flagOrdinativoSingolo
	 */
	public Boolean getFlagOrdinativoSingolo() {
		return flagOrdinativoSingolo;
	}
	/**
	 * @param flagOrdinativoSingolo the flagOrdinativoSingolo to set
	 */
	public void setFlagOrdinativoSingolo(Boolean flagOrdinativoSingolo) {
		this.flagOrdinativoSingolo = flagOrdinativoSingolo;
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
	 * @return the sedeSecondariaSoggetto
	 */
	public SedeSecondariaSoggetto getSedeSecondariaSoggetto() {
		return sedeSecondariaSoggetto;
	}
	/**
	 * @param sedeSecondariaSoggetto the sedeSecondariaSoggetto to set
	 */
	public void setSedeSecondariaSoggetto(
			SedeSecondariaSoggetto sedeSecondariaSoggetto) {
		this.sedeSecondariaSoggetto = sedeSecondariaSoggetto;
	}
	/**
	 * @return the numeroRegistrazioneIVA
	 */
	public String getNumeroRegistrazioneIVA() {
		return numeroRegistrazioneIVA;
	}
	/**
	 * @param numeroRegistrazioneIVA the numeroRegistrazioneIVA to set
	 */
	public void setNumeroRegistrazioneIVA(String numeroRegistrazioneIVA) {
		this.numeroRegistrazioneIVA = numeroRegistrazioneIVA;
	}
	/**
	 * @return the flagRilevanteIVA
	 */
	public Boolean getFlagRilevanteIVA() {
		return flagRilevanteIVA;
	}
	/**
	 * @param flagRilevanteIVA the flagRilevanteIVA to set
	 */
	public void setFlagRilevanteIVA(Boolean flagRilevanteIVA) {
		this.flagRilevanteIVA = flagRilevanteIVA;
	}
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
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}
	/**
	 * @return the importo not null
	 */
	public BigDecimal getImportoNotNull() {
		if (importo == null) {
			return BigDecimal.ZERO;
		}
		return importo;
	}
	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	/**
	 * @return the flagACopertura
	 */
	public Boolean getFlagACopertura() {
		return flagACopertura;
	}
	/**
	 * @param flagACopertura the flagACopertura to set
	 */
	public void setFlagACopertura(Boolean flagACopertura) {
		this.flagACopertura = flagACopertura;
	}
	/**
	 * @return the noteTesoriere
	 */
	public NoteTesoriere getNoteTesoriere() {
		return noteTesoriere;
	}
	/**
	 * @param noteTesoriere the noteTesoriere to set
	 */
	public void setNoteTesoriere(NoteTesoriere noteTesoriere) {
		this.noteTesoriere = noteTesoriere;
	}
	/**
	 * @return the tipoAvviso
	 */
	public TipoAvviso getTipoAvviso() {
		return tipoAvviso;
	}
	/**
	 * @param tipoAvviso the tipoAvviso to set
	 */
	public void setTipoAvviso(TipoAvviso tipoAvviso) {
		this.tipoAvviso = tipoAvviso;
	}
	
	/**
	 * @return the elencoDocumenti
	 */
	public ElencoDocumentiAllegato getElencoDocumenti() {
		return elencoDocumenti;
	}
	/**
	 * @param elencoDocumenti the elencoDocumenti to set
	 */
	public void setElencoDocumenti(ElencoDocumentiAllegato elencoDocumenti) {
		this.elencoDocumenti = elencoDocumenti;
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
	 * @return the provvisorioCassa
	 */
	public ProvvisorioDiCassa getProvvisorioCassa() {
		return provvisorioCassa;
	}
	/**
	 * @param provvisorioCassa the provvisorioCassa to set
	 */
	public void setProvvisorioCassa(ProvvisorioDiCassa provvisorioCassa) {
		this.provvisorioCassa = provvisorioCassa;
	}
	/**
	 * @return the importoDaDedurre not null
	 */
	public BigDecimal getImportoDaDedurreNotNull() {
		if(importoDaDedurre==null){
			return BigDecimal.ZERO;
		}
		return importoDaDedurre;
	}
	
	/**
	 * @return the importoDaDedurre
	 */
	public BigDecimal getImportoDaDedurre() {
		return importoDaDedurre;
	}
	/**
	 * @param importoDaDedurre the importoDaDedurre to set
	 */
	public void setImportoDaDedurre(BigDecimal importoDaDedurre) {
		this.importoDaDedurre = importoDaDedurre;
	}
	/**
	 * @return the flagConvalidaManuale
	 */
	public Boolean getFlagConvalidaManuale() {
		return flagConvalidaManuale;
	}
	/**
	 * @param flagConvalidaManuale the flagConvalidaManuale to set
	 */
	public void setFlagConvalidaManuale(Boolean convalidaManuale) {
		this.flagConvalidaManuale = convalidaManuale;
	}
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	/**
	 * @return the subdocumentoIva
	 */
	@XmlTransient
	public SDI getSubdocumentoIva() {
		return subdocumentoIva;
	}
	/**
	 * @param subdocumentoIva the subdocumentoIva to set
	 */
	public void setSubdocumentoIva(SDI subdocumentoIva) {
		this.subdocumentoIva = subdocumentoIva;
	}
	
	/**
	 * @return the ordinativo
	 */
	public Ordinativo getOrdinativo() {
		return ordinativo;
	}
	/**
	 * @param ordinativo the ordinativo to set
	 */
	public void setOrdinativo(Ordinativo ordinativo) {
		this.ordinativo = ordinativo;
	}
	/**
	 * @return the hasSubordinati
	 */
	public Boolean getHasSubordinati() {
		return hasSubordinati;
	}
	/**
	 * @param hasSubordinati the hasSubordinati to set
	 */
	public void setHasSubordinati(Boolean hasSubordinati) {
		this.hasSubordinati = hasSubordinati;
	}
	/**
	 * @return the isSubordinato
	 */
	public Boolean getIsSubordinato() {
		return isSubordinato;
	}
	/**
	 * @param isSubordinato the isSubordinato to set
	 */
	public void setIsSubordinato(Boolean isSubordinato) {
		this.isSubordinato = isSubordinato;
	}
	/**
	 * @return the hasSubordinatiPNL
	 */
	public Boolean getHasSubordinatiPNL() {
		return hasSubordinatiPNL;
	}
	/**
	 * @param hasSubordinatiPNL the hasSubordinatiPNL to set
	 */
	public void setHasSubordinatiPNL(Boolean hasSubordinatiPNL) {
		this.hasSubordinatiPNL = hasSubordinatiPNL;
	}
	/**
	 * Ottiene il movimento di gestione: 
	 * Accertamento se SubdocumentoEntrata o Impegno se SubdocumentoSpesa.
	 * 
	 * @return
	 */
	public MovimentoGestione getMovimentoGestione() {
		if(this instanceof SubdocumentoEntrata){
			final SubdocumentoEntrata se = (SubdocumentoEntrata) this;
			return se.getAccertamento();
		} else if (this instanceof SubdocumentoSpesa){
			final SubdocumentoSpesa ss = (SubdocumentoSpesa) this;
			return ss.getImpegno();
		}		
		
		return null;
	}
	
	/**
	 * Ottiene il submovimento di gestione: 
	 * SubAccertamento se SubdocumentoEntrata o SubImpegno se SubdocumentoSpesa.
	 * 
	 * @return
	 */
	public MovimentoGestione getSubMovimentoGestione() {
		if(this instanceof SubdocumentoEntrata){
			final SubdocumentoEntrata se = (SubdocumentoEntrata) this;
			return se.getSubAccertamento();
		} else if (this instanceof SubdocumentoSpesa){
			final SubdocumentoSpesa ss = (SubdocumentoSpesa) this;
			return ss.getSubImpegno();
		}		
		
		return null;
	}
	
	
}
