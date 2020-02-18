/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;

/**
 * UnitaElementareGestioneEntrata
 * 
 * @author 1513
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class UnitaElementareGestioneEntrata extends UnitaElementareGestione {

	private static final long serialVersionUID = 6610678969589840513L;
	private List<Accertamento> accertamenti = new ArrayList<Accertamento>();
	private List<CapitoloEntrataGestione> capitoliEntrata = new ArrayList<CapitoloEntrataGestione>();

	public List<Accertamento> getAccertamenti() {
		return accertamenti;
	}

	public void setAccertamenti(List<Accertamento> accertamenti) {
		this.accertamenti = accertamenti;
	}

	public List<CapitoloEntrataGestione> getCapitoliEntrata() {
		return capitoliEntrata;
	}

	public void setCapitoliEntrata(List<CapitoloEntrataGestione> capitoliEntrata) {
		this.capitoliEntrata = capitoliEntrata;
	}

}
