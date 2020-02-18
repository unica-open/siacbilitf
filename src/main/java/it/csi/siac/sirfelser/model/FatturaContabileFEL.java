/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * FatturaContabileFEL
 * 
 * @author Valentina
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class FatturaContabileFEL extends Entita{
	
	private static final long serialVersionUID = -3711147881679094933L;
	
	private Ente ente;
	
	private String eu;
	private BigDecimal codBen;
	private String annofat;
	private String nfatt;
	private String tipofatt;
	
	private FatturaFEL fattura;

	/**
	 * @return the eu
	 */
	public String getEu() {
		return eu;
	}
	/**
	 * @param eu the eu to set
	 */
	public void setEu(String eu) {
		this.eu = eu;
	}
	/**
	 * @return the codBen
	 */
	public BigDecimal getCodBen() {
		return codBen;
	}
	/**
	 * @param codBen the codBen to set
	 */
	public void setCodBen(BigDecimal codBen) {
		this.codBen = codBen;
	}
	
	/**
	 * @return the annofat
	 */
	public String getAnnofat() {
		return annofat;
	}
	/**
	 * @param annofat the annofat to set
	 */
	public void setAnnofat(String annofat) {
		this.annofat = annofat;
	}
	/**
	 * @return the nfatt
	 */
	public String getNfatt() {
		return nfatt;
	}
	/**
	 * @param nfatt the nfatt to set
	 */
	public void setNfatt(String nfatt) {
		this.nfatt = nfatt;
	}
	/**
	 * @return the tipofatt
	 */
	public String getTipofatt() {
		return tipofatt;
	}
	/**
	 * @param tipofatt the tipofatt to set
	 */
	public void setTipofatt(String tipofatt) {
		this.tipofatt = tipofatt;
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
