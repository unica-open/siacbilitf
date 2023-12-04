/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccecser.model.CECDataDictionary;

/**
 * Elenco dei tipi di entita consultabile.
 * 
 * @author Domenico Lisi
 * @version 1.0 - 22/03/2016
 */
@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum TipoEntitaConsultabile {
	
	SOGGETTO("Soggetti"),
	PROVVEDIMENTO("Provvedimenti"),
	
	CAPITOLOSPESA("Capitoli Spesa"),
	CAPITOLOENTRATA("Capitoli Entrata"),
	
	ACCERTAMENTO("Accertamenti"), 
	REVERSALE("Reversali"), 

	IMPEGNO("Impegni"), 
	LIQUIDAZIONE("Liquidazioni"), 
	MANDATO("Mandati"),
	
	ALLEGATO("Allegati"), 
	ELENCO("Elenchi"), 
	DOCUMENTO("Documenti"), 
	VARIAZIONE("Variazioni"),
	
	// SIAC-4589
	MODIFICA_IMPORTO_MOVIMENTO_GESTIONE_SPESA("Modifiche Importo Impegno"),
	MODIFICA_IMPORTO_MOVIMENTO_GESTIONE_ENTRATA("Modifiche Importo Accertamento"),
	
	// SIAC-5279
	INDIRIZZO("Indirizzi"),
	SEDE_SECONDARIA_SOGGETTO("Sedi Secondarie Soggetto"),
	MODALITA_PAGAMENTO_SOGGETTO("Modalita' Pagamento Soggetto"),
	
	;
	
	private final String descrizione;
	
	private TipoEntitaConsultabile(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	
}
