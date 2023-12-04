/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import it.csi.siac.siacbilser.model.Ambito;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;

import javax.xml.bind.annotation.XmlType;

/**
 * definisce le famiglie di Piani dei Conti
 * 
 * - CE - Costi di esercizio
 * - RE - Ricavi di esercizio
 * - AP - Attivo patrimoniale
 * - PP - Passivo patrimoniale
 * - OP - Conti d'ordine Passività
 * - OA - Conti d'ordine Attività
 * - EP - Conti epilogativi
 * @author 1080
 * @version 1.0
 * @created 06-mar-2015 16.32.13
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class ClassePiano extends Codifica {
	//SiacDPdceFam

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3486119354839355613L;
	
	
	private Ente ente;
	private SegnoConto segnoConto;
	private Integer livelloDiLegge;
	
	// Lotto N
	private Ambito ambito;
	
	/**
	 * @return the operazioneSegnoConto
	 */
	public SegnoConto getSegnoConto() {
		return this.segnoConto;
	}

	/**
	 * @param operazioneSegnoConto the operazioneSegnoConto to set
	 */
	public void setSegnoConto(SegnoConto segnoConto) {
		this.segnoConto = segnoConto;
	}
	
	/**
	 * @return the operazioneSegnoConto
	 */
	public String getSegnoContoString() {
		return segnoConto!=null?segnoConto.name():null;
	}

	/**
	 * @param segnoConto the operazioneSegnoConto to set
	 * 
	 * @throws IllegalArgumentException se il codice non esiste nell'enum OperazioneSegnoConto.
	 */
	public void setSegnoContoString(String segnoContoString) {
		if(segnoContoString==null){
			this.segnoConto = null;
		} else {
			this.segnoConto = SegnoConto.fromCodice(segnoContoString);
		}
	}

	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	/**
	 * @return the livelloDiLegge
	 */
	public Integer getLivelloDiLegge() {
		return livelloDiLegge;
	}

	/**
	 * @param livelloDiLegge the livelloDiLegge to set
	 */
	public void setLivelloDiLegge(Integer livelloDiLegge) {
		this.livelloDiLegge = livelloDiLegge;
	}

	/**
	 * @return the ambito
	 */
	public Ambito getAmbito() {
		return ambito;
	}

	/**
	 * @param ambito the ambito to set
	 */
	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}
	
	

}