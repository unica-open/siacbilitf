/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.QuadroEconomico;


/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 04/01/2018
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaQuadroEconomicoValidoResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaQuadroEconomico")
	@XmlElement(name = "quadroEconomico")
	private List<QuadroEconomico> listaQuadroEconomico = new ArrayList<QuadroEconomico>();

	/**
	 * @return the listaQuadroEconomico
	 */
	@XmlTransient
	public List<QuadroEconomico> getListaQuadroEconomico() {
		return listaQuadroEconomico;
	}

	/**
	 * @param listaQuadroEconomico the listaQuadroEconomico to set
	 */
	public void setListaQuadroEconomico(List<QuadroEconomico> listaQuadroEconomico) {
		this.listaQuadroEconomico = listaQuadroEconomico;
	}

	

	
}
