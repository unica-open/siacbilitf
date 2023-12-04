/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.Cespite;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.model.MovimentoDettaglio;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class CollegaCespiteRegistroACespite extends ServiceRequest {

	private MovimentoDettaglio movimentoDettaglio;
	private Boolean inserimentoContestuale;
	
	@XmlElementWrapper(name = "listaCespiti")
	@XmlElement(name = "cespite")
	private List<Cespite> listaCespiti;
	
	/**
	 * @return the listaCespiti
	 */
	@XmlTransient
	public List<Cespite> getListaCespiti() {
		return listaCespiti;
	}
	/**
	 * @param listaCespiti the listaCespiti to set
	 */
	public void setListaCespiti(List<Cespite> listaCespiti) {
		this.listaCespiti = listaCespiti;
	}
	
	/**
	 * @return the movimentoDettaglio
	 */
	public MovimentoDettaglio getMovimentoDettaglio() {
		return movimentoDettaglio;
	}
	/**
	 * @param movimentoDettaglio the movimentoDettaglio to set
	 */
	public void setMovimentoDettaglio(MovimentoDettaglio movimentoDettaglio) {
		this.movimentoDettaglio = movimentoDettaglio;
	}
	/**
	 * @return the inserimentoContestuale
	 */
	public Boolean getInserimentoContestuale() {
		return inserimentoContestuale;
	}
	/**
	 * @param inserimentoContestuale the inserimentoContestuale to set
	 */
	public void setInserimentoContestuale(Boolean inserimentoContestuale) {
		this.inserimentoContestuale = inserimentoContestuale;
	}
	
}
