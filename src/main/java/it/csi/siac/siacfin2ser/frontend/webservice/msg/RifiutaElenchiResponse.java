/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RifiutaElenchiResponse extends ServiceResponse {

	private AllegatoAtto allegatoAtto;
	private List<String> listaScarti = new ArrayList<String>();

	/**
	 * @return the allegatoAtto
	 */
	public AllegatoAtto getAllegatoAtto() {
		return allegatoAtto;
	}

	/**
	 * @param allegatoAtto the allegatoAtto to set
	 */
	public void setAllegatoAtto(AllegatoAtto allegatoAtto) {
		this.allegatoAtto = allegatoAtto;
	}

	/**
	 * @return the listaScarti
	 */
	public List<String> getListaScarti() {
		return listaScarti;
	}

	/**
	 * @param listaScarti the listaScarti to set
	 */
	public void setListaScarti(List<String> listaScarti) {
		this.listaScarti = listaScarti != null ? listaScarti : new ArrayList<String>();
	}
	

}
