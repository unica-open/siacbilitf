/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class CountOrdinativiMifResponse extends BaseCountOrdinativiMifResponse {
	private int numeroOrdinativi;

	public int getNumeroOrdinativi() {
		return numeroOrdinativi;
	}

	public void setNumeroOrdinativi(int numeroOrdinativi) {
		this.numeroOrdinativi = numeroOrdinativi;
	}
}
