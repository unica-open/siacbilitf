/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.mutuo.Mutuo;

/**
 *  
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceMutuo extends ServiceRequest {
	
	private Ente ente;
	private Mutuo mutuo;

	public Ente getEnte() {
		return ente;
	}
	
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	
	public Mutuo getMutuo() {
		return mutuo;
	}
	
	public void setMutuo(Mutuo mutuo) {
		this.mutuo = mutuo;
	}
}