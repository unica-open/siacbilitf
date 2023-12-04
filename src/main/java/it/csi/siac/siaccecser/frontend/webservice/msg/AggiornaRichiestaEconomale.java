/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.RichiestaEconomale;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class AggiornaRichiestaEconomale extends ServiceRequest {
	
	private RichiestaEconomale richiestaEconomale;

	public RichiestaEconomale getRichiestaEconomale() {
		return richiestaEconomale;
	}

	public void setRichiestaEconomale(RichiestaEconomale richiestaEconomale) {
		this.richiestaEconomale = richiestaEconomale;
	}


}
