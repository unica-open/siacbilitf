/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

/**
 * Request del servizio di ricerca dettagli variazione importo capitolo
 * 
 * @author Domenico
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettagliVariazioneImportoCapitoloNellaVariazione extends ServiceRequest {
	
	private ParametriPaginazione parametriPaginazione;
	
	private int uidVariazione;
	
	//SIAC-6884
	private String tipoCapitolo;

	public String getTipoCapitolo() {
		return tipoCapitolo;
	}

	public void setTipoCapitolo(String tipoCapitolo) {
		this.tipoCapitolo = tipoCapitolo;
	}

	public int getUidVariazione() {
		return uidVariazione;
	}

	public void setUidVariazione(int uidVariazione) {
		this.uidVariazione = uidVariazione;
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
