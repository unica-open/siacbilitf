/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.movgest.VincoloImpegno;

public class RicercaSinteticaModulareVincoliImpegnoResponse extends ServiceResponse {

	private Impegno impegno;
	private List<VincoloImpegno> vincoliImpegno;

	/**
	 * @return the impegno
	 */
	public Impegno getImpegno() {
		return impegno;
	}

	/**
	 * @param impegno the impegno to set
	 */
	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

	/**
	 * @return the vincoliImpegno
	 */
	public List<VincoloImpegno> getVincoliImpegno() {
		return vincoliImpegno;
	}

	/**
	 * @param vincoliImpegno the vincoliImpegno to set
	 */
	public void setVincoliImpegno(List<VincoloImpegno> vincoliImpegno) {
		this.vincoliImpegno = vincoliImpegno;
	}
	
}
