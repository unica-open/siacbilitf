/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.codifiche.CodificaFin;


@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ListaSoggettiDellaClasseResponse extends ServiceResponse {
	
	
	private List<CodificaFin> listaSoggetti;

	public List<CodificaFin> getListaSoggetti() {
		return listaSoggetti;
	}

	public void setListaSoggetti(List<CodificaFin> listaSoggetti) {
		this.listaSoggetti = listaSoggetti;
	}
	
}
