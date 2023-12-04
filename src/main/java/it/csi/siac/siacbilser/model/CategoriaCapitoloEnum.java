/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

public enum CategoriaCapitoloEnum {

	STD("STD","Standard"), 
	FPV("FPV","Fondo Pluriennale Vincolato"),
	AAM("AAM","Avanzo amministrazione"),
	FCI("FCI","Fondo cassa iniziale"),
	DAM("DAM","Disavanzo amministrazione"),
	FPVCC("FPVCC","Entrate Fondo Pluriennale vincolato per spese in conto capitale"),
	FPVSC("FPVSC","Entrate Fondo Pluriennale vincolato per spese correnti"),
	FSC("FSC","Fondo Crediti Dubbia Esigibilita'"),
	DDANC("DDANC","Disavanzo derivante da debito autorizzato e non contratto"),
	FPVIAF("FPVIAF","Entrate Fondo pluriennale vincolato per incremento di  attivita' finanziarie"),
	;
	
	private String codice;
	private String descrizione;
	
	private CategoriaCapitoloEnum(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}

	public String getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}
	
	public static CategoriaCapitoloEnum byCodice(String code) {
		for (CategoriaCapitoloEnum st : CategoriaCapitoloEnum.values()) {
			if(st.getCodice().equals(code)) {
				return st;
			}
		}
		return null;
	}
	
	public static boolean categoriaIsFPV(String codice) {
		if(codice != null)
			return codice.startsWith("FPV");
		else
			return false;
	}
	
}
