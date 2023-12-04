/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.messaggio;

import it.csi.siac.siacbilser.business.utility.StringUtilities;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.messaggio.TipoMessaggio;

public enum MessaggioFin implements TipoMessaggio {

	MESSAGGIO_GENERICO("FIN-WAR-0316", "{0}"),
	SOSTITUITO_CONTO_PER_MANCATA_CAPIENZA("FIN-WAR-0314", "Il conto tesoreria vincolato {0} che e'' stato selezionato ha una disponibilita'' di {1},  insufficiente per inserire un ordinativo di {2}. L''ordinativo e'' stato pertanto inserito sul conto tesoreria {3}."),
	//SIAC-8784 
	//SIAC-8856
	SOSTITUITO_CONTO_PER_MANCATA_CAPIENZA_CON_RIPIANAMENTO_MANUALE("FIN-WAR-0315", "Il conto di tesoreria vincolato {0} che e'' stato selezionato ha un valore di ripiano di {1}, l''ordinativo da inserire ha un importo di {2}, prima di incassare direttamente sul conto scelto e'' necessario procedere al ripiano. L''ordinativo pertanto e'' stato inserito sul conto di tesoreria {3} con un importo pari a {4}. Sara'' necessario procedere manualmente all''inserimento di un ordinativo con importo pari a {5} sul conto vincolato {6}")
	;
	
	
	private final String codice;
	private final String messaggio;

	MessaggioFin(String codice, String messaggio) {
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
	public Messaggio getMessaggio(Object... args) {
		final String msg =  StringUtilities.formatStringWithDefaultReplacements(this.messaggio, "", args);
		return new Messaggio(this.codice, msg);
	}
}
