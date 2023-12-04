/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.SubAccertamento;
import it.csi.siac.siacfinser.model.SubImpegno;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaAttributiMovimentoGestioneOttimizzatoResponse extends PaginazioneResponse{ 

	//Febbraio 2016: viene data la possibilita' di carica i sub per pagine per motivi di performance:
	private int numeroTotaleSub;
	private int numeroTotPagineSub;
	private int dimensionePaginaSub;
	private int numeroPaginaSubRestituita;
	
	//riepiloghi:
	private List<SubImpegno> elencoSubImpegniTuttiConSoloGliIds;
	private List<SubAccertamento> elencoSubAccertamentiTuttiConSoloGliIds;
	//
	
	public int getNumeroTotaleSub() {
		return numeroTotaleSub;
	}
	public void setNumeroTotaleSub(int numeroTotaleSub) {
		this.numeroTotaleSub = numeroTotaleSub;
	}
	public int getNumeroTotPagineSub() {
		return numeroTotPagineSub;
	}
	public void setNumeroTotPagineSub(int numeroTotPagineSub) {
		this.numeroTotPagineSub = numeroTotPagineSub;
	}
	public int getDimensionePaginaSub() {
		return dimensionePaginaSub;
	}
	public void setDimensionePaginaSub(int dimensionePaginaSub) {
		this.dimensionePaginaSub = dimensionePaginaSub;
	}
	public int getNumeroPaginaSubRestituita() {
		return numeroPaginaSubRestituita;
	}
	public void setNumeroPaginaSubRestituita(int numeroPaginaSubRestituita) {
		this.numeroPaginaSubRestituita = numeroPaginaSubRestituita;
	}
	public List<SubImpegno> getElencoSubImpegniTuttiConSoloGliIds() {
		return elencoSubImpegniTuttiConSoloGliIds;
	}
	public void setElencoSubImpegniTuttiConSoloGliIds(
			List<SubImpegno> elencoSubImpegniTuttiConSoloGliIds) {
		this.elencoSubImpegniTuttiConSoloGliIds = elencoSubImpegniTuttiConSoloGliIds;
	}
	public List<SubAccertamento> getElencoSubAccertamentiTuttiConSoloGliIds() {
		return elencoSubAccertamentiTuttiConSoloGliIds;
	}
	public void setElencoSubAccertamentiTuttiConSoloGliIds(
			List<SubAccertamento> elencoSubAccertamentiTuttiConSoloGliIds) {
		this.elencoSubAccertamentiTuttiConSoloGliIds = elencoSubAccertamentiTuttiConSoloGliIds;
	}
	
}
