/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ric.RicercaSinteticaCapitoloUGest;

/**
 * Richiesta al metodo
 * BIL.CapitoloUscitaGestioneService.ricercaSinteticaCapitoloUscitaGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaCapitoloUscitaGestione extends RicercaSinteticaCapitolo {

	private RicercaSinteticaCapitoloUGest ricercaSinteticaCapitoloUGest;
	private Boolean calcolaTotaleImporti;

	public RicercaSinteticaCapitoloUGest getRicercaSinteticaCapitoloUGest() {
		return ricercaSinteticaCapitoloUGest;
	}

	public void setRicercaSinteticaCapitoloUGest(
			RicercaSinteticaCapitoloUGest ricercaSinteticaCapitoloUGest) {
		this.ricercaSinteticaCapitoloUGest = ricercaSinteticaCapitoloUGest;
	}

	/**
	 * @return the calcolaTotaleImporti
	 */
	public Boolean getCalcolaTotaleImporti() {
		return calcolaTotaleImporti;
	}

	/**
	 * @param calcolaTotaleImporti the calcolaTotaleImporti to set
	 */
	public void setCalcolaTotaleImporti(Boolean calcolaTotaleImporti) {
		this.calcolaTotaleImporti = calcolaTotaleImporti;
	}
	
}
