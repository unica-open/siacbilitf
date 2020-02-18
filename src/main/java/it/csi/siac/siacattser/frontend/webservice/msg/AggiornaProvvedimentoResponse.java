/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Response del servizio di aggiornamento provvedimento
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class AggiornaProvvedimentoResponse extends ServiceResponse {
	
	private AttoAmministrativo attoAmministrativoAggiornato;

	/**
	 * @return the attoAmministrativoAggiornato
	 */
	public AttoAmministrativo getAttoAmministrativoAggiornato() {
		return attoAmministrativoAggiornato;
	}

	/**
	 * @param attoAmministrativoAggiornato the attoAmministrativoAggiornato to set
	 */
	public void setAttoAmministrativoAggiornato(AttoAmministrativo attoAmministrativoAggiornato) {
		this.attoAmministrativoAggiornato = attoAmministrativoAggiornato;
	}
	
}
