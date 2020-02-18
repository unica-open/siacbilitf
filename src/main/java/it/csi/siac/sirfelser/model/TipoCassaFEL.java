/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * TipoCassaFEL
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public enum TipoCassaFEL {
	
	CASSA_AVVOCATI("TC01", "Cassa nazionale previdenza e assistenza avvocati e procuratori legali"),
	CASSA_COMMERCIALISTI("TC02", "Cassa previdenza dottori commercialisti"),
	CASSA_GEOMETRI("TC03", "Cassa previdenza e assistenza geometri"),
	CASSA_INGEGNERI_E_ARCHITETTI("TC04", "Cassa nazionale previdenza e assistenza ingegneri e architetti liberi professionisti"),
	CASSA_NOTARIATO("TC05", "Cassa nazionale del notariato"),
	CASSA__RAGIONIERI_E_PERITI("TC06", "Cassa nazionale previdenza e assistenza ragionieri e periti commerciali"),
	ENTE_AGENTI_DI_COMMERCIO("TC07", "Ente nazionale assistenza agenti e rappresentanti di commercio (ENASARCO)"),
	ENTE_CONSULENTI_DEL_LAVORO("TC08", "Ente nazionale previdenza e assistenza consulenti del lavoro (ENPACL)"),
	ENTE_MEDICI("TC09", "Ente nazionale previdenza e assistenza medici (ENPAM)"),
	ENTE_FARMACISTI("TC10", "Ente nazionale previdenza e assistenza farmacisti (ENPAF)"),
	ENTE_VETERINARI("TC11", "Ente nazionale previdenza e assistenza veterinari (ENPAV)"),
	ENTE_IMPIEGATI_AGRICOLTURA("TC12", "Ente nazionale previdenza e assistenza impiegati dell''agricoltura (ENPAIA)"),
	FONDO_IMPRESE_DI_SPEDIZIONE_E_AGENZIE_MARITTIME("TC13", "Fondo previdenza impiegati imprese di spedizione e agenzie marittime"),
	ISTITUTO_GIORNALISTI("TC14", "Istituto nazionale previdenza giornalisti italiani (INPGI)"),
	OPERA_ORFANI("TC15", "Opera nazionale assistenza orfani sanitari italiani (ONAOSI)"),
	CASSA_INTEGRATIVA_GIORNALISTI("TC16", "Cassa autonoma assistenza integrativa giornalisti italiani (CASAGIT)"),
	ENTE_PERITI_INDUSTRIALI("TC17", "Ente previdenza periti industriali e periti industriali laureati (EPPI)"),
	ENTE_PLURICATEGORIALE("TC18", "Ente previdenza e assistenza pluricategoriale (EPAP)"),
	ENTE_BIOLOGI("TC19", "Ente nazionale previdenza e assistenza biologi (ENPAB)"),
	ENTE_PROFESSIONE_INFERMIERISTICA("TC20", "Ente nazionale previdenza e assistenza professione infermieristica (ENPAPI)"),
	ENTE_PSICOLOGI("TC21", "Ente nazionale previdenza e assistenza psicologi (ENPAP)"),
	INPS("TC22", "INPS");
	
	private String codice;
	private String descrizione;
	
	private TipoCassaFEL(String codice, String descrizione) {
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
	
	public static TipoCassaFEL byCodice(String codice) {
		for(TipoCassaFEL tipoCassaFEL : TipoCassaFEL.values()) {
			if(tipoCassaFEL.getCodice().equals(codice)) {
				return tipoCassaFEL;
			}
		}
		return null;
	}
	
}