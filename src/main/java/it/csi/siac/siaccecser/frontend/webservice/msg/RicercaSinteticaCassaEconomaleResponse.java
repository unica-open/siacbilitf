/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.CassaEconomale;
import it.csi.siac.siaccorser.model.ServiceResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaSinteticaCassaEconomaleResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaCasseEconomali")
	@XmlElement(name = "cassaEconomale")
	private List<CassaEconomale> listaCasseEconomali = new ArrayList<CassaEconomale>();

	/**
	 * @return the listaCasseEconomali
	 */
	@XmlTransient
	public List<CassaEconomale> getListaCasseEconomali() {
		return listaCasseEconomali;
	}

	/**
	 * @param listaCasseEconomali the listaCasseEconomali to set
	 */
	public void setListaCasseEconomali(List<CassaEconomale> listaCasseEconomali) {
		this.listaCasseEconomali = listaCasseEconomali;
	}
	
	
}
