/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class TipoCausale extends Codifica {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8295799128690799692L;
	
	private TipoFamigliaCausale tipoFamigliaCausale;

	/**
	 * @return the tipoFamigliaCausale
	 */
	public TipoFamigliaCausale getTipoFamigliaCausale() {
		return tipoFamigliaCausale;
	}

	/**
	 * @param tipoFamigliaCausale the tipoFamigliaCausale to set
	 */
	public void setTipoFamigliaCausale(TipoFamigliaCausale tipoFamigliaCausale) {
		this.tipoFamigliaCausale = tipoFamigliaCausale;
	}
	
	
	

}
