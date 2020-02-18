/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siacbilser.business.utility.DummyMapper;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class DatiAnagraficiPreDocumentoSpesa extends DatiAnagraficiPreDocumento {
	
	private static final long serialVersionUID = -8529046468267644272L;
	
	private String intestazioneConto;
	private String codiceABI;
	private String codiceCAB;
	private String contoCorrente;
	private String codiceIban;
	private String codiceBic;
	private String soggettoQuietanzante;
	private String codiceFiscaleQuietanzante;
	
	/**
	 * Costruttore vuoto
	 */
	public DatiAnagraficiPreDocumentoSpesa() {
		// Costruttore vuoto
	}
	
	/**
	 * Costruttore a partire dalla sua sottoclasse.
	 * 
	 * @param dapd
	 */
	public DatiAnagraficiPreDocumentoSpesa(DatiAnagraficiPreDocumento dapd) {
		DummyMapper.mapNotNullNotEmpty(dapd, this);
	}	
	
	/**
	 * @return the intestazioneConto
	 */
	public String getIntestazioneConto() {
		return intestazioneConto;
	}
	/**
	 * @param intestazioneConto the intestazioneConto to set
	 */
	public void setIntestazioneConto(String intestazioneConto) {
		this.intestazioneConto = intestazioneConto;
	}
	/**
	 * @return the codiceABI
	 */
	public String getCodiceABI() {
		return codiceABI;
	}
	/**
	 * @param codiceABI the codiceABI to set
	 */
	public void setCodiceABI(String codiceABI) {
		this.codiceABI = codiceABI;
	}
	/**
	 * @return the codiceCAB
	 */
	public String getCodiceCAB() {
		return codiceCAB;
	}
	/**
	 * @param codiceCAB the codiceCAB to set
	 */
	public void setCodiceCAB(String codiceCAB) {
		this.codiceCAB = codiceCAB;
	}
	/**
	 * @return the contoCorrente
	 */
	public String getContoCorrente() {
		return contoCorrente;
	}
	/**
	 * @param contoCorrente the contoCorrente to set
	 */
	public void setContoCorrente(String contoCorrente) {
		this.contoCorrente = contoCorrente;
	}
	/**
	 * @return the codiceIban
	 */
	public String getCodiceIban() {
		return codiceIban;
	}
	/**
	 * @param codiceIban the codiceIban to set
	 */
	public void setCodiceIban(String codiceIban) {
		this.codiceIban = codiceIban;
	}
	/**
	 * @return the codiceBic
	 */
	public String getCodiceBic() {
		return codiceBic;
	}
	/**
	 * @param codiceBic the codiceBic to set
	 */
	public void setCodiceBic(String codiceBic) {
		this.codiceBic = codiceBic;
	}
	/**
	 * @return the soggettoQuietanzante
	 */
	public String getSoggettoQuietanzante() {
		return soggettoQuietanzante;
	}
	/**
	 * @param soggettoQuietanzante the soggettoQuietanzante to set
	 */
	public void setSoggettoQuietanzante(String soggettoQuietanzante) {
		this.soggettoQuietanzante = soggettoQuietanzante;
	}
	/**
	 * @return the codiceFiscaleQuietanzante
	 */
	public String getCodiceFiscaleQuietanzante() {
		return codiceFiscaleQuietanzante;
	}
	/**
	 * @param codiceFiscaleQuietanzante the codiceFiscaleQuietanzante to set
	 */
	public void setCodiceFiscaleQuietanzante(String codiceFiscaleQuietanzante) {
		this.codiceFiscaleQuietanzante = codiceFiscaleQuietanzante;
	}

}
