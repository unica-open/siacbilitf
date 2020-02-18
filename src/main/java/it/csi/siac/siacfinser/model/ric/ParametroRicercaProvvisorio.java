/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa.TipoProvvisorioDiCassa;

/**
 * Attributi dell'entit&agrave; di supporto ParametroRicercaprovvisorio
 *
 * @author fb
 *
 */

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaProvvisorio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 137283467797433422L;

	private TipoProvvisorioDiCassa tipoProvvisorio; 
	
	private Integer anno;
	private Integer numero;
	
	//aggiuntive per servizio inserisci ordinativo	
	private Integer annoDa;
	private Integer numeroDa;
	private Integer annoA;
	private Integer numeroA;	
	//fine aggiuntive
	
	private String descCausale;
	private String denominazioneSoggetto;
	private String subCausale;
	private String contoTesoriere;

	private String flagDaRegolarizzare;
	private String flagAnnullato;
	
	private Date dataInizioEmissione;
	private Date dataFineEmissione;
	
	private Date dataInizioTrasmissione;
	private Date dataFineTrasmissione;
	
	// SIAC-6879
	private Date dataInizioInvioServizio;
	private Date dataFineInvioServizio;
	private Date dataInizioRifiutoErrataAttribuzione;
	private Date dataFineRifiutoErrataAttribuzione;
	
	private BigDecimal importoDa;
	private BigDecimal importoA;
	
	private Integer idStrutturaAmministrativa;
	
	private Boolean flagProvvisoriPagoPA;
	
	//SIAC-6981
	private Boolean escludiProvvisoriConImportoDaEmettereZero;
	
	//private ContoTesoreria ContoTesoreria;
	
	public TipoProvvisorioDiCassa getTipoProvvisorio() {
		return tipoProvvisorio;
	}
	
	public void setTipoProvvisorio(TipoProvvisorioDiCassa tipoProvvisorio) {
		this.tipoProvvisorio = tipoProvvisorio;
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
	
	public String getDescCausale() {
		return descCausale;
	}
	
	public void setDescCausale(String causale) {
		this.descCausale = causale;
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
	
	public String getFlagDaRegolarizzare() {
		return flagDaRegolarizzare;
	}
	
	public void setFlagDaRegolarizzare(String flagDaRegolarizzare) {
		this.flagDaRegolarizzare = flagDaRegolarizzare;
	}
	
	public String getFlagAnnullato() {
		return flagAnnullato;
	}
	
	public void setFlagAnnullato(String flagAnnullato) {
		this.flagAnnullato = flagAnnullato;
	}
	
	public Date getDataInizioEmissione() {
		return dataInizioEmissione;
	}
	
	public void setDataInizioEmissione(Date dataInizio) {
		this.dataInizioEmissione = dataInizio;
	}
	
	public Date getDataFineEmissione() {
		return dataFineEmissione;
	}
	
	public void setDataFineEmissione(Date dataFine) {
		this.dataFineEmissione = dataFine;
	}

	public Integer getAnnoDa() {
		return annoDa;
	}

	public Integer getNumeroDa() {
		return numeroDa;
	}

	public Integer getAnnoA() {
		return annoA;
	}

	public Integer getNumeroA() {
		return numeroA;
	}

	public void setAnnoDa(Integer annoDa) {
		this.annoDa = annoDa;
	}

	public void setNumeroDa(Integer numeroDa) {
		this.numeroDa = numeroDa;
	}

	public void setAnnoA(Integer annoA) {
		this.annoA = annoA;
	}

	public void setNumeroA(Integer numeroA) {
		this.numeroA = numeroA;
	}

	public BigDecimal getImportoDa() {
		return importoDa;
	}

	public void setImportoDa(BigDecimal importoDa) {
		this.importoDa = importoDa;
	}

	public BigDecimal getImportoA() {
		return importoA;
	}

	public void setImportoA(BigDecimal importoA) {
		this.importoA = importoA;
	}

	public Integer getIdStrutturaAmministrativa() {
		return idStrutturaAmministrativa;
	}

	public void setIdStrutturaAmministrativa(Integer idStrutturaAmministrativa) {
		this.idStrutturaAmministrativa = idStrutturaAmministrativa;
	}

	public Date getDataInizioTrasmissione() {
		return dataInizioTrasmissione;
	}

	public void setDataInizioTrasmissione(Date dataInizioTrasmissione) {
		this.dataInizioTrasmissione = dataInizioTrasmissione;
	}

	public Date getDataFineTrasmissione() {
		return dataFineTrasmissione;
	}

	public void setDataFineTrasmissione(Date dataFineTrasmissione) {
		this.dataFineTrasmissione = dataFineTrasmissione;
	}

	public String getContoTesoriere() {
		return contoTesoriere;
	}

	public void setContoTesoriere(String contoTesoriere) {
		this.contoTesoriere = contoTesoriere;
	}

	/**
	 * @return the flagProvvisoriPagoPA
	 */
	public Boolean getFlagProvvisoriPagoPA() {
		return flagProvvisoriPagoPA;
	}

	/**
	 * @param flagProvvisoriPagoPA the flagProvvisoriPagoPA to set
	 */
	public void setFlagProvvisoriPagoPA(Boolean flagProvvisoriPagoPA) {
		this.flagProvvisoriPagoPA = flagProvvisoriPagoPA;
	}

	/**
	 * @return the escludiProvvisoriConImportoDaemettereZero
	 */
	public Boolean getEscludiProvvisoriConImportoDaEmettereZero() {
		return escludiProvvisoriConImportoDaEmettereZero;
	}

	/**
	 * @param escludiProvvisoriConImportoDaemettereZero the escludiProvvisoriConImportoDaemettereZero to set
	 */
	public void setEscludiProvvisoriConImportoDaEmettereZero(Boolean escludiProvvisoriConImportoDaEmettereZero) {
		this.escludiProvvisoriConImportoDaEmettereZero = escludiProvvisoriConImportoDaEmettereZero;
	}

	public Date getDataInizioInvioServizio() {
		return dataInizioInvioServizio;
	}

	public void setDataInizioInvioServizio(Date dataInizioInvioServizio) {
		this.dataInizioInvioServizio = dataInizioInvioServizio;
	}

	public Date getDataFineInvioServizio() {
		return dataFineInvioServizio;
	}

	public void setDataFineInvioServizio(Date dataFineInvioServizio) {
		this.dataFineInvioServizio = dataFineInvioServizio;
	}

	public Date getDataInizioRifiutoErrataAttribuzione() {
		return dataInizioRifiutoErrataAttribuzione;
	}

	public void setDataInizioRifiutoErrataAttribuzione(Date dataInizioRifiutoErrataAttribuzione) {
		this.dataInizioRifiutoErrataAttribuzione = dataInizioRifiutoErrataAttribuzione;
	}

	public Date getDataFineRifiutoErrataAttribuzione() {
		return dataFineRifiutoErrataAttribuzione;
	}

	public void setDataFineRifiutoErrataAttribuzione(Date dataFineRifiutoErrataAttribuzione) {
		this.dataFineRifiutoErrataAttribuzione = dataFineRifiutoErrataAttribuzione;
	}

	
}
