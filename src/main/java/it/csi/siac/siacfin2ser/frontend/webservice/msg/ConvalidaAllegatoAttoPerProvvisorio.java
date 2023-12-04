/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class ConvalidaAllegatoAttoPerProvvisorio extends ConvalidaAllegatoAtto {
	
	private ProvvisorioDiCassa provvisorioDiCassa;
	
	private Ente ente;
	
	//va tolto
	//private List<AllegatoAtto> allegatiAtto = new ArrayList<AllegatoAtto>();

	/**
	 * @return the provvisorioDiCassa
	 */
	public ProvvisorioDiCassa getProvvisorioDiCassa() {
		return provvisorioDiCassa;
	}

	/**
	 * @param provvisorioDiCassa the provvisorioDiCassa to set
	 */
	public void setProvvisorioDiCassa(ProvvisorioDiCassa provvisorioDiCassa) {
		this.provvisorioDiCassa = provvisorioDiCassa;
	}

	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	
	
	
	

}
