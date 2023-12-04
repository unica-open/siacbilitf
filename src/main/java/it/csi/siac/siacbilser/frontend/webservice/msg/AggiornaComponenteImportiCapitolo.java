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
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siacbilser.model.ComponenteImportiCapitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaComponenteImportiCapitolo extends ServiceRequest {

	private Capitolo<?, ?> capitolo;
	
	@XmlElementWrapper(name = "listaComponenteImportiCapitolo")
	@XmlElement(name = "componenteImportiCapitolo")
	private List<ComponenteImportiCapitolo> listaComponenteImportiCapitolo = new ArrayList<ComponenteImportiCapitolo>();
	
	private boolean computeResultList = true;
	/**
	 * @return the capitolo
	 */
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}
	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}
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
	/**
	 * @return the computeResultList
	 */
	public boolean isComputeResultList() {
		return this.computeResultList;
	}
	/**
	 * @param computeResultList the computeResultList to set
	 */
	public void setComputeResultList(boolean computeResultList) {
		this.computeResultList = computeResultList;
	}
}
