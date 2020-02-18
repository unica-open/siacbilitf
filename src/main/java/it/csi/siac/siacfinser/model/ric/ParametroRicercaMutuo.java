/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * Tutti i campi presenti in ParametroRicercaSoggetto non sono obbligatori.
 * @author andrea.colombo
 *
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaMutuo implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2780892332493643462L;
		
	private String numeroMutuo;
	private String numeroRegistrazioneMutuo;
	private AttoAmministrativo attoAmministrativo;
	private Soggetto soggetto;
	
	public String getNumeroMutuo() {
		return numeroMutuo;
	}
	
	public void setNumeroMutuo(String numeroMutuo) {
		this.numeroMutuo = numeroMutuo;
	}
	
	public String getNumeroRegistrazioneMutuo() {
		return numeroRegistrazioneMutuo;
	}
	
	public void setNumeroRegistrazioneMutuo(String numeroRegistrazioneMutuo) {
		this.numeroRegistrazioneMutuo = numeroRegistrazioneMutuo;
	}
	
	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}
	
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}
	
	public Soggetto getSoggetto() {
		return soggetto;
	}
	
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}
}
