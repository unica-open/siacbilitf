/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model.allegatoattochecklist;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnteExt;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class Checklist extends EntitaEnteExt  {

	private static final long serialVersionUID = 5048967662374069351L;

	private ChecklistOption soggettoCreditore;
	private ChecklistOption sommaDovuta;
	private ChecklistOption causale;
	private ChecklistOption modalitaPagamento;
	private ChecklistOption scadenza;
	private ChecklistOption estremiProvvedimentoDirigenziale;
	private ChecklistOption allegati;
	private ChecklistOption esigibileSpesa;
	private ChecklistOption congruitaSpesaSommaImpegnata;
	private ChecklistOption applicazioneNormativaFiscale;
	private ChecklistOption iva;
	private ChecklistOption entrataVincolata;
	private ChecklistText accertamento;
	private ChecklistText incasso;
	private ChecklistOption cig;
	private ChecklistOption cup;
	private ChecklistOption contributiva;
	private ChecklistOption pubblicazione;
	private ChecklistOption regolaritaContabile;
	
	
	public ChecklistOption getCausale() {
		return causale;
	}

	public void setCausale(ChecklistOption causale) {
		this.causale = causale;
	}

	public ChecklistOption getModalitaPagamento() {
		return modalitaPagamento;
	}

	public void setModalitaPagamento(ChecklistOption modalitaPagamento) {
		this.modalitaPagamento = modalitaPagamento;
	}

	public ChecklistOption getScadenza() {
		return scadenza;
	}

	public void setScadenza(ChecklistOption scadenza) {
		this.scadenza = scadenza;
	}

	public ChecklistOption getEstremiProvvedimentoDirigenziale() {
		return estremiProvvedimentoDirigenziale;
	}

	public void setEstremiProvvedimentoDirigenziale(ChecklistOption estremiProvvedimentoDirigenziale) {
		this.estremiProvvedimentoDirigenziale = estremiProvvedimentoDirigenziale;
	}

	public ChecklistOption getAllegati() {
		return allegati;
	}

	public void setAllegati(ChecklistOption allegati) {
		this.allegati = allegati;
	}

	public ChecklistOption getEsigibileSpesa() {
		return esigibileSpesa;
	}

	public void setEsigibileSpesa(ChecklistOption esigibileSpesa) {
		this.esigibileSpesa = esigibileSpesa;
	}

	public ChecklistOption getCongruitaSpesaSommaImpegnata() {
		return congruitaSpesaSommaImpegnata;
	}

	public void setCongruitaSpesaSommaImpegnata(ChecklistOption congruitaSpesaSommaImpegnata) {
		this.congruitaSpesaSommaImpegnata = congruitaSpesaSommaImpegnata;
	}

	public ChecklistOption getApplicazioneNormativaFiscale() {
		return applicazioneNormativaFiscale;
	}

	public void setApplicazioneNormativaFiscale(ChecklistOption applicazioneNormativaFiscale) {
		this.applicazioneNormativaFiscale = applicazioneNormativaFiscale;
	}

	public ChecklistOption getIva() {
		return iva;
	}

	public void setIva(ChecklistOption iva) {
		this.iva = iva;
	}

	public ChecklistOption getEntrataVincolata() {
		return entrataVincolata;
	}

	public void setEntrataVincolata(ChecklistOption entrataVincolata) {
		this.entrataVincolata = entrataVincolata;
	}



	public ChecklistOption getCig() {
		return cig;
	}

	public void setCig(ChecklistOption cig) {
		this.cig = cig;
	}

	public ChecklistOption getCup() {
		return cup;
	}

	public void setCup(ChecklistOption cup) {
		this.cup = cup;
	}

	public ChecklistOption getContributiva() {
		return contributiva;
	}

	public void setContributiva(ChecklistOption contributiva) {
		this.contributiva = contributiva;
	}

	public ChecklistOption getPubblicazione() {
		return pubblicazione;
	}

	public void setPubblicazione(ChecklistOption pubblicazione) {
		this.pubblicazione = pubblicazione;
	}

	public ChecklistOption getRegolaritaContabile() {
		return regolaritaContabile;
	}

	public void setRegolaritaContabile(ChecklistOption regolaritaContabile) {
		this.regolaritaContabile = regolaritaContabile;
	}

	

	public ChecklistOption getSoggettoCreditore() {
		return soggettoCreditore;
	}

	public void setSoggettoCreditore(ChecklistOption soggettoCreditore) {
		this.soggettoCreditore = soggettoCreditore;
	}

	public ChecklistOption getSommaDovuta() {
		return sommaDovuta;
	}

	public void setSommaDovuta(ChecklistOption sommaDovuta) {
		this.sommaDovuta = sommaDovuta;
	}

	public ChecklistText getAccertamento() {
		return accertamento;
	}

	public void setAccertamento(ChecklistText accertamento) {
		this.accertamento = accertamento;
	}

	public ChecklistText getIncasso() {
		return incasso;
	}

	public void setIncasso(ChecklistText incasso) {
		this.incasso = incasso;
	}
}
