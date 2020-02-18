/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model.errore;

import it.csi.siac.siacbilser.business.utility.StringUtilities;
import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.errore.TipoErrore;

public enum ErroreCEC implements TipoErrore {
	
	CEC_ERR_0001("CEC_ERR_0001", "Non ci sono occorrenze di cassa economale per l''ente in gestione", "Nessuna cassa e'' stata configurata per l''ente selezionato"),
	CEC_ERR_0002("CEC_ERR_0002", "Giustificativo che non si puo'' annullare perche'' gia'' annullato", "Annullamento tipo giustificativo non possibile: gia'' annullato"),
	CEC_ERR_0003("CEC_ERR_0003", "Tipo operazione di cassa che non si puo'' annullare perche'' gia'' annullato", "Annullamento tipo operazione di cassa non possibile: gia'' annullato"),
	CEC_ERR_0004("CEC_ERR_0004", "Operazione di cassa che non si può annullare perche'' gia'' annullato.", "Annullamento operazione di cassa non possibile: gia'' annullato"),
	CEC_INF_0005("CEC_INF_0005", "Conferma aggornamento", "Il sistema procedera'' con l''aggiornamento della tipologia della cassa, vuoi proseguire?"),
	CEC_ERR_0006("CEC_ERR_0006", "Richiesta non aggiornabile perche'' stato incongruente", "Operazione non possibile. Richiesta con stato incongruente"),
	CEC_WAR_0007("CEC_WAR_0007", "Aggiornamento di una richiesta che potrebbe gia'' essere andata al processo di firma", "Il processo di firma della richiesta potrebbe gia'' essere in corso, si desidera continuare?"),
	CEC_ERR_0008("CEC_ERR_0008", "Richiesta non annullabile perche'' stato incongruente", "Operazione non possibile. Richiesta con stato incongruente"),
	CEC_ERR_0009("CEC_ERR_0009", "Elemento gia'' presente in archivio", "Impossibile procedere con l''inserimento  - elemento gia'' esistente in archivio"),
	CEC_ERR_0010("CEC_ERR_0010", "Cassa che non si puo'' annullare", "Annullamento non possibile: sono presenti importi significativi"),
	CEC_INF_0011("CEC_INF_0011", "Impegno non trovato con i criteri di ricerca indicati", "La ricerca degli impegni con i criteri indicati non ha dato risultati"),
	CEC_INF_0012("CEC_INF_0012", "Richiesta gia'' conclusa con il pagamento", "Richiesta conclusa con il pagamento. Si desidera comunque proseguire?"),
	CEC_WAR_0013("CEC_WAR_0013", "Compilazione di alcuni dati del rendiconto, ma poi scelta della restituzione totale dell''anticipo", "Sono gia'' stati compilati alcuni dati del rendiconto, se si procede con la restituzione totale non verranno salvati. Si desidera comunque proseguire?"),
	CEC_ERR_0014("CEC_ERR_0014", "Fattura gia'' lavorata dalla finanziaria", "Operazione non possbile. La fattura e'' gia'' in carico alla finanziaria"),
	CEC_INF_0015("CEC_INF_0015", "Aggiornamento di una richiesta che e'' gia'' stata rendicontata", "Richiesta gia'' rendicontata o evasa. Si desidera comunque proseguire?"),
	CEC_INF_0016("CEC_INF_0016", "Aggiornamento di una richiesta su cui c''e'' gia'' stato un pagamento", "Richiesta su cui c''e'' gia'' stato un pagamento. Si desidera comunque proseguire?"),
	CEC_INF_0017("CEC_INF_0017", "Conferma Stampa Giornale di cassa", "Si sta per elaborare la stampa del Giornale di cassa, vuoi proseguire?"),
	CEC_ERR_0018("CEC_ERR_0018", "Impossibile elaborare la stampa del Giornale di cassa", "Impossibile elaborare la stampa del Gionale di cassa"),
	CEC_ERR_0019("CEC_ERR_0019", "Stampa definitiva per la data indicata gia'' effettuata", "Impossibile elaborare la stampa del Gionale di cassa in quanto gia'' stampato in definitivo"),
	CEC_INF_0020("CEC_INF_0020", "Conferma Stampa Giornale di cassa", "Ultima stampa definitiva effettuata in data {0}. Si desidera proseguire?"),
	CEC_INF_0021("CEC_INF_0021", "Conferma Stampa Rendiconto", "Si sta per elaborare la stampa del Rendiconto, vuoi proseguire?"),
	CEC_ERR_0022("CEC_ERR_0022", "Stampa del rendiconto nelle data indicata gia'' stampata in definitivo", "Impossibile elaborare la stampa del Rendiconto in quanto gia'' stampato in definitivo"),
	CEC_ERR_0023("CEC_ERR_0023", "La data inizio periodo e'' compresa in un intervallo di rendiconti gia'' stampati", "Impossibile elaborare la stampa del Rendiconto in quanto la data di inizio periodo e'' compresa in un intervallo di rendiconti gia'' stampati"),
	CEC_ERR_0024("CEC_ERR_0024", "Impossibile elaborare la stampa del Rendiconto", "Impossibile elaborare la stampa del Rendiconto"),
	CEC_INF_0025("CEC_INF_0025", "Conferma Stampa Ricevuta", "Si sta per elaborare la stampa Ricevuta, vuoi proseguire?"),

	CEC_ERR_0026("CEC_ERR_0026", "Impossibile annullare il tipo operazione", "Tipo che non si puo'' annullare perche'' associato ad un''operazione di cassa"),
	CEC_ERR_0027("CEC_ERR_0027", "Impossibile annullare il tipo giustificativo", "Tipo che non si puo'' annullare perche'' associato ad una richiesta"),
	;
	
	private String codice;
	private String descrizione;
	private String messaggio;
	
	private ErroreCEC(String codice, String descrizione, String messaggio) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.messaggio = messaggio;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}

	public String getMessaggio() {
		return messaggio;
	}

	@Override
	public Errore getErrore(Object... args) {
		final String msg =  StringUtilities.formatStringWithDefaultReplacements(this.descrizione, "", args);
		return new Errore(this.codice, msg);
	}

}
