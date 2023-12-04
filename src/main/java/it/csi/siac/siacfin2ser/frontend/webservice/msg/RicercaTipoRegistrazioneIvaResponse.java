/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.TipoRegistrazioneIva;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaTipoRegistrazioneIvaResponse extends ServiceResponse {
	
	private List<TipoRegistrazioneIva> listaTipoRegistrazioneIva = new ArrayList<TipoRegistrazioneIva>();

	/**
	 * @return the listaTipoRegistrazioneIva
	 */
	public List<TipoRegistrazioneIva> getListaTipoRegistrazioneIva() {
		return listaTipoRegistrazioneIva;
	}

	/**
	 * @param listaTipoRegistrazioneIva the listaTipoRegistrazioneIva to set
	 */
	public void setListaTipoRegistrazioneIva(List<TipoRegistrazioneIva> listaTipoRegistrazioneIva) {
		this.listaTipoRegistrazioneIva = listaTipoRegistrazioneIva != null ? listaTipoRegistrazioneIva : new ArrayList<TipoRegistrazioneIva>();
	}

}
