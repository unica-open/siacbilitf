/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

import java.util.Map;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siaccommon.util.CoreUtil;
import it.csi.siac.siaccommon.util.collections.Function;



@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum StatoMutuo {

	Bozza("B", "Bozza"),
	Predefinitivo("P", "Predefinitivo"),
	Definitivo("D", "Definitivo"),
	Annullato("A", "Annullato"),
	;
	
	private String codice;
	private String descrizione;
	
	
	private static final Map<String, StatoMutuo> REVERSE_MAP = CoreUtil
			.getEnumMap(StatoMutuo.class, new Function<StatoMutuo, String>(){

				@Override
				public String map(StatoMutuo source) {
					return source.getCodice();
				}});


	public static StatoMutuo fromCodice(String codice) {
		return REVERSE_MAP.get(codice);
	}
	
	
	private StatoMutuo(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public String getCodice(){
		return codice; 
	}

	public String getDescrizione() {
		return descrizione;
	}
	
	public boolean isBozza() {
		return Bozza.codice.equals(codice);
	}

	public boolean isPredefinitivo() {
		return Predefinitivo.codice.equals(codice);
	}
	
	public boolean isDefinitivo() {
		return Definitivo.codice.equals(codice);
	}
	
	public boolean isAnnullato() {
		return Annullato.codice.equals(codice);
	}
}
