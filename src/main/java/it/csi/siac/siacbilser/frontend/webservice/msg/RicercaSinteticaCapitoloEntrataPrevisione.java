/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ric.RicercaSinteticaCapitoloEPrev;

/**
 * Richiesta al metodo BIL.CapitoloEntrataPrevisioneService.
 * ricercaSinteticaCapitoloEntrataPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaCapitoloEntrataPrevisione extends RicercaSinteticaCapitolo {

	private RicercaSinteticaCapitoloEPrev ricercaSinteticaCapitoloEPrev;
	private Boolean calcolaTotaleImporti;

	public RicercaSinteticaCapitoloEPrev getRicercaSinteticaCapitoloEPrev() {
		return ricercaSinteticaCapitoloEPrev;
	}

	public void setRicercaSinteticaCapitoloEPrev(
			RicercaSinteticaCapitoloEPrev ricercaSinteticaCapitoloEPrev) {
		this.ricercaSinteticaCapitoloEPrev = ricercaSinteticaCapitoloEPrev;
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
