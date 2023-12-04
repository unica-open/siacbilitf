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
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.movgest.VincoliMovimentoModelDetail;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSinteticaModulareVincoliAccertamento extends ServiceRequest {

	private Accertamento accertamento;

	@XmlElementWrapper(name="VincoliMovimentoModelDetail")
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

}
