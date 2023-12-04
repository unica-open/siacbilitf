/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.movimentogestione;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacfin2ser.model.AccertamentoModelDetail;
import it.csi.siac.siacfin2ser.model.ImpegnoModelDetail;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.Impegno;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioAccertamento extends RicercaDettaglioMovimentoGestione<Accertamento> {

	private AccertamentoModelDetail[] accertamentoModelDetails;

	public void setAccertamento(Accertamento accertamento) {
		setMovimentoGestione(accertamento);
	}

	public Accertamento getAccertamento() {
		return getMovimentoGestione();
	}
		
	public void setAccertamentoModelDetails(AccertamentoModelDetail... accertamentoModelDetails) {
		this.accertamentoModelDetails = accertamentoModelDetails;
	}

	public AccertamentoModelDetail[] getAccertamentoModelDetails() {
		return accertamentoModelDetails;
	}
}
