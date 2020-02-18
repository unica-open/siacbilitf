/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;

public class SiopeSpesa extends ClassificatoreGerarchico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3621457080279558848L;
	
	private List<SiopeSpesa> figli = new ArrayList<SiopeSpesa>();
	

	public SiopeSpesa() {
		super();
		
	}

	public SiopeSpesa(ClassificatoreGerarchico cg) {
		super(cg);
		
	}

	public SiopeSpesa(String codice, String descrizione) {
		super(codice, descrizione);
		
	}

	public List<SiopeSpesa> getFigli() {
		return figli;
	}

	public void setFigli(List<SiopeSpesa> figli) {
		this.figli = figli;
	}
	
	public Date getDataFineValiditaSiopeSpesa() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaSiopeSpesa(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

	
	
}
