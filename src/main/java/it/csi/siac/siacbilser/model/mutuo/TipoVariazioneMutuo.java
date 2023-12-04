/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum TipoVariazioneMutuo {

	VariazioneTasso("T", "Variazione tasso"),
	VariazionePiano("P", "Variazione piano"),
	;
	
	private String codice;
	private String descrizione;
	
	private TipoVariazioneMutuo(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public String getCodice(){
		return codice; 
	}

	public String getDescrizione() {
		return descrizione;
	}
}
