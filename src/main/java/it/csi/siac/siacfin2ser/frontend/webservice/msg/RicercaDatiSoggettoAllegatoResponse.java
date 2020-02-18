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


/**
 * The Class RicercaDatiSoggettoAllegatoResponse.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaDatiSoggettoAllegatoResponse extends ServiceResponse {

	@XmlElementWrapper(name = "datiSoggettiAllegati")
	@XmlElement(name = "datiSoggettoAllegato")
	private List<DatiSoggettoAllegato> datiSoggettiAllegati = new ArrayList<DatiSoggettoAllegato>();

	/**
	 * @return the datiSoggettiAllegati
	 */
	@XmlTransient
	public List<DatiSoggettoAllegato> getDatiSoggettiAllegati() {
		return datiSoggettiAllegati;
	}

	/**
	 * @param datiSoggettiAllegati the datiSoggettiAllegati to set
	 */
	public void setDatiSoggettiAllegati(List<DatiSoggettoAllegato> datiSoggettiAllegati) {
		this.datiSoggettiAllegati = datiSoggettiAllegati != null ? datiSoggettiAllegati : new ArrayList<DatiSoggettoAllegato>();
	}
	
	
}
