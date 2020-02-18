/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.errore;

import java.text.MessageFormat;

import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.errore.TipoErrore;

public enum ErroreFin implements TipoErrore {

	SOGGETTO_ANNULLATO("FIN_ERR_00??", "msg"),
	CODICE_FISCALE_OBBLIGATORIO_PF("FIN_ERR_0015", "Codice fiscale alfanumerico obbligatorio"),
	PARTITA_IVA_OBBLIGATORIO("FIN_ERR_0016", "Partita IVA obbligatoria"),
	CODICE_FISCALE_OBBLIGATORIO_PG("FIN_ERR_0017", "Codice fiscale numerico obbligatorio"),
	PARTITA_IVA_ERRATO("FIN_ERR_0018", "Partita IVA errata"),
	SOGGETTO_ESISTENTE("FIN_ERR_0025", "Soggetto esistente (codice = {0})"),
	CANALEPA_ERRATO("FIN_ERR_0900", "Il canale PA/PRIVATI deve essere valorizzato"), //	SIAC-6565-CR1215
	CANALEPA_ERROREPA("FIN_ERR_0901", "Se il Canale PA/PRIVATI &egrave; PA, il Codice Destinatario deve essere lungo 6 caratteri"), // SIAC-6565-CR1215
	CANALEPA_ERROREPR("FIN_ERR_0901", "Se il Canale PA/PRIVATI &egrave; PRIVATI, devi valorizzare correttamente l&apos;e-mail PEC oppure il Codice Destinatario deve essere di 7 caratteri"), // SIAC-6565-CR1215
	CAMPO_ERRATO("FIN_ERR_00122", "{0} formalmente errato"),
	OPERAZIONE_EFFETTUATA_CORRETTAMENTE("COR_INF_0006", "Operazione effettuata correttamente"),
	OPERAZIONE_INCOMPATIBILE("COR_ERR_0028", "Operazione incompatibile con lo stato dell&apos; entit&agrave;"),
	FORMATO_NON_VALIDO("COR_ERR_0009", "Il formato del parametro {0} non &egrave; valido e del tipo {1}"), 	
	LEGAME_GIA_ESISTENTE("FIN_ERR_002", "Il legame e&grave; gia&grave; presente in archivio"),
	LEGAME_NON_VALIDO("FIN_ERR_003", "Legame non valido o non presente in archivio"),
	ANNULLAMENTO_MODIFICA_IMPOSSIBILE("FIN_ERR_0072", "Annullamento Modifica Impossibile"),
	RICERCA_TROPPO_ESTESA("COR_ERR_0026", "Ricerca troppo estesa"),
	DISPONIBILITA_INSUFFICIENTE("FIN_ERR_0230","{0}: disponibilit&agrave; {1} &egrave; insufficiente."),
	STATO_PROVVEDIMENTO_NON_CONSENTITO("FIN_ERR_0075","Per l&apos;operazione di {0} il provvedimento indicato deve essere in stato {1}"),
	DATO_SOGGETTO_PRESENTE("FIN_ERR_0057","Dato Soggetto Presente (entita'': {0}  valore: {1})"),
	SOGGETTO_NON_VALIDO("FIN_ERR_0104","Il soggetto selezionato non &egrave; VALIDO"),
	SEDE_SECONDARIA_SOGGETTO_NON_VALIDA("FIN_ERR_0175","Sede Secondaria Soggetto non valida"),
	INCONGRUENZA_TRA_I_PARAMETRI_ORIGINE("FIN_ERR_0211", "Incongruenza nei parametri (motivo: l&apos;anno dell&apos;{0} di origine deve essere minore dell&apos;anno {1})"),
	INCONGRUENZA_TRA_I_PARAMETRI_IMPEGNO("FIN_ERR_0211", "Incongruenza nei parametri (motivo: l&apos;anno del finanziamento deve essere minore o uguale a quello dell&apos;impegno)"),
	INCONGRUENZA_TRA_I_PARAMETRI_RIACCERTAMENTO("FIN_ERR_0211", "Incongruenza nei parametri (motivo: l&apos;anno dell&apos;{0} riaccertato deve essere minore dell&apos;anno {1})"),
	MOVIMENTO_NON_TROVATO("FIN_ERR_0133","Movimento collegato non trovato (movimento = {0}) "),
	DISPONIBILITA_INSUFFICIENTE_IMPEGNO("FIN_ERR_0078", "Disponibilit&agrave; Insufficiente (movimento = {0}, operazione = {1})"),
	ANNO_MOVIMENTO_NON_VALIDO("FIN_ERR_0153", "L&apos;anno del movimento deve essere uguale o superiore all&apos;anno di bilancio corrente"),
	DATA_SCADENZA_IMPEGNO_ERRATA("FIN_ERR_300", "La data scadenza deve essere compresa nell&apos;anno impegno"),
	DATA_SCADENZA_ACCERTAMENTO_ERRATA("FIN_ERR_300", "La data scadenza deve essere compresa nell&apos;anno accertamento"),
	PIU_RISULTATI_TROVATI("FIN_ERR_301", "La ricerca ha restituito piu&apos; di un provvedimento"),
	PIU_RISULTATI__PROVV_TROVATI("FIN_ERR_301", "La ricerca ha restituito piu&apos; di un capitolo"),
	REIMPUTAZIONE_RESIDUI_SU_MODIFICA_IN_AUMENTO("FIN_ERR_0127", "La reimputazione puo'' essere realizzata solo a seguito di una modifica in diminuzione di importo del movimento"),
	REIMPUTAZIONE_NON_PREVISTA_PER_I_SUB_IMP("FIN_ERR_0129", "La reimputazione &egrave; prevista solo per l&apos;impegno"),
	REIMPUTAZIONE_NON_PREVISTA_PER_I_SUB_ACC("FIN_ERR_0129", "La reimputazione &egrave; prevista solo per l&apos;accertamento"),
	
