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
import it.csi.siac.siaccespser.model.VariazioneCespite;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 08/08/2018
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaVariazioneCespiteResponse extends RicercaSinteticaBaseResponse<VariazioneCespite> {

	@XmlElementWrapper(name = "variazioniCespite")
	@XmlElement(name = "variazioneCespite")
	private ListaPaginata<VariazioneCespite> listaVariazioneCespite = new ListaPaginataImpl<VariazioneCespite>();
	
	@Override
	protected ListaPaginataImpl<VariazioneCespite> getAsListaPaginata() {
		return (ListaPaginataImpl<VariazioneCespite>) listaVariazioneCespite;
	}

	/**
	 * @return the listaVariazioneCespite
	 */
	@XmlTransient
	public ListaPaginata<VariazioneCespite> getListaVariazioneCespite() {
		return this.listaVariazioneCespite;
	}

	/**
	 * @param listaVariazioneCespite the listaVariazioneCespite to set
	 */
	public void setListaVariazioneCespite(ListaPaginata<VariazioneCespite> listaVariazioneCespite) {
		this.listaVariazioneCespite = listaVariazioneCespite;
	}

}
