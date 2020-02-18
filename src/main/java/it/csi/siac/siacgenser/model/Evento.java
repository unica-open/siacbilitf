/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import it.csi.siac.siaccorser.model.Codifica;

import javax.xml.bind.annotation.XmlType;

/**
 * Identifica l'evento collegato a un'entit&agrave; della finanziaria che determina una
 * regstrazione EP.
 * 
 * Valori possibili:
 * - inserisci impegno definitivo
 * - aggiorna impegno con passaggio a definitivo
 * - inserisci modifica positiva di impegno
 * - inserisci modifica negativa di impegno
 * - inserisci accertamento definitivo
 * - aggiorna accertamento con passaggio a definitivo
 * - inserisci modifica positiva di accertamento
 * - inserisci modifica negativa di accertamento
 * - inserisci quota documento
 * - annulla quota documento
 * ...
 * tra gli eventi di tipo : P - prima nota pura  si elencano
 * - GIR - Giroconto
 * -
 * @author 1080
 * @version 1.0
 * @created 06-mar-2015 16.31.24
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class Evento extends Codifica {

	private static final long serialVersionUID = 2972978796381069528L;
	
	private TipoEvento tipoEvento;
	private TipoCollegamento tipoCollegamento;

	
	public Evento() {
		// Costruttore vuoto di default
	}
	
	public Evento(String codice){
		super(codice, null);
	}

	
	/**
	 * @return the tipoEvento
	 */
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	/**
	 * @param tipoEvento the tipoEvento to set
	 */
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	/**
	 * @return the tipoCollegamento
	 */
	public TipoCollegamento getTipoCollegamento() {
		return tipoCollegamento;
	}

	/**
	 * @param tipoCollegamento the tipoCollegamento to set
	 */
	public void setTipoCollegamento(TipoCollegamento tipoCollegamento) {
		this.tipoCollegamento = tipoCollegamento;
	}
	
	


}