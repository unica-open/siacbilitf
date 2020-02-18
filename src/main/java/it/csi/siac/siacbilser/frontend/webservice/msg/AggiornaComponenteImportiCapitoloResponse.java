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
import it.csi.siac.siacbilser.frontend.webservice.msg.base.BaseComponenteImportiCapitoloResponse;
import it.csi.siac.siacbilser.model.ComponenteImportiCapitolo;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaComponenteImportiCapitoloResponse extends BaseComponenteImportiCapitoloResponse {
	
	@XmlElementWrapper(name = "listaComponenteImportiCapitolo")
	@XmlElement(name = "componenteImportiCapitolo")
	private List<ComponenteImportiCapitolo> listaComponenteImportiCapitolo = new ArrayList<ComponenteImportiCapitolo>();

	/**
	 * @return the listaComponenteImportiCapitolo
	 */
	@XmlTransient
	public List<ComponenteImportiCapitolo> getListaComponenteImportiCapitolo() {
		return this.listaComponenteImportiCapitolo;
	}

	/**
	 * @param listaComponenteImportiCapitolo the listaComponenteImportiCapitolo to set
	 */
	public void setListaComponenteImportiCapitolo(List<ComponenteImportiCapitolo> listaComponenteImportiCapitolo) {
		this.listaComponenteImportiCapitolo = listaComponenteImportiCapitolo;
	}
	
}
