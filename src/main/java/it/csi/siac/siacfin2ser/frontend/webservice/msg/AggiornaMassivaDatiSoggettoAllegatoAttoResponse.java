/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DatiSoggettoAllegato;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaMassivaDatiSoggettoAllegatoAttoResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaDatiSoggettoAllegato")
	@XmlElement(name = "datiSoggettoAllegato")
	private List<DatiSoggettoAllegato> listaDatiSoggettoAllegato = new ArrayList<DatiSoggettoAllegato>();

	/**
	 * @return the listaDatiSoggettoAllegato
	 */
	@XmlTransient
	public List<DatiSoggettoAllegato> getListaDatiSoggettoAllegato() {
		return listaDatiSoggettoAllegato;
	}

	/**
	 * @param listaDatiSoggettoAllegato the listaDatiSoggettoAllegato to set
	 */
	public void setListaDatiSoggettoAllegato(List<DatiSoggettoAllegato> listaDatiSoggettoAllegato) {
		this.listaDatiSoggettoAllegato = listaDatiSoggettoAllegato;
	}

}
