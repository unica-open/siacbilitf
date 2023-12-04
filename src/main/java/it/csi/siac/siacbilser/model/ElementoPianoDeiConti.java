/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;

/**
 * ElementoPianoDeiConti
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ElementoPianoDeiConti extends ClassificatoreGerarchico {

	private static final long serialVersionUID = 2169355272276015133L;

	private List<ElementoPianoDeiConti> elemPdc = new ArrayList<ElementoPianoDeiConti>();

	public ElementoPianoDeiConti() {
		super();
	}

	public ElementoPianoDeiConti(String codice, String descrizione) {
		super(codice, descrizione);
	}

	public List<ElementoPianoDeiConti> getElemPdc() {
		return elemPdc;
	}

	public void setElemPdc(List<ElementoPianoDeiConti> elemPdc) {
		this.elemPdc = elemPdc;
	}
	
	public Date getDataFineValiditaElementoPianoDeiConti() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaElementoPianoDeiConti(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
