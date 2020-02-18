/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.movgest;

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
public class ModificaMovimentoGestioneEntrata extends ModificaMovimentoGestione {
	
	private static final long serialVersionUID = 2965925009689538534L;

    private Accertamento accertamento;
    private SubAccertamento subAccertamento;
	  
	// attributi momentanei per riconoscere i padri delle modifiche
	private Integer uidAccertamento;
	private Integer uidSubAccertamento;
	private Integer numeroSubAccertamento;
	
	private ClassificatoreGenerico motivoModificaEntrata;
	
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
	
}
