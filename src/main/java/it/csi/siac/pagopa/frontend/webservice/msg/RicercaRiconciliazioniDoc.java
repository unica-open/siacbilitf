/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pagopa.frontend.webservice.msg;



import javax.xml.bind.annotation.XmlType;

import it.csi.siac.pagopa.model.Riconciliazione;
import it.csi.siac.pagopa.model.RiconciliazioneDoc;
import it.csi.siac.pcc.frontend.webservice.PCCSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

@XmlType(namespace = PCCSvcDictionary.NAMESPACE)
public class RicercaRiconciliazioniDoc extends ServiceRequest {
 
	
	private ParametriPaginazione parametriPaginazione;
	
	private Riconciliazione riconciliazione;
	
	private RiconciliazioneDoc riconciliazioneDoc;
	
	

	/**
	 * @return the riconciliazione
	 */
	public Riconciliazione getRiconciliazione()
	{
		return riconciliazione;
	}

	/**
	 * @param riconciliazione the riconciliazione to set
	 */
	public void setRiconciliazione(Riconciliazione riconciliazione)
	{
		this.riconciliazione = riconciliazione;
	}
	
	

	/**
	 * @return the riconciliazioneDoc
	 */
	public RiconciliazioneDoc getRiconciliazioneDoc()
	{
		return riconciliazioneDoc;
	}

	/**
	 * @param riconciliazioneDoc the riconciliazioneDoc to set
	 */
	public void setRiconciliazioneDoc(RiconciliazioneDoc riconciliazioneDoc)
	{
		this.riconciliazioneDoc = riconciliazioneDoc;
	}

	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione()
	{
		return parametriPaginazione;
	}

	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione)
	{
		this.parametriPaginazione = parametriPaginazione;
	}
	
	
	
	
}
