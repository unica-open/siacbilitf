/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.msg.report.ReportServiceRequest;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.Periodo;
import it.csi.siac.siacfin2ser.model.RegistroIva;
import it.csi.siac.siacfin2ser.model.TipoStampa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class StampaRegistriIva extends ReportServiceRequest {

	private Bilancio bilancio;

	private Boolean documentiPagati;
	private Boolean documentiIncassati;

	private TipoStampa tipoStampa;

	private Periodo periodo;

	@XmlElementWrapper(name="listaRegistriIva")
	@XmlElement(name="registroIva")
	private List<RegistroIva> registriIva = new ArrayList<RegistroIva>();

	private Boolean flagOnlyCheckRegistroIva;

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
	 * @return the documentiPagati
	 */
	public Boolean getDocumentiPagati() {
		return documentiPagati;
	}

	/**
	 * @param documentiPagati the documentiPagati to set
	 */
	public void setDocumentiPagati(Boolean documentiPagati) {
		this.documentiPagati = documentiPagati;
	}

	/**
	 * @return the documentiIncassati
	 */
	public Boolean getDocumentiIncassati() {
		return documentiIncassati;
	}

	/**
	 * @param documentiIncassati the documentiIncassati to set
	 */
	public void setDocumentiIncassati(Boolean documentiIncassati) {
		this.documentiIncassati = documentiIncassati;
	}

	/**
	 * @return the tipoStampa
	 */
	public TipoStampa getTipoStampa() {
		return tipoStampa;
	}

	/**
	 * @param tipoStampa the tipoStampa to set
	 */
	public void setTipoStampa(TipoStampa tipoStampa) {
		this.tipoStampa = tipoStampa;
	}

	/**
	 * @return the periodo
	 */
	public Periodo getPeriodo() {
		return periodo;
	}

	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	@XmlTransient
	public List<RegistroIva> getRegistriIva() {
		return registriIva;
	}

	public void setRegistriIva(List<RegistroIva> registriIva) {
		this.registriIva = registriIva != null ? registriIva : new ArrayList<RegistroIva>();
	}

	public Boolean getFlagOnlyCheckRegistroIva() {
		return flagOnlyCheckRegistroIva;
	}

	public void setFlagOnlyCheckRegistroIva(Boolean flagOnlyCheckRegistroIva) {
		this.flagOnlyCheckRegistroIva = flagOnlyCheckRegistroIva;
	}

}
