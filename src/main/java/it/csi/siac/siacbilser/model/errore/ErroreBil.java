/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.errore;

import it.csi.siac.siacbilser.business.utility.StringUtilities;
import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.errore.TipoErrore;

public enum ErroreBil implements TipoErrore {

	// SIAC-3854: aggiunto errore generico utilizzabile per altre segnalazioni (previa richiesta CSI)
	ERRORE_GENERICO("BIL_ERR_0000", "{0}"),
	
	CAPITOLO_INESISTENTE("BIL_ERR_0001", "Il capitolo indicato non esiste"),
	DISPONIBILITA_NULLA("BIL_ERR_0002", "La disponibilita'' ad impegnare del capitolo e'' uguale a 0"),
	NON_TUTTI_I_CAMPI_DI_UN_CAPITOLO_ASSOCIATO_AD_UNA_VARIAZIONE_SONO_STATI_VALORIZZATI("BIL_ERR_0003", "Valorizzare tutti i campi dell''elenco capitoli per inserire un nuovo elemento"),
	DISPONIBILITA_INSUFFICIENTE("BIL_ERR_0004", "Disponibilita'' insufficiente: {0}"),
	QUADRATURA_NON_CORRETTA("BIL_ERR_0005", "{0} impossibile. Quadratura entrate-spese non corretta"),
	ANNULLAMENTO_NON_POSSIBILE("BIL_ERR_0006", "{0} impossibile. Stato variazione incongruente"),
	INCONGRUENZA_PARAMETRI_NELLA_RICERCA_ENTITA_DELLA_STRUTTURA_BILANCIO("BIL_ERR_0007", "I parametri nella ricerca {0} sono incongruenti"),
	CAPITOLO_OBBLIGATORIO_PER_ARTICOLO("BIL_ERR_0008", "Obbligo di valorizzare capitolo se valorizzato articolo"),
	IMPOSSIBILE_ATTIVARE_PREDISPOSIZIONE_BILANCIO_DI_PREVISIONE("BIL_ERR_0009", "Il bilancio si trova nella fase: {0} - non e'' pertanto consentita la predisposizione del Bilancio di Previsione"),
	ANNO_BILANCIO_GIA_PRESENTE_IN_ARCHIVIO("BIL_ERR_0010", "Impossibile inserire nuovo anno di bilancio - elemento gia'' esistente in archivio"),
	CAPITOLO_GIA_ASSOCIATO_ALLA_VARIAZIONE("BIL_ERR_0011", "Operazione non possibile. Capitolo gia'' presente nell''elenco"),
	STATO_ESERCIZIO_INCONGURENTE("BIL_ERR_0012", "Operazione consentita solamente nei seguenti stati dell''esercizio {0}"),
	DISPONIBILITA_PREVISIONE_INSUFFICIENTE("BIL_ERR_0015", "{0} impossibile: la disponibilita'' e'' insufficiente nel Bilancio di Previsione successivo"),
	CAPITOLO_CHE_NON_SI_PUO_ANNULLARE("BIL_ERR_0016", "Definizione non possibile: sono presenti capitoli non annullabili con movimenti contabili collegati o con importi significativi"),
	CAPITOLO_ANNULLATO("BIL_ERR_0017", "Il capitolo e'' stato annullato"),
	CONTROLLO_DI_VALIDITA_IMPORTO("BIL_ERR_0019", "L''importo indicato deve essere maggiore o uguale a zero"),
	// es:''Inserimento capitolo''
	OPERAZIONE_NON_POSSIBILE("BIL_ERR_0023", "Operazione non possibile: {0}"),
	ANNO_CAPITOLO_NON_CORRETTO("BIL_ERR_0024", "Non e'' possibile inserire un anno di capitolo futuro"),
	FASE_DI_BILANCIO_NON_AMMESSA_PER_GESTIONE_VINCOLI("BIL-ERR_0025", "Fase di Bilancio {0} non ammessa per la gestione dei vincoli fra capitoli"),
	//CAPITOLO_CON_VARIAZIONI_NON_DEFINITIVE_COLLEGATE("BIL_ERR_0026", "Operazione non possibile. Capitolo con variazioni non definitive collegate: {0}"),
	CAPITOLO_CON_VARIAZIONI_NON_DEFINITIVE_COLLEGATE("BIL_ERR_0026", "Capitolo con variazioni non definitive collegate: {0}"),
	//SIAC-7600
	CAPITOLO_BUDGET_CON_IMPEGNI_COLLEGATI("BIL_ERR_0027", "Capitolo con impegni collegati: {0}"),
	//
	CAPITOLO_NON_ANNULLABILE_PER_MOVIMENTI_COLLEGATI("BIL_ERR_0029", "Capitolo che non si puo'' annullare perche'' ha movimenti collegati: {0}"),
	CAPITOLO_NON_ELIMINABILE("BIL_ERR_0030", "Capitolo che non si puo'' eliminare: {0}"), 
	CAPITOLO_NON_VALIDO("BIL_ERR_0031", "Lo stato del capitolo non e'' valido"),
	CAPITOLO_NON_ANNULLABILE("BIL_ERR_0034", "Capitolo che non si puo'' annullare: {0}"),
	// UPB_GIA_PRESENTE_IN_ARCHIVIO - BIL_ERR_0035
	FASE_DI_BILANCIO_NON_AMMESSA("BIL_ERR_0036", "Fase di bilancio {0} non ammessa per {1} - {2}"),
	// CANCELLAZIONE_CLASSIFICATORE_ESISTONO_ENTITA_COLLEGATO - BIL_ERR_0037 - sostituito da COR_ERR_0024
	IMPOSSIBILE_CREARE_RESIDUO("BIL_ERR_0038", "Impossibile creare {0} residuo {1} nell''esercizio {2} - {3}"),
	CAPITOLO_NON_AGGIORNABILE_PERCHE_STATO_INCONGRUENTE("BIL_ERR_0039", "Operazione non possibile. Capitolo con stato incongruente"),
	IMPOSSIBILE_ATTIVARE_CREAZIONE_PROPOSTE_PRELIMINARI("BIL_ERR_0040", "Il bilancio si trova nella fase: {0} - non e'' pertanto consentita la creazione delle Proposte Preliminari"),
	IMPOSSIBILE_CREARE_PLURIENNALE("BIL_ERR_0041", "Impossibile creare {0} pluriennale {1} nell''esercizio {2} - {3}"),
	IMPOSSIBILE_CREARE_MOVIMENTO_GESTIONE("BIL_ERR_0042", "Impossibile creare {0} {1} per il capitolo {2} nell''esercizio {3} - {4}"),
	OBBLIGATORIETA_TIPO_VINCOLO("BIL_ERR_0043", "Tipo Vincolo obbligatorio"),
	TIPO_VINCOLO_INESISTENTE("BIL_ERR_0044", "Tipo vincolo {0} non esistente per l''anno di bilancio {1}"),
	DEFINIZIONE_NON_POSSIBILE_PERCHE_STATO_INCONGRUENTE("BIL_ERR_0045", "{0} impossibile. Stato variazione incongruente"),
	DEFINIZIONE_NON_POSSIBILE_PERCHE_FASE_DI_BILANCIO_INCONGRUENTE("BIL_ERR_0046", "{0} impossibile. Fase di Bilancio incongruente"),
	NUMERO_CAPITOLO_NON_INDICATO("BIL_ERR_0047", "Indicare il numero capitolo per effetturare la ricerca"),
	// CAPITOLO_NON_IDONEO_PER_INSERIMENTO_UPB - BIL_ERR_0048
	// DATI_UPB_INCONSISTENTI - BIL_ERR_0049
	// UPB_CON_VARIAZIONI_NON_DEFINITIVE_COLLEGATE - BIL_ERR_0051
	// UPB_NON_AGGIORNABILE_PERCHE_STATO_INCONGRUENTE - BIL_ERR_0052
	DISPONIBILITA_UEB_INSUFFICIENTE("BIL_INF_0054" , "Disponibilta'' a impegnare insufficiente, inserimento Storno UEB {0} nell''anno {1}"),
	IMPEGNATO_SUPERIORE_ALL_IMPORTO_DEL_FPV("BIL_ERR_0057", "Importo FPV non coerente: impegato superiore all''importo indicato"),
	STANZIAMENTI_CAPITOLO_UEB_CHE_SI_STANNO_VARIANDO_MINORI_DI_ZERO("BIL_ERR_0058", "Stanziamenti capitolo-UEB che si stanno variando minori di zero"),
	ASSOCIAZIONE_ATTO_DI_LEGGE_CAPITOLO_NON_INSERIBILE_PERCHE_GIA_PRESENTE("BIL_ERR_0059", "Associazione gia'' presente in archivio: {0} non possibile"),
	INSERIMENTO_CAPITOLI_NUOVI_DA_PROPOSTA_PRELIMINARE("BIL_ERR_0061", "Inserire i nuovi capitoli della proposta associata prima di effettuare il salvataggio"),
	NON_TUTTI_I_CAMPI_DELL_UEB_RELATIVA_ALLA_VARIAZIONE_DI_BILANCIO_SONO_STATI_VALORIZZATI("BIL_ERR_0062", "Valorizzare tutti i campi dell''elenco UEB per inserire un nuovo elemento"),
	UEB_GIA_ASSOCIATA_ALLA_VARIAZIONE("BIL_ERR_0063", "Operazione non possibile. UEB gia'' presente nell''elenco"), 
	// UPB_GIA_ASSOCIATA_ALLO_STORNO - BIL_ERR_0065
	ESISTONO_GIA_DELLE_PROPOSTE_PRELIMINARI("BIL_ERR_0066", "Impossibile attivare la creazione di Proposte preliminari perche'' gia'' presenti in archivio"),
	CAPITOLO_STATO_OPERATIVO_INCONGRUENTE("BIL_ERR_0067", "Impossibile trasferire i dati del capitolo {0} {1} di {2} di Previsione sull''equivalente di gestione {3}"),
	// UPB_STATO_OPERATIVO_INCONGRUENTE - BIL_ERR_0068
	CAPITOLO_DI_ENTRATA_NON_ACCERTABILE("BIL_ERR_0069", "Impossibile emettere accertamenti lo stato operativo del capitolo deve essere valido"),
	LIVELLO_PIANO_CONTI_NON_AMMESSO("BIL_ERR_0070", "L''elemento del piano dei conti finanziario deve essere di quinto livello"),
	// ELEMENTO_DEL_PIANO_DEI_CONTI_INCOERENTE_CON_UPB - BIL_ERR_0071
	OPZIONI_NON_SELEZIONATE("BIL_ERR_0073", "Selezionare almeno una delle opzioni previste"), 
	PERCENTUALE_NON_VALORIZZATA("BIL_ERR_0074", "Inserire la percentuale di variazione"), 
	TIPOLOGIA_FINANZIAMENTO_INCOMPATIBILE_CON_OPZIONE_SCELTA("BIL_ERR_0075", "Con la scelta della tipologia di finanziamento e'' ammessa solo l''opzione ''Proposte Preliminari selezionate''"), 
	DISCORDANZA_TRA_VARIAZIONI("BIL_ERR_0076", "Esiste una discordanza tra variazioni in diminuzione e variazioni in aumento per il finanziamento {0} del capitolo di {1} per l''anno di competenza {2} della proposta preliminare n. {3}"), 
	DISCORDANZA_TRA_ENTRATA_E_SPESA("BIL_ERR_0077", "Esiste una discordanza tra Entrate e Spese per i finanziamenti di tipo {0} per la proposta preliminare n. {1} per l''anno di competenza {2}"), 
	DISCORDANZA_TRA_STANZIATO_SPESA_E_STANZIATO_ENTRATA_VINCOLATO("BIL_ERR_0078", "L''importo stanziato dalla spesa e'' superiore all''importo stanziato del capitolo/ueb di entrata vincolato per la proposta preliminare n. {0} per il capitolo/ueb {1} per l''anno di competenza {2}"), 
	DISCORDANZA_TRA_STANZIATO_ENTRATA_E_STANZIATO_SPESA_VINCOLATO("BIL_ERR_0079", "L''importo stanziato dell''entrata e'' inferiore all''importo stanziato del capitolo/ueb di spesa vincolato per la proposta preliminare n. {0} per il capitolo/ueb {1} per l''anno di competenza {2}"), 
	IMPORTO_STANZIATO_INFERIORE_ALLA_SOMMA_DEGLI_IMPEGNI("BIL_ERR_0080", "Importo stanziato inferiore alla somma degli impegni per la proposta preliminare n. {0} per il capitolo/ueb {1} per l''anno di competenza {2}"), 
	IMPOSSIBILE_APRIRE_AMBIENTE_PROPOSTE_PRELIMINARI("BIL_ERR_0081", "Impossibile aprire ambiente proposte preliminari perche'' e'' nella fase: {0}"),
	IMPOSSIBILE_CHIUDERE_AMBIENTE_PROPOSTE_PRELIMINARI("BIL_ERR_0082", "Impossibile chiudere ambiente proposte preliminari perche'' e'' nella fase {0}"),
	LIVELLO_NON_AMMESSO("BIL_ERR_0083", "Il numero del livello deve essere compreso tra 1 e 4"),
	CAPITOLO_GIA_PRESENTE("BIL_ERR_0084", "Il capitolo e'' gia'' presente in archivio"),
	SELEZIONARE_RIGA_CAPITOLO("BIL_ERR_0085", "Non e'' stata selezionata nessuna riga relativa al capitolo"),
	ELEMENTO_DEL_PIANO_DEI_CONTI_INCOERENTE_CON_STRUTTURA_CAPITOLO("BIL_ERR_0086", "L''elemento del piano dei conti scelto non e'' coerente con {0} del capitolo di entrata"),
	ALCUNI_DATI_DELLA_UEB_INSERITA_SONO_DIVERSI_DALLA_PRIMA_PRESENTE_IN_ARCHIVIO("BIL_ERR_0087", "Alcuni dati inseriti differiscono da quelli della prima UEB inserita"),
	IMPOSSIBILE_APRIRE_AMBIENTE_AGLI_ORGANI("BIL_ERR_0088", "Impossibile aprire il Bilancio di Previsione {0} perche'' l''attuale bilancio e'' nella fase {1} , Stato {2}"),
	IMPOSSIBILE_CANCELLARE_LE_PROPOSTE_PRELIMINARI("BIL_ERR_0089", "Impossibile cancellare le proposte preliminari perche'' {0}"),
	OPERAZIONE_POSSIBILE("BIL_ERR_0090", "Operazione possibile"),
	ESISTE_VINCOLO_SCADUTO("BIL_INF_0091", "Esiste gia'' un vincolo scaduto con lo stesso codice: vuoi continuare?"),
	CAPITOLO_DI_SPESA_ASSENTE("BIL_ERR_0092", "E'' obbligatorio associare almeno un capitolo di spesa in presenza di capitolo di entrata associato al vincolo"),
	CAPITOLO_DI_ENTRATA_ASSENTE("BIL_ERR_0093", "E'' obbligatorio associare almeno un capitolo di entrata in presenza di capitolo di spesa associato al vincolo"),
	TETTO_MASSIMO_A_PAGARE_SUPERIORE_ALLO_STANZIATO("BIL_ERR_0094", "L''importo del tetto massimo a pagare e'' superiore all''importo dello stanziato dei capitoli di entrata per l''anno: {0}"),
	TETTO_MASSIMO_A_IMPEGNARE_SUPERIORE_ALLO_STANZIATO("BIL_ERR_0095", "L''importo del tetto massimo ad impegnare e'' superiore all''importo dello stanziato dei capitoli di spesa per l''anno: {0}"),
	DATA_INIZIO_VALIDITA_VINCOLO_NON_PRESENTE("BIL_ERR_0096", "Indicare la data di inizio validita'' del vincolo"),
	CAPITOLO_GIA_ASSOCIATO_A_UN_VINCOLO("BIL_ERR_0097", "Il capitolo selezionato e'' gia'' collegato al vincolo: {0}"),
	CAPITOLO_COLLEGATO_A_VINCOLO_SCADUTO("BIL_INF_0098", "Il capitolo e'' collegato ad un vincolo scaduto: vuoi continuare?"),
	OPERAZIONE_CON_FASE_DI_BILANCIO_NON_AMMESSA("BIL_ERR_0099", "Fase di Bilancio {0} non ammessa per {1} - {2}"),
	CRONOPROGRAMMA_INCOMPLETO("BIL_ERR_0100", "Abbinare al cronoprogramma  almeno un finanziamento e una spesa"),
	COMPETENZA_SPESA_ANTECEDENTE_COMPETENZA_ENTRATA("BIL_ERR_0101", "L''anno di competenza della spesa non puo'' essere antecedente l''anno di competenza del finanziamento"),
	INDICARE_CAPITOLO_E_ARTICOLO("BIL_ERR_0102", "La ricerca solo per ueb non e'' ammessa: indicare anche il capitolo e l''articolo"),
	INCONGRUENZA_NEI_CRITERI_IMPORTO("BIL_ERR_0103", "Indicare anche l''importo iniziale."),
	INCONGRUENZA_NEI_CRITERI_RICERCA_PROVVEDIMENTO("BIL_ERR_0104", "Incongruenza nei criteri di ricerca del provvedimento"),
	TOTALE_SPESE_DIVERSO_DAL_TOTALE_ENTRATE("BIL_ERR_0105", "Il totale delle spese e'' diverso dal totale delle entrate"),
	SPESE_CON_ANNO_RIFERIMENTO_FINANZIAMENTO_NON_PRESENTE("BIL_ERR_0106", "Nelle spese un capitolo ha l''anno di riferimento dei finanziamenti che non ha corrispondenza con i finanziamenti"),
	TOTALE_DELLE_SPESE_SUPERIORE_AL_TOTALE_DEI_FINANZIEMENTI_DI_RIFERIMENTO("BIL_ERR_0107", "Il totale delle spese e'' maggiore del totale dei finanziamenti di riferimento (verificare l''anno di riferimento dei finanziamenti)"),
	PROSECUZIONE_NONOSTANTE_QUADRATURA_NON_CORRETTA("BIL_ERR_0108", "Quadratura entrate-spese non corretta"),
	CRONOPROGRAMMA_CHE_NON_SI_PUO_AGGIORNARE_PERCHE_UTILIZZATO_NEL_CALCOLO_FPV("BIL_ERR_0109", "Aggiornamento cronoprogramma non possibile: e'' stato utilizzato per il calcolo defnitivo del FPV"),
	CRONOPROGRAMMA_CHE_NON_SI_PUO_USARE_PER_IL_CALCOLO_FPV_PERCHE_GIA_UTILIZZATO_NEL_CALCOLO_FPV("BIL_ERR_0110", "Scelta del cronoprogramma non possibile: e'' gia'' stato utilizzato per il calcolo definitivo del FPV"),
	//SIAC-8870
	CRONOPROGRAMMA_CHE_NON_SI_PUO_USARE_PER_IL_DISASSOCIA_FPV("BIL_ERR_0110", "Scelta del cronoprogramma non possibile: non e'' flaggato come FPV"),
	ESISTE_GIA_UN_CRONOPROGRAMMA_USATO_PER_IL_CALCOLO_FPV("BIL_ERR_0111", "Scelta del cronoprogramma non possibile: e'' gia'' presente un cronoprogramma usato per il calcolo FPV"),
	
