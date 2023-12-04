/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoVariazione;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Response per il servizio di RicercaTipoVariazione.
 * 
 * @author Marchino Alessandro
 * @version 1.0.0 - 10/01/2014
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaTipoVariazioneResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "elencoTipiVariazione")	    
	@XmlElement(name = "tipoVariazione")
	private List<TipoVariazione> elencoTipiVariazione = new ArrayList<TipoVariazione>();

	/**
	 * @return the elencoTipiVariazione
	 */
	@XmlTransient
	public List<TipoVariazione> getElencoTipiVariazione() {
		return elencoTipiVariazione;
	}

	/**
	 * @param elencoTipiVariazione the elencoTipiVariazione to set
	 */
	public void setElencoTipiVariazione(List<TipoVariazione> elencoTipiVariazione) {
		this.elencoTipiVariazione = elencoTipiVariazione;
	}
	
}
