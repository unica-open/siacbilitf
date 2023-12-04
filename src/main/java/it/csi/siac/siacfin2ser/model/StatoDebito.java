/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.tesoro.fatture.StatoDebitoTipo;

/**
 * The Class StatoDebito.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class StatoDebito extends Codifica {
	//maps the siac_d_pcc_debito_stato
	private static final long serialVersionUID = -3930234782194813064L;
	
	private List<CausalePCC> causaliPCC = new ArrayList<CausalePCC>();
	
	public StatoDebito() {
		// Costruttore vuoto
	}
	
	public StatoDebito(String codice, String descrizione){
		super(codice, descrizione);
	}
	
	public StatoDebito(String codice){
		super(codice, null);
	}
	
	
	/**
	 * @return the causaliPCC
	 */
	public List<CausalePCC> getCausaliPCC() {
		return causaliPCC;
	}

	/**
	 * @param causaliPCC the causaliPCC to set
	 */
	public void setCausaliPCC(List<CausalePCC> causaliPCC) {
		this.causaliPCC = causaliPCC != null ? causaliPCC : new ArrayList<CausalePCC>();
	}
	
	/**
	 * Adds the causale pcc.
	 *
	 * @param causalePCC the causale pcc
	 */
	public void addCausalePCC(CausalePCC causalePCC){
		getCausaliPCC().add(causalePCC);
	}







	public enum Value {
		//"LIQ";"Importo liquidato (ovvero esigibile)"
		ImportoLiquidato(StatoDebitoTipo.LIQ),
		//"SOSP";"esigibilità importo sospesa"
		EsigibilitaImportoSospesa(StatoDebitoTipo.SOSP),
		//"NOLIQ";"importo valutato non liquidabile"
		ImportoValutatoNonLiquidabile(StatoDebitoTipo.NOLIQ),
		//"LIQdaSOSP";"cambio stato da sospeso a liquidato"
		CambioStatoDaSospesoALiquidato(StatoDebitoTipo.LIQ),
		// "LIQdaNL";"cambio stato da non liquidabile a liquidato"
		CambioStatoDaNonLiquidabileALiquidato(StatoDebitoTipo.LIQ),
		//"SOSPdaLIQ";"cambio stato da liquidato a sospeso"
		CambioStatoDaLiquidatoASospeso(StatoDebitoTipo.SOSP),
		//"SOSPdaNL";"cambio stato da nonliquidabile a sospeso"
		CambioStatoDaNonLiquidabileASospeso(StatoDebitoTipo.SOSP),
		//"NLdaLIQ";"cambio stato da liquidato a non liquidabile"
		CambioStatoDaLiquidatoANonLiquidabile(StatoDebitoTipo.NOLIQ),
		//"NLdaSOSP";"cambio stato da sospeso a non liquidabile"
		CambioStatoDaSospesoANonLiquidabile(StatoDebitoTipo.NOLIQ),
		//"ADEGLIQ";"variazione natura di spesa all'interno dello stato liquidato"
		VariazioneNaturaDiSpesaAllinternoDelloStatoLiquidato(StatoDebitoTipo.LIQ),
		;
		

		private StatoDebitoTipo statoDebitoTipo;
		
		
		private Value(StatoDebitoTipo statoDebitoTipo) {
			this.statoDebitoTipo = statoDebitoTipo; 
		}
		
		/**
		 * @return the statoDebitoTipo
		 */
		public StatoDebitoTipo getStatoDebitoTipo() {
			return statoDebitoTipo;
		}
		
		public Value byStatoDebitoTipo(StatoDebitoTipo statoDebito) {
			for(Value value : Value.values()){
				if(value.getStatoDebitoTipo() != null && value.getStatoDebitoTipo().equals(statoDebito)){
					return value;
				}
			}
			throw new IllegalArgumentException("Impossibile trovare il StatoDebito: "+statoDebito + " in StatoDebito.Value.");
		}
		
		
	}
	
}


