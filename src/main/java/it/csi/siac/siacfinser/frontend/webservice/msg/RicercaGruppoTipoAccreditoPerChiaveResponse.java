/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.codifiche.CodificaFin;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaGruppoTipoAccreditoPerChiaveResponse extends ServiceResponse{

	
	private CodificaFin gruppoTipoAccredito;

	public CodificaFin getGruppoTipoAccredito() {
		return gruppoTipoAccredito;
	}

	public void setGruppoTipoAccredito(CodificaFin gruppoTipoAccredito) {
		this.gruppoTipoAccredito = gruppoTipoAccredito;
	}
	
	
	
	
}
