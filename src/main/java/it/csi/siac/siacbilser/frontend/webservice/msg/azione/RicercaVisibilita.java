/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.azione;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.visibilita.Visibilita;
import it.csi.siac.siacbilser.model.visibilita.modeldetail.VisibilitaModelDetail;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVisibilita extends ServiceRequest {
	
	private Visibilita visibilita;
	@XmlElementWrapper(name = "visibilitaModelDetails")
	@XmlElement(name = "modelDetail")
	private VisibilitaModelDetail[] visibilitaModelDetails;

	/**
	 * @return the visibilita
	 */
	public Visibilita getVisibilita() {
		return this.visibilita;
	}

	/**
	 * @param visibilita the visibilita to set
	 */
	public void setVisibilita(Visibilita visibilita) {
		this.visibilita = visibilita;
	}

	/**
	 * @return the visibilitaModelDetails
	 */
	@XmlTransient
	public VisibilitaModelDetail[] getVisibilitaModelDetails() {
		return this.visibilitaModelDetails;
	}

	/**
	 * @param visibilitaModelDetails the visibilitaModelDetails to set
	 */
	public void setVisibilitaModelDetails(VisibilitaModelDetail... visibilitaModelDetails) {
		this.visibilitaModelDetails = visibilitaModelDetails;
	}

}
