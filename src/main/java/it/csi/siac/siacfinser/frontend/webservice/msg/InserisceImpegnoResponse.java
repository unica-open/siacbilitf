/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;

/**
 * Risposta al metodo FIN.ImpegnoService.inserisceImpegno()
 * 
 * @author alagna
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceImpegnoResponse extends ServiceResponse {

	private Impegno impegno;

	public Impegno getImpegno() {
		return impegno;
	}

	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

}
