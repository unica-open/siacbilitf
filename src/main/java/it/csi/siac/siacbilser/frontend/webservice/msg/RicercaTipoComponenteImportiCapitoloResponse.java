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
import it.csi.siac.siacbilser.model.TipoComponenteImportiCapitolo;
import it.csi.siac.siaccorser.model.ServiceResponse;


/**
 * The Class RicercaComponenteCapitoloResponse.
 * @author Jacopo
 * @version 1.0.0
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaTipoComponenteImportiCapitoloResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaTipoComponenteImportiCapitolo")
	@XmlElement(name = "tipoComponenteImportiCapitolo")
	private List<TipoComponenteImportiCapitolo> listaTipoComponenteImportiCapitolo = new ArrayList<TipoComponenteImportiCapitolo>();

	/**
	 * @return the listaTipoComponenteImportiCapitolo
	 */
	@XmlTransient
	public List<TipoComponenteImportiCapitolo> getListaTipoComponenteImportiCapitolo() {
		return listaTipoComponenteImportiCapitolo;
	}

	/**
	 * @param listaTipoComponenteImportiCapitolo the listaTipoComponenteImportiCapitolo to set
	 */
	public void setListaTipoComponenteImportiCapitolo(List<TipoComponenteImportiCapitolo> listaTipoComponenteImportiCapitolo) {
		this.listaTipoComponenteImportiCapitolo = listaTipoComponenteImportiCapitolo;
	}



}
