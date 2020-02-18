/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * Parametri per la ricerca dell'Ordinativo per chiave
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RicercaOrdinativoK implements Serializable {
	
	private static final long serialVersionUID = -7961682258394780926L;
    	
	private Bilancio bilancio;

	public Bilancio getBilancio() {
	    return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
	    this.bilancio = bilancio;
	}
}
