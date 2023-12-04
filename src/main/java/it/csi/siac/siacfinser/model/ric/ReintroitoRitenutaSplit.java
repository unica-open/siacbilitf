/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ReintroitoRitenutaSplit extends ReintroitoRitenute {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private OrdinativoKey ordinativoIncasso;
	
	public OrdinativoKey getOrdinativoIncasso() {
		return ordinativoIncasso;
	}
	public void setOrdinativoIncasso(OrdinativoKey ordinativoIncasso) {
		this.ordinativoIncasso = ordinativoIncasso;
	}
	
}
