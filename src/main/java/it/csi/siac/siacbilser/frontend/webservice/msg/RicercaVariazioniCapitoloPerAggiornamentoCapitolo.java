/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.CapitoloUscitaGestioneService.ricercaVariazioniCapitoloUscitaGestionePerAggiornamentoCapitolo()
 * 
 * @author Marchino Alessandro
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVariazioniCapitoloPerAggiornamentoCapitolo extends ServiceRequest {

	private Integer uidCapitolo;

	/**
	 * @return the uidCapitolo
	 */
	public Integer getUidCapitolo() {
		return uidCapitolo;
	}

	/**
	 * @param uidCapitolo the uidCapitolo to set
	 */
	public void setUidCapitolo(Integer uidCapitolo) {
		this.uidCapitolo = uidCapitolo;
	}

}
