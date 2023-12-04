/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.movimentogestione;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.model.MovimentoGestione;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class RicercaDettaglioMovimentoGestione<MG extends MovimentoGestione> extends ServiceRequest { 

	protected MG movimentoGestione;
	
	public MG getMovimentoGestione() {
		return movimentoGestione;
	}

	public void setMovimentoGestione(MG movimentoGestione) {
		this.movimentoGestione = movimentoGestione;
	}
}
