/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Response del servizio di verifica annullabilit&agrave; del provvedimento
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class VerificaAnnullabilitaProvvedimentoResponse extends ServiceResponse {
	
	private Boolean annullabilitaAttoAmministrativo;

	/**
	 * @return the annullabilitaAttoAmministrativo
	 */
	public Boolean getAnnullabilitaAttoAmministrativo() {
		return annullabilitaAttoAmministrativo;
	}

	/**
	 * @param annullabilitaAttoAmministrativo the annullabilitaAttoAmministrativo to set
	 */
	public void setAnnullabilitaAttoAmministrativo(Boolean annullabilitaAttoAmministrativo) {
		this.annullabilitaAttoAmministrativo = annullabilitaAttoAmministrativo;
	}

}
