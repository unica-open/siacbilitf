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
import it.csi.siac.siaccespser.model.TipoBeneCespite;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;


/**
 * @author anto
 * @version 1.0.0 - 04-06-2018
 *
 */

@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaTipoBeneCespiteResponse extends RicercaSinteticaBaseResponse<TipoBeneCespite> {
	@XmlElementWrapper(name = "tipiBeneCespiti")	    
	@XmlElement(name = "tipoBeneCespite")
	private ListaPaginata<TipoBeneCespite> listaTipoBeneCespite = new ListaPaginataImpl<TipoBeneCespite>();

	
	@Override
	protected ListaPaginataImpl<TipoBeneCespite> getAsListaPaginata() {
		return (ListaPaginataImpl<TipoBeneCespite>) getListaTipoBeneCespite();
	}

	/**
	 * @return the listaTipoBeneCespite
	 */
	@XmlTransient
	public ListaPaginata<TipoBeneCespite> getListaTipoBeneCespite() {
		return listaTipoBeneCespite;
	}


	/**
	 * @param listaTipoBeneCespite the listaTipoBeneCespite to set
	 */
	public void setListaTipoBeneCespite(ListaPaginata<TipoBeneCespite> listaTipoBeneCespite) {
		this.listaTipoBeneCespite = listaTipoBeneCespite;
	}

	
}
