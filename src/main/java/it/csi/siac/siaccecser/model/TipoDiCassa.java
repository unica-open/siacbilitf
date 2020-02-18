/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.21
 */

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum TipoDiCassa {
	CONTO_CORRENTE_BANCARIO("CC", "Conto/Corrente bancario"),
	CONTANTI("CO", "Contanti"),
	MISTA("MI", "Mista");
	
	private String codice;
	private String descrizione;
	
	private TipoDiCassa(String codice, String descrizione) {
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
	
	public static TipoDiCassa byCodice(String codice) {
		for(TipoDiCassa tdc : values()) {
			if(tdc.getCodice().equals(codice)) {
				return tdc;
			}
		}
		return null;
	}
	
	
	public static class TipoDiCassaAdapter extends XmlAdapter<TipoDiCassa.TipoDiCassaWrapper, TipoDiCassa> {
	
		@Override
		public TipoDiCassa unmarshal(TipoDiCassaWrapper tipoDiCassa) throws Exception {
			return tipoDiCassa != null ? TipoDiCassa.valueOf(tipoDiCassa.name) : null;
		}

		@Override
		public TipoDiCassaWrapper marshal(TipoDiCassa tipoDiCassa) throws Exception {
			return tipoDiCassa != null ? new TipoDiCassaWrapper(tipoDiCassa.name(), tipoDiCassa.getCodice(), tipoDiCassa.getDescrizione()) : null;
		}
	}
	
	@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
	public static class TipoDiCassaWrapper {
		@XmlValue
		String name;
		@XmlAttribute
		private String codice;
		@XmlAttribute
		private String descrizione;
		
		public TipoDiCassaWrapper(){
			// Costruttore vuoto
		}
		
		public TipoDiCassaWrapper(String name, String codice, String descrizione) {
			super();
			this.name = name;
			this.codice = codice;
			this.descrizione = descrizione;
		}	
	}

}