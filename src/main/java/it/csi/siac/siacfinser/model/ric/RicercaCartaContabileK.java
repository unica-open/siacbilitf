/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.carta.CartaContabile;

/**
 * Parametri per la ricerca della Carta Contabile per chiave
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RicercaCartaContabileK implements Serializable {

	private static final long serialVersionUID = 3379696452171576514L;
	
	private Bilancio bilancio;
	private CartaContabile cartaContabile;

	public Bilancio getBilancio() {
	    return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
	    this.bilancio = bilancio;
	}

	public CartaContabile getCartaContabile() {
		return cartaContabile;
	}

	public void setCartaContabile(CartaContabile cartaContabile) {
		this.cartaContabile = cartaContabile;
	}
}
