/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.soggetto;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.Constanti;
import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
* Soggetto
* 
* @author paolos
* 
*/
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Contatto extends Entita {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8520704702217704029L;
	
	private String descrizione;
	private String contattoCod;
	private String avviso;
	
	private String descrizioneModo;
	private String contattoCodModo;
	
	//id su drecapitomodo
	private Integer idTipoContatto;
	private String codTipoContatto;
	
	private String uidProvvisiorio;
		
	/*	
	private TipoContatto tipoContatto;
	
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum TipoContatto{TELEFONO,PERSONA, TELEFONO_SECONDARIO, FAX, MAIL, PEC, SITO_WEB}
	*/
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getAvviso() {
		return avviso;
	}
	public void setAvviso(String avviso) {
		this.avviso = avviso;
	}
	public Integer getIdTipoContatto() {
		return idTipoContatto;
	}
	public void setIdTipoContatto(Integer idTipoContatto) {
		this.idTipoContatto = idTipoContatto;
	}
	public String getCodTipoContatto() {
		return codTipoContatto;
	}
	public void setCodTipoContatto(String codTipoContatto) {
		this.codTipoContatto = codTipoContatto;
	}
	public String getContattoCod() {
		return contattoCod;
	}
	public void setContattoCod(String contattoCod) {
		this.contattoCod = contattoCod;
	}
	public String getDescrizioneModo() {
		return descrizioneModo;
	}
	public void setDescrizioneModo(String descrizioneModo) {
		this.descrizioneModo = descrizioneModo;
	}
	public String getContattoCodModo() {
		return contattoCodModo;
	}
	public void setContattoCodModo(String contattoCodModo) {
		this.contattoCodModo = contattoCodModo;
	}
	public String getContattoFormattato() {
		return getContattoCod() + " " + getDescrizione() + ((avviso != null && Constanti.TRUE.equalsIgnoreCase(avviso)) ? " (recapito per avviso)" : "");
	}
	public String getUidProvvisiorio() {
		return uidProvvisiorio;
	}
	public void setUidProvvisiorio(String uidProvvisiorio) {
		this.uidProvvisiorio = uidProvvisiorio;
	}

}
