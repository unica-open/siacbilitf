/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.SubAccertamento;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSubAccertamentiDiUnAccertamentoResponse extends RicercaAttributiMovimentoGestioneOttimizzatoResponse{

	private Accertamento accertamento;
	
	private List<SubAccertamento> elencoSubAccertamenti;

	public List<SubAccertamento> getElencoSubAccertamenti() {
		return elencoSubAccertamenti;
	}

	public void setElencoSubAccertamenti(List<SubAccertamento> elencoSubAccertamenti) {
		this.elencoSubAccertamenti = elencoSubAccertamenti;
	}

	public Accertamento getAccertamento() {
		return accertamento;
	}

	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}
	
}
