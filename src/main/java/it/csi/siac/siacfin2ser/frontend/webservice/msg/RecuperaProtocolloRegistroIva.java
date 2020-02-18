/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.RegistroIva;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RecuperaProtocolloRegistroIva extends ServiceRequest {
	
	private RegistroIva registroIva;
	private Bilancio bilancio;
	private Integer numeroProtocolloProvvisorio;
	private Integer numeroProtocolloDefinitivo;

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
	 * @return the numeroProtocolloProvvisorio
	 */
	public Integer getNumeroProtocolloProvvisorio() {
		return numeroProtocolloProvvisorio;
	}

	/**
	 * @param numeroProtocolloProvvisorio the numeroProtocolloProvvisorio to set
	 */
	public void setNumeroProtocolloProvvisorio(Integer numeroProtocolloProvvisorio) {
		this.numeroProtocolloProvvisorio = numeroProtocolloProvvisorio;
	}

	/**
	 * @return the numeroProtocolloDefinitivo
	 */
	public Integer getNumeroProtocolloDefinitivo() {
		return numeroProtocolloDefinitivo;
	}

	/**
	 * @param numeroProtocolloDefinitivo the numeroProtocolloDefinitivo to set
	 */
	public void setNumeroProtocolloDefinitivo(Integer numeroProtocolloDefinitivo) {
		this.numeroProtocolloDefinitivo = numeroProtocolloDefinitivo;
	}
	
}
