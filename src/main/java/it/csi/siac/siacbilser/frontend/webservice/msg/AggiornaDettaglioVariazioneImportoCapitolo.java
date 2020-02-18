/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.DettaglioVariazioneImportoCapitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaDettaglioVariazioneImportoCapitolo extends ServiceRequest {
	
	private DettaglioVariazioneImportoCapitolo dettaglioVariazioneImportoCapitolo;

	private boolean skipLoadCapitolo = false;
	private boolean skipLoadVariazione = false;
	//SIAC-7267
	private boolean capitoloFondino = false;
	
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

	/**
	 * @return the skipLoadCapitolo
	 */
	@XmlTransient
	public boolean isSkipLoadCapitolo() {
		return this.skipLoadCapitolo;
	}

	/**
	 * @param skipLoadCapitolo the skipLoadCapitolo to set
	 */
	public void setSkipLoadCapitolo(boolean skipLoadCapitolo) {
		this.skipLoadCapitolo = skipLoadCapitolo;
	}

	/**
	 * @return the skipLoadVariazione
	 */
	@XmlTransient
	public boolean isSkipLoadVariazione() {
		return this.skipLoadVariazione;
	}

	/**
	 * @param skipLoadVariazione the skipLoadVariazione to set
	 */
	public void setSkipLoadVariazione(boolean skipLoadVariazione) {
		this.skipLoadVariazione = skipLoadVariazione;
	}

	/**
	 * @return the capitoloFondino
	 */
	public boolean isCapitoloFondino() {
		return capitoloFondino;
	}

	/**
	 * @param capitoloFondino the capitoloFondino to set
	 */
	@XmlTransient
	public void setCapitoloFondino(boolean capitoloFondino) {
		this.capitoloFondino = capitoloFondino;
	}
	
}
