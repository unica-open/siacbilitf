/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaImpegniGlobalResponse extends PaginazioneResponse{

	
	private List<Impegno> impegniList;
	private Bilancio bilancio;
	
	
	public List<Impegno> getImpegniList() {
		return impegniList;
	}
	public void setImpegniList(List<Impegno> impegniList) {
		this.impegniList = impegniList;
	}
	public Bilancio getBilancio() {
		return bilancio;
	}
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	
	
	
	
}