	//SIAC-7228
	MODIFICA_STANZIAMENTO_NON_CONSENTITA("BIL_ERR_0112", "Modifica dello Stanziamento non consentita: La modifica dell'importo comporterebbe un importo Cassa passivo"),
	
	// CR-2304
	PROVVEDIMENTO_VARIAZIONE_NON_PRESENTE("BIL_ERR_0112", "Occorre associare un provvedimento {0} definitivo alla variazione"),
	ENTITA_ANNULLATA("BIL_ERR_0113", "{0}  in stato annullato"),

	
	CLASSIFICATORI_NON_MODIFICABILI("BIL_ERR_00XX", "I seguenti classificatori legati al capitolo non sono modificabili: {0}"),
	ATTRIBUTI_NON_MODIFICABILI("BIL_ERR_00XX", "I seguenti attributi legati al capitolo non sono modificabili: {0}"),
	PROVVEDIMENTI_UGUALI_CON_SAC_DIVERSE("FIN_ERR_0916", "E'' presente piu'' di un provvedimento con {0} . Si desidera proseguire con quello senza SAC?"),
	
	// SIAC-4451
	ELABORAZIONE_ATTIVA("FIN_WAR_4451", "{0}. Si prega di rieseguire piu'' tardi"),

	CAPITOLO_NON_MODIFICABILE("BIL_ERR_0123", "Capitolo {0} non modificabile perche'' in stato diverso da VALIDO o PROVVISORIO"), 
	
