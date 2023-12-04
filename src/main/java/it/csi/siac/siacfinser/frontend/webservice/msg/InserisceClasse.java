/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.soggetto.ClassificazioneSoggetto;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceClasse extends ServiceRequest {

	private	Ente ente;

	private	ClassificazioneSoggetto classeSoggetto;	
	
	public ClassificazioneSoggetto getClasseSoggetto() {
		return classeSoggetto;
	}

	public void setClasseSoggetto(ClassificazioneSoggetto classeSoggetto) {
		this.classeSoggetto = classeSoggetto;
	}

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	
}
