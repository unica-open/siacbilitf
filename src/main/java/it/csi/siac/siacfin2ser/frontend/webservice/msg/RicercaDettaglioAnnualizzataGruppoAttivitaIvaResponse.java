/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.GruppoAttivitaIva;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaDettaglioAnnualizzataGruppoAttivitaIvaResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaGruppiAttivitaIva")
	@XmlElement(name = "gruppoAttivitaIva")
	private List<GruppoAttivitaIva> gruppiAttivitaIva = new ArrayList<GruppoAttivitaIva>();

	/**
	 * @return the gruppiAttivitaIva
	 */
	@XmlTransient
	public List<GruppoAttivitaIva> getGruppiAttivitaIva() {
		return gruppiAttivitaIva;
	}

	/**
	 * @param gruppiAttivitaIva the gruppiAttivitaIva to set
	 */
	public void setGruppiAttivitaIva(List<GruppoAttivitaIva> gruppiAttivitaIva) {
		this.gruppiAttivitaIva = gruppiAttivitaIva;
	}

}
