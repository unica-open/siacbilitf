/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.movimentogestione;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.model.MovimentoGestione;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class RicercaDettaglioMovimentoGestioneResponse<MG extends MovimentoGestione> extends ServiceResponse {

	protected MG movimentoGestione;

	protected void setMovimentoGestione(MG movimentoGestione) {
		this.movimentoGestione = movimentoGestione;
	}
	
	protected MG getMovimentoGestione() {
		return movimentoGestione;
	}
	
}
