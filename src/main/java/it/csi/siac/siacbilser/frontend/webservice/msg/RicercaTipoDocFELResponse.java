/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoDocFEL;
import it.csi.siac.siaccorser.model.ServiceResponse;


/**
 * The Class RicercaTipoDocFELResponse.
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaTipoDocFELResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaTipoDocFEL")
	@XmlElement(name = "tipoDocFEL")
	private List<TipoDocFEL> listaTipoDocFEL = new ArrayList<TipoDocFEL>();

	/**
	 * @return the listaTipoDocFEL
	 */
	@XmlTransient
	public List<TipoDocFEL> getListaTipoDocFEL()
	{
		return listaTipoDocFEL;
	}

	/**
	 * @param listaTipoDocFEL the listaTipoDocFEL to set
	 */
	public void setListaTipoDocFEL(List<TipoDocFEL> listaTipoDocFEL)
	{
		this.listaTipoDocFEL = listaTipoDocFEL;
	}

	
	
	
	 



}