	ANTEPRIMA_NON_CONSENTITA("BIL_ERR_0113", "Anteprima non consentita {0}"),
	
	IMPORTI_NON_COERENTI("BIL_ERR_0014", "Importi non coerenti: {0}"),
	
	//SIAC-6884
	CODICE_ELENCHI_NON_CONFORME("BIL_ERR_0124", "I capitoli inseriti non presentano tutti lo stesso Codice Elenchi."),
	
	// SIAC-6881
	COMPONENTE_INESISTENTE("BIL_ERR_0126", "Il componente indicato non esiste"),
	
	// SIAC-7571
	FATTURA_CON_IMPORTO_NEGATIVO("BIL_WAR_0113", "La fattura presenta un importo negativo, si desidera importarla come nota di credito o come fattura attiva?"),

	SOLO_MACROTIPO_FRESCO("COR_ERR_0047", "Sono presenti componenti con macrotipo diverso da: {0}"),

	//SIAC-7556
	PROVVISORIO_FLUSSO_NON_TROVATO("BIL_ERR_0125", "Non sono stati trovati provvisori elaborati"),
	
	//SIAC-8004 => SIAC-8273
	FATTURA_CON_IMPORTO_NON_VALORIZZATO("BIL_ERR_0127", "La fattura presenta l''importo totale documento non valorizzato, l''importo totale verra'' valorizzato come l''importo netto. Desidera proseguire comunque?"),
	
	NESSUN_ELEMENTO_SALVATO("BIL_WAR_0114", "Non e'' stato modificato nessun dato"),
	//SIAC-8191
	IMPORTO_PREVISIONE("BIL_ERR_0128", "L''importo di previsione a chiudere supera  la differenza fra stanziato e impegnato attuale per l''anno {0}"),

	//task-225
	VARIAZIONE_MODIFICATA("BIL_ERR_0130", "La variazione e'' stata modificata da un altro utente. Si prega di visualizzare lo stato attuale attraverso la consultazione"),
	
	// mutui
	SOGGETTO_NON_ISTITUTO_CREDITO("BIL_ERR_0129", "Il soggetto {0} non e'' un''istituto di credito."),
	;


	private final String codice;
	private final String messaggio;
	
	ErroreBil(String codice, String messaggio) {
		this.codice = codice;
		this.messaggio = messaggio;
	}

	public String getCodice() {
		return codice;
	}

	@Override
	public Errore getErrore(Object... args) {
		final String msg = StringUtilities.formatStringWithDefaultReplacements(this.messaggio, "", args);
		return new Errore(this.codice, msg);
	}

}
