/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.VariazioneImportoCapitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Classe di request per l'inserimento dell'anagrafica della variazione di bilancio
 * @author Pro Logic
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceDettaglioResiduoVariazioneBilancio extends ServiceRequest {
	
	private VariazioneImportoCapitolo variazioneImportoCapitolo;

	/**
	 * Gets the variazione importo capitolo.
	 *
	 * @return the variazione importo capitolo
	 */
	public VariazioneImportoCapitolo getVariazioneImportoCapitolo() {
		return variazioneImportoCapitolo;
	}

	/**
	 * Sets the variazione importo capitolo.
	 *
	 * @param variazioneImportoCapitolo the new variazione importo capitolo
	 */
	public void setVariazioneImportoCapitolo(VariazioneImportoCapitolo variazioneImportoCapitolo) {
		this.variazioneImportoCapitolo = variazioneImportoCapitolo;
	}
	
	
	
	

}
