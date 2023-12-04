/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.soggetto;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.datigeografici.Indirizzo;

/**
 * Il parametro idTipoIndirizzo contiene il codice,il quale verr&agrave; poi
 * decodificato dall'entit&agrave; TipoIndirizzo. La Nazione associata all'indirizzo,
 * verr&agrave; mappata tramite il paramentro codiceNazione.
 * 
 * @author andrea.colombo
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class IndirizzoSoggetto extends Indirizzo {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9184913670481215692L;

	private String principale;
	private String avviso;

	private Integer indirizzoId;
	private String indirizzoIdProvvisorio;

	private String idTipoIndirizzo;
	private String idTipoIndirizzoDesc;

	private String codiceIstatComune;
	private String comune;
	private Integer comuneUid;

	private String provincia;

	private String codiceNazione;

	private String nazione;

	private boolean checkPrincipale;
	private boolean checkAvviso;

	/*
	 * private TipoIndirizzo tipoIndirizzo;
	 * 
	 * @XmlType(namespace = FINDataDictionary.NAMESPACE) public enum
	 * TipoIndirizzo{SEDE_LEGALE,RESIDENZA,DOMICILIO_FISCALE,ALTERNATIVO}
	 */
	public String getPrincipale() {
		return principale;
	}

	public void setPrincipale(String principale) {
		this.principale = principale;
	}

	public String getAvviso() {
		return avviso;
	}

	public void setAvviso(String avviso) {
		this.avviso = avviso;
	}

	public String getCodiceIstatComune() {
		return codiceIstatComune;
	}

	public void setCodiceIstatComune(String codiceIstatComune) {
		this.codiceIstatComune = codiceIstatComune;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getIndirizzoFormattato() {
		StringBuilder indirizzoFormattato = new StringBuilder();

		if ("1".equals(codiceNazione))
			indirizzoFormattato.append(String.format("%s %s %s, %s %s - %s", getSedime(),
					getDenominazione(), getNumeroCivico(), getCap(), getComune(), getProvincia()));
		else
			indirizzoFormattato.append(String.format("%s %s %s, %s %s - %s", getSedime(),
					getDenominazione(), getNumeroCivico(), getCap(), getComune(), getNazione()));

		if (Boolean.parseBoolean(principale))
			indirizzoFormattato.append(" (principale)");

		if (Boolean.parseBoolean(avviso))
			indirizzoFormattato.append(" (recapito per avviso)");

		return indirizzoFormattato.toString();
	}

	public Integer getIndirizzoId() {
		return indirizzoId;
	}

	public void setIndirizzoId(Integer indirizzoId) {
		this.indirizzoId = indirizzoId;
	}

	public String getIdTipoIndirizzo() {
		return idTipoIndirizzo;
	}

	public void setIdTipoIndirizzo(String idTipoIndirizzo) {
		this.idTipoIndirizzo = idTipoIndirizzo;
	}

	public String getIdTipoIndirizzoDesc() {
		return idTipoIndirizzoDesc;
	}

	public void setIdTipoIndirizzoDesc(String idTipoIndirizzoDesc) {
		this.idTipoIndirizzoDesc = idTipoIndirizzoDesc;
	}

	public String getIndirizzoIdProvvisorio() {
		return indirizzoIdProvvisorio;
	}

	public void setIndirizzoIdProvvisorio(String indirizzoIdProvvisorio) {
		this.indirizzoIdProvvisorio = indirizzoIdProvvisorio;
	}

	public String getCodiceNazione() {
		return codiceNazione;
	}

	public void setCodiceNazione(String codiceNazione) {
		this.codiceNazione = codiceNazione;
	}

	public boolean isCheckPrincipale() {
		return checkPrincipale;
	}

	public void setCheckPrincipale(boolean checkPrincipale) {
		this.checkPrincipale = checkPrincipale;
	}

	public boolean isCheckAvviso() {
		return checkAvviso;
	}

	public void setCheckAvviso(boolean checkAvviso) {
		this.checkAvviso = checkAvviso;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public boolean isIndirizzoPrincipale() {
		if (principale != null)
			return Boolean.parseBoolean(principale);

		return false;
	}

	/**
	 * @return the comuneUid
	 */
	public Integer getComuneUid() {
		return comuneUid;
	}

	/**
	 * @param comuneUid the comuneUid to set
	 */
	public void setComuneUid(Integer comuneUid) {
		this.comuneUid = comuneUid;
	}

}
