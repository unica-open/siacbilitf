/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoComponenteImportiCapitolo;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;


/**
 * The Class RicercaComponenteCapitoloResponse.
 * @author Jacopo
 * @version 1.0.0
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaTipoComponenteImportiCapitoloResponse extends RicercaSinteticaBaseResponse<TipoComponenteImportiCapitolo> {
	
	@XmlElementWrapper(name = "listaTipoComponenteImportiCapitolo")
	@XmlElement(name = "tipoComponenteImportiCapitolo")
	private ListaPaginata<TipoComponenteImportiCapitolo> listaTipoComponenteImportiCapitolo = new ListaPaginataImpl<TipoComponenteImportiCapitolo>();

	@Override
	protected ListaPaginataImpl<TipoComponenteImportiCapitolo> getAsListaPaginata() {
		return (ListaPaginataImpl<TipoComponenteImportiCapitolo>) listaTipoComponenteImportiCapitolo;
	}

	/**
	 * @return the listaTipoComponenteImportiCapitolo
	 */
	@XmlTransient
	public ListaPaginata<TipoComponenteImportiCapitolo> getListaTipoComponenteImportiCapitolo() {
		return listaTipoComponenteImportiCapitolo;
	}

	/**
	 * @param listaTipoComponenteImportiCapitolo the listaTipoComponenteImportiCapitolo to set
	 */
	public void setListaTipoComponenteImportiCapitolo(ListaPaginata<TipoComponenteImportiCapitolo> listaTipoComponenteImportiCapitolo) {
		this.listaTipoComponenteImportiCapitolo = listaTipoComponenteImportiCapitolo;
	}



}
