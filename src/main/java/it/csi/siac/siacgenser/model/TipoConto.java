/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;

/**
 * Serve a classificare i conti in tipologi che hanno regole di gestione
 * specifiche
 * 
 * valori possibili
 * GE - Generico (default)
 * IVA  - Conti IVA
 * RAT - RATEI
 * RIS   - RISCONTI
 * CLI   - CLIENTE
 * FOR  - FORNITORE
 * 
 * F_AMM - Fondo Ammortamento
 * F_SVA - Fondo Svalutazione crediti
 * F_RIS   - Fondo rischi
 * 
 * CES - Cespiti.
 *
 * @author 1080
 * @version 1.0
 * @created 06-mar-2015 16.32.16
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class TipoConto extends Codifica {
	//SiacDPdceContoTipo
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3373477586368036200L;
	
	private Ente ente;

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

	
	public boolean isTipoCespiti(){
		return "CES".equals(getCodice());
	}



}