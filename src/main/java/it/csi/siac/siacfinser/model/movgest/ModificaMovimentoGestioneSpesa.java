/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.movgest;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;

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
}
