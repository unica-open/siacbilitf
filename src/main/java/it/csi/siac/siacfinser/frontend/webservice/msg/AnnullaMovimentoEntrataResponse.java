/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;

/**
 * Risposta al metodo FIN.ImpegnoService.annullaMovimentoEntrata()
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaMovimentoEntrataResponse extends ServiceResponse {

	private Accertamento accertamento;

	public Accertamento getAccertamento() {
		return accertamento;
	}

	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}
}
