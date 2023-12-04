/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSingoloDettaglioVariazioneImportoCapitoloNellaVariazione extends ServiceRequest {
	
	private int uidVariazione;
	private Capitolo<?,?> capitolo;
	private Bilancio bilancio;

	/**
	 * Gets the uid variazione.
	 *
	 * @return the uid variazione
	 */
	public int getUidVariazione() {
		return uidVariazione;
	}

	/**
	 * Sets the uid variazione.
	 *
	 * @param uidVariazione the new uid variazione
	 */
	public void setUidVariazione(int uidVariazione) {
		this.uidVariazione = uidVariazione;
	}

	/**
	 * @return the capitolo
	 */
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}

	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	
	

}
