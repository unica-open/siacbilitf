/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.TipoRegistroIva;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaTipoRegistroIvaResponse extends ServiceResponse {
	
	private List<TipoRegistroIva> listaTipoRegistroIva = new ArrayList<TipoRegistroIva>();

	/**
	 * @return the listaTipoRegistroIva
	 */
	public List<TipoRegistroIva> getListaTipoRegistroIva() {
		return listaTipoRegistroIva;
	}

	/**
	 * @param listaTipoRegistroIva the listaTipoRegistroIva to set
	 */
	public void setListaTipoRegistroIva(List<TipoRegistroIva> listaTipoRegistroIva) {
		this.listaTipoRegistroIva = listaTipoRegistroIva;
	}

	
}
