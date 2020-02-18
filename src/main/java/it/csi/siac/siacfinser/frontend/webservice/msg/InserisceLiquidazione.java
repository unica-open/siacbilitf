/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;



import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;

/**
 *  
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceLiquidazione extends ServiceRequest {
	
	private Ente ente;
	private Liquidazione liquidazione;
	private Bilancio bilancio;
	private String annoEsercizio;
	
	private boolean registraGen = true;
	
	private boolean caricaDatiLiquidazione = true;
	
	//SIAC-5333
	private boolean saltaInserimentoPrimaNotaGEN;

	/**
	 * Gets the ente.
	 *
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	
	/**
	 * Sets the ente.
	 *
	 * @param ente the new ente
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	/**
	 * Gets the liquidazione.
	 *
	 * @return the liquidazione
	 */
	public Liquidazione getLiquidazione() {
		return liquidazione;
	}

	/**
	 * Sets the liquidazione.
	 *
	 * @param liquidazione the new liquidazione
	 */
	public void setLiquidazione(Liquidazione liquidazione) {
		this.liquidazione = liquidazione;
	}

	/**
	 * Gets the bilancio.
	 *
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * Sets the bilancio.
	 *
	 * @param bilancio the new bilancio
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * Gets the anno esercizio.
	 *
	 * @return the anno esercizio
	 */
	public String getAnnoEsercizio() {
		return annoEsercizio;
	}

	/**
	 * Sets the anno esercizio.
	 *
	 * @param annoEsercizio the new anno esercizio
	 */
	public void setAnnoEsercizio(String annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	/**
	 * Checks if is registra gen.
	 *
	 * @return true, if is registra gen
	 */
	public boolean isRegistraGen() {
		return registraGen;
	}

	/**
	 * Sets the registra gen.
	 *
	 * @param registraGen the new registra gen
	 */
	@XmlTransient
	public void setRegistraGen(boolean registraGen) {
		this.registraGen = registraGen;
	}

	/**
	 * Checks if is carica dati liquidazione.
	 *
	 * @return true, if is carica dati liquidazione
	 */
	public boolean isCaricaDatiLiquidazione() {
		return caricaDatiLiquidazione;
	}

	/**
	 * Sets the carica dati liquidazione.
	 *
	 * @param caricaDatiLiquidazione the new carica dati liquidazione
	 */
	@XmlTransient
	public void setCaricaDatiLiquidazione(boolean caricaDatiLiquidazione) {
		this.caricaDatiLiquidazione = caricaDatiLiquidazione;
	}

	/**
	 * Checks if is salta inserimento prima nota GEN.
	 *
	 * @return the saltaInserimentoPrimaNotaGEN
	 */
	public boolean isSaltaInserimentoPrimaNotaGEN() {
		return saltaInserimentoPrimaNotaGEN;
	}

	/**
	 * Sets the salta inserimento prima nota GEN.
	 *
	 * @param saltaInserimentoPrimaNotaGEN the saltaInserimentoPrimaNotaGEN to set
	 */
	public void setSaltaInserimentoPrimaNotaGEN(boolean saltaInserimentoPrimaNotaGEN) {
		this.saltaInserimentoPrimaNotaGEN = saltaInserimentoPrimaNotaGEN;
	}
	
	
	
}