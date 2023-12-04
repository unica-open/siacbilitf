/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model.errore;

import it.csi.siac.siacbilser.business.utility.StringUtilities;
import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.errore.TipoErrore;

/**
 * Enum per gli errori del modulo GEN.
 */
public enum ErroreGEN implements TipoErrore {
	
	@Deprecated
	TOTALE_DARE_O_AVERE_ERRATI("GEN_ERR_0001", "Il totale DARE deve essere UGUALE al totale AVERE"),
	RIGHE_DI_DETTAGLIO_INSUFFICIENTI_PER_UN_MOVIMENTO_CONTABILE("GEN_ERR_0002", "Il movimento contabile deve avere almeno due righe di dettaglio"),
	MOVIMENTO_CONTABILE_NON_MODIFICABILE("GEN_ERR_0003", "Movimento non modificabile: {0}"),
	MOVIMENTO_CONTABILE_NON_ELIMINABILE("GEN_ERR_0004", "Movimento non eliminabile: {0}"),
	CAUSALE_CON_SCRITTURE_CONTABILI_ASSOCIATE("GEN_INF_0005", "Causale non annullabile: e'' gia'' stata associata a scritture contabili, verra'' comunque valorizzata la sua data fine validita''"),
	CONTI_INCONGRUENTI("GEN_ERR_0006", "Conto non selezionabile: {0}"),
	ASSENZA_CONTI_OBBLIGATORI_CAUSALI_DI_RACCORDO("GEN_ERR_0007", "E'' obbligatorio associare alla causale almeno due conti, uno con segno DARE ed uno con segno AVERE"),
	OPERAZIONE_NON_CONSENTITA("GEN_ERR_0009", "Operazione non consentita: {0}"),
	OPERAZIONE_NON_CONSENTITA_0011("GEN_ERR_0011", "Occorre selezionare un codice della categoria cespiti"),
	NESSUN_CONTO_COLLEGATO("GEN_WAR_0012", "Non è stato collegato nessun conto anche se il tipo è Cespite"),
	OPERAZIONE_NON_CONSENTITA_0014("GEN_ERR_0014", "La causale trovata e'' personalizzata per soggetto, ma non e'' coerente con il soggetto presente sul movimento finanziario."),
	OPERAZIONE_NON_CONSENTITA_0015("GEN_ERR_0015", "Non esistono causali associate al V livello del PdC collegato al movimento finanziario"),
	OPERAZIONE_NON_CONSENTITA_0016("GEN_ERR_0016", "Esiste nel sistema una causale che ha lo stesso PdC finanziario e gli stessi conti economico patrimoniali"),
	OPERAZIONE_NON_CONSENTITA_0015_GSA("GEN_ERR_0015", "Non esistono causali collegate al movimento finanziario"),

	;
	
	private String codice;
	private String messaggio;
	
	private ErroreGEN(String codice, String messaggio) {
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
		final String msg =  StringUtilities.formatStringWithDefaultReplacements(this.messaggio, "", args);
		return new Errore(this.codice, msg);
	}

}
