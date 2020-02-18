/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.soggetto.modpag;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ModalitaPagamentoSoggettoCessioni extends Entita{
	
	private static final long serialVersionUID = 135020805232302368L;
   	
	//campi r_soggetto_relaz (Relazione cessione)
	private Integer tipoRelazCessioneId;
	private Integer cessioneSoggettoDa;
	private Integer cessioneSoggettoA;
	    	
	private Date dataInizioValidita;
	private Date dataFineValidita;
	private Date dataCreazione;
	private Date dataModifica;
	private Date dataCancellazione;
	
	//campi r_soggrel_modpag (associaz cessione a mdp dest)
	private Integer soggettoRelazId;
	private Integer modpagId;
	private String note;
	
	private String loginCancellazione;
	private String loginCreazione;
	private String loginModifica;
	
	//campi r_soggetto_relaz_stato (stato cessione)
	Integer idStatoModalitaCessione;
	String codiceStatoModalitaCessione;
	String descrizioneStatoModalitaCessione;
	
	public Integer getTipoRelazCessioneId() {
		return tipoRelazCessioneId;
	}
	public void setTipoRelazCessioneId(Integer tipoRelazCessioneId) {
		this.tipoRelazCessioneId = tipoRelazCessioneId;
	}
	public Integer getCessioneSoggettoDa() {
		return cessioneSoggettoDa;
	}
	public void setCessioneSoggettoDa(Integer cessioneSoggettoDa) {
		this.cessioneSoggettoDa = cessioneSoggettoDa;
	}
	public Integer getCessioneSoggettoA() {
		return cessioneSoggettoA;
	}
	public void setCessioneSoggettoA(Integer cessioneSoggettoA) {
		this.cessioneSoggettoA = cessioneSoggettoA;
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
	public Integer getSoggettoRelazId() {
		return soggettoRelazId;
	}
	public void setSoggettoRelazId(Integer soggettoRelazId) {
		this.soggettoRelazId = soggettoRelazId;
	}
	public Integer getModpagId() {
		return modpagId;
	}
	public void setModpagId(Integer modpagId) {
		this.modpagId = modpagId;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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
	public Integer getIdStatoModalitaCessione() {
		return idStatoModalitaCessione;
	}
	public void setIdStatoModalitaCessione(Integer idStatoModalitaCessione) {
		this.idStatoModalitaCessione = idStatoModalitaCessione;
	}
	public String getCodiceStatoModalitaCessione() {
		return codiceStatoModalitaCessione;
	}
	public void setCodiceStatoModalitaCessione(String codiceStatoModalitaCessione) {
		this.codiceStatoModalitaCessione = codiceStatoModalitaCessione;
	}
	public String getDescrizioneStatoModalitaCessione() {
		return descrizioneStatoModalitaCessione;
	}
	public void setDescrizioneStatoModalitaCessione(
			String descrizioneStatoModalitaCessione) {
		this.descrizioneStatoModalitaCessione = descrizioneStatoModalitaCessione;
	}
	  
 
}
