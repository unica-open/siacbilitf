/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.RegistroComunicazioniPCC;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisciRegistroComunicazioniPCCResponse extends ServiceResponse {
	
	private RegistroComunicazioniPCC registroComunicazioniPCC;

	/**
	 * @return the registroComunicazioniPCC
	 */
	public RegistroComunicazioniPCC getRegistroComunicazioniPCC() {
		return registroComunicazioniPCC;
	}

	/**
	 * @param registroComunicazioniPCC the registroComunicazioniPCC to set
	 */
	public void setRegistroComunicazioniPCC(RegistroComunicazioniPCC registroComunicazioniPCC) {
		this.registroComunicazioniPCC = registroComunicazioniPCC;
	}

}
