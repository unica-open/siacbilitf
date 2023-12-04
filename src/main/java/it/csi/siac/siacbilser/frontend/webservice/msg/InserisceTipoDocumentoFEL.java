/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoDocFEL;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceTipoDocumentoFEL extends ServiceRequest {
	
	
	private TipoDocFEL tipoDocumentoFEL;

	/**
	 * @return the tipoDocumentoFEL
	 */
	public TipoDocFEL getTipoDocumentoFEL()
	{
		return tipoDocumentoFEL;
	}

	/**
	 * @param tipoDocumentoFEL the tipoDocumentoFEL to set
	 */
	public void setTipoDocumentoFEL(TipoDocFEL tipoDocumentoFEL)
	{
		this.tipoDocumentoFEL = tipoDocumentoFEL;
	}
	
	
}