	CAMPO_LUNGHEZZA_MINIMA_NON_RISPETTATA("FIN_ERR_0303", "Il campo {0} deve essere almeno di {1} caratteri"),
	
	INCONGRUENZA_CON_IL_RESIDUO_DERIVATO("FIN_ERR_0051", "Attenzione c&apos;&egrave; una incongruenza con il residuo derivato, verificare. {0} "),
	
	RIACCERTAMENTO_RESIDUI_NON_AMMESSO_IN_PREDISPOSIZIONE_CONSUNTIVO_IMP("FIN_ERR_0129", "Riaccertamento residui non ammesso in predisposizione consuntivo, ''Impegno''"),
	RIACCERTAMENTO_RESIDUI_NON_AMMESSO_IN_PREDISPOSIZIONE_CONSUNTIVO_ACC("FIN_ERR_0129", "Riaccertamento residui non ammesso in predisposizione consuntivo, ''Accertamento''"),
	
	RIACCERTAMENTO_RESIDUI_NON_AMMESSO_ASSIEME_REIMPUTAZIONE_IMP("FIN_ERR_0129", "Riaccertamento residui non ammesso contemporaneamente alla reimputazione, ''Impegno''"),
	RIACCERTAMENTO_RESIDUI_NON_AMMESSO_ASSIEME_REIMPUTAZIONE_ACC("FIN_ERR_0129", "Riaccertamento residui non ammesso contemporaneamente alla reimputazione, ''Accertamento''"),
	
	RIACCERTAMENTO_RESIDUI_NON_AMMESSO_IMP("FIN_ERR_0129", "Riaccertamento residui non ammesso, ''Impegno''"),
	RIACCERTAMENTO_RESIDUI_NON_AMMESSO_ACC("FIN_ERR_0129", "Riaccertamento residui non ammesso, ''Accertamento''"),
	
	REIMPUTAZIONE_NON_COMPATIBILE_CON_CANCELLAZIONE_IMP("FIN_ERR_0129", "Reimputazione non compatibile con cancellazione, ''Impegno''"),
	REIMPUTAZIONE_NON_COMPATIBILE_CON_CANCELLAZIONE_ACC("FIN_ERR_0129", "Reimputazione non compatibile con cancellazione, ''Accertamento''"),
	
	REIMPUTAZIONE_RESIDUI_NON_AMMESSO_IMP("FIN_ERR_0129", "Reimputazione residui non ammesso, ''Impegno''"),
	REIMPUTAZIONE_RESIDUI_NON_AMMESSO_ACC("FIN_ERR_0129", "Reimputazione residui non ammesso, ''Accertamento''"),
	
	SUPERAMENTO_IMPORTO_PROGETTO("FIN_ERR_0302", "L&apos;importo del progetto non deve essere superato dalla somma dei movimenti collegati"),
	
