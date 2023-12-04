/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model.errore;

import it.csi.siac.siacbilser.business.utility.StringUtilities;
import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.errore.TipoErrore;

/**
 * Enum per gli errori del modulo FIN.
 */
public enum ErroreFin implements TipoErrore {
	
	DISPONIBILITA_INSUFFICIENTE_IMPEGNO("FIN_ERR_0001", "{0} impossibile la disponibilita'' dell''impegno (sub) e'' insufficiente"),
	SOGGETTO_ANNULLATO("FIN_ERR_0007", "Il soggetto ricercato non e'' valido"),
	ACCERTAMENTO_NON_IN_STATO_DEFINITIVO("FIN_ERR_0042", "Accertamento non in stato Definitivo {0}"),
	ACCERTAMENTO_CON_SUBACCERTAMENTI("FIN_ERR_0043", "Accertamento con subaccertamenti"),
	ACCERTAMENTO_NON_PERTINENTE_AL_CAPITOLO_UPB("FIN_ERR_0050", "Accertamento non pertinente al capitolo/UEB"),
	IMPEGNO_NON_PERTINENTE_AL_CAPITOLO_UPB("FIN_ERR_0050", "Impegno non pertinente al capitolo/UEB"),
	STATO_PROVVEDIMENTO_NON_CONSENTITO("FIN_ERR_0075", "Per l''operazione di {0} il provvedimento indicato deve essere in stato {1}"),
	IMPEGNO_CON_SUBIMPEGNI("FIN_ERR_0076", "Non e'' possibile liquidare un impegno se ha dei subimpegni: selezionare un subimpegno"),
	IMPEGNO_NON_IN_STATO_DEFINITIVO_NON_LIQUIDABILE("FIN_ERR_0077", "L''impegno non e'' liquidabile: {0}"),
	IMPORTO_QUOTE_E_IMPORTO_DOCUMENTO_INCONGRUENTI("FIN_ERR_0086", "Operazione non possibile: il totale delle quote e l''importo del documento sono incongruenti"),
	DISPONIBILITA_INSUFFICIENTE("FIN_ERR_0088", "{0} impossibile, la disponibilita'' dell''accertamento-prenotazione e'' insufficiente"),
	QUOTA_DOCUMENTO_CHE_NON_SI_PUO_ELIMINARE("FIN_ERR_0089", "Quota documento che non si puo'' elimimare. {0}"),
	DOCUMENTO_CHE_NON_SI_PUO_ANNULLARE("FIN_ERR_0091","Annullamento documento non possibile: stato incongruente o presenza di documenti collegati non annullati."),
	ANNO_DOCUMENTO_ERRATO("FIN_ERR_0092", "L''anno del documento non puo'' essere superiore all''anno di Bilancio"),
	DATA_SCADENZA_ANTECEDENTE_ALLA_DATA_DEL_DOCUMENTO("FIN_ERR_0093", "Data scadenza antecedente alla data del documento"),
	SOGGETTO_BLOCCATO("FIN_ERR_0094", "Il soggetto e'' BLOCCATO, non e'' possibile effettuare pagamenti"),
	IMPEGNO_NON_IN_STATO_DEFINITIVO("FIN_ERR_0096", "L''impegno non e'' in stato Definitivo {0}"),
	SUBACCERTAMENTO_NON_IN_STATO_DEFINITIVO("FIN_ERR_0097", "SubAccertamento non in stato Definitivo {0}"),
	SUBIMPEGNO_NON_IN_STATO_DEFINITIVO("FIN_ERR_0098", "Il subimpegno non e'' in stato Definitivo"),
	TIPO_PROVVEDIMENTO_INCONGRUENTE("FIN_ERR_0099","Tipo provvedimento incongruente e quindi non selezionabile."),
	SOGGETTO_NON_VALIDO("FIN_ERR_0104", "Il soggetto selezionato {0} non e'' VALIDO"),
	PRESENZA_CLASSIFICAZIONE_SOGGETTO("FIN_ERR_0115", "Il creditore e'' stato scelto non appartenente alla classificazione dell''{0}. Vuoi proseguire ugualmente?"),
	CANCELLAZIONE_GRUPPO_ATTIVITA_IVA_IMPOSSIBILE("FIN_INF_0122", "Cancellazione gruppo attivita'' iva impossibile: esistono entita'' collegate"),
	SOGGETTO_DIVERSO_DA_QUELLO_DEL_DOCUMENTO("FIN_ERR_0134", "Operazione non possibile: il creditore del movimento {0} e'' diverso da quello del documento"),
	CIG_CUP_DIFFERENTI_DA_QUELLI_DEL_MOVIMENTO_SELEZIONATO("FIN_ERR_0137", "CIG/CUP differenti da quelli del movimento selezionato. Si desidera proseguire?"),
	DATA_E_CAUSALE_SOSPENSIONE_DEVONO_ESSERE_ENTRAMBI_VALORIZZATI("FIN_ERR_0139", "Data e causale della sospensione devono essere entrambi valorizzati"),
	DATA_RIATTIVAZIONE_SOSPENSIONE_NON_CORRETTA("FIN_ERR_0140", "La data di riattivazione deve essere successiva a quella di sospensione"),
	DOCUMENTO_NON_AGGIORNABILE_PERCHE_STATO_INCONGRUENTE("FIN_ERR_0141", "Operazione non possibile. Documento con stato incongruente."),
	QUOTA_NON_AGGIORNABILE_PERCHE_CON_ORDINATIVO("FIN_ERR_0142", "Operazione non possibile. Quota con ordinativo."),
	CONVALIDA_NON_POSSIBILE("FIN_ERR_0143", "Convalida non possibile: {0}."),
	ELENCO_CON_STATO_INCONGRUENTE_O_ASSENTE("FIN_ERR_0146", "Operazione non possibile: presenza di un elenco in stato incongruente o non presente"),
	DATI_PROVVISORIO_QUIETANZA_ERRATI("FIN_ERR_0147","Dati di provvisorio/quietanza non corretti."),
	ENTITA_NON_VALIDA("FIN_INF_0159","{0} non corretto."),
	TOTALE_NOTA_CREDITO_ERRATO("FIN_ERR_0169", "Totale Nota incongruente: verificare il totale delle quote da liquidare/incassare"),
	INSERIMENTO_LIQUIDAZIONE_NON_POSSIBILE_MANCA_IL_NUMERO_REGISTRAZIONE_IVA("FIN_ERR_0172","Capitolo rilevante ai fini IVA: per liquidare e'' obbligatorio il numero di registrazione IVA."),
	MOVIMENTO_GESTIONE_STATO_OPERATIVO_NON_AMMESSO_PER_OPERAZIONE("FIN_ERR_0176", "{0} non e'' in stato operativo {1}. {2}"),
	MOVIMENTO_GESTIONE_PLURIENNALE_NON_AMMESSO_PER_OPERAZIONE("FIN_ERR_0177", "{0} non ammesso per {1} {2}"),
	CANCELAZIONE_REGISTRO_IVA_IMPOSSIBILE("FIN_ERR_0186", "Cancellazione registro  iva impossibile: esistono entita'' collegate"),
	NON_CI_SONO_MOVIMENTI_IVA_ASSOCIATI("FIN_ERR_0189", "Non ci sono movimenti iva associati"),
	TOTALE_MOVIMENTI_IVA_NON_MAGGIORE_IMPORTO_QUOTA("FIN_ERR_0190", "Il totale dei movimenti iva {0} non puo'' essere maggiore dell''importo della quota {1}"),
	IL_TOTALE_DEI_MOVIMENTI_IVA_NON_E_UGUALE_ALL_IMPORTO_DELLA_QUOTA("FIN_INF_0191", "Il totale dei movimenti iva non e'' uguale all''importo della quota"),
	DATA_REGIST_ANTECEDENTE_DATA_EMISSIONE_DOC("FIN_ERR_0192","Data di registrazione antecedente alla data emissione del documento"),
	PROVVISORIO_NON_REGOLARIZZABILE("FIN_ERR_0195", "{0} di un {1} con indicazione del provvisorio di cassa {2}. Impossibile procedere con la sua regolarizzazione. {3}"),
	DATI_INCONSISTENTI_IMPOSSIBILE_AGGIORNARE_LA_TABELLA_DEI_MOVIMENTI_IVA("FIN_ERR_0196", "Dati inconsistenti: impossibile aggiornare la tabella dei movimenti iva"),
	OPERAZIONE_NON_COMPATIBILE("FIN_ERR_0197", "{0} non possibile: {1}"),
	STRUTTURA_CONTABILE_NON_COMPATIBILE("FIN_ERR_0198", "{0} e'' associato ad altra struttura contabile"),
	IL_TOTALE_DEI_MOVIMENTI_IVA_NON_E_UGUALE_ALL_IMPORTO_RILEVANTE_IVA("FIN_INF_207", "Il totale dei movimenti iva non e'' uguale all''importo rilevante iva"),
	TOTALE_MOVIMENTI_IVA_NON_MAGGIORE_TOTALE_IMPORTO_RILEVANTE_IVA("FIN_ERR_0208", "Il totale dei movimenti iva {0} non puo'' essere maggiore dell''importo rilevante iva {1}"),
	DATA_DI_REGISTRAZIONE_ANTECEDENTE_ALLA_DATA_DI_REGISTRAZIONE_DELL_ULTIMO_DOCUMENTO_REGISTRATO_NEL_SISTEMA_IN_QUELLO_STESSO_REGISTRO("FIN_ERR_0209", "Data di registrazione antecedente  alla data di registrazione dell''ultimo documento registrato nel sistema in quello stesso registro"),
	LA_DATA_DI_REGISTRAZIONE_DEVE_SEMPRE_ESSERE_SUCCESSIVA_ALL_ULTIM0_PERIODO_STAMPATO_IN_DEFINITIVO_PER_QUELLO_STESSO_REGISTRO("FIN_ERR_010","La data di registrazione  deve sempre essere successiva all'' ultimo periodo stampato in definitivo per quello stesso registro"),
	SUBDOCUMENTO_IVA_NON_AGGIORNABILE("FIN_ERR_0213", "Documento Iva non aggiornabile"),
	ATTO_GIA_ABBINATO("FIN_ERR_0214", "Provvedimento gia'' associato ad altri elenchi di documenti, operazione non possibile. {0}"),
	ELENCO_NON_SELEZIONABILE("FIN_ERR_0215", "Operazione non possibile. {0}"),
	DATA_NON_VALIDA("FIN_ERR_0216", "La data {0} non e'' valida, deve rientrare nell''anno di bilancio corrente"),
	SOGGETTO_NON_VALIDO_PER_INCONGRUENZA("FIN_ERR_0218", "Il soggetto associato a {0} e'' incongruente con quello associato a {1}"),
	STATO_OPERATIVO_PREDOCUMENTO_NON_VALIDO("FIN_ERR_0219", "Lo stato operativo {0} non e'' valido. {1}"),
	SOGGETTO_DIVERSO_DA_QUELLO_DEL_MOVIMENTO("FIN_ERR_0221", "Operazione non possibile: il creditore del movimento {0} e'' diverso da quello selezionato"),
	CAPITOLO_NON_VALIDO_PER_OPERAZIONE("FIN_ERR_0223", "Lo stato operativo {0} del capitolo di {1} non e'' valido per l''operazione di {2} del {3}"),
	STATO_ATTO_DA_ALLEGATO_INCONGRUENTE("FIN_ERR_0226", "Operazione non possibile: stato dell''atto incongruente"),
	DISPONIBILITA_INSUFFICIENTE_MOVIMENTO("FIN_ERR_0230","{0}: disponibilita'' {1} e'' insufficiente. {2}"),
	IMPEGNO_CON_SUBIMPEGNI_VALIDI("FIN_ERR_0231", "Non e'' possibile collegare un impegno con subimpegni validi: selezionare un subimpegno"),
	IL_TOTALE_DEI_MOVIMENTI_IVA_NON_E_UGUALE_ALL_IMPORTO_DA_DEDURRE_SU_QUOTE_RILEVANTI_IVA("FIN_INF_0233", "Il totale dei movimenti iva non e'' uguale all''importo da dedurre su quote rilevanti iva"),
	IL_TOTALE_DEI_MOVIMENTI_IVA_NON_PUO_ESSERE_MAGGIORE_DELL_IMPORTO_DA_DEDURRE_SU_QUOTE_RILEVANTI_IVA("FIN_ERR_0234", "Il totale dei movimenti iva non puo'' essere maggiore dell''importo da dedurre su quote rilevanti iva"),
	IL_TOTALE_DEI_MOVIMENTI_IVA_NON_PUO_ESSERE_MAGGIORE_DELL_IMPORTO_DA_DEDURRE_SULLA_QUOTA("FIN_ERR_0235", "Il totale dei movimenti iva non puo'' essere maggiore dell''importo da dedurre sulla quota"),
	IL_TOTALE_DEI_MOVIMENTI_IVA_NON_E_UGUALE_ALL_IMPORTO_DA_DEDURRE_SULLA_QUOTA("FIN_INF_0236", "Il totale dei movimenti iva non e'' uguale all''importo da dedurre sulla quota"),
	CONFERMA_RIFIUTO_ELENCO("FIN_CON_0237", "L''operazione di rifiuto verra'' effettuata sugli elenchi selezionati agendo su TUTTE le quote documento collegate, proseguire con l''operazione?"),
	CONFERMA_RIFIUTO_ALLEGATO("FIN_CON_0238", "L''operazione di rifiuto verra'' effettuata sull''intero Atto (elenchi e documenti) rendendolo inutilizzabile, proseguire con l''operazione?"),
	IMPOSSIBILE_ELABORARE_LA_STAMPA_DEL_REGISTRO_IVA("FIN_ERR_0241", "Impossibile elaborare la stampa del Registro Iva"),
	CONFERMA_STAMPA_REGISTRO_IVA("FIN_INF_0242", "Si sta per elaborare la stampa del registro iva {0} per il periodo selezionato, vuoi proseguire?"),
	NON_E_POSSIBILE_STAMPARE_UN_REGISTRO_GIA_STAMPATO_IN_DEFINITIVO_PER_IL_PERIODO_SELEZIONATO("FIN_ERR_0243", "Non e'' possibile stampare il registro {0}, gia'' stampato in definitivo per il periodo selezionato"),
	NON_E_POSSIBILE_STAMPARE_IL_REGISTRO_IN_DEFINITIVO_PER_IL_PERIODO_SELEZIONATO("FIN_ERR_0244", "Non e'' possibile stampare il registro {0} in definitivo per il periodo selezionato (il periodo antecedente non e'' stampato in definitivo)"),
	QUOTA_NON_AGGIORNABILE_PERCHE_IN_ELABORAZIONE_ASINCRONA("FIN_ERR_0246", "Operazione non possibile. Quota in elaborazione asincrona."),
	OGGETTO_NON_UNIVOCO("FIN_ERR_0247", "{0} non identificato univocamente: specificare la chiave dell''oggetto"),
	CONFERMA_STAMPA_LIQUIDAZIONE_IVA("FIN_INF_0250", "Si sta per elaborare la stampa della Liquidazione Iva del Gruppo Attivita'' Iva {0} per il periodo selezionato, vuoi proseguire?"),
	IMPOSSIBILE_ELABORARE_LA_STAMPA_DELLA_LIQUIDAZIONE_IVA("FIN_ERR_0251", "Impossibile elaborare la stampa della Liquidazione Iva"),
	NON_E_POSSIBILE_ELABORARE_LA_STAMPA_IN_BOZZA_DELLA_LIQUIDAZIONE_IVA_PER_IL_PERIODO_SELEZIONATO("FIN_ERR_0252", "Non e'' possibile elaborare la stampa in bozza della Liquidazione Iva per il periodo selezionato"),
	NON_E_POSSIBILE_ELABORARE_LA_STAMPA_DEFINITIVA_DELLA_LIQUIDAZIONE_IVA_PER_IL_PERIODO_SELEZIONATO_PROCEDERE_STAMPA_LIQUIDAZIONI("FIN_ERR_0253", "Non e'' possibile elaborare la stampa definitiva della Liquidazione Iva per il periodo selezionato: prima procedere alla stampa definitiva delle Liquidazioni Iva dei periodi precedenti"),
	NON_E_POSSIBILE_ELABORARE_LA_STAMPA_DEFINITIVA_DELLA_LIQUIDAZIONE_IVA_PER_IL_PERIODO_SELEZIONATO_PROCEDERE_STAMPA_REGISTRI("FIN_ERR_0254", "Non e'' possibile elaborare la stampa definitiva della Liquidazione Iva per il periodo selezionato: prima procedere alla stampa definitiva di tutti i Registri Iva del periodo"),
	CONFERMA_STAMPA_RIEPILOGO_ANNUALE_IVA("FIN_INF_0255", "Si sta per elaborare la stampa del Riepilogo Annuale Iva del Gruppo Attivita'' Iva {0}, vuoi proseguire?"),
	INSERIMENTO_CONTESTUALE_ORDINATIVO_IMPOSSIBILE("FIN_ERR_0258", "Impossibile inserire ordinativi pagamento e incasso contestuali per {0} {1}: elemento scartato {2}"),
	INSERIMENTO_CAUSALE_NON_POSSIBILE("FIN_ERR_0259", "Operazione non possibile: causale gia'' presente nel sistema."),
	LA_DATA_DEVE_ESSERE_COERENTE_CON_L_ANNO_DEL_DOCUMENTO("FIN_ERR_0262", "La data deve essere coerente con l''anno del documento"),
	DOCUMENTO_NON_MODIFICABILE("FIN_ERR_0268", "Documento {0} - {1}"),
	DOCUMENTO_IVA_SPESA_INTRASTAT("FIN_INF_0270", "L''importo rilevante iva non sara'' minore o uguale all''importo totale dei movimenti iva inseriti applicando l''iva corretta all''imponibile della fattura estera perche'' e'' una fattura intracomunitaria"),
	DOCUMENTI_SUBORDINATI_NON_PRESENTI("FIN_WARN_0280", "In elenco manca documento di riferimento per {0}"),
	STAMPA_PRESA_IN_CARICO("FIN_INF_0281", "La richiesta di stampa e'' stata presa in carico. Il risultato sara'' disponibile da Cruscotto"),
	SOGGETTO_MOVIMENTO_GESTIONE_NON_VALIDO_PER_INCONGRUENZA("FIN_ERR_0282", "Il {0} cui riferisce {1} e'' incongruente rispetto a quello indicato {2} - {3}"),
	DIVISA_FEL_NON_EURO("FIN_INF_0283", "Divisa FEL non euro"),
	DATI_INCOSTISTENTI_DA_DOCUMENTO_FEL("FIN_INF_0284", "Impossibile completare la tabella {0} da documento FEL"),
	CONFERMA_INVIO_PER_FIRMA("FIN_CON_0286", "Si sta per inviare l''ATTO {0} per la firma, vuoi proseguire?"),
	TOTALI_SPLIT_REVERSE_ESENTE_INCONGRUENTI("FIN_INF_0287", "Totali Iva split-reverse-esente non congruenti"),
	CONDIZIONI_GEN_PCC_NON_SODDISFATTE("FIN_INF_0288", "Condizioni per la contabilizzazione non soddisfatte, operazione non possibile."),
	IMPORTO_QUOTA__SPLIT_REVERSE_INCONGRUENTE("FIN_INF_0289", "Importo split-reverse quota non corretto"),
	TOTALE_QUOTE_E_IMPORTI_DOCUMENTO_NON_COERENTI("FIN_ERR_0295", "Il totale delle quote e gli importi del documento non sono coerenti: {0}"),
	PIU_RISULTATI_TROVATI("FIN_ERR_0301", "La ricerca ha restituito piu'' di un provvedimento"),
	DISPONIBILITA_INSUFFICIENTE_PER_QUOTE("FIN_ERR_0304", "Lo stanziamento di cassa del capitolo {0} non e'' sufficiente per emettere gli ordinativi: cassa attuale {1}, disponibile di cassa {2}, quote da imputare {3}"),
	QUOTA_A_COPERTURA_CON_SPLIT("FIN_ERR_0304", "La quota a copertura non deve avere SPLIT"),
	TOTALE_SPLIT_REVERSE_NON_CONGRUENTI("FIN_ERR_0305", "Contabilizzazione impossibile: Totali Iva split-reverse-esente non congruenti {0}"),
	IMPEGNO_QUOTA_NC_NON_CONGRUENTE("FIN_ERR_0311", "Non e'' possibile liquidare la fattura se l''impegno selezionato e'' di tipo NON COMMERCIALE"),
	FEL_ORDINE_NON_VALORIZZATO("FIN_ERR_0312", "ATTENZIONE: {0,choice,1#e'' stato scartato 1 ordine di acquisto non correttamente valorizzato|1<sono stati scartati {0} ordini di acquisto non correttamente valorizzati}"),
	INVIO_FEL("FIN_ERR_0313", "Invio verso FEL in errore: {0} - {1}"),
	DISPONIBILITA_MOVIMENTO_INSUFFICIENTE_MA_ADEGUABILE("FIN_ERR_0313", "{0}: disponibilita'' {1} e'' insufficiente. E'' possibile adeguare l''importo.{2}"), 
	//XXX("FIN_XXX_0313","l'importo della liquidazione deve essere minore o uguale all'importo riscosso" ),
	WARNING_IMPORTO_VINCOLATO ("FIN_WAR_001","L''importo totale della liquidazione supera l''importo riscosso"),
	
