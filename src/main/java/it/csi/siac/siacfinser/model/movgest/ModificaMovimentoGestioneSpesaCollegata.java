/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.movgest;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.SubAccertamento;

/**
 * ModificaMovimentoGestioneSpesa
 * 
 */

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ModificaMovimentoGestioneSpesaCollegata extends ModificaMovimentoGestione {
	
	private static final long serialVersionUID = 2965925009689538534L;

	
    private Accertamento accertamento;
    private SubAccertamento subAccertamento;
	  
	// attributi momentanei per riconoscere i padri delle modifiche
	private Integer uidAccertamento;
	private Integer uidSubAccertamento;
	private Integer numeroSubAccertamento;
	
	private ClassificatoreGenerico motivoModificaEntrata;
	
	
	private ModificaMovimentoGestioneSpesa  modificaMovimentoGestioneSpesa;
	private ModificaMovimentoGestioneEntrata  modificaMovimentoGestioneEntrata;
	 
		
	private boolean  vincoloEsplicito;
		
	private BigDecimal importoResiduoCollegare;
	private BigDecimal importoCollegamento;
	private BigDecimal importoMaxCollegabile;
	
	/**
	 * @return the importoResiduoCollegare
	 */
	public BigDecimal getImportoResiduoCollegare() {
		return importoResiduoCollegare;
	}

	/**
	 * @param importoResiduoCollegare the importoResiduoCollegare to set
	 */
	public void setImportoResiduoCollegare(BigDecimal importoResiduoCollegare) {
		this.importoResiduoCollegare = importoResiduoCollegare;
	}

	/**
	 * @return the importoCollegamento
	 */
	public BigDecimal getImportoCollegamento() {
		return importoCollegamento;
	}

	/**
	 * @param importoCollegamento the importoCollegamento to set
	 */
	public void setImportoCollegamento(BigDecimal importoCollegamento) {
		this.importoCollegamento = importoCollegamento;
	}

	/**
	 * @return the importoMaxCollegabile
	 */
	public BigDecimal getImportoMaxCollegabile() {
		return importoMaxCollegabile;
	}

	/**
	 * @param importoMaxCollegabile the importoMaxCollegabile to set
	 */
	public void setImportoMaxCollegabile(BigDecimal importoMaxCollegabile) {
		this.importoMaxCollegabile = importoMaxCollegabile;
	}
	

	/**
	 * @return the modificaMovimentoGestioneSpesa
	 */
	public ModificaMovimentoGestioneSpesa getModificaMovimentoGestioneSpesa() {
		return modificaMovimentoGestioneSpesa;
	}

	/**
	 * @param modificaMovimentoGestioneSpesa the modificaMovimentoGestioneSpesa to set
	 */
	public void setModificaMovimentoGestioneSpesa(ModificaMovimentoGestioneSpesa modificaMovimentoGestioneSpesa) {
		this.modificaMovimentoGestioneSpesa = modificaMovimentoGestioneSpesa;
	}




	private boolean riepilogoAutomatiche=false;
	private int numeroModificheAutomatiche;

	public Accertamento getAccertamento() {
		return accertamento;
	}

	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}

	public SubAccertamento getSubAccertamento() {
		return subAccertamento;
	}

	public void setSubAccertamento(SubAccertamento subAccertamento) {
		this.subAccertamento = subAccertamento;
	}

	public Integer getUidAccertamento() {
		return uidAccertamento;
	}

	public void setUidAccertamento(Integer uidAccertamento) {
		this.uidAccertamento = uidAccertamento;
	}

	public Integer getUidSubAccertamento() {
		return uidSubAccertamento;
	}

	public void setUidSubAccertamento(Integer uidSubAccertamento) {
		this.uidSubAccertamento = uidSubAccertamento;
	}

	public Integer getNumeroSubAccertamento() {
		return numeroSubAccertamento;
	}

	public void setNumeroSubAccertamento(Integer numeroSubAccertamento) {
		this.numeroSubAccertamento = numeroSubAccertamento;
	}

	public ClassificatoreGenerico getMotivoModificaEntrata() {
		return motivoModificaEntrata;
	}

	public void setMotivoModificaEntrata(
			ClassificatoreGenerico motivoModificaEntrata) {
		this.motivoModificaEntrata = motivoModificaEntrata;
	}

	public boolean isRiepilogoAutomatiche() {
		return riepilogoAutomatiche;
	}

	public void setRiepilogoAutomatiche(boolean riepilogoAutomatiche) {
		this.riepilogoAutomatiche = riepilogoAutomatiche;
	}

	public int getNumeroModificheAutomatiche() {
		return numeroModificheAutomatiche;
	}

	public void setNumeroModificheAutomatiche(int numeroModificheAutomatiche) {
		this.numeroModificheAutomatiche = numeroModificheAutomatiche;
	}

	/**
	 * @return the vincoloEsplicito
	 */
	public boolean isVincoloEsplicito() {
		return vincoloEsplicito;
	}

	/**
	 * @param vincoloEsplicito the vincoloEsplicito to set
	 */
	public void setVincoloEsplicito(boolean vincoloEsplicito) {
		this.vincoloEsplicito = vincoloEsplicito;
	}

	/**
	 * @return the modificaMovimentoGestioneEntrata
	 */
	public ModificaMovimentoGestioneEntrata getModificaMovimentoGestioneEntrata() {
		return modificaMovimentoGestioneEntrata;
	}

	/**
	 * @param modificaMovimentoGestioneEntrata the modificaMovimentoGestioneEntrata to set
	 */
	public void setModificaMovimentoGestioneEntrata(ModificaMovimentoGestioneEntrata modificaMovimentoGestioneEntrata) {
		this.modificaMovimentoGestioneEntrata = modificaMovimentoGestioneEntrata;
	}

	
}

