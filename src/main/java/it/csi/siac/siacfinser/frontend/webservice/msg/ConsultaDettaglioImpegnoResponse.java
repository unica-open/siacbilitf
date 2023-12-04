/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.DettaglioImportiImpegno;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ConsultaDettaglioImpegnoResponse extends ConsultaDettaglioMovimentoResponse{ 

	private DettaglioImportiImpegno dettaglioImportiImpegno;

	public DettaglioImportiImpegno getImpegnoDettaglioImporti() {
		return dettaglioImportiImpegno;
	}

	public void setImpegnoDettaglioImporti(
			DettaglioImportiImpegno dettaglioImportiImpegno) {
		this.dettaglioImportiImpegno = dettaglioImportiImpegno;
	}
	
}
