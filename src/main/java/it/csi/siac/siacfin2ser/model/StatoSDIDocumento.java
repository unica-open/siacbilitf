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
public enum StatoSDIDocumento {
	
	INVIATA_FEL				("1", "Inviata a FEL"), 
	ACCET_CONSEG			("2","Accettata/Consegnata"),
	DECORR_TERMINI 			("3","In decorrenza termini"),
	MANCATA_CONS		 	("4","Mancata consegna"),
	SCARTATA		 		("5","Scartata"),
	RIFIUTATA				("6","Rifiutata"),
	SCARTATO_FEL			("7","Scartato da FEL");
	
	private String codice;
	private String descrizione;
	
	private StatoSDIDocumento(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	/**
	 * restituice la descrizione a partire del codice se non presente stringa vuota
	 * @param codice
	 * @return
	 */
	
	static public String getDescrizioneFromCodice(String codice) {
		for (StatoSDIDocumento b : StatoSDIDocumento.values()) {
            if (b.getCodice().equalsIgnoreCase(codice)) {
               return b.getDescrizione();
            }
        }
		return "";
	}
	
	
	
}
