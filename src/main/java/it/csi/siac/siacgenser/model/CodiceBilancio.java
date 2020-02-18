/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;

/**
 * Rappresentano le voci dei prospetti del Conto economico e del Conto dello Stato
 * del Patrimonio.
 * Servono a classificare i conti al fine della loro rappresentazione nel
 * Rendiconto.
 * 
 * Il Conto economico prevede una classificazione delle sue voci a 4 livelli,  lo
 * Stato patrimoniale a 7 livelli.
 * @author 1080
 * @version 1.0
 * @created 06-mar-2015 16.32.13
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class CodiceBilancio extends ClassificatoreGerarchico {

	
	private static final long serialVersionUID = 7141045057555889899L;
	
	private List<CodiceBilancio> figli = new ArrayList<CodiceBilancio>();

	/**
	 * @return the figli
	 */
	public List<CodiceBilancio> getFigli() {
		return figli;
	}

	/**
	 * @param figli the figli to set
	 */
	public void setFigli(List<CodiceBilancio> figli) {
		this.figli = figli != null ? figli : new ArrayList<CodiceBilancio>();
	}
	
	/**
	 * Adds the figlio.
	 *
	 * @param codiceBilancio the codice bilancio
	 */
	public void addFiglio(CodiceBilancio codiceBilancio) {
		figli.add(codiceBilancio);

	}
	
	public String getTesto(){
		return getCodice() + " - " + getDescrizione();
	}


}