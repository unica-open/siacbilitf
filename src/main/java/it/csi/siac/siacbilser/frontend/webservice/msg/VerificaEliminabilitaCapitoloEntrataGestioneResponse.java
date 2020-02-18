/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CapitoloUscitaPrevisione;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.CapitoloEntrataGestioneService.
 * verificaEliminabilitaCapitoloEntrataGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class VerificaEliminabilitaCapitoloEntrataGestioneResponse extends
		ServiceResponse {

	private boolean eliminabilitaCapitolo;
	private CapitoloUscitaPrevisione capitolo;

	public boolean isEliminabilitaCapitolo() {
		return eliminabilitaCapitolo;
	}

	public void setEliminabilitaCapitolo(boolean eliminabilitaCapitolo) {
		this.eliminabilitaCapitolo = eliminabilitaCapitolo;
	}

	public CapitoloUscitaPrevisione getCapitolo() {
		return capitolo;
	}

	public void setCapitolo(CapitoloUscitaPrevisione capitolo) {
		this.capitolo = capitolo;
	}

}
