/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.07
 */

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class Matricola extends EntitaEnte {
	
	private static final long serialVersionUID = -5946441627894371915L;
	
	private String numeroMatricola;
	private String cognome;
	private String nome;
	private String codiceIBAN;
	private String banca;
	private String agenzia;
	private String contoCorrente;
	
	private List<RichiestaEconomale> richiesteEconomali = new ArrayList<RichiestaEconomale>();

	/**
	 * @return the numeroMatricola
	 */
	public String getNumeroMatricola() {
		return numeroMatricola;
	}

	/**
	 * @param numeroMatricola the numeroMatricola to set
	 */
	public void setNumeroMatricola(String numeroMatricola) {
		this.numeroMatricola = numeroMatricola;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the codiceIBAN
	 */
	public String getCodiceIBAN() {
		return codiceIBAN;
	}

	/**
	 * @param codiceIBAN the codiceIBAN to set
	 */
	public void setCodiceIBAN(String codiceIBAN) {
		this.codiceIBAN = codiceIBAN;
	}

	/**
	 * @return the banca
	 */
	public String getBanca() {
		return banca;
	}

	/**
	 * @param banca the banca to set
	 */
	public void setBanca(String banca) {
		this.banca = banca;
	}

	/**
	 * @return the agenzia
	 */
	public String getAgenzia() {
		return agenzia;
	}

	/**
	 * @param agenzia the agenzia to set
	 */
	public void setAgenzia(String agenzia) {
		this.agenzia = agenzia;
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
	 * @return the richiesteEconomali
	 */
	public List<RichiestaEconomale> getRichiesteEconomali() {
		return richiesteEconomali;
	}

	/**
	 * @param richiesteEconomali the richiesteEconomali to set
	 */
	public void setRichiesteEconomali(List<RichiestaEconomale> richiesteEconomali) {
		this.richiesteEconomali = richiesteEconomali != null ? richiesteEconomali : new ArrayList<RichiestaEconomale>();
	}
	
}