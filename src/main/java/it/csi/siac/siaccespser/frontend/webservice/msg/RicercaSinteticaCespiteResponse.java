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
import it.csi.siac.siaccespser.model.Cespite;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
/**
 * @author antonino
 * @version 1.0.0 - 30-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaCespiteResponse extends RicercaSinteticaBaseResponse<Cespite> {

	@XmlElementWrapper(name = "cespite")
	@XmlElement(name = "cespite")
	private ListaPaginata<Cespite> listaCespite = new ListaPaginataImpl<Cespite>();
	
	@Override
	protected ListaPaginataImpl<Cespite> getAsListaPaginata() {
		return (ListaPaginataImpl<Cespite>) getListaCespite();
	}

	/**
	 * @return the listaTipoBeneCespite
	 */
	@XmlTransient
	public ListaPaginata<Cespite> getListaCespite() {
		return listaCespite;
	}

	/**
	 * @param listaTipoBeneCespite the listaTipoBeneCespite to set
	 */
	public void setListaCespite(ListaPaginata<Cespite> listaCespite) {
		this.listaCespite = listaCespite;
	}

}
