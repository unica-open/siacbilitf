/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

import javax.xml.bind.annotation.XmlType;

/**
 * DettaglioOrdineAcquistoFEL
 * 
 * @author Marchino Alessandro
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class DettaglioOrdineAcquistoFEL extends Entita{
	
	private static final long serialVersionUID = 5618065853133562164L;

	private Ente ente;
	
	private Integer numeroDettaglio;
	private OrdineAcquistoFEL ordineAcquistoFEL;
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
