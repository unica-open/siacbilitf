/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.messaggio;

import it.csi.siac.siacbilser.business.utility.StringUtilities;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.messaggio.TipoMessaggio;

public enum MessaggioBil implements TipoMessaggio {
	
	STANZIAMENTO_DI_CASSA_INCONGRUENTE("BIL_WAR_0001", "Stanziamento di cassa diverso dalla somma tra la competenza e i residui, si desidera continuare?"),
	STANZIAMENTO_DI_CASSA_INCONGRUENTE_DOPO_DEFINIZIONE_VARIAZIONE("BIL_WAR_0112", "Stanziamento di cassa dopo la definizione della variazione sar&agrave; incongruente, si desidera continuare?"),
	
	PRESENZA_DI_VARIAZIONI_IN_BOZZA("BIL_INF_0013", "Esistono variazioni di bilancio in stato bozza, vuoi proseguire?"),
	NUOVO_CAPITOLO_GIA_ABBINATO_AD_UNA_VARIAZIONE_CON_DIVERSA_APPLICAZIONE("BIL_INF_0014", "Capitolo gia'' creato con un'altra variazione con diversa applicazione. Si desidera proseguire?"),
	INSERIMENTO_VARIAZIONE_ANDATO_A_BUON_FINE("BIL_INF_0018", "L''operazione e'' stata completata con successo. Inserita variazione {0}"),
	INSERIMENTO_VINCOLO_CAPITOLO_ANDATO_A_BUON_FINE("BIL_INF_0020", "L''operazione e'' stata completata con successo. Vincolo inserito"),
	VINCOLO_CAPITOLO_GIA_PRESENTE("BIL_INF_0021", "L''inserimento del vincolo non e'' andato a buon fine. Per il capitolo di spesa {0} e il capitolo di entrata {1} il vincolo e'' gia'' presente"),
	INDICARE_TIPO_CAPITOLO("BIL_INF_0022", "Indicare il tipo di capitolo per effettuare la ricerca dei vincoli di uno specifico capitolo"),
	CONFERMA_ANNULLAMENTO("BIL_INF_0027", "Il sistema procedera'' con l'annullamento del {0}, vuoi proseguire?"),
	CONFERMA_ELIMINAZIONE("BIL_INF_0028", "Il sistema procedera'' con l'eliminazione del {0}, vuoi proseguire?"),
	CONFERMA_PIANO_DEI_CONTI_DIVERSO_DA_QUELLO_DEL_CAPITOLO("BIL_INF_0032", "Piano dei conti diverso da quello del capitolo, vuoi proseguire?"),
	CONFERMA_TIPO_FINANZIAMENTO_DIVERSO_DA_QUELLO_DEL_CAPITOLO("BIL_INF_0033", "Tipo finanziamento diverso da quello del capitolo, vuoi proseguire?"),
	// CONFERMA_ANNULLAMENTO_DI_UN_CAPITOLO_E_DELLE_SUE_UPB - BIL_INF_0050
	// CONFERMA_ELIMINAZIONE_DI_UN_CAPITOLO_E_DELLE_SUE_UPB - BIL_INF_0053
	// DISPONIBILITA_UPB_INSUFFICIENTE - BIL_INF_0054
	// UPB_NON_ELIMINABILE - BIL_INF_0055
	// UPB_NON_CANCELLABILE - BIL_INF_0056
	CONFERMA_AGGANCIO_PROPOSTA_PRELIMINARE_ALLA_VARIAZIONE("BIL_INF_0060", "Si conferma il legame della proposta preliminare con la variazione?"),
	INSERIMENTO_ANDATO_A_BUON_FINE("BIL_INF_0064", "L''operazione e'' stata completata con successo. Inserito storno {0}"),
	//AGGIORNAMENTO_CODIFICHE_UPB_DA_VARIAZIONE_CODIFICHE_CAPITOLO - BIL_INF_0072
	DATI_DURC_NON_COERENTI("BIL_INF_0114", "Dati durc non corretti: {0}"),
	
	// SIAC-6881 
	INSERIMENTO_COMPONENTE_CAPITOLO_ANDATO_A_BUON_FINE("BIL_INF_0113", "L''operazione e'' stata completata con successo. Inserito Componente:  {0}"),
	AGGIORNAMENTO_COMPONENTE_CAPITOLO_ANDATO_A_BUON_FINE("BIL_INF_0114", "L''operazione e'' stata completata con successo. Aggiornato Componente:  {0}"),
	
	// SIAC-7557 
	INSERIMENTO_TIPO_DOCUMENTO_ANDATO_A_BUON_FINE("BIL_INF_0115", "L''operazione e'' stata completata con successo. Inserito Tipo Documento:  {0}"),
	AGGIORNAMENTO_TIPO_DOCUMENTO_ANDATO_A_BUON_FINE("BIL_INF_0116", "L''operazione e'' stata completata con successo. Aggiornato Tipo Documento:  {0}"),
	
	//SIAC-8017-CMTO
	DISPONIBILITA_CAPITOLO_SU_SOTTOCONTO("BIL_INF_0115", "Disponibilita'' capitolo {0} su sottoconto {1}"), 
	
	//SIAC-8856
	DISPONIBILITA_CAPITOLO_SU_SOTTOCONTO_INCASSO("BIL_INF_0115", "Il valore da ripianare sul vincolo {0} su sottoconto {1} "), 
	DISPONIBILITA_CAPITOLO_SU_SOTTOCONTO_NON_VINCOLATO("BIL_INF_0115","Capitolo {0}/{1} sottoconto {2} non vincolati, valore di ripiano non calcolabile"),
	
	
	IMPORTO_RATA_NON_CORRETTO("BIL_WAR_0120", "L''importo rata {0} non e'' corretto ed e'' stato ricalcolato"),
	
	;

	
	private final String codice;
	private final String messaggio;
	
	MessaggioBil(String codice, String messaggio) {
		this.codice = codice;
		this.messaggio = messaggio;
	}

	@Override
	public String getCodice() {
		return codice;
	}

	@Override
	public Messaggio getMessaggio(Object... args) {
		final String msg = StringUtilities.formatStringWithDefaultReplacements(this.messaggio, "", args);
		return new Messaggio(this.codice, msg);
	}
	
}
