/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoComponenteImportiCapitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceTipoComponenteImportiCapitolo extends ServiceRequest {

	private TipoComponenteImportiCapitolo tipoComponenteImportiCapitolo;

	/**
	 * @return the tipoComponenteImportiCapitolo
	 */
	public TipoComponenteImportiCapitolo getTipoComponenteImportiCapitolo() {
		return tipoComponenteImportiCapitolo;
	}

	/**
	 * @param tipoComponenteImportiCapitolo the tipoComponenteImportiCapitolo to set
	 */
	public void setTipoComponenteImportiCapitolo(TipoComponenteImportiCapitolo tipoComponenteImportiCapitolo) {
		this.tipoComponenteImportiCapitolo = tipoComponenteImportiCapitolo;
	}

}
