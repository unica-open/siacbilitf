/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public enum OrdinamentoPreDocumentoEntrata {
	
	NUMERO_PREDOCUMENTO("Numero"),
	PERIODO_COMPETENZA("Periodo di competenza"),
	DATA_COMPETENZA_NOMINATIVO("Data di competenza e nominativo"),
	;
	
	private final String descrizione;
	
	/**
	 * Costruttore
	 * @param descrizione la descrizione utente
	 */
	private OrdinamentoPreDocumentoEntrata(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
}
