/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ListaSoggettiDellaClasse extends AbstractSoggettoServiceRequest {

	private	Ente ente;

	private	String codiceClasse;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public String getCodiceClasse() {
		return codiceClasse;
	}

	public void setCodiceClasse(String codiceClasse) {
		this.codiceClasse = codiceClasse;
	}
	
}
