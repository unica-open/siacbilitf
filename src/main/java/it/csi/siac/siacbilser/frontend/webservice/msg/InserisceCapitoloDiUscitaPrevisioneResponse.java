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
 * Risposta al metodo
 * BIL.CapitoloUscitaPrevisioneService.inserisceCapitoloDiUscitaPrevisione()
 * 
 * @author rmonutori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceCapitoloDiUscitaPrevisioneResponse extends
		ServiceResponse {

	private CapitoloUscitaPrevisione capitoloUPrevInserito;

	public CapitoloUscitaPrevisione getCapitoloUPrevInserito() {
		return capitoloUPrevInserito;
	}

	public void setCapitoloUPrevInserito(
			CapitoloUscitaPrevisione capitoloUPrevInserito) {
		this.capitoloUPrevInserito = capitoloUPrevInserito;
	}

}