	//SIAC 6677
	DATA_OPERAZIONE_SUCCESSIVA_ALLA_DATA_ODIERNA("FIN_ERR_0917", "La data operazione non puo'' essere successiva alla data di sistema"),
	COD_AVVISO_PAGO_PA_MAXLENGTH("FIN_ERR_0918", "Codice Avviso PagoPA supera le 18 cifre consentite"),
	COD_AVVISO_PAGO_PA_NUMERICO("FIN_ERR_0919", "Codice Avviso PagoPA puo'' contenere solo valori numerici"),
	
	//SIAC-6840
	COD_AVVISO_PAGO_PA_ASSENTE("FIN_ERR_0920", "Codice Avviso Pago PA non presente.{0}"),
	MOD_PAGO_PA_NON_AMMESSA("FIN_ERR_0921", "Metodo di pagamento AVVISO PAGOPA non ammesso.{0}"),
	
	// SIAC-7764
	CODICE_IBAN_ERRATO("FIN_ERR_0022", "Codice IBAN ''{0}'' errato ({1})"),
	
	;
	
	private String codice;
	private String descrizione;
	
	private ErroreFin(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}

	@Override
	public Errore getErrore(Object... args) {
		final String msg = StringUtilities.formatStringWithDefaultReplacements(this.descrizione, "", args);
		return new Errore(this.codice, msg);
	}

}