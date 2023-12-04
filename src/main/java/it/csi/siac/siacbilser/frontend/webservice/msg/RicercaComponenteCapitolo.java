/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;
 
 
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoComponenteImportiCapitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaComponenteCapitolo extends ServiceRequest {
	
	
	private   TipoComponenteImportiCapitolo componenteCapitolo;
 
	
	private ParametriPaginazione parametriPaginazione;
 
	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	/**
	 * @return the componenteCapitolo
	 */
	public TipoComponenteImportiCapitolo getComponenteCapitolo() {
		return componenteCapitolo;
	}

	/**
	 * @param componenteCapitolo the componenteCapitolo to set
	 */
	public void setComponenteCapitolo(TipoComponenteImportiCapitolo componenteCapitolo) {
		this.componenteCapitolo = componenteCapitolo;
	}
	
	
	
	

	 
}
