/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.TipoImpresa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaTipoImpresaResponse extends ServiceResponse {
	
	private List<TipoImpresa> elencoTipiImpresa = new ArrayList<TipoImpresa>();

	public List<TipoImpresa> getElencoTipiImpresa() {
		return elencoTipiImpresa;
	}

	public void setElencoTipiImpresa(List<TipoImpresa> elencoTipiImpresa) {
		this.elencoTipiImpresa = elencoTipiImpresa;
	}

}
