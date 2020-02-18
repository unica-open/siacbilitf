/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.RegistroComunicazioniPCC;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaRegistriComunicazioniPCCSubdocumentoResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "registriComunicazioniPCC")
	@XmlElement(name = "registroComunicazioniPCC")
	private List<RegistroComunicazioniPCC> registriComunicazioniPCC = new ArrayList<RegistroComunicazioniPCC>();

	/**
	 * @return the registriComunicazioniPCC
	 */
	@XmlTransient
	public List<RegistroComunicazioniPCC> getRegistriComunicazioniPCC() {
		return registriComunicazioniPCC;
	}

	/**
	 * @param registriComunicazioniPCC the registriComunicazioniPCC to set
	 */
	public void setRegistriComunicazioniPCC(List<RegistroComunicazioniPCC> registriComunicazioniPCC) {
		this.registriComunicazioniPCC = registriComunicazioniPCC;
	}
	
	
	
}
