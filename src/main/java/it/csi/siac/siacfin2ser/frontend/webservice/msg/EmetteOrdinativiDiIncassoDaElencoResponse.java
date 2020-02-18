/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class EmetteOrdinativiDiIncassoDaElencoResponse extends ServiceResponse {
	
	private List<SubdocumentoEntrata> subdocumentiScartati = new ArrayList<SubdocumentoEntrata>();
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();

	/**
	 * @return the subdocumentiScartati
	 */
	public List<SubdocumentoEntrata> getSubdocumentiScartati() {
		return subdocumentiScartati;
	}

	/**
	 * @param subdocumentiScartati the subdocumentiScartati to set
	 */
	public void setSubdocumentiScartati(List<SubdocumentoEntrata> subdocumentiScartati) {
		this.subdocumentiScartati = subdocumentiScartati;
	}
	/**
	 * @return the messaggi
	 */
	public List<Messaggio> getMessaggi() {
		return messaggi;
	}

	/**
	 * @param messaggi the messaggi to set
	 */
	public void setMessaggi(List<Messaggio> messaggi) {
		this.messaggi = messaggi;
	}
	
	public void addMessaggio(Messaggio messaggio) {
		messaggi.add(messaggio);
	}

	public void addMessaggi(List<Messaggio> messaggi) {
		this.messaggi.addAll(messaggi);
	}
	
}
