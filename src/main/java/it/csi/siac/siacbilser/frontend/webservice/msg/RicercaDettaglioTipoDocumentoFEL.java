/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoDocFEL;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Request al servizio di ricerca tipo documento
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioTipoDocumentoFEL extends ServiceRequest {

	private TipoDocFEL tipoDocFEL;

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


}
