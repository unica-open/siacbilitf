/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import it.csi.siac.siaccorser.model.Entita;


/**
 * IndirizziSoggetto
 * 
 * @author paolos
 * 
 */
public class IndirizziSoggetto extends Entita {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 5904036533429858118L;
	private boolean principale;
	private boolean avviso;
	
	
	
	public boolean isPrincipale() {
		return principale;
	}
	public void setPrincipale(boolean principale) {
		this.principale = principale;
	}
	public boolean isAvviso() {
		return avviso;
	}
	public void setAvviso(boolean avviso) {
		this.avviso = avviso;
	}
}
