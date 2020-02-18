/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;

/**
 * The Class CompletaAllegatoAttoMultiplo.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class ConvalidaAllegatoAttoPerElenchiMultiplo extends ConvalidaAllegatoAtto {

	private List<Integer> uidsAllegatiAtto;
	private RicercaAllegatoAtto ricercaAllegatoAtto;

	/**
	 * @return the allegatoAtto
	 */
	public List<Integer> getUidsAllegatiAtto() {
		return uidsAllegatiAtto;
	}

	/**
	 * Sets the allegati atto.
	 *
	 * @param uidsAllegatiAtto the new allegati atto
	 */
	public void setUidsAllegatiAtto(List<Integer> uidsAllegatiAtto) {
		this.uidsAllegatiAtto = uidsAllegatiAtto;
	}

	/**
	 * Gets the ricerca allegato atto.
	 *
	 * @return the req
	 */
	public RicercaAllegatoAtto getRicercaAllegatoAtto() {
		return ricercaAllegatoAtto;
	}

	/**
	 * Sets the ricerca allegato atto.
	 *
	 * @param ricercaAllegatoAtto the new ricerca allegato atto
	 */
	public void setRicercaAllegatoAtto(RicercaAllegatoAtto ricercaAllegatoAtto) {
		this.ricercaAllegatoAtto = ricercaAllegatoAtto;
	}

}
