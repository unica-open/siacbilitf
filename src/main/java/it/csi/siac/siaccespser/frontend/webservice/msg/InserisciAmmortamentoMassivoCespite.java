/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class InserisciAmmortamentoMassivoCespite extends ServiceRequest {

	private List<Integer> uidsCespiti;
	
	private Integer ultimoAnnoAmmortamento;
	
	private Boolean inserisciAmmortamentoCompleto;
	
	private RicercaSinteticaCespite requestRicerca;

	/**
	 * @return the cespiti
	 */
	public List<Integer> getUidsCespiti() {
		return uidsCespiti;
	}

	/**
	 * @param cespiti the cespiti to set
	 */
	public void setUidsCespiti(List<Integer> uidsCespiti) {
		this.uidsCespiti = uidsCespiti;
	}

	/**
	 * @return the ultimoAnnoAmmortamento
	 */
	public Integer getUltimoAnnoAmmortamento() {
		return ultimoAnnoAmmortamento;
	}

	/**
	 * @param ultimoAnnoAmmortamento the ultimoAnnoAmmortamento to set
	 */
	public void setUltimoAnnoAmmortamento(Integer ultimoAnnoAmmortamento) {
		this.ultimoAnnoAmmortamento = ultimoAnnoAmmortamento;
	}
	
	/**
	 * @return the inserisciAmmortamentoCompleto
	 */
	@XmlTransient
	public Boolean getInserisciAmmortamentoCompleto() {
		return inserisciAmmortamentoCompleto;
	}

	/**
	 * @param inserisciAmmortamentoCompleto the inserisciAmmortamentoCompleto to set
	 */
	public void setInserisciAmmortamentoCompleto(Boolean inserisciAmmortamentoCompleto) {
		this.inserisciAmmortamentoCompleto = inserisciAmmortamentoCompleto;
	}

	/**
	 * @return the requestRicerca
	 */
	public RicercaSinteticaCespite getRequestRicerca() {
		return requestRicerca;
	}

	/**
	 * @param requestRicerca the requestRicerca to set
	 */
	public void setRequestRicerca(RicercaSinteticaCespite requestRicerca) {
		this.requestRicerca = requestRicerca;
	}
	
}
