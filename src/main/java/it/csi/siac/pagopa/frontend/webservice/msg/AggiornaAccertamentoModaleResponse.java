/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pagopa.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacintegser.frontend.webservice.ricerche.RicercheSvcDictionary;

/*
 * SIAC-8046 CM Task 2.2 13/04/2021
 * Aggiorna accertamento in riconciliazione
 * 
 * */
@XmlType(namespace = RicercheSvcDictionary.NAMESPACE)
public class AggiornaAccertamentoModaleResponse extends ServiceResponse {

	Integer codice;
	String descrizione;
	/**
	 * @return the codice
	 */
	public Integer getCodice() {
		return codice;
	}
	/**
	 * @param codice the codice to set
	 */
	public void setCodice(Integer codice) {
		this.codice = codice;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}	
}
