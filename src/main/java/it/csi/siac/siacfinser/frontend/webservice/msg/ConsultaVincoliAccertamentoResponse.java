/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.movgest.VincoloAccertamento;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ConsultaVincoliAccertamentoResponse extends ConsultaDettaglioMovimentoResponse{ 
	
	
	private List<VincoloAccertamento> vincoli;

	public List<VincoloAccertamento> getVincoli() {
		return vincoli;
	}

	public void setVincoli(List<VincoloAccertamento> vincoli) {
		this.vincoli = vincoli;
	}
	
}