    DISTRIBUZIONE_IMPORTI_ERRATA("FIN_ERR_00168", "La somma degli importi deve essere uguale all&apos;importo {0}"),
    IMPORTO_ERRATO_SUBIMPEGNO("FIN_ERR_302", "L&apos;importo inserito non &egrave; valido"),
    INCONGRUENZA_NEI_PARAMETRI_("COR_ERR_0029", "Esiste un&apos;incongruenza tra i parametri di input: {0}"),
	ENTITA_GIA_PRESENTE("COR_ERR_0008", "{0} : {1} &egrave; gi&agrave; presente in archivio"),
    PRESENZA_SUBIMPEGNI("FIN_ERR_0004", "Esistono Movimenti Collegati (operazione=Annullamento)"),
    AGGIORNAMENTO_LIQUIDAZIONE_PROVVISORIA("FIN_ERR_0004", "Esistono Movimenti Collegati (operazione = aggiornamento liquidazione)"),
    OPERAZIONE_INCOMPATIBILE_CON_STATO_ENTITA("COR_ERR_0028", "Operazione non consentita: {0} in stato {1}"),
    OPERAZIONE_INCOMPATIBILE_CON_STATO_ENTITA_FIN("FIN_ERR_0028", "{0} {1} , non utilizzabile per il riaccertamento residui"),
    ANNO_PLURIENNALE_GIA_PRESENTE("COR_ERR_0035", "Attributo gi&agrave; presente (entit&agrave;: Anno; valore: {0})"),
    OPERAZIONE_INCOMPATIBILE_PER_BILANCIO("FIN_ERR_0197","Operazione non compatibile(operazione = {0}; causa = Lo stato del Bilancio e&#180 in stato : {1})"),
    SOGGETTO_BLOCCATO_PER_MUTUO("FIN_ERR_0162","Soggetto Bloccato per mutuo"),
    FORMATO_BANCARIO_NON_VALIDO("COR_ERR_0009", "Il formato del parametro {0} non &egrave; valido - deve essere di {1} caratteri"),
    VALORE_NON_VALIDO("COR_ERR_0010", "Il valore del parametro {0} non &egrave; consentito {1}"),
    ANNULLAMENTO_MUTUO_IMPOSSIBILE("FIN_ERR_0145", "Annullamento mutuo impossibile"),
    CANCELLAZIONE_MUTUO_IMPOSSIBILE("FIN_ERR_0167", "Cancellazione mutuo impossibile"),
    MUTUO_INESISTENTE("FIN_ERR_0144","Il mutuo indicato non esiste"),
    IMPORTO_MUTUO_NON_MODIFICABILE("FIN_ERR_0144","Importo mutuo non modificabile"),
    IMPORTO_MUTUO_NON_VALIDO("FIN_ERR_0144","Importo mutuo non valido"),
    SOGGETTO_MUTUO_NON_MODIFICABILE("FIN_ERR_0144","Soggetto mutuo non modificabile"),
    PROVVEDIMENTO_MUTUO_NON_MODIFICABILE("FIN_ERR_0144","Provvedimento mutuo non modificabile"),
    CANCELLAZIONE_VOCE_MUTUO_IMPOSSIBLE("FIN_ERR_0167", "Cancellazione mutuo impossibile"),
    IMPORTO_VOCE_MUTUO_MAGGIORE_DISPONIBILITA_IMPEGNO("FIN_ERR_0149", "Importo della voce di mutuo &egrave; superiore al disponibile da finanziare su impegno"),
    IMPORTO_VOCE_MUTUO_MAGGIORE_DISPONIBILE_MUTUO("FIN_ERR_0150", "Importo della voce di mutuo &egrave; superiore ad importo disponibile del mutuo"),
    MUTUO_TOTALMENTE_FINANZIATO("FIN_ERR_0151", "Il mutuo &egrave; totalmente finanziato"),
    IMPORTO_RIUTILIZZO_ECO_RID_MAGGIORE_MODIFICA_SU_IMPEGNO("FIN_ERR_0165", "Importo di riutilizzo per Economia/Riduzione &egrave; superiore all&apos;importo della modifica sull&apos;impegno"),
    IMPORTO_VOCE_MUTUO_MAGGIORE_IMPORTO_DI_RIUTILIZZO("FIN_ERR_0164", "L&apos;importo della voce di mutuo &egrave; superiore all&apos;importo della modifica disponibile sull&apos;impegno"),
    IMPORTO_VOCE_MUTUO_INFERIORE_ALLA_SOMMA_LIQUIDAZIONI_SU_IMPEGNO("FIN_ERR_0154", "L&apos;importo della voce di mutuo &egrave; inferiore alla somma delle liquidazioni legate all&apos;impegno"),
    OPERAZIONE_NON_COMPATIBILE("FIN_ERR_0197", "{0} non possibile: {1}"),
    IMPORTO_ECO_RID_MAGGIORE("FIN_ERR_0165", "L&apos;importo di riutilizzo per ECO o RID maggiore della modifica su impegno"),	
    NUMERO_IMPEGNO_NON_VALIDO("FIN_ERR_0077", "Impegno non in stato Definitivo/Non Liquidabile (motivo: {0})"),
    IMPEGNO_CON_SUBIMPEGNI("FIN_ERR_0076", "Impegno con subimpegni"),
    ACCERTAMENTO_CON_SUBACCERTAMENTI("FIN_ERR_0076", "Accertamento con subaccertamento/i: {0}. Indicare il subAccertamento di interesse."),
    PRESENZA_CLASSIFICAZIONE_SOGGETTO("FIN_ERR_0115", "Il soggetto scelto non appartiene alla classificazione del movimento"),
    MANCATA_CORRISPONDENZA_IMPEGNO_CON_SUBIMPEGNI("FIN_ERR_0076B", "Mancata corrispondenza impegno subimpegni"),
    IMPEGNO_FINANZIATO_DA_MUTUO("FIN_ERR_0248", "Impegno finanziato da mutuo"),    
    IMPEGNO_NON_FINANZIATO_DA_MUTUO("FIN_ERR_0248B", "Impegno non finanziato da mutuo"),
    NESSUNA_CORRISPONDENZA_MUTUO("FIN_ERR_0248C", "Mancata corrispondenza mutuo"),
    IMPEGNO_STATO_DEF_O_NON_LIQ("FIN_ERR_0077", "Impegno non in stato Definitivo/Non Liquidabile"),
    SUB_IMP_PRESENTE("FIN_ERR_0076", "Impegno con subimpegni"),
    SOGGETTO_BLOCCATO("FIN_ERR_0094","Soggetto Bloccato"),
    MOD_PAGAMENTO_NON_VALIDE("FIN_ERR_0001","Disponibilit&agrave; Insufficiente (operazione = \"Inserimento Liquidazione\")"),
    MOD_DISPONIBILITA_LIQUIDAZIONE_INSUFFICIENTE("FIN_ERR_0001","Disponibilit&agrave; Insufficiente (operazione = \"Aggiornamento Liquidazione\")"),
    SUB_IMP_NON_DEFINITIVO("FIN_ERR_0076", "Subimpegno non in stato Definitivo"),
    ATTO_AMM_ANNULLATO("FIN_ERR_00", "Provvedimento Annullato"),
    MOD_PAGAMENTO_STATO("FIN_ERR_0249", "Stato elemento soggetto non valido (parte=\"Modalit&agrave; di Pagamento\")"),
    MOD_PAGAMENTO_NON_PRESENTE("FIN_ERR_0082", "Modalit&agrave; di pagamento non presente per il soggetto {0}"),
    MOD_PAGAMENTO_STATO_CESSIONE("FIN_ERR_0249", "Stato elemento soggetto non valido (parte=\"Modalit&agrave; Cessione di Credito\")"),
    MOD_PAGAMENTO_STATO_ORIG("FIN_ERR_0249", "{0} soggetto non Valido o Utilizzabile"),
    ANNULLAMENTO_LIQUIDAZIONE_IMPOSSIBILE("FIN_ERR_0111", "{0} Impossibile annullare una liquidazione con mandati validi collegati"),
    ANNULLAMENTO_LIQUIDAZIONE_DERIVATA_DA_ALLEGATOA_ATTO("FIN_ERR_0111", "Impossibile annullare una liquidazione derivata da atto allegato."),
    OGGETTO_NON_UNIVOCO("FIN_ERR_0247", "{0} non identificato univocamente: specificare la chiave dell&apos;oggetto"),
    LIQUIDAZIONE_INESISTENTE("FIN_ERR_0095", "La liquidazione indicata non esiste"),
    DISPONIBILITA_LIQUIDAZIONE_INSUFFICIENTE("FIN_ERR_0103", "Il disponibile della LIQUIDAZIONE &egrave; insufficiente"),	
    DISPONIBILITA_DI_CASSA_INSUFFICIENTE("FIN_ERR_0102", "Il disponibile di CASSA &egrave; insufficiente"),
    OPERAZIONE_NON_POSSIBILE("FIN_ERR_0087", "{0} impossibile"),
    SUPERAMENTO_DISPONIBILITA("FIN_0062","Superamento della disponibilit&agrave;"),
    DISPONIBILITA_INSUFFICIENTE_IMPEGNI_PLUR("FIN_ERR_0209","Disponibilit&agrave; Insufficiente per anno ({0}: impegno , {1}: anno bilancio del capitolo)"),
    MOV_NON_ESISTENTE("FIN_ERR_0002", "{0} inesistente"),
    RIACCERTAMENTO_AUTOMATICO("FIN_INF_0069","Modifica per RIACCERTAMENTO RESIDUI: si desidera emettere automaticamente l&apos;{0} con l&apos;importo della modifica effettuata?"),
    MOV_ANNULLATO("FIN_ERR_0008", "{0} annullato"),
    MOV_PROVVISORIO("FIN_ERR_0106", "Movimento provvisorio (movimento = {0} )"),
    FORMATO_NON_VALIDO_SECONDO("COR_ERR_0009", "Il formato del parametro {0} non &egrave; valido "), 	
    IMPEGNO_NON_COMPATIBILE("FIN_ERR_0105", "Impegno non compatibile"),
    DATA_SCADENZA_IMPEGNO_ERRATA_PARAMETRIZZATA("FIN_ERR_300", "La data scadenza deve essere compresa nell&apos;anno {0}"), 
    RANGE_NON_VALIDO("FIN_ERR_0040", "L&apos;importo deve essere compreso tra il minimo e il massimo"),
    RIACCERTAMENTO_RESIDUI_MOD_AUM("FIN_ERR_0127", "Il riaccertamento residui puo'' essere realizzato solo a seguito di una modifica in diminuzione di importo del movimento {0} di origine"),
    MODPAGAMENTOBLOCCATO("FIN_ERR_MODPAG_01","Non &egrave; possibile inserire una modalita'' di pagamento in stato BLOCCATO, ANNULLATO o PROVVISORIO"),
    ELEM_PDC_NON_INDICATO("FIN_ERR_0074", "Il livello selezionato del piano dei conti finanziario deve essere uguale al V"),
    ELEM_CONTOECO_NON_INDICATO("FIN_ERR_0074", "Il livello selezionato del piano dei conto economico deve essere uguale al V"),
    UTENTE_NON_ABILITATO("FIN_ERR_0265", "L&apos;operatore non &egrave; abilitato all&apos;accesso"),
    STATO_MOVIMENTO_IMPOSSIBILE("FIN_ERR_0055", "Operazione impossibile, movimdento in stato annullato."),
	CAMPO_NON_ACCETTABILE("FIN_ERR_0009", "Il valore del campo {0} non &egrave; ammesso"),
	CAMPO_DATA_NON_ACCETTABILE("FIN_ERR_0009", "Il valore {0}  deve essere successivo alla data corrente"),
	LIQUIDAZIONE_GIA_PRESENTE("FIN_ERR_0128", "Liquidazione gia&grave; presente"),
	ACCERTAMENTO_GIA_PRESENTE("FIN_ERR_0128", "Accertamento gia&grave; presente"),
	ENTITA_COLLEGATE("FIN_INF_0260", "Esistono {0} collegati: {1}"),
	ORDINATIVO_INESISTENTE("FIN_ERR_0179", "Nessun Ordinativo trovato"),
	ORDINATIVO_MANCANTE_QUOTE("FIN_ERR_0203", "Ordinativo mancante di quote {0}, {1}"),
	ORDINATIVO_MANCANTE_DI_QUOTE("FIN_ERR_0203", "Operazione di {0} di {1} non confermabile. Deve essere indicata almeno una quota."),
	ORDINATIVO_COMPETENZA_O_RESIDUO("FIN_ERR_0114", "Ordinativo competenza o residuo"),
	MOVIMENTO_GESTIONE_PLURIENNALE_NON_AMMESSO("FIN_ERR_0177", "Movimento gestione pluriennale non ammesso per operazione, {0} , {1} "),
	CRU_WAR_1003("CRU_WAR_1003", "Non sono presenti {0}"),
    DISPONIBILITA_ACCERTAMENTO_INSUFFICIENTE("FIN_ERR_0103", "Il disponibile dell&apos; accertamento &egrave; insufficiente"),
    INSERIMENTO_QUOTA_CON_CONFERMA("COR_CON_0032","	L&apos; importo della quota &egrave; maggiore della disponibilit&agrave; dell&apos; accertamento: si vuole procedere con {0}?"),
    ESISTONO_MOVIMENTI_COLLEGATI("FIN_ERR_0004","{0} impossibile, esistono movimenti collegati {1}"),
    DISPONIBILITA_INSUFFICIENTE_ORIG("FIN_ERR_0001","{0} impossibile, la disponibilita'' dell''impegno (sub) e'' insufficiente"),
    DISPONIBILITA_INSUFFICIENTE_MOVIMENTO_GESTIONE("FIN_ERR_0001","Operazione impossibile {0} , la disponibilit&agrave; dell&apos;impegno (sub) &egrave; insufficiente"),
    ANNULLAMENTO_CARTA_IMPOSSIBILE("COR_ERR_0039","Annullamento non possibile( Motivo: {0})"),
    ORDINATIVI_COLLEGATI("FIN_ERR_0107","Liquidazione con ordinativi collegati"),
    ENTITA_NON_AGGIORNABILE("FIN_ERR_0163","Operazione non possibile. {0}  associata  {1}"),
    CANCELLAZIONE_SOGGETTO_IMPOSSIBILE("FIN_ERR_0021","Cancellazione {0} soggetto impossibile: esistono movimenti collegati di tipo {1}"),
    RELAZIONE_GIA_PRESENTE("COR_ERR_0033","Operazione impossibile: relazione gi&agrave; presente in archivio"),
    PDC_INCOMPATIBILE("FIN_ERR_0290", "PdC Finanziario non compatibile"),
    DATA_NON_OMOGENEA("FIN_ERR_291", "Le date di Esecuzione/Scadenza devono essere uguali per tutte le quote"),
    MOD_PAGAMENTO_SCADUTA("FIN_ERR_0296", "La modalit&agrave; di pagamento selezionata non &egrave; pi&ugrave valida"),

