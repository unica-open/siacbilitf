/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.07
 */

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class Abilitata implements Serializable {

	private static final long serialVersionUID = -3560682937864944548L;
	
	private Ente ente;
	private TipoRichiestaEconomale tipoRichiestaEconomale;
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
	 * @return the tipoRichiestaEconomale
	 */
	public TipoRichiestaEconomale getTipoRichiestaEconomale() {
		return tipoRichiestaEconomale;
	}
	/**
	 * @param tipoRichiestaEconomale the tipoRichiestaEconomale to set
	 */
	public void setTipoRichiestaEconomale(TipoRichiestaEconomale tipoRichiestaEconomale) {
		this.tipoRichiestaEconomale = tipoRichiestaEconomale;
	}
	
}