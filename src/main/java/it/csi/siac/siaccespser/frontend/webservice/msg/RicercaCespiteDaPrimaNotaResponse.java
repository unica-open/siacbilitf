/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/**
 * 
 */
package it.csi.siac.siaccespser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.Cespite;
import it.csi.siac.siaccorser.model.ServiceResponse;
/**
 * @author antonino
 * @version 1.0.0 - 30-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaCespiteDaPrimaNotaResponse extends ServiceResponse  {

	@XmlElementWrapper(name = "cespiti")
	@XmlElement(name = "cespite")
	private List<Cespite> listaCespite = new ArrayList<Cespite>();

	/**
	 * @return the listaCespite
	 */
	@XmlTransient
	public List<Cespite> getListaCespite() {
		return listaCespite;
	}

	/**
	 * @param listaCespite the listaCespite to set
	 */
	public void setListaCespite(List<Cespite> listaCespite) {
		this.listaCespite = listaCespite;
	}

}
