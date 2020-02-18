/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * VincoliCapitoloUscitaEntrataGestione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class VincoloCapitolo extends Vincolo {

	private static final long serialVersionUID = -6895451555917771798L;
		
	private Capitolo<?, ?> capitolo;

	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}

	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}
	
	
	

}
