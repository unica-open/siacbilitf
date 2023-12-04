/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.DettaglioVariazioneImportoCapitolo;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaDettaglioVariazioneImportoCapitoloResponse extends ServiceResponse {


	private DettaglioVariazioneImportoCapitolo dettaglioVariazioneImportoCapitolo;

	/**
	 * @return the dettaglioVariazioneImportoCapitolo
	 */
	public DettaglioVariazioneImportoCapitolo getDettaglioVariazioneImportoCapitolo() {
		return dettaglioVariazioneImportoCapitolo;
	}

	/**
	 * @param dettaglioVariazioneImportoCapitolo the dettaglioVariazioneImportoCapitolo to set
	 */
	public void setDettaglioVariazioneImportoCapitolo(DettaglioVariazioneImportoCapitolo dettaglioVariazioneImportoCapitolo) {
		this.dettaglioVariazioneImportoCapitolo = dettaglioVariazioneImportoCapitolo;
	}
	
}
