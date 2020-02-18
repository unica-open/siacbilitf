/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseRequest;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.CausaleEP;
import it.csi.siac.siacgenser.model.CausaleEPModelDetail;
import it.csi.siac.siacgenser.model.TipoEvento;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaModulareCausale extends RicercaSinteticaBaseRequest {

	private CausaleEP causaleEP;
	private TipoEvento tipoEvento;
	private Bilancio bilancio;
	@XmlElementWrapper(name="causaleEPModelDetails")
	@XmlElement(name="modelDetail")
	private CausaleEPModelDetail[] causaleEPModelDetails;

	/**
	 * @return the causaleEP
	 */
	public CausaleEP getCausaleEP() {
		return causaleEP;
	}

	/**
	 * @param causaleEP the causaleEP to set
	 */
	public void setCausaleEP(CausaleEP causaleEP) {
		this.causaleEP = causaleEP;
	}

	/**
	 * @return the tipoEvento
	 */
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	/**
	 * @param tipoEvento the tipoEvento to set
	 */
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * @return the causaleEPModelDetails
	 */
	@XmlTransient
	public CausaleEPModelDetail[] getCausaleEPModelDetails() {
		return causaleEPModelDetails;
	}

	/**
	 * @param causaleEPModelDetails the causaleEPModelDetails to set
	 */
	public void setCausaleEPModelDetails(CausaleEPModelDetail... causaleEPModelDetails) {
		this.causaleEPModelDetails = causaleEPModelDetails;
	}
	
}
