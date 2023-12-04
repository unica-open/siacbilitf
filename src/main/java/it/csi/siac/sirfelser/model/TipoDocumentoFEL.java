/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * TipoDocumentoFEL
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public enum TipoDocumentoFEL {
	
	FATTURA("TD01", "fattura", Boolean.TRUE),
	ACCONTO_FATTURA("TD02", "acconto/anticipo su fattura", Boolean.TRUE),
	ACCONTO_PARCELLA("TD03", "acconto/anticipo su parcella", Boolean.TRUE),
	NOTA_DI_CREDITO("TD04", "nota di credito", Boolean.TRUE),
	NOTA_DI_DEBITO("TD05", "nota di debito", Boolean.TRUE),
	PARCELLA("TD06", "parcella", Boolean.TRUE),
	//SIAC-7557 INIZIO
	INTEGRAZIONE_FATTURA_REVERSE_CHARGE_INTERNO("TD16","Integrazione fattura reverse charge interno", Boolean.TRUE),
	INTEGRAZIONE_AUTOFATTURA_ACQUISTO_SERVIZI_ESTERO("TD17","Integrazione/autofattura per acquisto servizi dall'estero", Boolean.TRUE),
	INTEGRAZIONE_ACQUISTO_BENI_INTRACOMUNITARI("TD18","Integrazione per acquisto di beni intracomunitari", Boolean.TRUE),
	INTEGRAZIONE_AUTOFATTURA_ACQUISTO_BENI_EX_ART_1("TD19","Integrazione/autofattura per acquisto di beni ex art. 17, c. 2, D.P.R. n. 633/1972", Boolean.TRUE),
	AUTOFATTURA_SPLAFONAMNTO("TD21","Autofattura per splafonamento", Boolean.TRUE),
	ESTRAZIONE_BENI_DEPOSITO_IVA("TD22","Estrazione beni da Deposito IVA", Boolean.TRUE),
	ESTRAZIONE_BENI_DEPOSITO_IVA_CON_VERSAMENTO("TD23","Estrazione beni da Deposito IVA con versamento dell’IVA", Boolean.TRUE),
	FATTURA_DIFFERITA_ART_1("TD24","Fattura differita di cui all’art. 21, comma 4, lett. a)", Boolean.TRUE),
	FATTURA_DIFFERITA_ART_2("TD25","Fattura differita di cui all’art. 21, comma 4, terzo Periodo, lett. b)", Boolean.TRUE),
	CESSIONE_BENI_AMMORTIZZABILI("TD26","Cessione di beni ammortizzabili e per passaggi interni (ex art. 36 D.P.R. n. 633/1972)", Boolean.TRUE),
	FATTURA_AUTOCONSUMO_CESSIONI_GRATUITE("TD27","Fattura per autoconsumo o per cessioni gratuite senza rivalsa", Boolean.TRUE)
	//SIAC-7557 FINE
	;
	
	
	
	private String codice;
	private String descrizione;
	private Boolean flagBilancio;
	
	private TipoDocumentoFEL(String codice, String descrizione, Boolean flagBilancio) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.flagBilancio = flagBilancio;
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


	/**
	 * @return the flagBilancio
	 */
	public Boolean getFlagBilancio() {
		return flagBilancio;
	}
	
	/**
	 * By codice.
	 *
	 * @param codice the codice
	 * @return the tipo documento FEL
	 */
	public static TipoDocumentoFEL byCodice(String codice){
		for(TipoDocumentoFEL e : TipoDocumentoFEL.values()){
			if(e.getCodice().equals(codice)){
				return e;
			}
		}
		return null;
	}
}