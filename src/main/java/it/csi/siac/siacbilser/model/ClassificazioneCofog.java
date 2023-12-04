/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;

/**
 * ClassificazioneCofog
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ClassificazioneCofog extends ClassificatoreGerarchico {

	private static final long serialVersionUID = -210221463462310788L;

	public ClassificazioneCofog() {
		super();
	}

	public ClassificazioneCofog(String codice, String descrizione) {
		super(codice, descrizione);
	}
	
	public Date getDataFineValiditaClassificazioneCofog() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaClassificazioneCofog(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
