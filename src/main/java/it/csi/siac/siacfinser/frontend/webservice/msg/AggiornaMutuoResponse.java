/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.mutuo.Mutuo;


/**
 * Risposta al metodo FIN.MutuoService.aggiornaMutuo()
 * 
 * @author paolos
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaMutuoResponse extends ServiceResponse {
	
	Mutuo mutuo;

	public Mutuo getMutuo() {
		return mutuo;
	}

	public void setMutuo(Mutuo mutuo) {
		this.mutuo = mutuo;
	}
}
