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
 * FattureCollegateFEL
 * 
 * @author Valentina
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class FattureCollegateFEL extends Entita{

	private static final long serialVersionUID = -3700074813131686457L;
	
	private Ente ente;
	
	private Integer progressivo;
	private String numero;
	private Date data;
	private String codiceCup;
	private String codiceCig;
	
	private FatturaFEL fattura;

	
	/**
	 * @return the progressivo
	 */
	public Integer getProgressivo() {
		return progressivo;
	}
	/**
	 * @param progressivo the progressivo to set
	 */
	public void setProgressivo(Integer progressivo) {
		this.progressivo = progressivo;
	}
	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return the codiceCup
	 */
	public String getCodiceCup() {
		return codiceCup;
	}
	/**
	 * @param codiceCup the codiceCup to set
	 */
	public void setCodiceCup(String codiceCup) {
		this.codiceCup = codiceCup;
	}
	/**
	 * @return the codiceCig
	 */
	public String getCodiceCig() {
		return codiceCig;
	}
	/**
	 * @param codiceCig the codiceCig to set
	 */
	public void setCodiceCig(String codiceCig) {
		this.codiceCig = codiceCig;
	}
	/**
	 * @return the fattura
	 */
	public FatturaFEL getFattura() {
		return fattura;
	}
	/**
	 * @param fattura the fattura to set
	 */
	public void setFattura(FatturaFEL fattura) {
		this.fattura = fattura;
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
	
}
