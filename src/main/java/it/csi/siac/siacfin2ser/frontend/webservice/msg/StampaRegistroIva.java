/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.Periodo;
import it.csi.siac.siacfin2ser.model.RegistroIva;
import it.csi.siac.siacfin2ser.model.TipoStampa;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class StampaRegistroIva extends ReportServiceRequest {

	private Bilancio bilancio;
	
	private RegistroIva registroIva;
		
	private Boolean documentiPagati;
	private Boolean documentiIncassati;
	
	private TipoStampa tipoStampa;
	
	private Periodo periodo; 
	
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
	
	
	

}
