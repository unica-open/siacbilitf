/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class ContoTesoreria extends Codifica {
	private static final long serialVersionUID = -8295799133690799692L;
	
	private boolean vincolato;

	public ContoTesoreria() {
		super();
	}
	
	public ContoTesoreria(String codice, String descrizione) {
		super(codice, descrizione);
	}

	public boolean isVincolato() {
		return vincolato;
	}

	public void setVincolato(boolean vincolato) {
		this.vincolato = vincolato;
	}
	
	

}
