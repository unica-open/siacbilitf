/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.TipoRegistroIva;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaTipoRegistroIva extends ServiceRequest {
	
	private TipoRegistroIva tipoRegistroIva;

	/**
	 * @return the tipoRegistroIva
	 */
	public TipoRegistroIva getTipoRegistroIva() {
		return tipoRegistroIva;
	}

	/**
	 * @param tipoRegistroIva the tipoRegistroIva to set
	 */
	public void setTipoRegistroIva(TipoRegistroIva tipoRegistroIva) {
		this.tipoRegistroIva = tipoRegistroIva;
	}

}
