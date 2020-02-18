/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.soggetto.modpag;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * 
 * @author claudio.picco
 * Classe introdotta implementando la  	SIAC-5156 
 * FIN - CHG 757 - Completamento dettaglio modalita' di pagamento - cessioni e numero d'ordine
 * 
 * Per centralizzare e razionalizzare la costruzione della descrizione della modalita' di pagamento.
 * 
 *
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class DescrizioneInfoModPagSog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String descrizioneArricchita;

	public String getDescrizioneArricchita() {
		return descrizioneArricchita;
	}

	public void setDescrizioneArricchita(String descrizioneArricchita) {
		this.descrizioneArricchita = descrizioneArricchita;
	}
	

}
