/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ConciliazionePerTitolo;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Valentina
 * @version 1.0.0 - 28/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaConciliazionePerTitolo extends ServiceRequest {
	
	private ConciliazionePerTitolo conciliazionePerTitolo;
	private ClassificatoreGerarchico titolo;
	private ClassificatoreGerarchico tipologia;
	
	private ParametriPaginazione parametriPaginazione;

	/**
	 * @return the conciliazionePerTitolo
	 */
	public ConciliazionePerTitolo getConciliazionePerTitolo() {
		return conciliazionePerTitolo;
	}

	/**
	 * @param conciliazionePerTitolo the conciliazionePerTitolo to set
	 */
	public void setConciliazionePerTitolo(ConciliazionePerTitolo conciliazionePerTitolo) {
		this.conciliazionePerTitolo = conciliazionePerTitolo;
	}

	/**
	 * @return the titolo
	 */
	public ClassificatoreGerarchico getTitolo() {
		return titolo;
	}

	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(ClassificatoreGerarchico titolo) {
		this.titolo = titolo;
	}

	/**
	 * @return the tipologia
	 */
	public ClassificatoreGerarchico getTipologia() {
		return tipologia;
	}

	/**
	 * @param tipologia the tipologia to set
	 */
	public void setTipologia(ClassificatoreGerarchico tipologia) {
		this.tipologia = tipologia;
	}

	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}
	
	
	
}
