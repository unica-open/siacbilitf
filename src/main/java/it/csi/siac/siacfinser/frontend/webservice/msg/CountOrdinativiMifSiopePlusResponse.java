/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class CountOrdinativiMifSiopePlusResponse extends BaseCountOrdinativiMifResponse {

	private Map<Integer, Integer> numeroOrdinativiPerAnnoEsercizio = new HashMap<Integer, Integer>();

	public Map<Integer, Integer> getNumeroOrdinativiPerAnnoEsercizio()
	{
		return numeroOrdinativiPerAnnoEsercizio;
	}

	public void setNumeroOrdinativiPerAnnoEsercizio(Map<Integer, Integer> numeroOrdinativiPerAnnoEsercizio)
	{
		this.numeroOrdinativiPerAnnoEsercizio = numeroOrdinativiPerAnnoEsercizio;
	}
}
