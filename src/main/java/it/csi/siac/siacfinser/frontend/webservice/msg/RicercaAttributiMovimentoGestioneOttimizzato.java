/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaAttributiMovimentoGestioneOttimizzato extends PaginazioneRequest{
	
	//QUESTO PILOTA IL CARICAMENTO DI ULTERIORI DATI NON TROPPO LEGGERI DA CARICARE DENTRO LA LISTA elencoSubImpegniTuttiConSoloGliIds - elencoSubAccertamentiTuttiConSoloGliIds
	private DatiOpzionaliElencoSubTuttiConSoloGliIds datiOpzionaliElencoSubTuttiConSoloGliIds;
	
	//Questo serve per abilitare la paginazione su dati minimi:
	private boolean paginazioneSuDatiMinimi=false;
	
	//COME VALORI DI DEFAULT CORRISPONDE AL VECCHIO E CLASSICO COMPORTAMENTO DEL SERVIZIO (ovvero caricare tutti i sub) :
	//SE A FALSE NON CARICA I SUB
	private boolean caricaSub=true;
	//SE A FALSE CARICA TUTTI I SUB, ALTRIMENTI RESTITUISCE SOLO LA PAGINA RICHIESTA
	private boolean subPaginati=false;
	private boolean escludiSubAnnullati=false;
	
	private String filtroSubSoloInQuestoStato=null;
	
	private DatiOpzionaliCapitoli datiOpzionaliCapitoli;
	
	//SIAC-6702
	private boolean caricaFlagPresenteStoricizzazioneNelBilancio = false;
	
	public boolean isCaricaSub() {
		return caricaSub;
	}
	public void setCaricaSub(boolean caricaSub) {
		this.caricaSub = caricaSub;
	}
	public boolean isSubPaginati() {
		return subPaginati;
	}
	public void setSubPaginati(boolean subPaginati) {
		this.subPaginati = subPaginati;
	}
	public DatiOpzionaliElencoSubTuttiConSoloGliIds getDatiOpzionaliElencoSubTuttiConSoloGliIds() {
		return datiOpzionaliElencoSubTuttiConSoloGliIds;
	}
	public void setDatiOpzionaliElencoSubTuttiConSoloGliIds(
			DatiOpzionaliElencoSubTuttiConSoloGliIds datiOpzionaliElencoSubTuttiConSoloGliIds) {
		this.datiOpzionaliElencoSubTuttiConSoloGliIds = datiOpzionaliElencoSubTuttiConSoloGliIds;
	}
	public boolean isEscludiSubAnnullati() {
		return escludiSubAnnullati;
	}
	public void setEscludiSubAnnullati(boolean escludiSubAnnullati) {
		this.escludiSubAnnullati = escludiSubAnnullati;
	}
	public boolean isPaginazioneSuDatiMinimi() {
		return paginazioneSuDatiMinimi;
	}
	public void setPaginazioneSuDatiMinimi(boolean paginazioneSuDatiMinimi) {
		this.paginazioneSuDatiMinimi = paginazioneSuDatiMinimi;
	}
	public String getFiltroSubSoloInQuestoStato() {
		return filtroSubSoloInQuestoStato;
	}
	public void setFiltroSubSoloInQuestoStato(String filtroSubSoloInQuestoStato) {
		this.filtroSubSoloInQuestoStato = filtroSubSoloInQuestoStato;
	}
	public DatiOpzionaliCapitoli getDatiOpzionaliCapitoli() {
		return datiOpzionaliCapitoli;
	}
	public void setDatiOpzionaliCapitoli(DatiOpzionaliCapitoli datiOpzionaliCapitoli) {
		this.datiOpzionaliCapitoli = datiOpzionaliCapitoli;
	}
	/**
	 * @return the caricaFlagPresenteStoricizzazione
	 */
	public boolean isCaricaFlagPresenteStoricizzazioneNelBilancio() {
		return caricaFlagPresenteStoricizzazioneNelBilancio;
	}
	/**
	 * @param caricaFlagPresenteStoricizzazione the caricaFlagPresenteStoricizzazione to set
	 */
	public void setCaricaFlagPresenteStoricizzazioneNelBilancio(boolean caricaFlagPresenteStoricizzazioneNelBilancio) {
		this.caricaFlagPresenteStoricizzazioneNelBilancio = caricaFlagPresenteStoricizzazioneNelBilancio;
	}
	
	
	
}
