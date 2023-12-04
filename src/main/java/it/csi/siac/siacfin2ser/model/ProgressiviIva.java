/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import it.csi.siac.siaccorser.model.EntitaEnte;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class ProgressiviIva extends EntitaEnte {
	
	private static final long serialVersionUID = -6698701009441926463L;
	
	private Integer annoEsercizio;
	
	private BigDecimal totaleImponibileProvvisorio = BigDecimal.ZERO;
	private BigDecimal totaleImponibileDefinitivo = BigDecimal.ZERO;
	private BigDecimal totaleIvaProvvisorio = BigDecimal.ZERO;
	private BigDecimal totaleIvaDefinitivo = BigDecimal.ZERO;
	
	// Derivati
	private BigDecimal totaleIvaIndetraibileProvvisorio = BigDecimal.ZERO;
	private BigDecimal totaleIvaIndetraibileDefinitivo = BigDecimal.ZERO;
	private BigDecimal totaleIvaDetraibileProvvisorio = BigDecimal.ZERO;
	private BigDecimal totaleIvaDetraibileDefinitivo = BigDecimal.ZERO;
	
	private RegistroIva registroIva;
	private Periodo periodo;
	private AttivitaIva attivitaIva;
	private AliquotaIva aliquotaIva;
	
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
	 * @return the totaleImponibileProvvisorio
	 */
	public BigDecimal getTotaleImponibileProvvisorio() {
		return totaleImponibileProvvisorio;
	}
	/**
	 * @param totaleImponibileProvvisorio the totaleImponibileProvvisorio to set
	 */
	public void setTotaleImponibileProvvisorio(BigDecimal totaleImponibileProvvisorio) {
		this.totaleImponibileProvvisorio = totaleImponibileProvvisorio != null ? totaleImponibileProvvisorio : BigDecimal.ZERO;
	}
	/**
	 * @return the totaleImponibileDefinitivo
	 */
	public BigDecimal getTotaleImponibileDefinitivo() {
		return totaleImponibileDefinitivo;
	}
	/**
	 * @param totaleImponibileDefinitivo the totaleImponibileDefinitivo to set
	 */
	public void setTotaleImponibileDefinitivo(BigDecimal totaleImponibileDefinitivo) {
		this.totaleImponibileDefinitivo = totaleImponibileDefinitivo != null ? totaleImponibileDefinitivo : BigDecimal.ZERO;
	}
	/**
	 * @return the totaleIvaProvvisorio
	 */
	public BigDecimal getTotaleIvaProvvisorio() {
		return totaleIvaProvvisorio;
	}
	/**
	 * @param totaleIvaProvvisorio the totaleIvaProvvisorio to set
	 */
	public void setTotaleIvaProvvisorio(BigDecimal totaleIvaProvvisorio) {
		this.totaleIvaProvvisorio = totaleIvaProvvisorio != null ? totaleIvaProvvisorio : BigDecimal.ZERO;
	}
	/**
	 * @return the totaleIvaDefinitivo
	 */
	public BigDecimal getTotaleIvaDefinitivo() {
		return totaleIvaDefinitivo;
	}
	/**
	 * @param totaleIvaDefinitivo the totaleIvaDefinitivo to set
	 */
	public void setTotaleIvaDefinitivo(BigDecimal totaleIvaDefinitivo) {
		this.totaleIvaDefinitivo = totaleIvaDefinitivo != null ? totaleIvaDefinitivo : BigDecimal.ZERO;
	}
	/**
	 * @return the totaleIvaIndetraibileProvvisorio
	 */
	public BigDecimal getTotaleIvaIndetraibileProvvisorio() {
		return totaleIvaIndetraibileProvvisorio;
	}
	/**
	 * @param totaleIvaIndetraibileProvvisorio the totaleIvaIndetraibileProvvisorio to set
	 */
	public void setTotaleIvaIndetraibileProvvisorio(BigDecimal totaleIvaIndetraibileProvvisorio) {
		this.totaleIvaIndetraibileProvvisorio = totaleIvaIndetraibileProvvisorio != null ? totaleIvaIndetraibileProvvisorio : BigDecimal.ZERO;
	}
	/**
	 * @return the totaleIvaIndetraibileDefinitivo
	 */
	public BigDecimal getTotaleIvaIndetraibileDefinitivo() {
		return totaleIvaIndetraibileDefinitivo;
	}
	/**
	 * @param totaleIvaIndetraibileDefinitivo the totaleIvaIndetraibileDefinitivo to set
	 */
	public void setTotaleIvaIndetraibileDefinitivo(BigDecimal totaleIvaIndetraibileDefinitivo) {
		this.totaleIvaIndetraibileDefinitivo = totaleIvaIndetraibileDefinitivo != null ? totaleIvaIndetraibileDefinitivo : BigDecimal.ZERO;
	}
	/**
	 * @return the totaleIvaDetraibileProvvisorio
	 */
	public BigDecimal getTotaleIvaDetraibileProvvisorio() {
		return totaleIvaDetraibileProvvisorio;
	}
	/**
	 * @param totaleIvaDetraibileProvvisorio the totaleIvaDetraibileProvvisorio to set
	 */
	public void setTotaleIvaDetraibileProvvisorio(BigDecimal totaleIvaDetraibileProvvisorio) {
		this.totaleIvaDetraibileProvvisorio = totaleIvaDetraibileProvvisorio != null ? totaleIvaDetraibileProvvisorio : BigDecimal.ZERO;
	}
	/**
	 * @return the totaleIvaDetraibileDefinitivo
	 */
	public BigDecimal getTotaleIvaDetraibileDefinitivo() {
		return totaleIvaDetraibileDefinitivo;
	}
	/**
	 * @param totaleIvaDetraibileDefinitivo the totaleIvaDetraibileDefinitivo to set
	 */
	public void setTotaleIvaDetraibileDefinitivo(BigDecimal totaleIvaDetraibileDefinitivo) {
		this.totaleIvaDetraibileDefinitivo = totaleIvaDetraibileDefinitivo != null ? totaleIvaDetraibileDefinitivo : BigDecimal.ZERO;
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
	 * @return the attivitaIva
	 */
	public AttivitaIva getAttivitaIva() {
		return attivitaIva;
	}
	/**
	 * @param attivitaIva the attivitaIva to set
	 */
	public void setAttivitaIva(AttivitaIva attivitaIva) {
		this.attivitaIva = attivitaIva;
	}
	/**
	 * @return the aliquotaIva
	 */
	public AliquotaIva getAliquotaIva() {
		return aliquotaIva;
	}
	/**
	 * @param aliquotaIva the aliquotaIva to set
	 */
	public void setAliquotaIva(AliquotaIva aliquotaIva) {
		this.aliquotaIva = aliquotaIva;
	}
	
	
	
	
	
}
