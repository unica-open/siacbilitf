/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.model.Valuta;


/**
 * @author prologicMMA
 * @version 1.0
 * @created 01-dic-2014 09.50.07
 */

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class CambioValuta {

	/**
	 * valore del cambio valuta rispetto all'euro
	 */
	private BigDecimal cambio;
	private Valuta valuta;

	/**
	 * @return the cambio
	 */
	public BigDecimal getCambio() {
		return cambio;
	}

	/**
	 * @param cambio the cambio to set
	 */
	public void setCambio(BigDecimal cambio) {
		this.cambio = cambio;
	}

	/**
	 * @return the valuta
	 */
	public Valuta getValuta() {
		return valuta;
	}

	/**
	 * @param valuta the valuta to set
	 */
	public void setValuta(Valuta valuta) {
		this.valuta = valuta;
	}

}