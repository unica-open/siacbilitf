/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.tesoro.fatture.TipoOperazioneTipo;

/**
 * The Class TipoOperazionePCC.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class TipoOperazionePCC extends Codifica {
	//maps the siac_d_pcc_operazione_tipo
	
	private static final long serialVersionUID = 6812995892036797960L;
	
	public TipoOperazionePCC() {
		// Costruttore vuoto
	}
	
	public TipoOperazionePCC(String codice, String descrizione) {
		super(codice, descrizione);
	}
	
	public TipoOperazionePCC(String codice){
		super(codice, null);
	}
	
	public static enum Value {
		//CO
		Contabilizzazione(TipoOperazioneTipo.CO, 1),
		//CS
		ComunicazioneDataScadenza(TipoOperazioneTipo.CS, 1),
		//CP
		ComunicazionePagamento(TipoOperazioneTipo.CP, 1),
		//CCS
		CancellazioneComunicazioniScadenza(TipoOperazioneTipo.CCS, 0),
		;
		
		private final TipoOperazioneTipo tipoOperazioneTipo;
		private final int sortOrder;
		
		private Value(TipoOperazioneTipo tipoOperazioneTipo, int sortOrder) {
			this.tipoOperazioneTipo = tipoOperazioneTipo; 
			this.sortOrder = sortOrder;
		}

		/**
		 * @return the tipoOperazioneTipo
		 */
		public TipoOperazioneTipo getTipoOperazioneTipo() {
			return tipoOperazioneTipo;
		}
		
		/**
		 * @return the sortOrder
		 */
		public int getSortOrder() {
			return sortOrder;
		}
		
		public static Value byTipoOperazionePCC(TipoOperazionePCC tipoOperazionePCC) {
			if(tipoOperazionePCC == null) {
				return null;
			}
			final String code = tipoOperazionePCC.getCodice();
			for(Value value : Value.values()){
				if(value.getTipoOperazioneTipo().value().equals(code)){
					return value;
				}
			}
			throw new IllegalArgumentException("Impossibile trovare il codice " + code + " in TipoOperazionePCC.Value.");
		}

		public static Value byTipoOperazione(TipoOperazioneTipo tipoOperazione) {
			for(Value value : Value.values()){
				if(value.getTipoOperazioneTipo().equals(tipoOperazione)){
					return value;
				}
					
			}
			throw new IllegalArgumentException("Impossibile trovare il tipoOperazione: "+tipoOperazione + " in TipoOperazionePCC.Value.");
		}
		
		
		
	}
	
	
}