    IMPOSSIBILE_ANNULLARE_ACCERTAMENTO_VINCOLATO("FIN_ERR_0136", "Annullamento Accertamento impossibile, &egrave; collegato a impegni "),
     
    
    MODIFICA_IMPORTO_ACCERTAMENTO_CON_STATO_PROVV("FIN_ERR_0030", "La modifica dell&apos;Accertamento non  &egrave; consentita se lo stato accertamento non  &egrave; PROVVISORIO"),
    MODIFICA_IMPORTO_IMPEGNO_CON_STATO_PROVV("FIN_ERR_0030", "La modifica dell&apos;Impegno non  &egrave; consentita se lo stato impegno non  &egrave; PROVVISORIO"),
   
    MODIFICA_ATTO_AUTORIZZATIVO_CON_STATO_IMPEGNO_NON_PROVVISORIO("FIN_ERR_0029", "La modifica dell&apos;Atto Autorizzativo non &egrave; consentita se lo stato impegno non &egrave; PROVVISORIO"),
    MODIFICA_ATTO_AUTORIZZATIVO_CON_STATO_ACCERTAMENTO_NON_PROVVISORIO("FIN_ERR_0029", "La modifica dell&apos;Atto Autorizzativo non &egrave; consentita se lo stato accertamento non &egrave; PROVVISORIO"),
    
    
    // nuovo
    TRANSAZIONE_ELEMENTARE_OBBLIGATORIA("FIN_ERR_0201", "Transazione elementare obbligatoria : {0} - {1}"),
    // nuovo
    PROVVISORIO_NON_REGOLARIZZABILE("FIN_ERR_0195", "{0} di un {1} con indicazione del provvisorio di cassa {2}. Impossibile procedere con la sua regolarizzazione. {3}"),
    // nuovo
    IMPORTO_REGOLARIZZATO_ERRATO("FIN_ERR_0187", "L&apos; importo indicato per la regolarizzazione deve essere maggiore di 0 e inferiore al disponibile a regolarizzare. {0}"),
    ERRORE_IN_CARTA_CONTABILE("FIN_ERR_0261","Impossibile aggiornare la carta contabile {0}"),
    // nuovo
    TOTALE_PROVVISORI_COLLEGATI_NON_COINCIDE_CON_IMPORTO_ORDINATIVO_SUB("FIN_ERR_0045", "Il totale dei provvisori collegati non coincide con l&apos;importo dell&apos;ordinativo"),
	// modificato
	// vecchio
	// ACCERTAMENTO_STATO_OPERATIVO_NON_AMMESSO("FIN_ERR_0176", "Accertamento non può essere incassato"),
	// nuovo
	ACCERTAMENTO_STATO_OPERATIVO_NON_AMMESSO_PER_OPERAZIONE("FIN_ERR_0176", "{0} non e'' in stato operativo {1}  {2}"),
	// modificato
	// vecchio
	// SOGGETTO_MOVIMENTO_GESTIONE_NON_VALIDO_PER_ORDINATIVO("FIN_ERR_0205", "Soggetto movimento gestione non valido per ordinativo")
	// nuovo
	SOGGETTO_MOVIMENTO_GESTIONE_NON_VALIDO_PER_ORDINATIVO("FIN_ERR_0205", "Soggetto movimento gestione non valido per ordinativo : {0} {1} {2}"),
	
	
	//SIAC-6990
	//codice di errore scalabile per il sevizio ModificaImportoImpegnoSuAnniSuccessiviService
	MODIFICA_SU_ANNI_SUCCESSIVI_NON_COMPLEATA("FIN_ERR_0206", "{0}"),
	
