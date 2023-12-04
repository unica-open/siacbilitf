/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.QuadroEconomico;

/**
 * @author Elisa
 * @version 1.0.0 - 19/12/2017
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaQuadroEconomicoResponse extends RicercaSinteticaBaseResponse<QuadroEconomico> {
	
	@XmlElementWrapper(name = "listQuadroEconomico")	    
	@XmlElement(name = "quadroEconomico")
	private ListaPaginata<QuadroEconomico> listQuadroEconomico = new ListaPaginataImpl<QuadroEconomico>();
	

	@XmlTransient
	public ListaPaginata<QuadroEconomico> getListQuadroEconomico() {
		return listQuadroEconomico;
	}

	public void setQuadroEconomico(ListaPaginata<QuadroEconomico> listQuadroEconomico) {
		this.listQuadroEconomico = listQuadroEconomico;
	}

	@Override
	protected ListaPaginataImpl<QuadroEconomico> getAsListaPaginata() {
		return (ListaPaginataImpl<QuadroEconomico>) getListQuadroEconomico();
	}
	
}
