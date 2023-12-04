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
public enum TipoRipartizioneMutuo {

	Capitale("01", "Capitale"),
	Interessi("02", "Interessi"),
	;
	
	private String codice;
	private String descrizione;

	
	private static final Map<String, TipoRipartizioneMutuo> REVERSE_MAP = CoreUtil
			.getEnumMap(TipoRipartizioneMutuo.class, new Function<TipoRipartizioneMutuo, String>(){

				@Override
				public String map(TipoRipartizioneMutuo source) {
					return source.getCodice();
				}});


	public static TipoRipartizioneMutuo fromCodice(String codice) {
		return REVERSE_MAP.get(codice);
	}
	
	private TipoRipartizioneMutuo(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public String getCodice(){
		return codice; 
	}

	public String getDescrizione() {
		return descrizione;
	}
	
	public boolean isCapitale() {
		return Capitale.codice.equals(codice);
	}
	
	public boolean isInteressi() {
		return Interessi.codice.equals(codice);
	}
}
