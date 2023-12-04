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
import it.csi.siac.siacfin2ser.model.AliquotaIva;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaAliquotaIvaResponse extends ServiceResponse {
	
	private List<AliquotaIva> listaAliquotaIva = new ArrayList<AliquotaIva>();

	/**
	 * @return the listaAliquotaIva
	 */
	public List<AliquotaIva> getListaAliquotaIva() {
		return listaAliquotaIva;
	}

	/**
	 * @param listaAliquotaIva the listaAliquotaIva to set
	 */
	public void setListaAliquotaIva(List<AliquotaIva> listaAliquotaIva) {
		this.listaAliquotaIva = listaAliquotaIva != null ? listaAliquotaIva : new ArrayList<AliquotaIva>();
	}
	
}
