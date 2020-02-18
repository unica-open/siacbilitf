/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.StampaIva;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaStampaIvaResponse extends ServiceResponse {
	
	private List<StampaIva> listaStampaIva = new ArrayList<StampaIva>();

	/**
	 * @return the listaRegistroIva
	 */
	public List<StampaIva> getListaStampaIva() {
		return listaStampaIva;
	}

	/**
	 * @param listaRegistroIva the listaRegistroIva to set
	 */
	public void setListaStampaIva(List<StampaIva> listaStampaIva) {
		this.listaStampaIva = listaStampaIva != null ? listaStampaIva : new ArrayList<StampaIva>();
	}
	
	
}
