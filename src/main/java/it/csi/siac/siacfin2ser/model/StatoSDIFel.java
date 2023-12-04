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
public enum StatoSDIFel {
	
	DIGITATO 				("1", "Digitato"), 
	IN_RICONOSCIMENTO		("2","In riconoscimento"),
	DA_COMPLETARE 			("3","Da Completare"),
	COMPLETO			 	("4","Completo"),
	CANCELLATO		 		("5","Cancellato"),
	ERRATO					("6","Errato"),
	CARICATO				("7","Caricato"),
	INVIATO					("8","Inviato"),
	CONSEGNATO				("9","Consegnato"),
	SCARTATO				("10","Scartato"),
	IN_ATTESA_STAMPA		("11","In attesa di stampa"),
	IN_STAMPA				("12","In stampa"),
	DECORRENZA_TERMINI		("13","Decorrenza termini"),
	IMPOSSIBILE_RECAPITO	("14","Impossibile recapito"),
	DA_ASSOCIARE			("20","Da associare"),
	DA_COMPLETARE_P			("21","Da completare (passive)"),
	RICEVUTO				("22","Ricevuto"),
	RESPINTO				("23","Respinto"),
	ACCETTATO				("24","Accettato"),
	IN_VERIFICA				("25","In Verifica"),
	DISPUTA					("26","Disputa"),
	RIFIUTATO				("27","Rifiutato"),
	IN_CARICO				("29","In carico"),
	PAGATO					("30","Pagato"),
	INCASSATO				("31","Incassato");

	
	
	private String codice;
	private String descrizione;
	
	private StatoSDIFel(String codice, String descrizione) {
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
		for (StatoSDIFel b : StatoSDIFel.values()) {
            if (b.getCodice().equalsIgnoreCase(codice)) {
               return b.getDescrizione();
            }
        }
		return "";
	}
	

	/**
	 * restituice il corrispondente stato SDI di Contabilia
	 * @param codice
	 * @return
	 */
	
	static public String getCodiceContabilia(int codice) {
		
		String codContab = "";
		
		switch(codice) {
			case 0 :
				codContab = "7"; // Scartato da FEL
				break;
			case 1 :
			case 2 :
			case 4 :
			case 7 :
			case 8 :
			case 11 :
			case 12 :
				codContab = "1";  // Inviata a FEL
				break;
			case 9 :
			case 22 :
			case 24 :
			case 25 :
			case 26 :
			case 29 :
			case 30 : 
			case 31 :
				codContab = "2"; // Accettata/Consegnata
				break;
			case 13 :
				codContab = "3"; // In decorrenza termini
				break;
			case 14 :
				codContab = "4"; // Mancata consegna
				break;
			case 6 :
			case 10 :
			case 20 :
				codContab = "5"; // Scartata
				break;
			case 23 :
			case 27 :
				codContab = "6"; // Rifiutata
				break;
			case 3 :
			case 5 :
				codContab = null; // Vuoto
				break;
		}
		
		return codContab;
	
	}

	
}
