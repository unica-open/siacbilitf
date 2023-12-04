/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Map;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.util.CoreUtil;
import it.csi.siac.siaccommon.util.collections.Function;

/**
 * StatoOperativoProgetto
 * 
 * 
 */

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum StatoOperativoProgetto {

	ANNULLATO("AN"), 
	VALIDO("VA"), 
	//PROVVISORIO("PR")
	;

	String codice;
	
	StatoOperativoProgetto(String codice){
		this.codice = codice;
	}
	
	public String getCodice(){
		return codice;
	}
	
	
	private static final Map<String, StatoOperativoProgetto> REVERSE_MAP = CoreUtil
			.getEnumMap(StatoOperativoProgetto.class, new Function<StatoOperativoProgetto, String>(){

				@Override
				public String map(StatoOperativoProgetto source) {
					return source.getCodice();
				}});


	public static StatoOperativoProgetto fromCodice(String codice) {
		return REVERSE_MAP.get(codice);
	}		
}
