/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;

import javax.xml.bind.annotation.XmlType;

/**
 * DettaglioOrdineAcquistoFEL
 * 
 * @author Marchino Alessandro
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class DettaglioOrdineAcquistoFEL extends EntitaEnte{
	
	private static final long serialVersionUID = 5618065853133562164L;

	
	private Integer numeroDettaglio;
	private OrdineAcquistoFEL ordineAcquistoFEL;
	
	
	
	
	/**
	 * @return the numeroDettaglio
	 */
	public Integer getNumeroDettaglio() {
		return numeroDettaglio;
	}
	/**
	 * @param numeroDettaglio the numeroDettaglio to set
	 */
	public void setNumeroDettaglio(Integer numeroDettaglio) {
		this.numeroDettaglio = numeroDettaglio;
	}
	/**
	 * @return the ordineAcquistoFEL
	 */
	public OrdineAcquistoFEL getOrdineAcquistoFEL() {
		return ordineAcquistoFEL;
	}
	/**
	 * @param ordineAcquistoFEL the ordineAcquistoFEL to set
	 */
	public void setOrdineAcquistoFEL(OrdineAcquistoFEL ordineAcquistoFEL) {
		this.ordineAcquistoFEL = ordineAcquistoFEL;
	}
	
}
