/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.RichiestaEconomaleModelDetail;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaSinteticaModulareRichiestaEconomale extends RicercaSinteticaRichiestaEconomale {
	
	private RichiestaEconomaleModelDetail[] richiestaEconomaleModelDetails;

	/**
	 * @return the RichiestaEconomaleModelDetails
	 */
	public RichiestaEconomaleModelDetail[] getRichiestaEconomaleModelDetails() {
		return richiestaEconomaleModelDetails;
	}

	/**
	 * @param RichiestaEconomaleModelDetails the RichiestaEconomaleModelDetails to set
	 */
	public void setRichiestaEconomaleModelDetails(RichiestaEconomaleModelDetail... richiestaEconomaleModelDetails) {
		this.richiestaEconomaleModelDetails = richiestaEconomaleModelDetails;
	}
	
	
	
}
