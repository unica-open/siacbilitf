/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.mutuo.Mutuo;


/**
 * Richiesta al metodo FIN.MutuoService.annullaMutuo()
 * 
 * @author
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaMutuo extends ServiceRequest {

	private Ente ente;
	private Mutuo mutuoDaAnnullare;

	public Mutuo getMutuoDaAnnullare() {
		return mutuoDaAnnullare;
	}

	public void setMutuoDaAnnullare(Mutuo mutuoDaAnnullare) {
		this.mutuoDaAnnullare = mutuoDaAnnullare;
	}

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	
}
