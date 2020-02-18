/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneEntrata;

/**
 * 
 * @author 1513
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisciModificaImportoMovimentoGestioneEntrataResponse extends ServiceResponse {
	
	private  ModificaMovimentoGestioneEntrata modificaMovimentoGestioneEntrata;

	/**
	 * @return the modificaMovimentoGestioneEntrata
	 */
	public ModificaMovimentoGestioneEntrata getModificaMovimentoGestioneEntrata() {
		return modificaMovimentoGestioneEntrata;
	}

	/**
	 * @param modificaMovimentoGestioneEntrata the modificaMovimentoGestioneEntrata to set
	 */
	public void setModificaMovimentoGestioneEntrata(
			ModificaMovimentoGestioneEntrata modificaMovimentoGestioneEntrata) {
		this.modificaMovimentoGestioneEntrata = modificaMovimentoGestioneEntrata;
	}
	
	

}
