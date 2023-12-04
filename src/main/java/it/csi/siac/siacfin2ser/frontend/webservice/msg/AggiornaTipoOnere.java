/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.TipoOnere;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaTipoOnere extends ServiceRequest {
	
	
	private TipoOnere tipoOnere;
	private Integer annoEsercizio;

	/**
	 * @return the tipoOnere
	 */
	public TipoOnere getTipoOnere() {
		return tipoOnere;
	}

	/**
	 * @param tipoOnere the tipoOnere to set
	 */
	public void setTipoOnere(TipoOnere tipoOnere) {
		this.tipoOnere = tipoOnere;
	}

	/**
	 * @return the annoEsercizio
	 */
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	/**
	 * @param annoEsercizio the annoEsercizio to set
	 */
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	
	
	
}
