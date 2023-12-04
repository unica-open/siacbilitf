/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;

/**
 * Missione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RisorsaAccantonata extends ClassificatoreGenerico {

	/** Per la serializzazione	 */
	private static final long serialVersionUID = 4438512835662025215L;

	
	/**
	 * Instantiates a new disavanzo da debito.
	 */
	public RisorsaAccantonata() {
		super();
	}

	/**
	 * Instantiates a new disavanzo da debito.
	 *
	 * @param codice the codice
	 * @param descrizione the descrizione
	 */
	public RisorsaAccantonata(String codice, String descrizione) {
		super(codice, descrizione);
	}

	
	/**
	 * Gets the data fine validita disavanzo da debito.
	 *
	 * @return the data fine validita disavanzo da debito
	 */
	public Date getDataFineValiditaRisorsaAccantonata() {
		return getDataFineValidita();
	}
	
	/**
	 * Sets the data fine validita disavanzo da debito.
	 *
	 * @param dataFineValidita the new data fine validita disavanzo da debito
	 */
	public void setDataFineValiditaRisorsaAccantonata(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
