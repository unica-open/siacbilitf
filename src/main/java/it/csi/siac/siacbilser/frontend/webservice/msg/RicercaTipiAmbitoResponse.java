/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoAmbito;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaTipiAmbitoResponse extends ServiceResponse {

	private List<TipoAmbito> tipiAmbito = new ArrayList<TipoAmbito>();

	public List<TipoAmbito> getTipiAmbito() {
		return tipiAmbito;
	}

	public void setTipiAmbito(List<TipoAmbito> tipiAmbito) {
		this.tipiAmbito = tipiAmbito;
	}
	
	
}
