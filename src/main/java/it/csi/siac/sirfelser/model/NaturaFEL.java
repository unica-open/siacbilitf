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
	 /**
     * SIAC-7557
     * Inseriti i valori: N2.1, N2.2, N3.1, N3.2, N3.3, N3.4, N3.5, N3.6, N6.1, N6.2, N6.3, N6.4, N6.5, N6.6, N6.7, N6.8, N6.9. 
	 *(i codici N2, N3 e N6 non saranno più validi a partire dal primo gennaio 2021) 
     */
	NON_SOGGETTE_IVA("N2.1","non soggette ad IVA ai sensi degli articoli da 7 a 7- septies del D.P.R. n. 633/1972"),
	NON_SOGGETTE_ALTRI_CASI("N2.2","non soggette - altri casi"),
	NON_IMPONIBILI_ESPORTAZIONI("N3.1","non imponibili - esportazioni"),
	NON_IMPONIBILI_CESSIONI_INTRA("N3.2","non imponibili - cessioni intracomunitarie"),
	NON_IMPONIBILI_CESSIONI_SAN_MARINO("N3.3","non imponibili - cessioni verso San Marino"),
	NON_IMPONIBILI_ESPORTAZIONI_OPERAZIONI_ASSIMILATE("N3.4","non imponibili - operazioni assimilate alle cessioni all’esportazione"),
	NON_IMPONIBILI_DICHIARAZIONI_INTENTO("N3.5","non imponibili - a seguito di dichiarazioni d’intento"),
	NON_IMPONIBILI_ALTRE_OPERAZIONI("N3.6","non imponibili - altre operazioni che non concorrono alla formazione del plafond"),
	INVERSIONE_CONTABILE_CESSIONE_ROTTAMI("N6.1","inversione contabile - cessione di rottami e altri materiali di recupero"),
	INVERSIONE_CONTABILE_CESSIONE_ORO("N6.2","inversione contabile - cessione di oro e argento puro"),
	INVERSIONE_CONTABILE_SUB_SETT_EDILE("N6.3","inversione contabile - subappalto nel settore edile"),
	INVERSIONE_CONTABILE_CESSIONE_FABBRICATI("N6.4","inversione contabile - cessione di fabbricati"),
	INVERSIONE_CONTABILE_CESSIONE_TELEFONIA("N6.5","inversione contabile - cessione di telefoni cellulari"),
	INVERSIONE_CONTABILE_CESSIONE_ELETTRONICA("N6.6","inversione contabile - cessione di prodotti elettronici"),
	INVERSIONE_CONTABILE_PRESTAZIONI_EDILI("N6.7","inversione contabile - prestazioni comparto edile e settori connessi"),
	INVERSIONE_CONTABILE_SETT_ENERGETICO("N6.8","inversione contabile - operazioni settore energetico"),
	INVERSIONE_CONTABILE_ALTRI_CASI("N6.9","inversione contabile - altri casi")
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