/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * RegimeFiscaleFEL
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public enum RegimeFiscaleFEL {
	
	ORDINARIO("RF01", "Ordinario"),
	CONTRIBUENTI_MINIMI("RF02", "Contribuenti minimi (art.1, c.96-117, L. 244/07)"),
	NUOVE_INIZIATIVE("RF03", "Nuove iniziative produttive (art.13, L. 388/00)"),
	AGRICOLTURA_E_PESCA("RF04", "Agricoltura e attività connesse e pesca (artt.34 e 34-bis, DPR 633/72)"),
	SALI_E_TABACCHI("RF05", "Vendita sali e tabacchi (art.74, c.1, DPR. 633/72)"),
	COMMERCIO_FIAMMIFERI("RF06", "Commercio fiammiferi (art.74, c.1, DPR  633/72)"),
	EDITORIA("RF07", "Editoria (art.74, c.1, DPR  633/72)"),
	TELEFONIA_PUBBICA("RF08", "Gestione servizi telefonia pubblica (art.74, c.1, DPR 633/72)"),
	TRASPORTI_E_SOSTA("RF09", "Rivendita documenti di trasporto pubblico e di sosta (art.74, c.1, DPR  633/72)"),
	INTRATTENIMENTI("RF10", "Intrattenimenti, giochi e altre attività di cui alla tariffa allegata al DPR 640/72 (art.74, c.6, DPR 633/72)"),
	AGENZIE_VIAGGIO_E_TURISMO("RF11", "Agenzie viaggi e turismo (art.74-ter, DPR 633/72)"),
	AGRITURIMO("RF12", "Agriturismo (art.5, c.2, L. 413/91)"),
	VENDITE_A_DOMICILIO("RF13", "Vendite a domicilio (art.25-bis, c.6, DPR  600/73)"),
	RIVENDITA_BENI_USATI("RF14", "Rivendita beni usati, oggetti d''arte, d''antiquariato o da collezione (art.36, DL 41/95)"),
	VENDITE_ALL_ASTA("RF15", "Agenzie di vendite all''asta di oggetti d''arte, antiquariato o da collezione (art.40-bis, DL 41/95)"),
	IVA_CASSA_PA("RF16", "IVA per cassa P.A. (art.6, c.5, DPR 633/72)"),
	IVA_CASSA("RF17", "IVA per cassa (art. 32-bis, DL 83/2012)"),
	ALTRO("RF18","Altro"),
	REGIME_FORFETTARIO("RF19","Regime forfettario (art.1, c.54-89, L. 190/2014)");
	
	
	private String codice;
	private String descrizione;
	
	private RegimeFiscaleFEL(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}

	
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}


	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	public static RegimeFiscaleFEL byCodice(String codice) {
		for(RegimeFiscaleFEL r : RegimeFiscaleFEL.values()) {
			if(r.getCodice().equalsIgnoreCase(codice)) {
				return r;
			}
		}
		return null;
	}
	
}