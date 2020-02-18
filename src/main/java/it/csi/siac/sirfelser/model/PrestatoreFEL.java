/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * PrestatoreFEL
 * 
 * @author Valentina
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class PrestatoreFEL extends Entita{
	
	private static final long serialVersionUID = 9018172246003890471L;

	private RegimeFiscaleFEL regimeFiscale;
	private Ente ente;
	
	private Integer idPrestatore;
	private String codicePaese;
	private String codicePrestatore;
	private String denominazionePrestatore;
	private String nomePrestatore;
	private String cognomePrestatore;
	private String provinciaAlboPrestatore;
	private String indirizzoPrestatore;
	private String numeroCivicoPrestatore;
	private String capPrestatore;
	private String comunePrestatore;
	private String provinciaPrestatore;
	private String nazionePrestatore;
	private String telefonoPrestatore;
	private String faxPrestatore;
	private String emailPrestatore;
	private Integer codBen;
	private Date dataInserimento;
	
	/**
	 * @return the regimeFiscale
	 */
	public RegimeFiscaleFEL getRegimeFiscale() {
		return regimeFiscale;
	}
	/**
	 * @param regimeFiscale the regimeFiscale to set
	 */
	public void setRegimeFiscale(RegimeFiscaleFEL regimeFiscale) {
		this.regimeFiscale = regimeFiscale;
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
	 * @return the idPrestatore
	 */
	public Integer getIdPrestatore() {
		return idPrestatore;
	}
	/**
	 * @param idPrestatore the idPrestatore to set
	 */
	public void setIdPrestatore(Integer idPrestatore) {
		this.idPrestatore = idPrestatore;
	}
	/**
	 * @return the codicePaese
	 */
	public String getCodicePaese() {
		return codicePaese;
	}
	/**
	 * @param codicePaese the codicePaese to set
	 */
	public void setCodicePaese(String codicePaese) {
		this.codicePaese = codicePaese;
	}
	/**
	 * @return the codicePrestatore
	 */
	public String getCodicePrestatore() {
		return codicePrestatore;
	}
	/**
	 * @param codicePrestatore the codicePrestatore to set
	 */
	public void setCodicePrestatore(String codicePrestatore) {
		this.codicePrestatore = codicePrestatore;
	}
	/**
	 * @return the denominazionePrestatore
	 */
	public String getDenominazionePrestatore() {
		return denominazionePrestatore;
	}
	/**
	 * @param denominazionePrestatore the denominazionePrestatore to set
	 */
	public void setDenominazionePrestatore(String denominazionePrestatore) {
		this.denominazionePrestatore = denominazionePrestatore;
	}
	/**
	 * @return the nomePrestatore
	 */
	public String getNomePrestatore() {
		return nomePrestatore;
	}
	/**
	 * @param nomePrestatore the nomePrestatore to set
	 */
	public void setNomePrestatore(String nomePrestatore) {
		this.nomePrestatore = nomePrestatore;
	}
	/**
	 * @return the cognomePrestatore
	 */
	public String getCognomePrestatore() {
		return cognomePrestatore;
	}
	/**
	 * @param cognomePrestatore the cognomePrestatore to set
	 */
	public void setCognomePrestatore(String cognomePrestatore) {
		this.cognomePrestatore = cognomePrestatore;
	}
	/**
	 * @return the provinciaAlboPrestatore
	 */
	public String getProvinciaAlboPrestatore() {
		return provinciaAlboPrestatore;
	}
	/**
	 * @param provinciaAlboPrestatore the provinciaAlboPrestatore to set
	 */
	public void setProvinciaAlboPrestatore(String provinciaAlboPrestatore) {
		this.provinciaAlboPrestatore = provinciaAlboPrestatore;
	}
	/**
	 * @return the indirizzoPrestatore
	 */
	public String getIndirizzoPrestatore() {
		return indirizzoPrestatore;
	}
	/**
	 * @param indirizzoPrestatore the indirizzoPrestatore to set
	 */
	public void setIndirizzoPrestatore(String indirizzoPrestatore) {
		this.indirizzoPrestatore = indirizzoPrestatore;
	}
	/**
	 * @return the numeroCivicoPrestatore
	 */
	public String getNumeroCivicoPrestatore() {
		return numeroCivicoPrestatore;
	}
	/**
	 * @param numeroCivicoPrestatore the numeroCivicoPrestatore to set
	 */
	public void setNumeroCivicoPrestatore(String numeroCivicoPrestatore) {
		this.numeroCivicoPrestatore = numeroCivicoPrestatore;
	}
	/**
	 * @return the capPrestatore
	 */
	public String getCapPrestatore() {
		return capPrestatore;
	}
	/**
	 * @param capPrestatore the capPrestatore to set
	 */
	public void setCapPrestatore(String capPrestatore) {
		this.capPrestatore = capPrestatore;
	}
	/**
	 * @return the comunePrestatore
	 */
	public String getComunePrestatore() {
		return comunePrestatore;
	}
	/**
	 * @param comunePrestatore the comunePrestatore to set
	 */
	public void setComunePrestatore(String comunePrestatore) {
		this.comunePrestatore = comunePrestatore;
	}
	/**
	 * @return the provinciaPrestatore
	 */
	public String getProvinciaPrestatore() {
		return provinciaPrestatore;
	}
	/**
	 * @param provinciaPrestatore the provinciaPrestatore to set
	 */
	public void setProvinciaPrestatore(String provinciaPrestatore) {
		this.provinciaPrestatore = provinciaPrestatore;
	}
	/**
	 * @return the nazionePrestatore
	 */
	public String getNazionePrestatore() {
		return nazionePrestatore;
	}
	/**
	 * @param nazionePrestatore the nazionePrestatore to set
	 */
	public void setNazionePrestatore(String nazionePrestatore) {
		this.nazionePrestatore = nazionePrestatore;
	}
	/**
	 * @return the telefonoPrestatore
	 */
	public String getTelefonoPrestatore() {
		return telefonoPrestatore;
	}
	/**
	 * @param telefonoPrestatore the telefonoPrestatore to set
	 */
	public void setTelefonoPrestatore(String telefonoPrestatore) {
		this.telefonoPrestatore = telefonoPrestatore;
	}
	/**
	 * @return the faxPrestatore
	 */
	public String getFaxPrestatore() {
		return faxPrestatore;
	}
	/**
	 * @param faxPrestatore the faxPrestatore to set
	 */
	public void setFaxPrestatore(String faxPrestatore) {
		this.faxPrestatore = faxPrestatore;
	}
	/**
	 * @return the emailPrestatore
	 */
	public String getEmailPrestatore() {
		return emailPrestatore;
	}
	/**
	 * @param emailPrestatore the emailPrestatore to set
	 */
	public void setEmailPrestatore(String emailPrestatore) {
		this.emailPrestatore = emailPrestatore;
	}
	/**
	 * @return the codBen
	 */
	public Integer getCodBen() {
		return codBen;
	}
	/**
	 * @param codBen the codBen to set
	 */
	public void setCodBen(Integer codBen) {
		this.codBen = codBen;
	}
	/**
	 * @return the dataInserimento
	 */
	public Date getDataInserimento() {
		return dataInserimento;
	}
	/**
	 * @param dataInserimento the dataInserimento to set
	 */
	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}
	
	
}
