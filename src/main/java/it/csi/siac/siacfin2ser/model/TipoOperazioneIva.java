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
public enum TipoOperazioneIva {
	
	// siac_d_iva_operazione_tipo
	
	IMPONIBILE("I", "Imponibile"),
	NON_IMPONIBILE("NI", "Non imponibile"),
	ESENTE("ES", "Esente"),
	ESCLUSO_FCI("FCI", "Escluso (FCI)");
	
	private String codice;
	private String descrizione;
	
	private TipoOperazioneIva(String codice, String descrizione) {
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

	public static TipoOperazioneIva fromCodice(String codice) {
		for(TipoOperazioneIva toi : values()) {
			if(toi.getCodice().equals(codice)) {
				return toi;
			}
		}
		return null;
	}
	
	public static class TipoOperazioneIvaAdapter extends XmlAdapter<TipoOperazioneIva.TipoOperazioneIvaWrapper, TipoOperazioneIva> {
		
		@Override
		public TipoOperazioneIva unmarshal(TipoOperazioneIvaWrapper p) throws Exception {
			return TipoOperazioneIva.valueOf(p.name);
		}

		@Override
		public TipoOperazioneIvaWrapper marshal(TipoOperazioneIva p) throws Exception {
			return new TipoOperazioneIvaWrapper(p.name(), p.getCodice(), p.getDescrizione());
		}
	}
	
	@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
	public static class TipoOperazioneIvaWrapper {
		@XmlValue
		String name;
		@XmlAttribute
		private String codice;
		@XmlAttribute
		private String descrizione;
		
		public TipoOperazioneIvaWrapper(){
			// Costruttore vuoto
		}
		
		public TipoOperazioneIvaWrapper(String name, String codice, String descrizione) {
			super();
			this.name = name;
			this.codice = codice;
			this.descrizione = descrizione;
		}	
	}
	
}
