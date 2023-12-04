/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.movgest;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siacfinser.model.codifiche.ClasseSoggetto;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * ModificaMovimentoGestioneSpesa
 * 
 */

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ModificaMovimentoGestioneSpesa extends ModificaMovimentoGestione {
	
	private static final long serialVersionUID = 2965925009689538534L;

    private Impegno impegno;
    private SubImpegno subImpegno;
	  
	// attributi momentanei per riconoscere i padri delle modifiche
	private Integer uidImpegno;
	private Integer uidSubImpegno;
	private Integer numeroSubImpegno;
	
	private ClassificatoreGenerico motivoModificaSpesa;
	//SIAC-7349 Inizio  SR180 FL 02/04/2020
	private List<ModificaMovimentoGestioneSpesaCollegata> listaModificheMovimentoGestioneSpesaCollegata;
	//SIAC-7349 Fine  SR180 FL 02/04/2020
	
	//SIAC-7349 Inizio  SR180 GM 13/07/2020
	private java.math.BigDecimal importoDeltaVincolo;
	//SIAC-7349 Fine  SR180 GM 13/07/2020
	
	//SIAC-6865
	private Boolean flagAggiudicazione;
	private Soggetto soggettoAggiudicazione;
	private ClasseSoggetto classeSoggettoAggiudicazione;
	//SIAC-7838
	private Boolean flagAggiudicazioneSenzaSoggetto;
	
	public Impegno getImpegno() {
		return impegno;
	}

	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

	public SubImpegno getSubImpegno() {
		return subImpegno;
	}

	public void setSubImpegno(SubImpegno subImpegno) {
		this.subImpegno = subImpegno;
	}

	public ClassificatoreGenerico getMotivoModificaSpesa() {
		return motivoModificaSpesa;
	}

	public void setMotivoModificaSpesa(ClassificatoreGenerico motivoModificaSpesa) {
		this.motivoModificaSpesa = motivoModificaSpesa;
	}

	public Integer getUidImpegno() {
		return uidImpegno;
	}

	public void setUidImpegno(Integer uidImpegno) {
		this.uidImpegno = uidImpegno;
	}

	public Integer getUidSubImpegno() {
		return uidSubImpegno;
	}

	public void setUidSubImpegno(Integer uidSubImpegno) {
		this.uidSubImpegno = uidSubImpegno;
	}

	public Integer getNumeroSubImpegno() {
		return numeroSubImpegno;
	}

	public void setNumeroSubImpegno(Integer numeroSubImpegno) {
		this.numeroSubImpegno = numeroSubImpegno;
	}

	/**
	 * @return the listaModificheMovimentoGestioneSpesaCollegata
	 */
	public List<ModificaMovimentoGestioneSpesaCollegata> getListaModificheMovimentoGestioneSpesaCollegata() {
		return listaModificheMovimentoGestioneSpesaCollegata;
	}

	/**
	 * @param listaModificheMovimentoGestioneSpesaCollegata the listaModificheMovimentoGestioneSpesaCollegata to set
	 */
	public void setListaModificheMovimentoGestioneSpesaCollegata(
			List<ModificaMovimentoGestioneSpesaCollegata> listaModificheMovimentoGestioneSpesaCollegata) {
		this.listaModificheMovimentoGestioneSpesaCollegata = listaModificheMovimentoGestioneSpesaCollegata;
	}

	public java.math.BigDecimal getImportoDeltaVincolo() {
		return importoDeltaVincolo;
	}

	public void setImportoDeltaVincolo(java.math.BigDecimal importoDeltaVincolo) {
		this.importoDeltaVincolo = importoDeltaVincolo;
	}	

	/**
	 * @return the flagAggiudicazione
	 */
	public Boolean getFlagAggiudicazione() {
		return flagAggiudicazione;
	}

	/**
	 * @param flagAggiudicazione the flagAggiudicazione to set
	 */
	public void setFlagAggiudicazione(Boolean flagAggiudicazione) {
		this.flagAggiudicazione = flagAggiudicazione;
	}


	/**
	 * @return the soggettoAggiudicazione
	 */
	public Soggetto getSoggettoAggiudicazione() {
		return soggettoAggiudicazione;
	}

	/**
	 * @param soggettoAggiudicazione the soggettoAggiudicazione to set
	 */
	public void setSoggettoAggiudicazione(Soggetto soggettoAggiudicazione) {
		this.soggettoAggiudicazione = soggettoAggiudicazione;
	}

	/**
	 * @return the classeSoggettoAggiudicazione
	 */
	public ClasseSoggetto getClasseSoggettoAggiudicazione() {
		return classeSoggettoAggiudicazione;
	}

	/**
	 * @param classeSoggettoAggiudicazione the classeSoggettoAggiudicazione to set
	 */
	public void setClasseSoggettoAggiudicazione(ClasseSoggetto classeSoggettoAggiudicazione) {
		this.classeSoggettoAggiudicazione = classeSoggettoAggiudicazione;
	}

	public Boolean getFlagAggiudicazioneSenzaSoggetto() {
		return flagAggiudicazioneSenzaSoggetto;
	}

	public void setFlagAggiudicazioneSenzaSoggetto(Boolean flagSenzaSoggetto) {
		this.flagAggiudicazioneSenzaSoggetto = flagSenzaSoggetto;
	}
	
	
	
}
