/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/**
 * 
 */
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.CategoriaCespiti;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;


/**
 * @author elisa
 * @version 1.0.0 - 30-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaCategoriaCespitiResponse extends RicercaSinteticaBaseResponse<CategoriaCespiti> {

	
	@XmlElementWrapper(name = "categoriaCespiti")
	@XmlElement(name = "categoriaCespiti")
	private ListaPaginata<CategoriaCespiti> listaCategoriaCespiti = new ListaPaginataImpl<CategoriaCespiti>();

	
	@Override
	protected ListaPaginataImpl<CategoriaCespiti> getAsListaPaginata() {
		return (ListaPaginataImpl<CategoriaCespiti>) getListaCategoriaCespiti();
	}

	/**
	 * @return the listaTipoBeneCespite
	 */
	@XmlTransient
	
	public ListaPaginata<CategoriaCespiti> getListaCategoriaCespiti() {
		return listaCategoriaCespiti;
	}


	/**
	 * @param listaTipoBeneCespite the listaTipoBeneCespite to set
	 */
	public void setListaCategoriaCespiti(ListaPaginata<CategoriaCespiti> listaCategoriaCespiti) {
		this.listaCategoriaCespiti = listaCategoriaCespiti;
	}


}
