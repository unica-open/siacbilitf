/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * StatoOperativoDocumento
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum StatoOperativoModalitaPagamentoSoggetto {
	
	VALIDO 					("VALIDO","valido"),
	ANNULLATO 				("ANNULLATO","annullato"),
	PROVVISORIO 			("PROVVISORIO","provvisorio"),
	BLOCCATO 				("BLOCCATO","bloccato"),
	IN_MODIFICA 			("IN_MODIFICA","In modifica");
	
	
	private String codice;
	private String descrizione;
	
	private StatoOperativoModalitaPagamentoSoggetto(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
}
