/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class GeneraXmlOrdinativiMif extends ServiceRequest {
	private Integer idEnte;
	private Integer annoEsercizio; 
	private String codiceIstat;
	private Integer limitOrdinativi;
	private Integer offsetOrdinativi;
	private Integer idElaborazione;

	public Integer getIdEnte() {
		return idEnte;
	}

	public void setIdEnte(Integer idEnte) {
		this.idEnte = idEnte;
	}

	public Integer getLimitOrdinativi() {
		return limitOrdinativi;
	}

	public void setLimitOrdinativi(Integer limitOrdinativi) {
		this.limitOrdinativi = limitOrdinativi;
	}

	public Integer getOffsetOrdinativi() {
		return offsetOrdinativi;
	}

	public void setOffsetOrdinativi(Integer offsetOrdinativi) {
		this.offsetOrdinativi = offsetOrdinativi;
	}

	public Integer getIdElaborazione() {
		return idElaborazione;
	}

	public void setIdElaborazione(Integer idElaborazione) {
		this.idElaborazione = idElaborazione;
	}

	public Integer getAnnoEsercizio()
	{
		return annoEsercizio;
	}

	public void setAnnoEsercizio(Integer annoEsercizio)
	{
		this.annoEsercizio = annoEsercizio;
	}

	public String getCodiceIstat() {
		return codiceIstat;
	}

	public void setCodiceIstat(String codiceIstat) {
		this.codiceIstat = codiceIstat;
	}
}
