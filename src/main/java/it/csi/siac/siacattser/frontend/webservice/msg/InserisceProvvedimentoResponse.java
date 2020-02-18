/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Response del servizio di inserimento provvedimento
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class InserisceProvvedimentoResponse extends ServiceResponse {
	
	private AttoAmministrativo attoAmministrativoInserito;

	/**
	 * @return the attoAmministrativoInserito
	 */
	public AttoAmministrativo getAttoAmministrativoInserito() {
		return attoAmministrativoInserito;
	}

	/**
	 * @param attoAmministrativoInserito the attoAmministrativoInserito to set
	 */
	public void setAttoAmministrativoInserito(AttoAmministrativo attoAmministrativoInserito) {
		this.attoAmministrativoInserito = attoAmministrativoInserito;
	}
	
}
