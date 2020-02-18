/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * StatoOperativoProgetto
 * 
 * 
 */

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum TipoProgetto {

	PREVISIONE("P", "Previsione", TipoCapitolo.CAPITOLO_ENTRATA_PREVISIONE, TipoCapitolo.CAPITOLO_USCITA_PREVISIONE), 
	GESTIONE("G", "Gestione", TipoCapitolo.CAPITOLO_ENTRATA_GESTIONE, TipoCapitolo.CAPITOLO_USCITA_GESTIONE), 
	;

	private String codice;
	private String descrizione;
	private TipoCapitolo tipoCapitoloEntrata;
	private TipoCapitolo tipoCapitoloSpesa;
	
	private TipoProgetto(String codice, String descrizione, TipoCapitolo tipoCapitoloEntrata, TipoCapitolo tipoCapitoloSpesa){
		this.codice = codice;
		this.descrizione = descrizione;
		this.tipoCapitoloEntrata = tipoCapitoloEntrata;
		this.tipoCapitoloSpesa = tipoCapitoloSpesa;
	}
	
	
	public static TipoProgetto byCodice(String codice) {
		for(TipoProgetto tp : TipoProgetto.values()) {
			if(tp.getCodice().equals(codice)){
				return tp;
			}
		}
		throw new IllegalArgumentException("Il codice  "+ codice + " non esiste in TipoProgetto.");
	}
	
	/**
	 * Gets the codice.
	 *
	 * @return the codice
	 */
	public String getCodice(){
		return codice; 
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	
	
	public TipoCapitolo getTipoCapitoloSpesa() {
		return this.tipoCapitoloSpesa;
	}
	
	public TipoCapitolo getTipoCapitoloEntrata() {
		return this.tipoCapitoloEntrata;
	}
	
	
	
}
