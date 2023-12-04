/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.codifiche;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * Classe per il passaggio generalizzato di dati relativi 
 * alle codifiche necessarie al frontend
 * 
 * @author luca.romanello
 *
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class CodificaExtFin extends CodificaFin {
	private static final long serialVersionUID = 1L;

	private String descrizioneEstesa;

	public CodificaExtFin() {
		// Costruttore vuoto
	}

	public CodificaExtFin(Integer id, String descrizione, String codice, String descrizioneEstesa) {
		super(id, descrizione, codice);
		
		this.descrizioneEstesa = descrizioneEstesa;
	}

	
	public String getDescrizioneEstesa() {
		return descrizioneEstesa;
	}

	public void setDescrizioneEstesa(String descrizioneEstesa) {
		this.descrizioneEstesa = descrizioneEstesa;
	}
}
