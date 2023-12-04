/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class ControlloImportiImpegniVincolati  extends ServiceRequest {

	private List<Integer> listaAllegatoAttoId = new ArrayList<Integer>();

	/**
	 * @return the listaAllegatoAttoId
	 */
	public List<Integer> getListaAllegatoAttoId() {
		return listaAllegatoAttoId;
	}

	/**
	 * @param listaAllegatoAttoId the listaAllegatoAttoId to set
	 */
	public void setListaAllegatoAttoId(List<Integer> listaAllegatoAttoId) {
		this.listaAllegatoAttoId = listaAllegatoAttoId;
	}

	
}
