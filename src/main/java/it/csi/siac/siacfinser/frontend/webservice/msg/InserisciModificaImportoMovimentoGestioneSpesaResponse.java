/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneSpesa;

/**
 * 
 * @author 1513
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisciModificaImportoMovimentoGestioneSpesaResponse extends
		ServiceResponse {

	private ModificaMovimentoGestioneSpesa modificaMovimentoGestioneSpesa;

	/**
	 * @return the modificaMovimentoGestioneSpesa
	 */
	public ModificaMovimentoGestioneSpesa getModificaMovimentoGestioneSpesa() {
		return modificaMovimentoGestioneSpesa;
	}

	/**
	 * @param modificaMovimentoGestioneSpesa
	 *            the modificaMovimentoGestioneSpesa to set
	 */
	public void setModificaMovimentoGestioneSpesa(
			ModificaMovimentoGestioneSpesa modificaMovimentoGestioneSpesa) {
		this.modificaMovimentoGestioneSpesa = modificaMovimentoGestioneSpesa;
	}

}
