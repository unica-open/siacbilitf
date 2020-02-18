/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlAdapter;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoIvaSplitReverse {
	
	SPLIT_ISTITUZIONALE("SI", "Split istituzionale"),
	SPLIT_COMMERCIALE("SC", "Split commerciale"),
	REVERSE_CHANGE("RC", "Reverse change"),
	ESENZIONE("ES", "Esenzione"),
	;
	
	private String codice;
	private String descrizione;
	
	private TipoIvaSplitReverse(String codice, String descrizione) {
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
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public static TipoIvaSplitReverse byCodice(String codice) {
		for(TipoIvaSplitReverse tisr : values()) {
			if(tisr.getCodice().equals(codice)) {
				return tisr;
			}
		}
		return null;
	}

 public static class TipoIvaSplitReverseAdapter extends XmlAdapter<TipoIvaSplitReverse.TipoIvaSplitReverseWrapper, TipoIvaSplitReverse> {
	
		@Override
		public TipoIvaSplitReverse unmarshal(TipoIvaSplitReverseWrapper tipoIvaSplitReverse) throws Exception {
			return tipoIvaSplitReverse != null ? TipoIvaSplitReverse.valueOf(tipoIvaSplitReverse.name) : null;
		}

		@Override
		public TipoIvaSplitReverseWrapper marshal(TipoIvaSplitReverse tipoIvaSplitReverse) throws Exception {
			return tipoIvaSplitReverse != null ? new TipoIvaSplitReverseWrapper(tipoIvaSplitReverse.name(), tipoIvaSplitReverse.getCodice(), tipoIvaSplitReverse.getDescrizione()) : null;
		}
	}
	
	@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
	public static class TipoIvaSplitReverseWrapper {
		@XmlValue
		String name;
		@XmlAttribute
		private String codice;
		@XmlAttribute
		private String descrizione;
		
		public TipoIvaSplitReverseWrapper(){
			// Costruttore vuoto
		}
		
		public TipoIvaSplitReverseWrapper(String name, String codice, String descrizione) {
			super();
			this.name = name;
			this.codice = codice;
			this.descrizione = descrizione;
		}	
	}
}
