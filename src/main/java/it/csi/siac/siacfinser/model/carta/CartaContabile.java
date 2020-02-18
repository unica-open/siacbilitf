/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.carta;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 *  @author
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class CartaContabile extends Entita {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3548688089678485359L;
	
	private Integer idCartaContabile;
	private Integer numero;
	
	private String note;
	private String motivoUrgenza;
	private String numRegistrazione;
	private String oggetto;
	private String causale;
	
	private String utenteCreazione;
	private String utenteModifica;
	private String utenteCancellazione;
	private String utenteOperazione;
	
	private Date dataScadenza;
	private Date dataEsecuzionePagamento;
	private Date dataInizioValidita;
	private Date dataFineValidita;
	private Date dataCreazione;
	private Date dataModifica;
	private Date dataCancellazione;
	private Date dataTrasmissione;
	private Date dataCreazioneSupport;
	
	private BigDecimal importoValuta;
	private BigDecimal importo;
	// Somma degli importoDaRegolarizzare delle righe carta. Serve per avere immediatezza della totale regolarizzazione della carta
	private BigDecimal importoDaRegolarizzare;

	private StatoOperativoCartaContabile statoOperativoCartaContabile;
	
	private String firma1;
	private String firma2;
	
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum StatoOperativoCartaContabile{
		PROVVISORIO, ANNULLATO, COMPLETATO, TRASMESSO
	}
	
	private Date dataStatoOperativo;

	Bilancio bilancio;
	
	private AttoAmministrativo attoAmministrativo;
//	private Integer idAttoAmministrativo;
//	private String annoAttoAmministrativo;
//	private Integer numeroAttoAmministrativo;
//	private TipoAtto tipoAttoAmministrativo;
	
	private List<PreDocumentoCarta> listaPreDocumentiCarta;
	private CartaEstera cartaEstera;
	private List<CartaEstera> listaCarteEstere;
	
	public Integer getIdCartaContabile() {
		return idCartaContabile;
	}
	
	public void setIdCartaContabile(Integer idCartaContabile) {
		this.idCartaContabile = idCartaContabile;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getMotivoUrgenza() {
		return motivoUrgenza;
	}
	
	public void setMotivoUrgenza(String motivoUrgenza) {
		this.motivoUrgenza = motivoUrgenza;
	}
	
	public String getNumRegistrazione() {
		return numRegistrazione;
	}
	
	public void setNumRegistrazione(String numRegistrazione) {
		this.numRegistrazione = numRegistrazione;
	}
	
	public String getOggetto() {
		return oggetto;
	}
	
	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}
	
	public String getCausale() {
		return causale;
	}
	
	public void setCausale(String causale) {
		this.causale = causale;
	}
	
	public String getUtenteCreazione() {
		return utenteCreazione;
	}
	
	public void setUtenteCreazione(String utenteCreazione) {
		this.utenteCreazione = utenteCreazione;
	}
	
	public String getUtenteModifica() {
		return utenteModifica;
	}
	
	public void setUtenteModifica(String utenteModifica) {
		this.utenteModifica = utenteModifica;
	}
	
	public String getUtenteCancellazione() {
		return utenteCancellazione;
	}
	
	public void setUtenteCancellazione(String utenteCancellazione) {
		this.utenteCancellazione = utenteCancellazione;
	}
	
	public String getUtenteOperazione() {
		return utenteOperazione;
	}
	
	public void setUtenteOperazione(String utenteOperazione) {
		this.utenteOperazione = utenteOperazione;
	}
	
	@XmlSchemaType(name = "dateTime")
	public Date getDataScadenza() {
		return dataScadenza;
	}
	
	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	
	@XmlSchemaType(name = "dateTime")
	public Date getDataEsecuzionePagamento() {
		return dataEsecuzionePagamento;
	}
	
	public void setDataEsecuzionePagamento(Date dataEsecuzionePagamento) {
		this.dataEsecuzionePagamento = dataEsecuzionePagamento;
	}
	
	@XmlSchemaType(name = "dateTime")
	public Date getDataInizioValidita() {
		return dataInizioValidita;
	}
	
	public void setDataInizioValidita(Date dataInizioValidita) {
		this.dataInizioValidita = dataInizioValidita;
	}
	
	@XmlSchemaType(name = "dateTime")
	public Date getDataFineValidita() {
		return dataFineValidita;
	}
	
	public void setDataFineValidita(Date dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}
	
	@XmlSchemaType(name = "dateTime")
	public Date getDataCreazione() {
		return dataCreazione;
	}
	
	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	
	@XmlSchemaType(name = "dateTime")
	public Date getDataModifica() {
		return dataModifica;
	}
	
	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}
	
	@XmlSchemaType(name = "dateTime")
	public Date getDataCancellazione() {
		return dataCancellazione;
	}
	
	public void setDataCancellazione(Date dataCancellazione) {
		this.dataCancellazione = dataCancellazione;
	}
	
	public Date getDataTrasmissione() {
		return dataTrasmissione;
	}

	public void setDataTrasmissione(Date dataTrasmissione) {
		this.dataTrasmissione = dataTrasmissione;
	}

	public Date getDataCreazioneSupport() {
		return dataCreazioneSupport;
	}

	public void setDataCreazioneSupport(Date dataCreazioneSupport) {
		this.dataCreazioneSupport = dataCreazioneSupport;
	}

	public BigDecimal getImporto() {
		return importo;
	}
	
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	
	public BigDecimal getImportoValuta() {
		return importoValuta;
	}
	
	public void setImportoValuta(BigDecimal importoValuta) {
		this.importoValuta = importoValuta;
	}
	
	public BigDecimal getImportoDaRegolarizzare() {
		return importoDaRegolarizzare;
	}
	
	public void setImportoDaRegolarizzare(BigDecimal importoDaRegolarizzare) {
		this.importoDaRegolarizzare = importoDaRegolarizzare;
	}
	
	public StatoOperativoCartaContabile getStatoOperativoCartaContabile() {
		return statoOperativoCartaContabile;
	}
	
	public void setStatoOperativoCartaContabile(
			StatoOperativoCartaContabile statoOperativoCartaContabile) {
		this.statoOperativoCartaContabile = statoOperativoCartaContabile;
	}
	
	public Bilancio getBilancio() {
		return bilancio;
	}
	
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	
	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}
	
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}
	
	
	
	public List<PreDocumentoCarta> getListaPreDocumentiCarta() {
		return listaPreDocumentiCarta;
	}
	
	public void setListaPreDocumentiCarta(
			List<PreDocumentoCarta> listaPreDocumentiCarta) {
		this.listaPreDocumentiCarta = listaPreDocumentiCarta;
	}

	public List<CartaEstera> getListaCarteEstere() {
		return listaCarteEstere;
	}

	public void setListaCarteEstere(List<CartaEstera> listaCarteEstere) {
		this.listaCarteEstere = listaCarteEstere;
	}

	

	public CartaEstera getCartaEstera() {
		return cartaEstera;
	}

	public void setCartaEstera(CartaEstera cartaEstera) {
		this.cartaEstera = cartaEstera;
	}

	public Date getDataStatoOperativo() {
		return dataStatoOperativo;
	}

	public void setDataStatoOperativo(Date dataStatoOperativo) {
		this.dataStatoOperativo = dataStatoOperativo;
	}

	public String getFirma1() {
		return firma1;
	}

	public void setFirma1(String firma1) {
		this.firma1 = firma1;
	}

	public String getFirma2() {
		return firma2;
	}

	public void setFirma2(String firma2) {
		this.firma2 = firma2;
	}	
	
}