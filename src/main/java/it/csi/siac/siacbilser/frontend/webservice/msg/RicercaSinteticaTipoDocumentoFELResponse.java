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
import it.csi.siac.siacbilser.model.TipoDocFEL;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * The Class RicercaSinteticaTipoDocumentoFELResponse.
 * @author Filippo
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaTipoDocumentoFELResponse extends RicercaSinteticaBaseResponse<TipoDocFEL> {
	
	
	@XmlElementWrapper(name = "listaTipoDocFEL")
	@XmlElement(name = "tipoDocFEL")
	private ListaPaginata<TipoDocFEL> listaTipoDocFEL = new ListaPaginataImpl<TipoDocFEL>();
	
	

	@Override
	protected ListaPaginataImpl<TipoDocFEL> getAsListaPaginata() {
		return (ListaPaginataImpl<TipoDocFEL>) listaTipoDocFEL;
	}

	/**
	 * @return the listaTipoDocFEL
	 */
	@XmlTransient
	public ListaPaginata<TipoDocFEL> getListaTipoDocFEL() {
		return listaTipoDocFEL;
	}

	/**
	 * @param listaTipoComponenteImportiCapitolo the listaTipoDocFEL to set
	 */
	public void setListaTipoDocFEL(ListaPaginata<TipoDocFEL> listaTipoDocFEL) {
		this.listaTipoDocFEL = listaTipoDocFEL;
	}

	

}
