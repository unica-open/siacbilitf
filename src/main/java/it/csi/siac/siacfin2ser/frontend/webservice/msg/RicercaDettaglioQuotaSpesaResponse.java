/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;

import javax.xml.bind.annotation.XmlType;


@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaDettaglioQuotaSpesaResponse extends ServiceResponse {
	
    SubdocumentoSpesa subdocumentoSpesa;

	public SubdocumentoSpesa getSubdocumentoSpesa() {
		return subdocumentoSpesa;
	}

	public void setSubdocumentoSpesa(SubdocumentoSpesa subdocumentoSpesa) {
		this.subdocumentoSpesa = subdocumentoSpesa;
	}

	

}
