/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * 
 * @author Nazha Ahmad
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class ContaMovimentiAssociatiACapitoloResponse extends ServiceResponse {
		
	//numero movimenti in stato valido(non annullati)
	private Long numeroMovimenti;

	/**
	 * @return the numeroMovimenti
	 */
	public Long getNumeroMovimenti() {
		return numeroMovimenti;
	}

	/**
	 * @param numeroMovimenti the numeroMovimenti to set
	 */
	public void setNumeroMovimenti(Long numeroMovimenti) {
		this.numeroMovimenti = numeroMovimenti;
	}

}
