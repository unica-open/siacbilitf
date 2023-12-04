/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSubImpegniDiUnImpegnoResponse extends RicercaAttributiMovimentoGestioneOttimizzatoResponse{

	private Impegno impegno;
	
	private List<SubImpegno> elencoSubImpegni;
	
	public List<SubImpegno> getElencoSubImpegni() {
		return elencoSubImpegni;
	}
	public void setElencoSubImpegni(List<SubImpegno> elencoSubImpegni) {
		this.elencoSubImpegni = elencoSubImpegni;
	}
	public Impegno getImpegno() {
		return impegno;
	}
	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}
	
}
