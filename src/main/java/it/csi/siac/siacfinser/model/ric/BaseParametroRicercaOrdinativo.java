/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public abstract class BaseParametroRicercaOrdinativo implements Serializable {

	private static final long serialVersionUID = -1L;

	private Integer annoEsercizio;

	private String descrizione;
	private List<String> statiDaEscludere;

	private BigInteger numeroOrdinativoDa;
	private BigInteger numeroOrdinativoA;
	private String statoOperativo;
	private Date dataEmissioneDa;
	private Date dataEmissioneA;
	private Date dataTrasmissioneOIL;
	private String codiceDistinta;
	private String contoDelTesoriere;

	private Integer annoCapitolo;
	private BigDecimal numeroCapitolo;
	private BigDecimal numeroArticolo;
	private Integer numeroUEB;

	private Integer annoProvvedimento;
	private BigDecimal numeroProvvedimento;
	private String tipoProvvedimento;
	private String codiceTipoProvvedimento;
	private String codiceStrutturaAmministrativa;
	private Integer uidStrutturaAmministrativoContabile;
	private Integer uidProvvedimento;

	private Integer annoProvvCassa;
	private BigDecimal numeroProvvCassa;

	// SIAC-6175
	private Integer daTrasmettere;

	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<String> getStatiDaEscludere() {
		return statiDaEscludere;
	}

	public void setStatiDaEscludere(List<String> statiDaEscludere) {
		this.statiDaEscludere = statiDaEscludere;
	}

	public BigInteger getNumeroOrdinativoDa() {
		return numeroOrdinativoDa;
	}

	public void setNumeroOrdinativoDa(BigInteger numeroOrdinativoDa) {
		this.numeroOrdinativoDa = numeroOrdinativoDa;
	}

	public BigInteger getNumeroOrdinativoA() {
		return numeroOrdinativoA;
	}

	public void setNumeroOrdinativoA(BigInteger numeroOrdinativoA) {
		this.numeroOrdinativoA = numeroOrdinativoA;
	}

	public String getStatoOperativo() {
		return statoOperativo;
	}

	public void setStatoOperativo(String statoOperativo) {
		this.statoOperativo = statoOperativo;
	}

	public Date getDataEmissioneDa() {
		return dataEmissioneDa;
	}

	public void setDataEmissioneDa(Date dataEmissioneDa) {
		this.dataEmissioneDa = dataEmissioneDa;
	}

	public Date getDataEmissioneA() {
		return dataEmissioneA;
	}

	public void setDataEmissioneA(Date dataEmissioneA) {
		this.dataEmissioneA = dataEmissioneA;
	}

	public Date getDataTrasmissioneOIL() {
		return dataTrasmissioneOIL;
	}

	public void setDataTrasmissioneOIL(Date dataTrasmissioneOIL) {
		this.dataTrasmissioneOIL = dataTrasmissioneOIL;
	}

	public String getCodiceDistinta() {
		return codiceDistinta;
	}

	public void setCodiceDistinta(String codiceDistinta) {
		this.codiceDistinta = codiceDistinta;
	}

	public String getContoDelTesoriere() {
		return contoDelTesoriere;
	}

	public void setContoDelTesoriere(String contoDelTesoriere) {
		this.contoDelTesoriere = contoDelTesoriere;
	}

	public Integer getAnnoCapitolo() {
		return annoCapitolo;
	}

	public void setAnnoCapitolo(Integer annoCapitolo) {
		this.annoCapitolo = annoCapitolo;
	}

	public BigDecimal getNumeroCapitolo() {
		return numeroCapitolo;
	}

	public void setNumeroCapitolo(BigDecimal numeroCapitolo) {
		this.numeroCapitolo = numeroCapitolo;
	}

	public BigDecimal getNumeroArticolo() {
		return numeroArticolo;
	}

	public void setNumeroArticolo(BigDecimal numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}

	public Integer getNumeroUEB() {
		return numeroUEB;
	}

	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
	}

	public Integer getAnnoProvvedimento() {
		return annoProvvedimento;
	}

	public void setAnnoProvvedimento(Integer annoProvvedimento) {
		this.annoProvvedimento = annoProvvedimento;
	}

	public BigDecimal getNumeroProvvedimento() {
		return numeroProvvedimento;
	}

	public void setNumeroProvvedimento(BigDecimal numeroProvvedimento) {
		this.numeroProvvedimento = numeroProvvedimento;
	}

	public String getTipoProvvedimento() {
		return tipoProvvedimento;
	}

	public void setTipoProvvedimento(String tipoProvvedimento) {
		this.tipoProvvedimento = tipoProvvedimento;
	}

	public String getCodiceTipoProvvedimento() {
		return codiceTipoProvvedimento;
	}

	public void setCodiceTipoProvvedimento(String codiceTipoProvvedimento) {
		this.codiceTipoProvvedimento = codiceTipoProvvedimento;
	}

	public String getCodiceStrutturaAmministrativa() {
		return codiceStrutturaAmministrativa;
	}

	public void setCodiceStrutturaAmministrativa(String codiceStrutturaAmministrativa) {
		this.codiceStrutturaAmministrativa = codiceStrutturaAmministrativa;
	}

	public Integer getUidStrutturaAmministrativoContabile() {
		return uidStrutturaAmministrativoContabile;
	}

	public void setUidStrutturaAmministrativoContabile(Integer uidStrutturaAmministrativoContabile) {
		this.uidStrutturaAmministrativoContabile = uidStrutturaAmministrativoContabile;
	}

	public Integer getUidProvvedimento() {
		return uidProvvedimento;
	}

	public void setUidProvvedimento(Integer uidProvvedimento) {
		this.uidProvvedimento = uidProvvedimento;
	}

	public Integer getAnnoProvvCassa() {
		return annoProvvCassa;
	}

	public void setAnnoProvvCassa(Integer annoProvvCassa) {
		this.annoProvvCassa = annoProvvCassa;
	}

	public BigDecimal getNumeroProvvCassa() {
		return numeroProvvCassa;
	}

	public void setNumeroProvvCassa(BigDecimal numeroProvvCassa) {
		this.numeroProvvCassa = numeroProvvCassa;
	}

	public Integer getDaTrasmettere() {
		return daTrasmettere;
	}

	public void setDaTrasmettere(Integer daTrasmettere) {
		this.daTrasmettere = daTrasmettere;
	}

}
