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
import it.csi.siac.siaccespser.model.DismissioneCespite;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
/**
 * @author antonino
 * @version 1.0.0 - 30-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaDismissioneCespiteResponse extends RicercaSinteticaBaseResponse<DismissioneCespite> {

	@XmlElementWrapper(name = "dismissioniCespite")
	@XmlElement(name = "dismissioneCespite")
	private ListaPaginata<DismissioneCespite> listaDismissioneCespite = new ListaPaginataImpl<DismissioneCespite>();
	
	@Override
	protected ListaPaginataImpl<DismissioneCespite> getAsListaPaginata() {
		return (ListaPaginataImpl<DismissioneCespite>) getListaDismissioneCespite();
	}

	/**
	 * @return the listaTipoBeneDismissioneCespite
	 */
	@XmlTransient
	public ListaPaginata<DismissioneCespite> getListaDismissioneCespite() {
		return listaDismissioneCespite;
	}

	/**
	 * @param listaTipoBeneDismissioneCespite the listaTipoBeneDismissioneCespite to set
	 */
	public void setListaDismissioneCespite(ListaPaginata<DismissioneCespite> listaDismissioneCespite) {
		this.listaDismissioneCespite = listaDismissioneCespite;
	}

}
