/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.movgest.VincoliMovimentoModelDetail;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSinteticaModulareVincoliImpegno extends ServiceRequest {

	private Impegno impegno;

	@XmlElementWrapper(name="vincoliMovimentoModelDetail")
	@XmlElements({
		@XmlElement(name="modelDetail", type=VincoliMovimentoModelDetail.class)
	})
	private VincoliMovimentoModelDetail[] ricercaSinteticaModulareModelDetails;
	private boolean caricaPrimoImpegnoCatenaReimpReanno;
	
	/**
	 * @return the caricaPrimoImpegnoCatenaReimpReanno
	 */
	public boolean isCaricaPrimoImpegnoCatenaReimpReanno() {
		return caricaPrimoImpegnoCatenaReimpReanno;
	}
	
	/**
	 * @param caricaPrimoImpegnoCatenaReimpReanno the caricaPrimoImpegnoCatenaReimpReanno to set
	 */
	public void setCaricaPrimoImpegnoCatenaReimpReanno(boolean caricaPrimoImpegnoCatenaReimpReanno) {
		this.caricaPrimoImpegnoCatenaReimpReanno = caricaPrimoImpegnoCatenaReimpReanno;
	}

	/**
	 * @return the ricercaSinteticaModulareModelDetails
	 */
	@XmlTransient
	public VincoliMovimentoModelDetail[] getRicercaSinteticaModulareModelDetails() {
		return ricercaSinteticaModulareModelDetails;
	}

	/**
	 * @param ricercaSinteticaModulareModelDetails the ricercaSinteticaModulareModelDetails to set
	 */
	public void setRicercaSinteticaModulareModelDetails(VincoliMovimentoModelDetail... ricercaSinteticaModulareModelDetails) {
		this.ricercaSinteticaModulareModelDetails = ricercaSinteticaModulareModelDetails;
	}
	
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

}
