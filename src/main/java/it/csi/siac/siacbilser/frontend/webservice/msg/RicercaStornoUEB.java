/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.StornoUEB;
import it.csi.siac.siacbilser.model.TipoCapitolo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;


/** @deprecated da eliminare con le UEB */
@Deprecated
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaStornoUEB extends ServiceRequest {
	
	private Ente ente;
	private Bilancio bilancio;
	
	private StornoUEB stornoUEB;
	private TipoCapitolo tipoCapitolo;
	
	private ParametriPaginazione parametriPaginazione;
	
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
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
	
	/**
	 * @return the stornoUEB
	 */
	public StornoUEB getStornoUEB() {
		return stornoUEB;
	}
	
	/**
	 * @param stornoUEB the stornoUEB to set
	 */
	public void setStornoUEB(StornoUEB stornoUEB) {
		this.stornoUEB = stornoUEB;
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

	public TipoCapitolo getTipoCapitolo() {
		return tipoCapitolo;
	}

	public void setTipoCapitolo(TipoCapitolo tipoCapitolo) {
		this.tipoCapitolo = tipoCapitolo;
	}

	

}
