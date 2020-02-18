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
public enum TipoRegistroIva {
	
	CORRISPETTIVI("CI", "Corrispettivi", TipoEsigibilitaIva.IMMEDIATA),
	ACQUISTI_IVA_IMMEDIATA("AI", "Acquisti iva immediata", TipoEsigibilitaIva.IMMEDIATA),
	ACQUISTI_IVA_DIFFERITA("AD", "Acquisti iva differita", TipoEsigibilitaIva.DIFFERITA),
	VENDITE_IVA_IMMEDIATA("VI", "Vendite iva immediata", TipoEsigibilitaIva.IMMEDIATA),
	VENDITE_IVA_DIFFERITA("VD", "Vendite iva differita", TipoEsigibilitaIva.DIFFERITA);

	
	private String codice;
	private String descrizione;
	private TipoEsigibilitaIva tipoEsigibilitaIva;


	private TipoRegistroIva(String codice, String descrizione, TipoEsigibilitaIva tipoEsigibilitaIva){
		this.codice = codice;
		this.descrizione = descrizione;
		this.tipoEsigibilitaIva = tipoEsigibilitaIva;
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


	/**
	 * @return the tipoEsigibilitaIva
	 */
	public TipoEsigibilitaIva getTipoEsigibilitaIva() {
		return tipoEsigibilitaIva;
	}


	/**
	 * @param tipoEsigibilitaIva the tipoEsigibilitaIva to set
	 */
	public void setTipoEsigibilitaIva(TipoEsigibilitaIva tipoEsigibilitaIva) {
		this.tipoEsigibilitaIva = tipoEsigibilitaIva;
	}
	
	/**
	 * Adapter per il tipo di registro iva.
	 * 
	 * @author Marchino Alessandro
	 * @version 1.0.0 - 14/10/2015
	 *
	 */
	public static class TipoRegistroIvaAdapter extends XmlAdapter<TipoRegistroIva.TipoRegistroIvaWrapper, TipoRegistroIva> {
		
		@Override
		public TipoRegistroIva unmarshal(TipoRegistroIva.TipoRegistroIvaWrapper p) throws Exception {
			return p != null ? TipoRegistroIva.valueOf(p.name) : null;
		}

		@Override
		public TipoRegistroIva.TipoRegistroIvaWrapper marshal(TipoRegistroIva p) throws Exception {
			return p != null ? new TipoRegistroIva.TipoRegistroIvaWrapper(p.name(), p.getCodice(), p.getDescrizione()) : null;
		}
	}
	
	/**
	 * Wrapper per il tipo di registro iva.
	 * 
	 * @author Marchino Alessandro
	 * @version 1.0.0 - 14/01/2015
	 *
	 */
	@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
	public static class TipoRegistroIvaWrapper {
		@XmlValue
		String name;
		@XmlAttribute
		private String codice;
		@XmlAttribute
		private String descrizione;
		
		/** Costruttore vuoto di default */
		public TipoRegistroIvaWrapper(){
			// Costruttore vuoto
		}
		
		/**
		 * Costruttore a partire da nome, codice e descrizione.
		 * 
		 * @param name        the name to set
		 * @param codice      the codice to set
		 * @param descrizione the descrizione to set
		 */
		public TipoRegistroIvaWrapper(String name, String codice, String descrizione) {
			super();
			this.name = name;
			this.codice = codice;
			this.descrizione = descrizione;
		}	
	}
	
}