	DATA_SUCCESSIVA("COR_ERR_0009", "Il campo {0} deve essere successivo {1}"),
	DATE_INCONGRUENTI("COR_ERR_0038", "Date incongruenti.  {0}"),
	AGGIORNAMENTO_STATO_OPERATIVO("FIN_INF_0047", "Il movimento in stato {0} verr&agrave; salvato in stato {1}: confermi l&apos;operazione?"),
	ANNULLAMENTO_SOGGETTO_IMPOSSIBILE("FIN_ERR_0020", "Annullamento {0} soggetto impossibile: esistono ancora {1} pendenti"),
	OPERAZIONE_EFFETTUATA("COR_INF_0034", "Operazione di {0} &egrave; stata effettuata. {1}"),
	WARNING_GENERICO("FIN_WAR", "{0}"),
	// VINCOLI
	IMPEGNO_NON_TOT_VINCOLATO("FIN_CON_0273", "Impegno non totalmente vincolato alle entrate: al salvataggio verr&agrave; salvato con importo liquidabile = 0"),
	TOT_COLLEGA_VINCOLO("FIN_CON_0273", "Il totale da collegare non puo'' essere minore di zero"),
	MOVGEST_GIA_PRESENTE("FIN_ERR_0271", "{0} gia'' presente"),
	CAPITOLO_ENTR_NON_IN_VINCOLO("FIN_ERR_0272", "L&apos;accertamento deve appartenere a uno dei capitoli del vincolo {0} "),
	IMPEGNO_NON_TOTALMENTE_VINCOLATO("FIN_INF_0276", "Impegno vincolato non totalmente collegato alle entrate, il liquidabile &egrave; azzerato"),
	MOV_LIQUIDATO("FIN_ERR_0278", "{0} gia&grave; {1}: non e'' possibile inserire una modifica di soggetto"),
	MOV_VINCOLATO_LIQUIDATO("FIN_ERR_0279", "La somma delle liquidazioni &egrave; superiore alla somma dei vincoli "),
	
	
	ACCERTAMENTO_NON_VALIDO("FIN_ERR_0211", "L&apos;anno dell&apos;accertamento non deve essere maggiore dell&apos;anno dell&apos;impegno"),
	// TODO ACCERTAMENTO_VINCOLO_NON_VALIDO("FIN_ERR_0XXX", "Non è possibile inserire l'accertamento"), //accertamento non valido
	PROVVEDIMENTO_DECENTRATO_NON_VALIDO("FIN_INF_0282","Provvedimento con struttura amministrativa non congruente"),
	SAC_PROVVEDIMENTO_E_CAPITOLO_INCONGRUENTE("FIN_INF_0283","Provvedimento e Capitolo hanno una struttura amministrativa non congruente"),
	
