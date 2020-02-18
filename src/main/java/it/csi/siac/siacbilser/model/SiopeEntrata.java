/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;

public class SiopeEntrata extends ClassificatoreGerarchico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3621457080279558848L;
	
	private List<SiopeEntrata> figli = new ArrayList<SiopeEntrata>();
	

	public SiopeEntrata() {
		super();
		
	}

	public SiopeEntrata(ClassificatoreGerarchico cg) {
		super(cg);
		
	}

	public SiopeEntrata(String codice, String descrizione) {
		super(codice, descrizione);
		
	}

	public List<SiopeEntrata> getFigli() {
		return figli;
	}

	public void setFigli(List<SiopeEntrata> figli) {
		this.figli = figli;
	}
	
	public Date getDataFineValiditaSiopeEntrata() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaSiopeEntrata(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}
	

	
	
}
