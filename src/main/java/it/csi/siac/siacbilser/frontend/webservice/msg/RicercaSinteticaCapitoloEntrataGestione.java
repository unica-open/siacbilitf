/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ric.RicercaSinteticaCapitoloEGest;

/**
 * Richiesta al metodo
 * BIL.CapitoloEntrataGestioneService.ricercaSinteticaCapitoloEntrataGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaCapitoloEntrataGestione extends RicercaSinteticaCapitolo {

	private RicercaSinteticaCapitoloEGest ricercaSinteticaCapitoloEntrata;
	private Boolean calcolaTotaleImporti;

	public RicercaSinteticaCapitoloEGest getRicercaSinteticaCapitoloEntrata() {
		return ricercaSinteticaCapitoloEntrata;
	}

	public void setRicercaSinteticaCapitoloEntrata(
			RicercaSinteticaCapitoloEGest ricercaSinteticaCapitoloEntrata) {
		this.ricercaSinteticaCapitoloEntrata = ricercaSinteticaCapitoloEntrata;
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
