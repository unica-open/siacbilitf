/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.movimentogestione;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacfin2ser.model.ImpegnoModelDetail;
import it.csi.siac.siacfinser.model.Impegno;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioImpegno extends RicercaDettaglioMovimentoGestione<Impegno> {

	private ImpegnoModelDetail[] impegnoModelDetails;

	public void setImpegno(Impegno impegno) {
		setMovimentoGestione(impegno);
	}

	public Impegno getImpegno() {
		return getMovimentoGestione();
	}
		
	public ImpegnoModelDetail[] getImpegnoModelDetails() {
		return impegnoModelDetails;
	}
	
	public void setImpegnoModelDetails(ImpegnoModelDetail... impegnoModelDetails) {
		this.impegnoModelDetails = impegnoModelDetails;
	}
}
