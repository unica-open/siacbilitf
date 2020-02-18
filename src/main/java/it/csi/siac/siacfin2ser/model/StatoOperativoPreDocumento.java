/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum StatoOperativoPreDocumento implements DecodificaEnum {
	
	INCOMPLETO("I","Incompleto"),
	COMPLETO("C","Completo"),
	ANNULLATO("A","Annullato"),
	DEFINITO("D","Definito");
	
	private final String codice;
	private final String descrizione;
	
	private StatoOperativoPreDocumento(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	@Override
	public String getCodice() {
		return codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public static StatoOperativoPreDocumento byCodice(String codice) {
		for(StatoOperativoPreDocumento sopd : StatoOperativoPreDocumento.values()) {
			if(sopd.codice.equals(codice)) {
				return sopd;
			}
		}
		throw new IllegalArgumentException("Impossibile reperire uno stato corrispondente al codice " + codice);
	}

}
