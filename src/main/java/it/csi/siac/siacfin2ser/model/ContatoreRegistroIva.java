/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class ContatoreRegistroIva extends Entita {
	
	private static final long serialVersionUID = 6940695232983720215L;
	
	private Ente ente;
	private Integer annoEsercizio;
	private Periodo periodo;
	private Integer ultimoNumeroProtocolloProvvisorio;
	private Date ultimaDataProtocolloProvvisorio;
	private Integer ultimoNumeroProtocolloDefinitivo;
	private Date ultimaDataProtocolloDefinitivo;
//	private Boolean flagStampaProvvisorio = Boolean.FALSE;
//	private Boolean flagStampaDefinitivo = Boolean.FALSE;
//	private Integer ultimaPaginaStampaProvvisorio;
//	private Integer ultimaPaginaStampaDefinitivo;
	private RegistroIva registroIva;	
	private TipoChiusura tipoChiusura;
	
	
	
	

	
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	/**
	 * @return the annoEsercizio
	 */
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}
	/**
	 * @param annoEsercizio the annoEsercizio to set
	 */
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	
	/**
	 * @return the periodo
	 */
	@XmlJavaTypeAdapter(Periodo.PeriodoAdapter.class)
	public Periodo getPeriodo() {
		return periodo;
	}
	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	/**
	 * @return the ultimoNumeroProtocolloProvvisorio
	 */
	public Integer getUltimoNumeroProtocolloProvvisorio() {
		return ultimoNumeroProtocolloProvvisorio;
	}
	/**
	 * @param ultimoNumeroProtocolloProvvisorio the ultimoNumeroProtocolloProvvisorio to set
	 */
	public void setUltimoNumeroProtocolloProvvisorio(
			Integer ultimoNumeroProtocolloProvvisorio) {
		this.ultimoNumeroProtocolloProvvisorio = ultimoNumeroProtocolloProvvisorio;
	}
	/**
	 * @return the ultimaDataProtocolloProvvisorio
	 */
	public Date getUltimaDataProtocolloProvvisorio() {
		return ultimaDataProtocolloProvvisorio;
	}
	/**
	 * @param ultimaDataProtocolloProvvisorio the ultimaDataProtocolloProvvisorio to set
	 */
	public void setUltimaDataProtocolloProvvisorio(
			Date ultimaDataProtocolloProvvisorio) {
		this.ultimaDataProtocolloProvvisorio = ultimaDataProtocolloProvvisorio;
	}
	/**
	 * @return the ultimoNumeroProtocolloDefinitivo
	 */
	public Integer getUltimoNumeroProtocolloDefinitivo() {
		return ultimoNumeroProtocolloDefinitivo;
	}
	/**
	 * @param ultimoNumeroProtocolloDefinitivo the ultimoNumeroProtocolloDefinitivo to set
	 */
	public void setUltimoNumeroProtocolloDefinitivo(
			Integer ultimoNumeroProtocolloDefinitivo) {
		this.ultimoNumeroProtocolloDefinitivo = ultimoNumeroProtocolloDefinitivo;
	}
	/**
	 * @return the ultimaDataProtocolloDefinitivo
	 */
	public Date getUltimaDataProtocolloDefinitivo() {
		return ultimaDataProtocolloDefinitivo;
	}
	/**
	 * @param ultimaDataProtocolloDefinitivo the ultimaDataProtocolloDefinitivo to set
	 */
	public void setUltimaDataProtocolloDefinitivo(
			Date ultimaDataProtocolloDefinitivo) {
		this.ultimaDataProtocolloDefinitivo = ultimaDataProtocolloDefinitivo;
	}
	
	/**
	 * @return the registroIva
	 */
	public RegistroIva getRegistroIva() {
		return registroIva;
	}
	/**
	 * @param registroIva the registroIva to set
	 */
	public void setRegistroIva(RegistroIva registroIva) {
		this.registroIva = registroIva;
	}
	/**
	 * @return the tipoChiusura
	 */
	public TipoChiusura getTipoChiusura() {
		return tipoChiusura;
	}
	/**
	 * @param tipoChiusura the tipoChiusura to set
	 */
	public void setTipoChiusura(TipoChiusura tipoChiusura) {
		this.tipoChiusura = tipoChiusura;
	}
		
	
}
