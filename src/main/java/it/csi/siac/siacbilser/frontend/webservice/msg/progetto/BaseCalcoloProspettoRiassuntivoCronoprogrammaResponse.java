/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.progetto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ProspettoRiassuntivoCronoprogramma;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class BaseCalcoloProspettoRiassuntivoCronoprogrammaResponse extends ServiceResponse {
	
	private List<ProspettoRiassuntivoCronoprogramma> listaProspettoRiassuntivoCronoprogramma= new ArrayList<ProspettoRiassuntivoCronoprogramma>();

	/**
	 * 
	 * @return listaProspettoRiassuntivoCronoprogramma
	 */
	public List<ProspettoRiassuntivoCronoprogramma> getListaProspettoRiassuntivoCronoprogramma() {
		return listaProspettoRiassuntivoCronoprogramma;
	}
	/**
	 * 
	 * @param listaProspettoRiassuntivoCronoprogramma
	 */
	public void setListaProspettoRiassuntivoCronoprogramma(
			List<ProspettoRiassuntivoCronoprogramma> listaProspettoRiassuntivoCronoprogramma) {
		this.listaProspettoRiassuntivoCronoprogramma = listaProspettoRiassuntivoCronoprogramma;
	}
	

}
