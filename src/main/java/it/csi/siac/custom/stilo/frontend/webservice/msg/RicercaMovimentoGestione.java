/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.custom.stilo.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;


@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaMovimentoGestione extends ServiceRequest{

	
	private String annoProvvedimento;
	private Integer numeroProvvedimento;
	private Integer tipoProvvedimento;
	private Integer strutturaAmministrativoContabileProvvedimento;
	private Integer  enteProprietarioId;
	
	
	/**
	 * @return the enteProprietarioId
	 */
	public Integer getEnteProprietarioId() {
		return enteProprietarioId;
	}
	/**
	 * @param enteProprietarioId the enteProprietarioId to set
	 */
	public void setEnteProprietarioId(Integer enteProprietarioId) {
		this.enteProprietarioId = enteProprietarioId;
	}
	/**
	 * @return the annoProvvedimento
	 */
	public String getAnnoProvvedimento() {
		return annoProvvedimento;
	}
	/**
	 * @param annoProvvedimento the annoProvvedimento to set
	 */
	public void setAnnoProvvedimento(String annoProvvedimento) {
		this.annoProvvedimento = annoProvvedimento;
	}
	/**
	 * @return the numeroProvvedimento
	 */
	public Integer getNumeroProvvedimento() {
		return numeroProvvedimento;
	}
	/**
	 * @param numeroProvvedimento the numeroProvvedimento to set
	 */
	public void setNumeroProvvedimento(Integer numeroProvvedimento) {
		this.numeroProvvedimento = numeroProvvedimento;
	}
	/**
	 * @return the tipoProvvedimento
	 */
	public Integer getTipoProvvedimento() {
		return tipoProvvedimento;
	}
	/**
	 * @param tipoProvvedimento the tipoProvvedimento to set
	 */
	public void setTipoProvvedimento(Integer tipoProvvedimento) {
		this.tipoProvvedimento = tipoProvvedimento;
	}
	/**
	 * @return the strutturaAmministrativoContabileProvvedimento
	 */
	public Integer getStrutturaAmministrativoContabileProvvedimento() {
		return strutturaAmministrativoContabileProvvedimento;
	}
	/**
	 * @param strutturaAmministrativoContabileProvvedimento the strutturaAmministrativoContabileProvvedimento to set
	 */
	public void setStrutturaAmministrativoContabileProvvedimento(Integer strutturaAmministrativoContabileProvvedimento) {
		this.strutturaAmministrativoContabileProvvedimento = strutturaAmministrativoContabileProvvedimento;
	}
	
}
