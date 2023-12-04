/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoDocFEL;
import it.csi.siac.siaccorser.model.ServiceResponse;
 

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaTipoDocumentoFELPerTipoContabiliaResponse extends ServiceResponse {

	
	private List<TipoDocFEL> tipoDocumentiFEL;

	/**
	 * @return the tipoDocumentiFEL
	 */
	public List<TipoDocFEL> getTipoDocumentiFEL()
	{
		return tipoDocumentiFEL;
	}

	/**
	 * @param tipoDocumentiFEL the tipoDocumentiFEL to set
	 */
	public void setTipoDocumentiFEL(List<TipoDocFEL> tipoDocumentiFEL)
	{
		this.tipoDocumentiFEL = tipoDocumentiFEL;
	}
	
	

}
