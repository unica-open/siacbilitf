/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Enumara i Sistemi esterni che interagiscono col SIAC.
 * 
 * @author Domenico
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum SistemaEsterno {
	
	
	FEL("Fatture Elettroniche"),
	ATTIAMM("Atti amministrativi"),
//	STIPE("Stipendi"),
//	DOC("Documenti"), //Non credo nemmeno esista! ma per ora c'è su DB!
	
	PCC("Piattaforma per la Certificazione dei Crediti")
	;
	
	private String descrizione;
	
	private SistemaEsterno(String descrizione) {
		this.descrizione = descrizione;
	}
	
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
}
