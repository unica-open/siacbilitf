/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.movgest.VincoloAccertamento;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSinteticaModulareVincoliAccertamentoResponse extends ServiceResponse {

	private Accertamento accertamento;
	private List<VincoloAccertamento> vincoliAccertamento;

	/**
	 * @return the accertamento
	 */
	public Accertamento getAccertamento() {
		return accertamento;
	}

	/**
	 * @param accertamento the accertamento to set
	 */
	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}

	/**
	 * @return the vincoliAccertamento
	 */
	public List<VincoloAccertamento> getVincoliAccertamento() {
		return vincoliAccertamento;
	}

	/**
	 * @param vincoliAccertamento the vincoliAccertamento to set
	 */
	public void setVincoliAccertamento(List<VincoloAccertamento> vincoliAccertamento) {
		this.vincoliAccertamento = vincoliAccertamento;
	}
	
}
