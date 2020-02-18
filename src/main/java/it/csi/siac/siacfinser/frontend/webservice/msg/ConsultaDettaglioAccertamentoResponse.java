/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.AccertamentoDettaglioImporti;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ConsultaDettaglioAccertamentoResponse extends ConsultaDettaglioMovimentoResponse{ 
	
	
	private AccertamentoDettaglioImporti acertamentoDettaglioImporti;

	public AccertamentoDettaglioImporti getAcertamentoDettaglioImporti() {
		return acertamentoDettaglioImporti;
	}

	public void setAcertamentoDettaglioImporti(
			AccertamentoDettaglioImporti acertamentoDettaglioImporti) {
		this.acertamentoDettaglioImporti = acertamentoDettaglioImporti;
	}
	
	
}
