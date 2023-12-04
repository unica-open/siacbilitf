/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pagopa.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;


/*
 * SIAC-8046 CM Task 2.2 31/03/2021
 * Utile per controllo su esistenza e validità dell'accertamento 
 * in modale di "modifica accertamento" per ricerca/consulta pagoPA
 * 
 * */
@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class RicercaAccertamentoResponse extends ServiceResponse { //, RicercaPaginataResponse
	private boolean isAccertamentoExist;

	/**
	 * @return the isAccertamentoExist
	 */
	public boolean isAccertamentoExist() {
		return isAccertamentoExist;
	}

	/**
	 * @param isAccertamentoExist the isAccertamentoExist to set
	 */
	public void setAccertamentoExist(boolean isAccertamentoExist) {
		this.isAccertamentoExist = isAccertamentoExist;
	}

}
