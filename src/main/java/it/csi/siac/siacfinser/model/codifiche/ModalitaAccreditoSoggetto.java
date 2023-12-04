/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.codifiche;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ModalitaAccreditoSoggetto extends Codifica {

	private static final long serialVersionUID = -1743745193280310785L;
	
	private int priorita;

	public ModalitaAccreditoSoggetto() {
		super();
	}

	public ModalitaAccreditoSoggetto(String codice, String descrizione) {
		super(codice, descrizione);
	}

	public int getPriorita() {
		return priorita;
	}

	public void setPriorita(int priorita) {
		this.priorita = priorita;
	}

}
