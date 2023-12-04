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
public enum TipoTassoMutuo {

	Fisso("F", "Fisso"),
	Variabile("V", "Variabile"),
	;
	
	private String codice;
	private String descrizione;

	
	private static final Map<String, TipoTassoMutuo> REVERSE_MAP = CoreUtil
			.getEnumMap(TipoTassoMutuo.class, new Function<TipoTassoMutuo, String>(){

				@Override
				public String map(TipoTassoMutuo source) {
					return source.getCodice();
				}});


	public static TipoTassoMutuo fromCodice(String codice) {
		return REVERSE_MAP.get(codice);
	}
	
	private TipoTassoMutuo(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public String getCodice(){
		return codice; 
	}

	public String getDescrizione() {
		return descrizione;
	}
	
	public boolean isFisso() {
		return Fisso.codice.equals(codice);
	}
	
	public boolean isVariabile() {
		return Variabile.codice.equals(codice);
	}
}
