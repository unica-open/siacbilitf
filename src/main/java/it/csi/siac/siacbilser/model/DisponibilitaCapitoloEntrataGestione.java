/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;

/**
 * Disponibilit&agrave; per il capitolo di entrata gestione
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class DisponibilitaCapitoloEntrataGestione implements Serializable {

	private static final long serialVersionUID = -7608825537135251036L;
	
	private BigDecimal disponibilitaVariare;
	private BigDecimal disponibilitaAccertare;
	private BigDecimal disponibilitaIncassare;
	private BigDecimal accertato;
	private BigDecimal incassato;
	
	private Long numeroAccertamenti;
	private Long numeroOrdinativi;
	/**
	 * @return the disponibilitaVariare
	 */
	public BigDecimal getDisponibilitaVariare() {
		return disponibilitaVariare;
	}
	/**
	 * @param disponibilitaVariare the disponibilitaVariare to set
	 */
	public void setDisponibilitaVariare(BigDecimal disponibilitaVariare) {
		this.disponibilitaVariare = disponibilitaVariare;
	}
	/**
	 * @param disponibilitaVariare the disponibilitaVariare to set
	 */
	public void setDisponibilitaVariare0(BigDecimal disponibilitaVariare) {
		this.disponibilitaVariare = disponibilitaVariare!=null?disponibilitaVariare:BigDecimal.ZERO;
	}
	/**
	 * @return the disponibilitaAccertare
	 */
	public BigDecimal getDisponibilitaAccertare() {
		return disponibilitaAccertare;
	}
	/**
	 * @param disponibilitaAccertare the disponibilitaAccertare to set
	 */
	public void setDisponibilitaAccertare(BigDecimal disponibilitaAccertare) {
		this.disponibilitaAccertare = disponibilitaAccertare;
	}
	/**
	 * @param disponibilitaAccertare the disponibilitaAccertare to set
	 */
	public void setDisponibilitaAccertare0(BigDecimal disponibilitaAccertare) {
		this.disponibilitaAccertare = disponibilitaAccertare!=null?disponibilitaAccertare: BigDecimal.ZERO;
	}
	/**
	 * @return the disponibilitaIncassare
	 */
	public BigDecimal getDisponibilitaIncassare() {
		return disponibilitaIncassare;
	}
	/**
	 * @param disponibilitaIncassare the disponibilitaIncassare to set
	 */
	public void setDisponibilitaIncassare(BigDecimal disponibilitaIncassare) {
		this.disponibilitaIncassare = disponibilitaIncassare;
	}
	/**
	 * @param disponibilitaIncassare the disponibilitaIncassare to set
	 */
	public void setDisponibilitaIncassare0(BigDecimal disponibilitaIncassare) {
		this.disponibilitaIncassare = disponibilitaIncassare!=null?disponibilitaIncassare:BigDecimal.ZERO;
	}
	/**
	 * @return the accertato
	 */
	public BigDecimal getAccertato() {
		return accertato;
	}
	/**
	 * @param accertato the accertato to set
	 */
	public void setAccertato(BigDecimal accertato) {
		this.accertato = accertato;
	}
	/**
	 * @param accertato the accertato to set
	 */
	public void setAccertato0(BigDecimal accertato) {
		this.accertato = accertato!=null?accertato:BigDecimal.ZERO;
	}
	/**
	 * @return the incassato
	 */
	public BigDecimal getIncassato() {
		return incassato;
	}
	/**
	 * @param incassato the incassato to set
	 */
	public void setIncassato(BigDecimal incassato) {
		this.incassato = incassato;
	}
	/**
	 * @param incassato the incassato to set
	 */
	public void setIncassato0(BigDecimal incassato) {
		this.incassato = incassato!=null?incassato:BigDecimal.ZERO;
	}
	/**
	 * @return the numeroAccertamenti
	 */
	public Long getNumeroAccertamenti() {
		return numeroAccertamenti;
	}
	/**
	 * @param numeroAccertamenti the numeroAccertamenti to set
	 */
	public void setNumeroAccertamenti(Long numeroAccertamenti) {
		this.numeroAccertamenti = numeroAccertamenti;
	}
	/**
	 * @return the numeroOrdinativi
	 */
	public Long getNumeroOrdinativi() {
		return numeroOrdinativi;
	}
	/**
	 * @param numeroOrdinativi the numeroOrdinativi to set
	 */
	public void setNumeroOrdinativi(Long numeroOrdinativi) {
		this.numeroOrdinativi = numeroOrdinativi;
	}
	
}
