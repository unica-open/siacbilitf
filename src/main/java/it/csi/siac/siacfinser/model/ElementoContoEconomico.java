/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;

/**
 * ElementoContoEconomico
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ElementoContoEconomico extends ClassificatoreGerarchico {

	private static final long serialVersionUID = 2169355272276015133L;

	private List<ElementoContoEconomico> elemPdCEconomico = new ArrayList<ElementoContoEconomico>();

	public ElementoContoEconomico() {
		super();
	}

	public ElementoContoEconomico(String codice, String descrizione) {
		super(codice, descrizione);
	}

	public List<ElementoContoEconomico> getElemPdCEconomico() {
		return elemPdCEconomico;
	}

	public void setElemPdCEconomico(List<ElementoContoEconomico> elemPdCEconomico) {
		this.elemPdCEconomico = elemPdCEconomico;
	}

	
}
