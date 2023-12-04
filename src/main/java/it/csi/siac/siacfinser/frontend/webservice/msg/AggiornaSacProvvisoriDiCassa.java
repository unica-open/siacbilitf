/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaSacProvvisoriDiCassa extends ServiceRequest {

	private Ente ente;
	private List<ProvvisorioDiCassa> elencoProvvisoriDiCassa;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public List<ProvvisorioDiCassa> getElencoProvvisoriDiCassa() {
		return elencoProvvisoriDiCassa;
	}

	public void setElencoProvvisoriDiCassa(List<ProvvisorioDiCassa> elencoProvvisoriDiCassa) {
		this.elencoProvvisoriDiCassa = elencoProvvisoriDiCassa;
	}
}
