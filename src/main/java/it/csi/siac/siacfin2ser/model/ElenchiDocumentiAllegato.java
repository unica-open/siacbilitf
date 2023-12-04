/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class ElenchiDocumentiAllegato.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class ElenchiDocumentiAllegato extends EntitaEnte {
	
	private static final long serialVersionUID = 1568567315248741623L;
	
	
	@XmlElementWrapper(name = "elenchi")
	@XmlElement(name = "elenco")
	private List<ElencoDocumentiAllegato> elenchiDocumentiAllegato = new ArrayList<ElencoDocumentiAllegato>();

	/**
	 * Gets the elenchi documenti allegato.
	 *
	 * @return the elenchi documenti allegato
	 */
	@XmlTransient
	public List<ElencoDocumentiAllegato> getElenchiDocumentiAllegato() {
		return elenchiDocumentiAllegato;
	}

	/**
	 * Sets the elenchi documenti allegato.
	 *
	 * @param elenchiDocumentiAllegato the new elenchi documenti allegato
	 */
	public void setElenchiDocumentiAllegato(List<ElencoDocumentiAllegato> elenchiDocumentiAllegato) {
		this.elenchiDocumentiAllegato = elenchiDocumentiAllegato;
	}
	
}