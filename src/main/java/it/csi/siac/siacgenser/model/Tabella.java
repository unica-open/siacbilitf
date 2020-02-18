/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import it.csi.siac.siaccorser.model.Entita;

import javax.xml.bind.annotation.XmlType;

/**

 * @version 1.0
 * @created 14-apr-2015
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class Tabella extends Entita{

	private static final long serialVersionUID = 2076593776833832443L;
	
	private String nomeTabella;
	private String nomePkTabella;
	private Integer oidTabella;
	/**
	 * @return the nomeTabella
	 */
	public String getNomeTabella() {
		return nomeTabella;
	}
	/**
	 * @param nomeTabella the nomeTabella to set
	 */
	public void setNomeTabella(String nomeTabella) {
		this.nomeTabella = nomeTabella;
	}
	/**
	 * @return the nomePkTabella
	 */
	public String getNomePkTabella() {
		return nomePkTabella;
	}
	/**
	 * @param nomePkTabella the nomePkTabella to set
	 */
	public void setNomePkTabella(String nomePkTabella) {
		this.nomePkTabella = nomePkTabella;
	}
	/**
	 * @return the uidTabella
	 */
	public Integer getOidTabella() {
		return oidTabella;
	}
	/**
	 * @param uidTabella the uidTabella to set
	 */
	public void setOidTabella(Integer oidTabella) {
		this.oidTabella = oidTabella;
	}
	
	


}