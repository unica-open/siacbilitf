/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * NaturaFEL
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public enum NaturaFEL {
	
	ESCLUSE("N1","escluse ex art. 15"),
	NON_SOGGETTE("N2","non soggette"),
	NON_IMPONIBILI("N3","non imponibili"),
	ESENTI("N4","esenti"),
	REGIME_DEL_MARGINE("N5","regime del margine"),
	INVERSIONE_CONTABILE("N6","inversione contabile (reverse charge)"),
	IVA_ASSOLTA_ALTRO_STATO_UE("N7", "IVA assolta in altro stato UE (vendite a distanza ex art. 40 commi 3 e 4 e art. 41 comma 1 lett. b, DL 331/93; prestazione di servizi di telecomunicazioni, tele-radiodiffusione ed elettronici ex art. 7-sexies lett. f, g, DPR 633/72 e art. 74-sexies, DPR 633/72)"),
	;
	
	
	private String codice;
	private String descrizione;
	
	private NaturaFEL(String codice, String descrizione) {
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
	
	public static NaturaFEL byCodice(String codice) {
		for(NaturaFEL naturaFEL : NaturaFEL.values()) {
			if(naturaFEL.getCodice().equals(codice)) {
				return naturaFEL;
			}
		}
		return null;
	}
}