	MOVIMENTO_COLLEGATO_PER_PDC_MODIFICATO("FIN_INF_0294","ATTENZIONE! L&apos; {0} &egrave; collegato a movimenti il cui pdc deve essere verificato"),
	SUB_MOVIMENTO_COLLEGATO_PER_PDC_MODIFICATO("FIN_INF_0294","ATTENZIONE! Il {0} &egrave; collegato a movimenti il cui pdc deve essere verificato"),
	
	WARNING_IMPEGNO_SUBIMPEGNO_PER_PDC_MODIFICATO("FIN_INF_0294","ATTENZIONE! {0} &egrave; collegato a liquidazioni non annullate che non saranno aggiornate"),

	WARNING_IMPEGNO_SDF("FIN_INF_0299","L''Impegno supera il disponibile a impegnare del capitolo, verra'' salvato Senza Disponibilita'' di Fondi"),
	WARNING_CONFERMA_SALVA_IMPEGNO_SDF("FIN_INF_0299","L''Impegno supera il disponibile a impegnare del capitolo, vuoi salvarlo ugualmente come Senza Disponibilita'' di Fondi?"),
	
	WARNING_IMPEGNO_SDF_CON_DISPONIBILE("FIN_INF_0300","Impegno SDF con capitolo tornato disponibile"),
	WARNING_IMPEGNO_SDF_CON_DISPONIBILE_SALVA("FIN_INF_0300","Attenzione, L''Impegno e'' SDF ma e'' presente disponibilita'' sul capitolo al salvataggio verra'' tolta l''indicazione SDF"),
	
