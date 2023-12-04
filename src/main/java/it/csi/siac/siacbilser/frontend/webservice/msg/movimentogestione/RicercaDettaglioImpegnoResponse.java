/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.movimentogestione;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioImpegnoResponse extends RicercaDettaglioMovimentoGestioneResponse<Impegno> {


	public void setImpegno(Impegno impegno) {
		setMovimentoGestione(impegno);
	}
	
	public Impegno getImpegno() {
		return getMovimentoGestione();
	}

	
}
