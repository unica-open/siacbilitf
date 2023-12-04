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
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siaccorser.model.EntitaEnteExt;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class PreDocumento<DAPD extends DatiAnagraficiPreDocumento, SD extends Subdocumento<?, ?>> extends EntitaEnteExt  {
	
	private static final long serialVersionUID = -7559702029618586949L;	
	
	
	private String numero;
	private String descrizione;
	private String note;
	private BigDecimal importo;

	private String periodoCompetenza;
	private Date dataCompetenza;
	
	private Date dataDocumento;
	private Boolean flagManuale;
	
	
	@XmlElements({
		@XmlElement(name="datiAnagraficiPreDocumentoSpesa", type=DatiAnagraficiPreDocumentoSpesa.class),
		@XmlElement(name="datiAnagraficiPreDocumento", type=DatiAnagraficiPreDocumento.class)
		})
	private DAPD datiAnagraficiPreDocumento;
	
	@XmlElements({
		@XmlElement(name="subDocumentoSpesa", type=SubdocumentoSpesa.class),
		@XmlElement(name="subDocumentoEntrata", type=SubdocumentoEntrata.class)
		})
	private SD subDocumento;
	
	//Campi derivati
	private Date dataCompletamento;
	private Date dataDefinizione;
	private Date dataAnnullamento;
	private Date dataInizioValiditaStato;
	
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
	private StatoOperativoPreDocumento statoOperativoPreDocumento;
	private AttoAmministrativo attoAmministrativo;
	private Soggetto soggetto;
	private ProvvisorioDiCassa provvisorioDiCassa;
	
	//Uscita/Entrata sulle sottoclassi di PreDocumentoSpesa/Entrata
	//private Capitolo capitolo;
	//private MovimentoGestione //Impegno/Accertamento sulle sottoclassi di PreDocumentoSpesa/Entrata
	//private Causale //CausaleSpesa/CausaleEntrata sulle sottoclassi di PreDocumentoSpesa/Entrata
	//private ProvvisiorioCassa //ci sarà
	
	// SIAC-5001
	private ElencoDocumentiAllegato elencoDocumentiAllegato;
		
	
	
	
		
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}	
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {		
		this.numero = (numero==null?null:numero.toString());
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
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	/**
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}
	/**
	 * @return the importo
	 */
	public BigDecimal getImportoNotNull() {
		return importo != null ? importo : BigDecimal.ZERO;
	}
	/**
	 * @return the periodoCompetenza
	 */
	public String getPeriodoCompetenza() {
		return periodoCompetenza;
	}
	/**
	 * @param periodoCompetenza the periodoCompetenza to set
	 */
	public void setPeriodoCompetenza(String peridoCompetenza) {
		this.periodoCompetenza = peridoCompetenza;
	}
	/**
	 * @return the dataCompetenza
	 */
	public Date getDataCompetenza() {
		return dataCompetenza;
	}
	/**
	 * @param dataCompetenza the dataCompetenza to set
	 */
	public void setDataCompetenza(Date dataCompetenza) {
		this.dataCompetenza = dataCompetenza;
	}
	/**
	 * @return the dataDocumento
	 */
	public Date getDataDocumento() {
		return dataDocumento;
	}
	/**
	 * @param dataDocumento the dataDocumento to set
	 */
	public void setDataDocumento(Date dataDocumento) {
		this.dataDocumento = dataDocumento;
	}
	/**
	 * @return the flagManuale
	 */
	public Boolean getFlagManuale() {
		return flagManuale;
	}
	/**
	 * @param flagManuale the flagManuale to set
	 */
	public void setFlagManuale(Boolean flagManuale) {
		this.flagManuale = flagManuale;
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
	 * @return the dataDefinizione
	 */
	public Date getDataDefinizione() {
		return dataDefinizione;
	}
	/**
	 * @param dataDefinizione the dataDefinizione to set
	 */
	public void setDataDefinizione(Date dataDefinizione) {
		this.dataDefinizione = dataDefinizione;
	}
	/**
	 * @return the dataAnnullamento
	 */
	public Date getDataAnnullamento() {
		return dataAnnullamento;
	}
	/**
	 * @param dataAnnullamento the dataAnnullamento to set
	 */
	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}
	/**
	 * @return the strutturaAmministrativoContabile
	 */
	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}
	/**
	 * @param strutturaAmministrativoContabile the strutturaAmministrativoContabile to set
	 */
	public void setStrutturaAmministrativoContabile(
			StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}
	/**
	 * @return the statoOperativoPreDocumento
	 */
	public StatoOperativoPreDocumento getStatoOperativoPreDocumento() {
		return statoOperativoPreDocumento;
	}
	/**
	 * @param statoOperativoPreDocumento the statoOperativoPreDocumento to set
	 */
	public void setStatoOperativoPreDocumento(
			StatoOperativoPreDocumento statoOperativoPreDocumento) {
		this.statoOperativoPreDocumento = statoOperativoPreDocumento;
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
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}
	/**
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}
	/**
	 * @return the provvisorioDiCassa
	 */
	public ProvvisorioDiCassa getProvvisorioDiCassa() {
		return provvisorioDiCassa;
	}
	/**
	 * @param provvisorioDiCassa the provvisorioDiCassa to set
	 */
	public void setProvvisorioDiCassa(ProvvisorioDiCassa provvisorioDiCassa) {
		this.provvisorioDiCassa = provvisorioDiCassa;
	}
	/**
	 * @return the datiAnagraficiPreDocumento
	 */
	@XmlTransient
	public DAPD getDatiAnagraficiPreDocumento() {
		return datiAnagraficiPreDocumento;
	}
	/**
	 * @param datiAnagraficiPreDocumento the datiAnagraficiPreDocumento to set
	 */
	public void setDatiAnagraficiPreDocumento(DAPD datiAnagraficiPreDocumento) {
		this.datiAnagraficiPreDocumento = datiAnagraficiPreDocumento;
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
	 * @return the subDocumento
	 */
	@XmlTransient
	public SD getSubDocumento() {
		return subDocumento;
	}
	/**
	 * @param subDocumento the subDocumento to set
	 */
	public void setSubDocumento(SD subDocumento) {
		this.subDocumento = subDocumento;
	}
	/**
	 * @return the elencoDocumentiAllegato
	 */
	public ElencoDocumentiAllegato getElencoDocumentiAllegato() {
		return elencoDocumentiAllegato;
	}
	/**
	 * @param elencoDocumentiAllegato the elencoDocumentiAllegato to set
	 */
	public void setElencoDocumentiAllegato(ElencoDocumentiAllegato elencoDocumentiAllegato) {
		this.elencoDocumentiAllegato = elencoDocumentiAllegato;
	}
	/**
	 * @return the dataCreazione
	 */
	public Date getDataCreazionePreDocumento() {
		return getDataCreazione();
	}
	/**
	 * @param dataCreazione the dataCreazione to set
	 */
	public void setDataCreazionePreDocumento(Date dataCreazione) {
		setDataCreazione(dataCreazione);
	}
	
	/**
	 * Controlla il presente predocumento pu&oacute; essere portato allo stato <code>COMPLETO</code>.
	 * @return <code>true</code> se le condizioni di validazione per lo stato <code>COMPLETO</code> sono soddisfatte; <code>false</code> altrimento
	 */
	public boolean controllaCompletabilita() {
		return false;
	}
	
	protected boolean controllaNotNullUidValorizzato(Entita e) {
		return e != null && e.getUid() != 0;
	}
}
