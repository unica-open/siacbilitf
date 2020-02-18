/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.TipoCausale;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class LeggiTipiCausaleEntrataResponse extends ServiceResponse {

	private List<TipoCausale> tipiCausale = new ArrayList<TipoCausale>();

	public List<TipoCausale> getTipiCausale() {
		return tipiCausale;
	}

	public void setTipiCausale(List<TipoCausale> tipiCausale) {
		this.tipiCausale = tipiCausale;
	}
}
