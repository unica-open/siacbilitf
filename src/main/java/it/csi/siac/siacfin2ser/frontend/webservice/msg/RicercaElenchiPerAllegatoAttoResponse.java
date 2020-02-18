/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaElenchiPerAllegatoAttoResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "elenchiDocumentiAllegato")
	@XmlElement(name = "elencoDocumentiAllegato")
	private List<ElencoDocumentiAllegato> elenchiDocumentiAllegato = new ArrayList<ElencoDocumentiAllegato>();

	/**
	 * @return the elenchiDocumentiAllegato
	 */
	@XmlTransient
	public List<ElencoDocumentiAllegato> getElenchiDocumentiAllegato() {
		return elenchiDocumentiAllegato;
	}

	/**
	 * @param elenchiDocumentiAllegato the elenchiDocumentiAllegato to set
	 */
	public void setElenchiDocumentiAllegato(List<ElencoDocumentiAllegato> elenchiDocumentiAllegato) {
		this.elenchiDocumentiAllegato = elenchiDocumentiAllegato;
	}
}
