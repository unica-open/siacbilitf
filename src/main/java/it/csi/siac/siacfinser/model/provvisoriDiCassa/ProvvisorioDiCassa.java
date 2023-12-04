/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.provvisoriDiCassa;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.ordinativo.Ordinativo;
import it.csi.siac.siacfinser.model.ordinativo.RegolarizzazioneProvvisorio;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ProvvisorioDiCassa extends EntitaEnte {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1441355860052520397L;

	private BigInteger idProvvisorioDiCassa;

	private Integer idRegolarizzazione;

	private Integer anno;
	private Integer numero;
	private String codiceContoEvidenza;
	private String descrizioneContoEvidenza;

	private Date dataEmissione;
	private Date dataTrasmissione;
	private Date dataAnnullamento;
	private Date dataRegolarizzazione;
	private Date dataConvalida;

	private BigDecimal importo;
	private BigDecimal importoDaRegolarizzare;
	private BigDecimal importoDaEmettere;

	private String importoFormatString;
	private String importoDaRegolarizzareFormatString;
	private String importoDaEmettereFormatString;

	private String causale;
	private String denominazioneSoggetto;
	private String subCausale;
	private String contoTesoriere;
	private String descTipoProvvisorioDiCassa;

	private List<Ordinativo> elencoOrdinativi;
	private List<RegolarizzazioneProvvisorio> elencoRegolarizzazioneProvvisori;

	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
	
	/**
	 * Serve solo per fin app non e' reso persistente
	 */
	private Boolean riportaInTestata;
	
	private Boolean accettato;

	private String note;

	private String codice;
	
	private Date dataInvioServizio;
	private Date dataPresaInCaricoServizio;
	private Date dataRifiutoErrataAttribuzione;
	

	// private List<PreDocumento> elencoPreDocumenti;
	// private List<SubDocumento> elencoSubDocumenti;

	private TipoProvvisorioDiCassa tipoProvvisorioDiCassa;

	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum TipoProvvisorioDiCassa {
		E, S
	}

	public BigInteger getIdProvvisorioDiCassa() {
		return idProvvisorioDiCassa;
	}

	public void setIdProvvisorioDiCassa(BigInteger idProvvisorioDiCassa) {
		this.idProvvisorioDiCassa = idProvvisorioDiCassa;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataAnnullamento() {
		return dataAnnullamento;
	}

	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataRegolarizzazione() {
		return dataRegolarizzazione;
	}

	public void setDataRegolarizzazione(Date dataRegolarizzazione) {
		this.dataRegolarizzazione = dataRegolarizzazione;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataConvalida() {
		return dataConvalida;
	}

	public void setDataConvalida(Date dataConvalida) {
		this.dataConvalida = dataConvalida;
	}

	public BigDecimal getImporto() {
		return importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

	public BigDecimal getImportoDaRegolarizzare() {
		return importoDaRegolarizzare;
	}

	public void setImportoDaRegolarizzare(BigDecimal importoDaRegolarizzare) {
		this.importoDaRegolarizzare = importoDaRegolarizzare;
	}

	public BigDecimal getImportoRegolarizzato() {
		BigDecimal val1BD = getImporto()                != null ?  getImporto() : new BigDecimal(0);
		BigDecimal val2BD = getImportoDaRegolarizzare() != null ?  getImportoDaRegolarizzare() : new BigDecimal(0);
		return val1BD.subtract(val2BD);
	}

	
	public void setImportoDaRegolarizzare(String importoDaRegolarizzare) {
		if (importoDaRegolarizzare != null && !isEmpty(importoDaRegolarizzare)) {
			setImportoDaRegolarizzare(convertiImportoToBigDecimal(importoDaRegolarizzare));
		}

	}

	public BigDecimal getImportoDaEmettere() {
		return importoDaEmettere;
	}

	public void setImportoDaEmettere(BigDecimal importoDaEmettere) {
		this.importoDaEmettere = importoDaEmettere;
	}

	public String getCausale() {
		return causale;
	}

	public void setCausale(String causale) {
		this.causale = causale;
	}

	public String getDenominazioneSoggetto() {
		return denominazioneSoggetto;
	}

	public void setDenominazioneSoggetto(String denominazioneSoggetto) {
		this.denominazioneSoggetto = denominazioneSoggetto;
	}

	public String getSubCausale() {
		return subCausale;
	}

	public void setSubCausale(String subCausale) {
		this.subCausale = subCausale;
	}

	public TipoProvvisorioDiCassa getTipoProvvisorioDiCassa() {
		return tipoProvvisorioDiCassa;
	}

	public void setTipoProvvisorioDiCassa(TipoProvvisorioDiCassa tipoProvvisorioDiCassa) {
		this.tipoProvvisorioDiCassa = tipoProvvisorioDiCassa;
	}

	public List<Ordinativo> getElencoOrdinativi() {
		return elencoOrdinativi;
	}

	public void setElencoOrdinativi(List<Ordinativo> elencoOrdinativi) {
		this.elencoOrdinativi = elencoOrdinativi;
	}

	public String getDescTipoProvvisorioDiCassa() {
		return descTipoProvvisorioDiCassa;
	}

	public void setDescTipoProvvisorioDiCassa(String descTipoProvvisorioDiCassa) {
		this.descTipoProvvisorioDiCassa = descTipoProvvisorioDiCassa;
	}

	public String getImportoFormatString() {
		return importoFormatString;
	}

	public void setImportoFormatString(String importoFormatString) {
		this.importoFormatString = importoFormatString;
	}

	public String getImportoDaRegolarizzareFormatString() {
		return importoDaRegolarizzareFormatString;
	}

	public void setImportoDaRegolarizzareFormatString(String importoDaRegolarizzareFormatString) {
		this.importoDaRegolarizzareFormatString = importoDaRegolarizzareFormatString;
	}

	public String getImportoDaEmettereFormatString() {
		return importoDaEmettereFormatString;
	}

	public void setImportoDaEmettereFormatString(String importoDaEmettereFormatString) {
		this.importoDaEmettereFormatString = importoDaEmettereFormatString;
	}

	public List<RegolarizzazioneProvvisorio> getElencoRegolarizzazioneProvvisori() {
		return elencoRegolarizzazioneProvvisori;
	}

	public void setElencoRegolarizzazioneProvvisori(List<RegolarizzazioneProvvisorio> elencoRegolarizzazioneProvvisori) {
		this.elencoRegolarizzazioneProvvisori = elencoRegolarizzazioneProvvisori;
	}

	public Integer getIdRegolarizzazione() {
		return idRegolarizzazione;
	}

	public void setIdRegolarizzazione(Integer idRegolarizzazione) {
		this.idRegolarizzazione = idRegolarizzazione;
	}

	private static boolean isEmpty(String s) {
		return s == null || "".equals(s.trim());
	}

	public Boolean getRiportaInTestata() {
		return riportaInTestata;
	}

	public void setRiportaInTestata(Boolean riportaInTestata) {
		this.riportaInTestata = riportaInTestata;
	}

	private static BigDecimal convertiImportoToBigDecimal(String importoFormattato) {

		String importoString = importoFormattato;

		if (null != importoString && importoString.contains(".")) {
			importoString = importoString.replace(".", "");
			if (isEmpty(importoString))
				importoString = "0";
		}

		if (null != importoString && importoString.contains(",")) {

			importoString = importoString.replace(",", ".");
			if (isEmpty(importoString))
				importoString = "0";
		}

		return new BigDecimal(importoString).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}

	public void setStrutturaAmministrativoContabile(StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}

	public Date getDataTrasmissione() {
		return dataTrasmissione;
	}

	public void setDataTrasmissione(Date dataTrasmissione) {
		this.dataTrasmissione = dataTrasmissione;
	}

	public Boolean getAccettato() {
		return accettato;
	}

	public void setAccettato(Boolean accettato) {
		this.accettato = accettato;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getDataCreazioneProvv() {
		return super.getDataCreazione();
	}
	
	public Date getDataModificaProvv() {
		return super.getDataModifica();
	}

	public void setDataCreazioneProvv(Date dataCreazione) {
		super.setDataCreazione(dataCreazione);
	}

	public void setDataModificaProvv(Date dataModifica) {
		super.setDataModifica(dataModifica);
	}

	public String getCodiceContoEvidenza() {
		return codiceContoEvidenza;
	}

	public void setCodiceContoEvidenza(String codiceContoEvidenza) {
		this.codiceContoEvidenza = codiceContoEvidenza;
	}

	public String getDescrizioneContoEvidenza() {
		return descrizioneContoEvidenza;
	}

	public void setDescrizioneContoEvidenza(String descrizioneContoEvidenza) {
		this.descrizioneContoEvidenza = descrizioneContoEvidenza;
	}

	public String getContoTesoriere() {
		return contoTesoriere;
	}

	public void setContoTesoriere(String contoTesoriere) {
		this.contoTesoriere = contoTesoriere;
	}

	public Date getDataInvioServizio() {
		return dataInvioServizio;
	}

	public void setDataInvioServizio(Date dataInvioServizio) {
		this.dataInvioServizio = dataInvioServizio;
	}

	public Date getDataPresaInCaricoServizio() {
		return dataPresaInCaricoServizio;
	}

	public void setDataPresaInCaricoServizio(Date dataPresaInCaricoServizio) {
		this.dataPresaInCaricoServizio = dataPresaInCaricoServizio;
	}

	public Date getDataRifiutoErrataAttribuzione() {
		return dataRifiutoErrataAttribuzione;
	}

	public void setDataRifiutoErrataAttribuzione(Date dataRifiutoErrataAttribuzione) {
		this.dataRifiutoErrataAttribuzione = dataRifiutoErrataAttribuzione;
	}

	public String getCodice() {
		return codice;
	}

	//SIAC-6780
	public void setCodice(String codice) {
		//il codice lo utilizzo per ottenre anno e numero
		this.anno = Integer.valueOf(codice.substring(0, 4));
		this.numero = Integer.valueOf(codice.substring(5));
	}
	
	
	
}