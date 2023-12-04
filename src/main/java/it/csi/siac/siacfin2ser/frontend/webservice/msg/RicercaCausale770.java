/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.TipoOnere;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaCausale770 extends ServiceRequest {
	
	private Ente ente = null;
	
	private TipoOnere tipoOnere = null;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public TipoOnere getTipoOnere() {
		return tipoOnere;
	}

	public void setTipoOnere(TipoOnere tipoOnere) {
		this.tipoOnere = tipoOnere;
	}
}
