/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoDocFEL;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
 

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaTipoDocumentoFEL extends ServiceRequest {
	
	private Ente ente;
	private TipoDocFEL tipoDocFEL;
	private ParametriPaginazione parametriPaginazione;

	/**
	 * @return the tipoDocFEL
	 */
	public TipoDocFEL getTipoDocFEL()
	{
		return tipoDocFEL;
	}

	/**
	 * @param tipoDocFEL the tipoDocFEL to set
	 */
	public void setTipoDocFEL(TipoDocFEL tipoDocFEL)
	{
		this.tipoDocFEL = tipoDocFEL;
	}

	/**
	 * @return the ente
	 */
	public Ente getEnte()
	{
		return ente;
	}

	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente)
	{
		this.ente = ente;
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
