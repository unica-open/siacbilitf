/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfinser.model.MovimentoGestione;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class RicercaMovimentiGestioneMutuo extends ServiceRequest {
	
	private ParametriPaginazione parametriPaginazione;
	
	
	private MovimentoGestione movimentoGestione;
	
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}


	public MovimentoGestione getMovimentoGestione() {
		return movimentoGestione;
	}

	public void setMovimentoGestione(MovimentoGestione movimentoGestione) {
		this.movimentoGestione = movimentoGestione;
	}
	
}
