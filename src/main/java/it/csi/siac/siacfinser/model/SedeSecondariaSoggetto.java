/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * SedeSecondariaSoggetto
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class SedeSecondariaSoggetto extends EntitaEnte {

	private static final long serialVersionUID = -2492881506934660324L;
	
	private String nomeSede, statoSede, dataStato, inModifica, sedime, nomeVia, numeroCivico, cap, citta, provincia, telefono, cellulare, fax, contatto, email, pec, www;
	private Boolean avvisoIndirizzo, avvisoEmail, avvisoPec;
	private Date dataInserimento, dataModifica;

	private Long idStato, idComune;
	public String getNomeSede() {
		return nomeSede;
	}
	public void setNomeSede(String nomeSede) {
		this.nomeSede = nomeSede;
	}
	public String getStatoSede() {
		return statoSede;
	}
	public void setStatoSede(String statoSede) {
		this.statoSede = statoSede;
	}
	public String getDataStato() {
		return dataStato;
	}
	public void setDataStato(String dataStato) {
		this.dataStato = dataStato;
	}
	public String getInModifica() {
		return inModifica;
	}
	public void setInModifica(String inModifica) {
		this.inModifica = inModifica;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCellulare() {
		return cellulare;
	}
	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getContatto() {
		return contatto;
	}
	public void setContatto(String contatto) {
		this.contatto = contatto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPec() {
		return pec;
	}
	public void setPec(String pec) {
		this.pec = pec;
	}
	public String getWww() {
		return www;
	}
	public void setWww(String www) {
		this.www = www;
	}
	public Boolean getAvvisoIndirizzo() {
		return avvisoIndirizzo;
	}
	public void setAvvisoIndirizzo(Boolean avvisoIndirizzo) {
		this.avvisoIndirizzo = avvisoIndirizzo;
	}
	public Boolean getAvvisoEmail() {
		return avvisoEmail;
	}
	public void setAvvisoEmail(Boolean avvisoEmail) {
		this.avvisoEmail = avvisoEmail;
	}
	public Boolean getAvvisoPec() {
		return avvisoPec;
	}
	public void setAvvisoPec(Boolean avvisoPec) {
		this.avvisoPec = avvisoPec;
	}
	public Date getDataInserimento() {
		return dataInserimento;
	}
	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}
	public Date getDataModifica() {
		return dataModifica;
	}
	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}
	public String getSedime() {
		return sedime;
	}
	public void setSedime(String sedime) {
		this.sedime = sedime;
	}
	public String getNomeVia() {
		return nomeVia;
	}
	public void setNomeVia(String nomeVia) {
		this.nomeVia = nomeVia;
	}
	public String getNumeroCivico() {
		return numeroCivico;
	}
	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public Long getIdStato() {
		return idStato;
	}
	public void setIdStato(Long idStato) {
		this.idStato = idStato;
	}
	public Long getIdComune() {
		return idComune;
	}
	public void setIdComune(Long idComune) {
		this.idComune = idComune;
	}
	
}
