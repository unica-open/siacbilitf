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

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;
import it.csi.siac.siacfinser.model.ContoTesoreria;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;
import it.csi.siac.siacfinser.model.soggetto.sedesecondaria.SedeSecondariaSoggetto;

/**
 *  @author
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class PreDocumentoCarta extends Entita {


	/**
	 * 
	 */
	private static final long serialVersionUID = -5003052316967743648L;
	
	private Integer idPreDocumentoCarta;
	private Integer numero;
	
	private String note;
	private String descrizione;
	
	// data esecuzione pagamento
	private Date dataDocumento;
	
	private Date dataEsecuzioneRiga;

	private Date dataInizioValidita;
	private Date dataFineValidita;
	private Date dataCreazione;
	private Date dataModifica;
	private Date dataCancellazione;
	private Date dataCreazioneSupport;
	
	private String utenteCreazione;
	private String utenteModifica;
	private String utenteCancellazione;
	private String utenteOperazione;
	
	private BigDecimal importo;
	// Presente solo se la carta ha i dati di valuta estera
	private BigDecimal importoValutaEstera;
	// Differenza tra l'importo della riga e la somma dell'importo dei sub-documenti collegati
	private BigDecimal importoDaRegolarizzare;
 
	private ContoTesoreria contoTesoreria;
 
	private Soggetto soggetto;
	private SedeSecondariaSoggetto sedeSecondariaSoggetto;
	private ModalitaPagamentoSoggetto modalitaPagamentoSoggetto;
	
	private Impegno impegno;
	private SubImpegno subImpegno;
	
	private List<SubdocumentoSpesa> listaSubDocumentiSpesaCollegati;
	private List<Integer> listaIdSubDocumentiCollegati;

	public Integer getIdPreDocumentoCarta() {
		return idPreDocumentoCarta;
	}

	public void setIdPreDocumentoCarta(Integer idPreDocumentoCarta) {
		this.idPreDocumentoCarta = idPreDocumentoCarta;
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

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataDocumento() {
		return dataDocumento;
	}

	public void setDataDocumento(Date dataDocumento) {
		this.dataDocumento = dataDocumento;
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

	public BigDecimal getImporto() {
		return importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

	public BigDecimal getImportoValutaEstera() {
		return importoValutaEstera;
	}

	public void setImportoValutaEstera(BigDecimal importoValutaEstera) {
		this.importoValutaEstera = importoValutaEstera;
	}

	public BigDecimal getImportoDaRegolarizzare() {
		return importoDaRegolarizzare;
	}

	public void setImportoDaRegolarizzare(BigDecimal importoDaRegolarizzare) {
		this.importoDaRegolarizzare = importoDaRegolarizzare;
	}

	public ContoTesoreria getContoTesoreria() {
		return contoTesoreria;
	}

	public void setContoTesoreria(ContoTesoreria contoTesoreria) {
		this.contoTesoreria = contoTesoreria;
	}

	public Soggetto getSoggetto() {
		return soggetto;
	}

	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	public Impegno getImpegno() {
		return impegno;
	}

	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

	public SubImpegno getSubImpegno() {
	 	return subImpegno;
	}

	public void setSubImpegno(SubImpegno subImpegno) {
	 	this.subImpegno = subImpegno;
	}

	public Date getDataInizioValidita() {
		return dataInizioValidita;
	}

	public void setDataInizioValidita(Date dataInizioValidita) {
		this.dataInizioValidita = dataInizioValidita;
	}

	public Date getDataFineValidita() {
		return dataFineValidita;
	}

	public void setDataFineValidita(Date dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}

	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public Date getDataModifica() {
		return dataModifica;
	}

	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}

	public Date getDataCancellazione() {
		return dataCancellazione;
	}

	public void setDataCancellazione(Date dataCancellazione) {
		this.dataCancellazione = dataCancellazione;
	}

	public Date getDataCreazioneSupport() {
		return dataCreazioneSupport;
	}

	public void setDataCreazioneSupport(Date dataCreazioneSupport) {
		this.dataCreazioneSupport = dataCreazioneSupport;
	}

	public String getUtenteOperazione() {
		return utenteOperazione;
	}

	public void setUtenteOperazione(String utenteOperazione) {
		this.utenteOperazione = utenteOperazione;
	}

	public List<SubdocumentoSpesa> getListaSubDocumentiSpesaCollegati() {
		return listaSubDocumentiSpesaCollegati;
	}

	public void setListaSubDocumentiSpesaCollegati(
			List<SubdocumentoSpesa> listaSubDocumentiSpesaCollegati) {
		this.listaSubDocumentiSpesaCollegati = listaSubDocumentiSpesaCollegati;
	}

	public List<Integer> getListaIdSubDocumentiCollegati() {
		return listaIdSubDocumentiCollegati;
	}

	public void setListaIdSubDocumentiCollegati(
			List<Integer> listaIdSubDocumentiCollegati) {
		this.listaIdSubDocumentiCollegati = listaIdSubDocumentiCollegati;
	}

	public SedeSecondariaSoggetto getSedeSecondariaSoggetto() {
		return sedeSecondariaSoggetto;
	}

	public void setSedeSecondariaSoggetto(
			SedeSecondariaSoggetto sedeSecondariaSoggetto) {
		this.sedeSecondariaSoggetto = sedeSecondariaSoggetto;
	}

	public ModalitaPagamentoSoggetto getModalitaPagamentoSoggetto() {
		return modalitaPagamentoSoggetto;
	}

	public void setModalitaPagamentoSoggetto(
			ModalitaPagamentoSoggetto modalitaPagamentoSoggetto) {
		this.modalitaPagamentoSoggetto = modalitaPagamentoSoggetto;
	}

	public Date getDataEsecuzioneRiga() {
		return dataEsecuzioneRiga;
	}

	public void setDataEsecuzioneRiga(Date dataEsecuzioneRiga) {
		this.dataEsecuzioneRiga = dataEsecuzioneRiga;
	}	
}