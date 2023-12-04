/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.Date;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoIvaEntrata;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaSubdocumentoIvaEntrata extends ServiceRequest {
	
	private SubdocumentoIvaEntrata subdocumentoIvaEntrata;
	private ParametriPaginazione parametriPaginazione;
	
	private Integer progressivoIVADa;
	private Integer progressivoIVAA;
	
	private Integer numeroProtocolloProvvisorioDa;
	private Integer numeroProtocolloProvvisorioA;
	private Date protocolloProvvisorioDa;
	private Date protocolloProvvisorioA;
	
	private Integer numeroProtocolloDefinitivoDa;
	private Integer numeroProtocolloDefinitivoA;
	private Date protocolloDefinitivoDa;
	private Date protocolloDefinitivoA;
	
	
	/**
	 * @return the subdocumentoIvaEntrata
	 */
	public SubdocumentoIvaEntrata getSubdocumentoIvaEntrata() {
		return subdocumentoIvaEntrata;
	}
	/**
	 * @param subdocumentoIvaEntrata the subdocumentoIvaEntrata to set
	 */
	public void setSubdocumentoIvaEntrata(SubdocumentoIvaEntrata subdocumentoIvaEntrata) {
		this.subdocumentoIvaEntrata = subdocumentoIvaEntrata;
	}
	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}
	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}
	/**
	 * @return the progressivoIVADa
	 */
	public Integer getProgressivoIVADa() {
		return progressivoIVADa;
	}
	/**
	 * @param progressivoIVADa the progressivoIVADa to set
	 */
	public void setProgressivoIVADa(Integer progressivoIVADa) {
		this.progressivoIVADa = progressivoIVADa;
	}
	/**
	 * @return the progressivoIVAA
	 */
	public Integer getProgressivoIVAA() {
		return progressivoIVAA;
	}
	/**
	 * @param progressivoIVAA the progressivoIVAA to set
	 */
	public void setProgressivoIVAA(Integer progressivoIVAA) {
		this.progressivoIVAA = progressivoIVAA;
	}
	/**
	 * @return the numeroProtocolloProvvisorioDa
	 */
	public Integer getNumeroProtocolloProvvisorioDa() {
		return numeroProtocolloProvvisorioDa;
	}
	/**
	 * @param numeroProtocolloProvvisorioDa the numeroProtocolloProvvisorioDa to set
	 */
	public void setNumeroProtocolloProvvisorioDa(Integer numeroProtocolloProvvisorioDa) {
		this.numeroProtocolloProvvisorioDa = numeroProtocolloProvvisorioDa;
	}
	/**
	 * @return the numeroProtocolloProvvisorioA
	 */
	public Integer getNumeroProtocolloProvvisorioA() {
		return numeroProtocolloProvvisorioA;
	}
	/**
	 * @param numeroProtocolloProvvisorioA the numeroProtocolloProvvisorioA to set
	 */
	public void setNumeroProtocolloProvvisorioA(Integer numeroProtocolloProvvisorioA) {
		this.numeroProtocolloProvvisorioA = numeroProtocolloProvvisorioA;
	}
	/**
	 * @return the protocolloProvvisorioDa
	 */
	public Date getProtocolloProvvisorioDa() {
		return protocolloProvvisorioDa;
	}
	/**
	 * @param protocolloProvvisorioDa the protocolloProvvisorioDa to set
	 */
	public void setProtocolloProvvisorioDa(Date protocolloProvvisorioDa) {
		this.protocolloProvvisorioDa = protocolloProvvisorioDa;
	}
	/**
	 * @return the protocolloProvvisorioA
	 */
	public Date getProtocolloProvvisorioA() {
		return protocolloProvvisorioA;
	}
	/**
	 * @param protocolloProvvisorioA the protocolloProvvisorioA to set
	 */
	public void setProtocolloProvvisorioA(Date protocolloProvvisorioA) {
		this.protocolloProvvisorioA = protocolloProvvisorioA;
	}
	/**
	 * @return the numeroProtocolloDefinitivoDa
	 */
	public Integer getNumeroProtocolloDefinitivoDa() {
		return numeroProtocolloDefinitivoDa;
	}
	/**
	 * @param numeroProtocolloDefinitivoDa the numeroProtocolloDefinitivoDa to set
	 */
	public void setNumeroProtocolloDefinitivoDa(Integer numeroProtocolloDefinitivoDa) {
		this.numeroProtocolloDefinitivoDa = numeroProtocolloDefinitivoDa;
	}
	/**
	 * @return the numeroProtocolloDefinitivoA
	 */
	public Integer getNumeroProtocolloDefinitivoA() {
		return numeroProtocolloDefinitivoA;
	}
	/**
	 * @param numeroProtocolloDefinitivoA the numeroProtocolloDefinitivoA to set
	 */
	public void setNumeroProtocolloDefinitivoA(Integer numeroProtocolloDefinitivoA) {
		this.numeroProtocolloDefinitivoA = numeroProtocolloDefinitivoA;
	}
	/**
	 * @return the protocolloDefinitivoDa
	 */
	public Date getProtocolloDefinitivoDa() {
		return protocolloDefinitivoDa;
	}
	/**
	 * @param protocolloDefinitivoDa the protocolloDefinitivoDa to set
	 */
	public void setProtocolloDefinitivoDa(Date protocolloDefinitivoDa) {
		this.protocolloDefinitivoDa = protocolloDefinitivoDa;
	}
	/**
	 * @return the protocolloDefinitivoA
	 */
	public Date getProtocolloDefinitivoA() {
		return protocolloDefinitivoA;
	}
	/**
	 * @param protocolloDefinitivoA the protocolloDefinitivoA to set
	 */
	public void setProtocolloDefinitivoA(Date protocolloDefinitivoA) {
		this.protocolloDefinitivoA = protocolloDefinitivoA;
	}
	
	
	
}
