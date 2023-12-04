/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.mutuo.Mutuo;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class RicercaMovimentiGestioneAssociatiMutuo extends ServiceRequest {
	
	private Mutuo mutuo;

	public Mutuo getMutuo() {
		return mutuo;
	}

	public void setMutuo(Mutuo mutuo) {
		this.mutuo = mutuo;
	}
	
	
	
}
