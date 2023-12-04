/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Map;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.util.CoreUtil;
import it.csi.siac.siaccommon.util.collections.Function;


@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum StatoOperativoMovimentoGestione {

	ANNULLATO("A", "Annullato"), 
	DEFINITIVO("D", "Definitivo"),
	DEFINITIVO_NON_LIQUIDABILE("N", "Definitivo non liquidabile"),
	PROVVISORIO("P", "Provvisorio");

	private String codice;
	private String descrizione;
	
	StatoOperativoMovimentoGestione(String codice, String descrizione){
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public String getCodice(){
		return codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}

	private static final Map<String, StatoOperativoMovimentoGestione> REVERSE_MAP = CoreUtil
			.getEnumMap(StatoOperativoMovimentoGestione.class, new Function<StatoOperativoMovimentoGestione, String>(){

				@Override
				public String map(StatoOperativoMovimentoGestione source) {
					return source.getCodice();
				}});


	public static StatoOperativoMovimentoGestione fromCodice(String codice) {
		return REVERSE_MAP.get(codice);
	}	
}
