/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model.allegatoattochecklist;

public class ChecklistDelegate {

	private Checklist checklist;

	public ChecklistDelegate(Checklist checklist) {
		this.checklist = checklist;
	}

	public void setCausale(String label) {
		checklist.setCausale(new ChecklistOption(label));
	}

	public void setModalitaPagamento(String label) {
		checklist.setModalitaPagamento(new ChecklistOption(label));
	}

	public void setScadenza(String label) {
		checklist.setScadenza(new ChecklistOption(label));
	}

	public void setEstremiProvvedimentoDirigenziale(String label) {
		checklist.setEstremiProvvedimentoDirigenziale(new ChecklistOption(label));
	}

	public void setAllegati(String label) {
		checklist.setAllegati(new ChecklistOption(label));
	}

	public void setEsigibileSpesa(String label) {
		checklist.setEsigibileSpesa(new ChecklistOption(label));
	}

	public void setCongruitaSpesaSommaImpegnata(String label) {
		checklist.setCongruitaSpesaSommaImpegnata(new ChecklistOption(label));
	}

	public void setApplicazioneNormativaFiscale(String label) {
		checklist.setApplicazioneNormativaFiscale(new ChecklistOption(label));
	}

	public void setIva(String label) {
		checklist.setIva(new ChecklistOption(label));
	}

	public void setEntrataVincolata(String label) {
		checklist.setEntrataVincolata(new ChecklistOption(label));
	}

	public void setCig(String label) {
		checklist.setCig(new ChecklistOption(label));
	}

	public void setCup(String label) {
		checklist.setCup(new ChecklistOption(label));
	}

	public void setContributiva(String label) {
		checklist.setContributiva(new ChecklistOption(label));
	}

	public void setPubblicazione(String label) {
		checklist.setPubblicazione(new ChecklistOption(label));
	}

	public void setRegolaritaContabile(String label) {
		checklist.setRegolaritaContabile(new ChecklistOption(label));
	}

	public void setSoggettoCreditore(String label) {
		checklist.setSoggettoCreditore(new ChecklistOption(label));
	}

	public void setSommaDovuta(String label) {
		checklist.setSommaDovuta(new ChecklistOption(label));
	}

	public void setAccertamento(String label) {
		checklist.setAccertamento(new ChecklistText(label));
	}

	public void setIncasso(String label) {
		checklist.setIncasso(new ChecklistText(label));
	}
}
