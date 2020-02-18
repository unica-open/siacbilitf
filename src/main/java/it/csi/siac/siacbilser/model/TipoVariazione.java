/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.model.DecodificaEnum;

/**
 * Enumera i possibili tipi della variazione di bilancio
 * @author Pro Logic
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum TipoVariazione implements DecodificaEnum {
	
	/**
	 * the Storno
	 */
	STORNO("ST", "Storno"),
	/**
	 * The variazione importo
	 */
	VARIAZIONE_IMPORTO("VA", "Variazione di bilancio"),
	/**
	 * The variazione decentrata
	 */
	//VARIAZIONE_DECENTRATA("VD", "Variazione decentrata"),
	/**
	 * The variazione codifica
	 */
	VARIAZIONE_CODIFICA("CD", "Variazione codifiche"),
	/**
	 * The prelevamento fondo di riserva
	 */
	PRELEVAMENTO_FONDO_DI_RISERVA("PF", "Prelevamento fondo di riserva"),
	/**
	 * The Utilizzo avanzo di amministrazione
	 */
	UTILIZZO_AVANZO_DI_AMMINISTRAZIONE("UA", "Utilizzo avanzo di amministrazione"),
	/**
	 * The variazione prenotazione pluriennale
	 */
	PRENOTAZIONE_AL_PLURIENNALE("PP", "Prenotazione al pluriennale"),
	/**
	 * The prenotazione passata ad assegnazione
	 */
	PRENOTAZIONE_PASSATA_AD_ASSEGNAZIONE("XP", "Prenotazione passata ad assegnazione"),
	/**
	 * The variazione per riaccertamento
	 */
	VARIAZIONE_PER_RIACCERTAMENTO("VR", "Variazione per riaccertamento"),
	/**
	 * The variazione per assestamento 
	 */
	VARIAZIONE_PER_ASSESTAMENTO("AS","Variazione per assestamento"), 
	
	//SIAC-4637
	COSTITUZIONE_INCREMENTO_FPV_SPESA("FP","Costituzione/Incremento FPV di spesa"),
	;
	
	private String codice;
	private String descrizione;

	TipoVariazione(String codice, String descrizione){
		this.codice = codice;
		this.descrizione = descrizione;
	}

	@Override
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
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
	
	

}
