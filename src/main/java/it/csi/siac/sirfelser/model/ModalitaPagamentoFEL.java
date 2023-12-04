/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * ModalitaPagamentoFEL
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public enum ModalitaPagamentoFEL {
	
	CONTANTI("MP01", "contanti"),
	ASSEGNO("MP02", "assegno"),
	ASSEGNO_CIRCOLARE("MP03", "assegno circolare"),
	CONTANTI_TESORERIA("MP04", "contanti presso Tesoreria"),
	BONIFICO("MP05", "bonifico"),
	VAGLIA_CAMBIARIO("MP06", "vaglia cambiario"),
	BOLLETTINO_BANCARIO("MP07", "bollettino bancario"),
	CARTA_PAGAMENTO("MP08", "carta di pagamento"),
	RID("MP09", "RID"),
	RID_UTENZE("MP10", "RID utenze"),
	RID_VELOCE("MP11", "RID veloce"),
	RIBA("MP12", "RIBA"),
	MAV("MP13", "MAV"),
	QUIETANZA_ERARIO("MP14", "quietanza erario"),
	GIROCONTO("MP15", "giroconto su conti di contabilità speciale"),
	DOMICILIAZIONE_BANCARIA("MP16", "domiciliazione bancaria"),
	DOMICILIAZIONE_POSTALE("MP17", "domiciliazione postale"),
	BOLLETTINO_POSTALE("MP18", "bollettino di c/c postale"),
	SEPA("MP19", "SEPA Direct Debit"),
	SEPA_CORE("MP20", "SEPA Direct Debit CORE"),
	SEPA_B2B("MP21", "SEPA Direct Debit B2B"),
	// SIAC-4397
	TRATTENUTA_SOMME_RISCOSSE("MP22", "Trattenuta su somme già riscosse"),
	//SIAC-7557
	PAGOPA("MP23", "Pagopa")
	;
	
	private String codice;
	private String descrizione;
	
	private ModalitaPagamentoFEL(String codice, String descrizione) {
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


	public static ModalitaPagamentoFEL byCodice(String codice) {
		for(ModalitaPagamentoFEL r : values()) {
			if(r.getCodice().equalsIgnoreCase(codice)) {
				return r;
			}
		}
		return null;
	}
}