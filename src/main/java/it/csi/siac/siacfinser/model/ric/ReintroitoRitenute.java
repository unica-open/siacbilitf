/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ReintroitoRitenute implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MovimentoKey impegnoDiDestinazione;
	private MovimentoKey accertamentoDiDestinazione;
	
	public MovimentoKey getImpegnoDiDestinazione() {
		return impegnoDiDestinazione;
	}
	public void setImpegnoDiDestinazione(MovimentoKey impegnoDiDestinazione) {
		this.impegnoDiDestinazione = impegnoDiDestinazione;
	}
	public MovimentoKey getAccertamentoDiDestinazione() {
		return accertamentoDiDestinazione;
	}
	public void setAccertamentoDiDestinazione(MovimentoKey accertamentoDiDestinazione) {
		this.accertamentoDiDestinazione = accertamentoDiDestinazione;
	}
	
}