	CONFERMA_AGGIORNAMENTO_PROVVEDIMENTO_CON_MOVIMENTO_DEFINITIVO("FIN_CON_0298: Cambiamento di Provvedimento", "Si sta chiedendo di aggiornare il provvedimento di un movimento definitivo, confermi?"),
	CONFERMA_AGGIORNAMENTO_PROVVEDIMENTO_CON_MOVIMENTO_DEFINITIVO_NON_LIQUIDABILE("FIN_CON_0298: Cambiamento di Provvedimento","Si sta chiedendo di aggiornare il provvedimento di un movimento definitivo con sub che saranno eventualmente da aggiornare in seguito, confermi?"),
	CONFERMA_AGGIORNAMENTO_PROVVEDIMENTO_CON_MOVIMENTO_CON_LIQUIDAZIONI("FIN_CON_0298: Cambiamento di Provvedimento","Si sta chiedendo di aggiornare il provvedimento di un movimento con liquidazioni gia'' emesse, confermi?"),
	CONFERMA_AGGIORNAMENTO_PROVVEDIMENTO_CON_MOVIMENTO_CON_ORDINATIVI("FIN_CON_0298: Cambiamento di Provvedimento","Si sta chiedendo di aggiornare il provvedimento di un movimento con ordinativi gia'' emessi, confermi?"),
	CONFERMA_AGGIORNAMENTO_VINCOLO_CON_CAPITOLO_SENZA_DISPONIBILITA("FIN_CON_0298: Aggiorna Impegno - Modifica Vincoli","L''impegno supera il disponibile a impegnare del capitolo, vuoi salvarlo ugualmente?"),
	
	WARNING_IMPORTO_VINCOLATO ("FIN_WAR_001","L''importo totale della liquidazione supera l''importo riscosso"),
	WARNING_STORICIZZAZIONE_IMPEGNI ("FIN_WAR_002","Accertamento presente come legame storico con impegni: verifica gli importi FPV. Per proseguire, salvare nuovamente. "),

	//SIAC-6929
	OGGETTO_BLOCCATO_DALLA_RAGIONERIA("FIN_ERR_0304","Oggetto bloccato dalla ragioneria {0}")
	;
	
	
	private final String codice;
	private final String messaggio;

	ErroreFin(String codice, String messaggio) {
		this.codice = codice;
		this.messaggio = messaggio;
	}

	public String getCodice() {
		return codice;
	}

	public String getMessaggio() {
		return messaggio;
	}

	@Override
	public Errore getErrore(Object... args) {
		return new Errore(codice,MessageFormat.format(messaggio, args));
	}
}
