/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.TipoRegistrazioneIva;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaTipoRegistrazioneIva extends ServiceRequest {
	
	private TipoRegistrazioneIva tipoRegistrazioneIva;

	/**
	 * @return the tipoRegistrazioneIva
	 */
	public TipoRegistrazioneIva getTipoRegistrazioneIva() {
		return tipoRegistrazioneIva;
	}

	/**
	 * @param tipoRegistrazioneIva the tipoRegistrazioneIva to set
	 */
	public void setTipoRegistrazioneIva(TipoRegistrazioneIva tipoRegistrazioneIva) {
		this.tipoRegistrazioneIva = tipoRegistrazioneIva;
	}
	
}
