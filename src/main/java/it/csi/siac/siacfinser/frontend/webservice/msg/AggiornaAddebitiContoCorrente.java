/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.saldo.AddebitoContoCorrente;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaAddebitiContoCorrente extends ServiceRequest {
	private Ente ente;
	private List<AddebitoContoCorrente> elencoAddebiti = new ArrayList<AddebitoContoCorrente>();

	public List<AddebitoContoCorrente> getElencoAddebiti() {
		return elencoAddebiti;
	}

	public void setElencoAddebiti(List<AddebitoContoCorrente> elencoAddebiti) {
		this.elencoAddebiti = elencoAddebiti;
	}

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}
}
