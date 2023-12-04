/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfinser.model.codifiche.CommissioneDocumento;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaCodiceCommissioneDocumentoResponse extends ServiceResponse {
	
	List<CommissioneDocumento> elencoCodiciCommissioneDocumento = new ArrayList<CommissioneDocumento>();

	public List<CommissioneDocumento> getElencoCodiciCommissioneDocumento() {
		return elencoCodiciCommissioneDocumento;
	}

	public void setElencoCodiciCommissioneDocumento(List<CommissioneDocumento> elencoCodiciCommissioneDocumento) {
		this.elencoCodiciCommissioneDocumento = elencoCodiciCommissioneDocumento;
	}

	
}
