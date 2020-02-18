/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.mutuo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * Ad ogni voce di mutuo &eacute; possibile collegare una liquidazione;
 * Per le voci mutuo si possono effettuare operazioni di Economia, Riduzione, Storno.
 *  @author
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class VoceMutuo extends Entita {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3954128039139154358L;

	private BigDecimal idMutuo;
	private String numeroMutuo;
	
	private BigDecimal idVoceMutuo;
	private String numeroVoceMutuo;
	
	private String descrizioneVoceMutuo;
	private String descrizioneMutuo;
	private Soggetto istitutoMutuante;
	
	// l'attributo calcolato "liquidatoVoce" - la sommatoria degli importi liquidazioni su impegno/mutuo(voce mutuo)
	private BigDecimal importoLiquidatoVoceMutuo;
	
	private BigDecimal importoDisponibileLiquidareVoceMutuo;
	
	// quando nasce la voce (valutare se mantenere)
	private BigDecimal importoInizialeVoceMutuo;
	
	// l'importo attuale della voce di mutuo e' uguale alla sommatoria degli importi variazione.
	private BigDecimal importoAttualeVoceMutuo;
	// l'importo disponibile sull'impegno e' la somma delle modifiche di tipo RIU 
	private BigDecimal importoDisponibileModificheImpegno;
	// importi variazione suddivisi per tipologia
	private BigDecimal importoVariazioniEconomia;
	private BigDecimal importoVariazioniRiduzione;
	private BigDecimal importoVariazioniStorno;
	private BigDecimal importoVariazioniResiduo;
	
	private Date dataInizioValidita;
	private Date dataFineValidita;
	private Date dataCreazione;
	private Date dataModifica;
	private Date dataCancellazione;
	
	private String loginCancellazione;
	private String loginCreazione;
	private String loginModifica;

	// da verificare successivamente quando avremo la tavola sul db (siac_d_mutuo_voce_tipo)
	private OrigineVoceMutuo origineVoceMutuo;
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum OrigineVoceMutuo{
		ORIGINALE, STORNO, DA_RESIDUO
	}
	
	private ClassificatoreGenerico origineVoceMutuoClassificatore;
	
	private Impegno impegno;
//	private SubImpegno subImpegno;
	private Liquidazione liquidazione;
	
	private Mutuo mutuo;
	
	List<VariazioneImportoVoceMutuo> listaVariazioniImportoVoceMutuo;

	public BigDecimal getImportoLiquidatoVoceMutuo() {
		return importoLiquidatoVoceMutuo;
	}

	public void setImportoLiquidatoVoceMutuo(BigDecimal importoLiquidatoVoceMutuo) {
		this.importoLiquidatoVoceMutuo = importoLiquidatoVoceMutuo;
	}

	public BigDecimal getImportoDisponibileLiquidareVoceMutuo() {
		return importoDisponibileLiquidareVoceMutuo;
	}

	public void setImportoDisponibileLiquidareVoceMutuo(
			BigDecimal importoDisponibileLiquidareVoceMutuo) {
		this.importoDisponibileLiquidareVoceMutuo = importoDisponibileLiquidareVoceMutuo;
	}

	public BigDecimal getImportoInizialeVoceMutuo() {
		return importoInizialeVoceMutuo;
	}

	public void setImportoInizialeVoceMutuo(BigDecimal importoInizialeVoceMutuo) {
		this.importoInizialeVoceMutuo = importoInizialeVoceMutuo;
	}

	public BigDecimal getImportoAttualeVoceMutuo() {
		return importoAttualeVoceMutuo;
	}

	public void setImportoAttualeVoceMutuo(BigDecimal importoAttualeVoceMutuo) {
		this.importoAttualeVoceMutuo = importoAttualeVoceMutuo;
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

	public String getLoginCancellazione() {
		return loginCancellazione;
	}

	public void setLoginCancellazione(String loginCancellazione) {
		this.loginCancellazione = loginCancellazione;
	}

	public String getLoginCreazione() {
		return loginCreazione;
	}

	public void setLoginCreazione(String loginCreazione) {
		this.loginCreazione = loginCreazione;
	}

	public String getLoginModifica() {
		return loginModifica;
	}

	public void setLoginModifica(String loginModifica) {
		this.loginModifica = loginModifica;
	}

	public OrigineVoceMutuo getOrigineVoceMutuo() {
		return origineVoceMutuo;
	}

	public void setOrigineVoceMutuo(OrigineVoceMutuo origineVoceMutuo) {
		this.origineVoceMutuo = origineVoceMutuo;
	}

	public Impegno getImpegno() {
		return impegno;
	}

	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

//	public SubImpegno getSubImpegno() {
//		return subImpegno;
//	}
//
//	public void setSubImpegno(SubImpegno subImpegno) {
//		this.subImpegno = subImpegno;
//	}

	public Liquidazione getLiquidazione() {
		return liquidazione;
	}

	public void setLiquidazione(Liquidazione liquidazione) {
		this.liquidazione = liquidazione;
	}

	public List<VariazioneImportoVoceMutuo> getListaVariazioniImportoVoceMutuo() {
		return listaVariazioniImportoVoceMutuo;
	}

	public void setListaVariazioniImportoVoceMutuo(
			List<VariazioneImportoVoceMutuo> listaVariazioniImportoVoceMutuo) {
		this.listaVariazioniImportoVoceMutuo = listaVariazioniImportoVoceMutuo;
	}

	public ClassificatoreGenerico getOrigineVoceMutuoClassificatore() {
		return origineVoceMutuoClassificatore;
	}

	public void setOrigineVoceMutuoClassificatore(
			ClassificatoreGenerico origineVoceMutuoClassificatore) {
		this.origineVoceMutuoClassificatore = origineVoceMutuoClassificatore;
	}

	public BigDecimal getIdVoceMutuo() {
		return idVoceMutuo;
	}

	public void setIdVoceMutuo(BigDecimal idVoceMutuo) {
		this.idVoceMutuo = idVoceMutuo;
	}

	public String getDescrizioneVoceMutuo() {
		return descrizioneVoceMutuo;
	}

	public void setDescrizioneVoceMutuo(String descrizioneVoceMutuo) {
		this.descrizioneVoceMutuo = descrizioneVoceMutuo;
	}

	public String getNumeroVoceMutuo() {
		return numeroVoceMutuo;
	}

	public void setNumeroVoceMutuo(String numeroVoceMutuo) {
		this.numeroVoceMutuo = numeroVoceMutuo;
	}

	public BigDecimal getImportoVariazioniEconomia() {
		return importoVariazioniEconomia;
	}

	public void setImportoVariazioniEconomia(BigDecimal importoVariazioniEconomia) {
		this.importoVariazioniEconomia = importoVariazioniEconomia;
	}

	public BigDecimal getImportoVariazioniRiduzione() {
		return importoVariazioniRiduzione;
	}

	public void setImportoVariazioniRiduzione(BigDecimal importoVariazioniRiduzione) {
		this.importoVariazioniRiduzione = importoVariazioniRiduzione;
	}

	public BigDecimal getImportoVariazioniStorno() {
		return importoVariazioniStorno;
	}

	public void setImportoVariazioniStorno(BigDecimal importoVariazioniStorno) {
		this.importoVariazioniStorno = importoVariazioniStorno;
	}

	public BigDecimal getImportoVariazioniResiduo() {
		return importoVariazioniResiduo;
	}

	public void setImportoVariazioniResiduo(BigDecimal importoVariazioniResiduo) {
		this.importoVariazioniResiduo = importoVariazioniResiduo;
	}

	public BigDecimal getImportoDisponibileModificheImpegno() {
		return importoDisponibileModificheImpegno;
	}

	public void setImportoDisponibileModificheImpegno(BigDecimal importoDisponibileModificheImpegno) {
		this.importoDisponibileModificheImpegno = importoDisponibileModificheImpegno;
	}

	public BigDecimal getIdMutuo() {
		return idMutuo;
	}

	public void setIdMutuo(BigDecimal idMutuo) {
		this.idMutuo = idMutuo;
	}

	public String getNumeroMutuo() {
		return numeroMutuo;
	}

	public void setNumeroMutuo(String numeroMutuo) {
		this.numeroMutuo = numeroMutuo;
	}

	public String getDescrizioneMutuo() {
		return descrizioneMutuo;
	}

	public void setDescrizioneMutuo(String descrizioneMutuo) {
		this.descrizioneMutuo = descrizioneMutuo;
	}

	public Soggetto getIstitutoMutuante() {
		return istitutoMutuante;
	}

	public void setIstitutoMutuante(Soggetto istitutoMutuante) {
		this.istitutoMutuante = istitutoMutuante;
	}

	public Mutuo getMutuo() {
	    return mutuo;
	}

	public void setMutuo(Mutuo mutuo) {
	    this.mutuo = mutuo;
	}
}
