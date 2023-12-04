/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoDocFEL;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaTipoDocumentoFELResponse extends ServiceResponse {

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
