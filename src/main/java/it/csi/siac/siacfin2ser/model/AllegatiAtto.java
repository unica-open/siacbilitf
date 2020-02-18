/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class AllegatiAtto extends Entita {
	
	private static final long serialVersionUID = 6121698639058426614L;
	
	@XmlElement(name = "allegatoAtto")
	private List<AllegatoAtto> allegatiAtto = new ArrayList<AllegatoAtto>();

	/**
	 * @return the allegatiAtto
	 */
	@XmlTransient
	public List<AllegatoAtto> getAllegatiAtto() {
		return allegatiAtto;
	}

	/**
	 * @param allegatiAtto the allegatiAtto to set
	 */
	public void setAllegatiAtto(List<AllegatoAtto> allegatiAtto) {
		this.allegatiAtto = allegatiAtto;
	}
	

	
}
