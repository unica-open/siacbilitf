/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;


@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class EsistenzaProgetto  extends ServiceRequest{

	private String codiceProgetto;
	private Bilancio bilancio;
	private String codiceTipoProgetto;

	public String getCodiceProgetto() {
		return codiceProgetto;
	}

	public void setCodiceProgetto(String codiceProgetto) {
		this.codiceProgetto = codiceProgetto;
	}

	public String getCodiceTipoProgetto() {
		return codiceTipoProgetto;
	}

	public void setCodiceTipoProgetto(String codiceTipoProgetto) {
		this.codiceTipoProgetto = codiceTipoProgetto;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
}
