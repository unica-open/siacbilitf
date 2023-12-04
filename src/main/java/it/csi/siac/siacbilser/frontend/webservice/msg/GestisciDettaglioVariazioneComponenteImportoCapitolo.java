/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.DettaglioVariazioneImportoCapitolo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * The Class GestisciDettaglioVariazioneComponenteImportoCapitolo
 * @author elisa
 * @version 1.0.0 - 03-10-2019.
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class GestisciDettaglioVariazioneComponenteImportoCapitolo extends ServiceRequest {
	
	private Bilancio bilancio;
	private DettaglioVariazioneImportoCapitolo dettaglioVariazioneImportoCapitolo;
	private Boolean dettaglioInInserimento;

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return this.bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

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

	public Boolean getDettaglioInInserimento() {
		return dettaglioInInserimento;
	}

	public void setDettaglioInInserimento(Boolean dettaglioInInserimento) {
		this.dettaglioInInserimento = dettaglioInInserimento;
	}
	
	

}
