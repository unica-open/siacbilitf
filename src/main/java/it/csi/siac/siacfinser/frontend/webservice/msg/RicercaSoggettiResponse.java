/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;


@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSoggettiResponse  extends PaginazioneResponse {

	
	private Ente ente;
	private List<Soggetto> soggetti;
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public List<Soggetto> getSoggetti() {
		return soggetti;
	}
	public void setSoggetti(List<Soggetto> soggetti) {
		this.soggetti = soggetti;
	}
}
