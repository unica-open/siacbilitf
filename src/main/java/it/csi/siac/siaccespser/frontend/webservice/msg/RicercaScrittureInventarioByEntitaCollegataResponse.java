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
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.model.PrimaNota;
/**
 * @author antonino
 * @version 1.0.0 - 30-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaScrittureInventarioByEntitaCollegataResponse extends ServiceResponse {

	
	@XmlElementWrapper(name = "primenote")
	@XmlElement(name = "primanota")
	private List<PrimaNota> listaPrimaNota = new ArrayList<PrimaNota>();
	
	
	/**
	 * @return the listaTipoBenePrimaNota
	 */
	@XmlTransient
	public List<PrimaNota> getListaPrimaNota() {
		return listaPrimaNota;
	}

	/**
	 * Sets the lista prima nota.
	 *
	 * @param listaPrimaNota the new lista prima nota
	 */
	public void setListaPrimaNota(List<PrimaNota> listaPrimaNota) {
		this.listaPrimaNota = listaPrimaNota;
	}

}
