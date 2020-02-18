/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DettaglioOnere;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaOnereByDocumentoSpesaResponse extends ServiceResponse {

	
	private List<DettaglioOnere> listaDettagliOnere = new ArrayList<DettaglioOnere>();

	/**
	 * @return the listaDettagliOnere
	 */
	public List<DettaglioOnere> getListaDettagliOnere() {
		return listaDettagliOnere;
	}

	/**
	 * @param listaDettagliOnere the listaDettagliOnere to set
	 */
	public void setListaDettagliOnere(List<DettaglioOnere> listaDettagliOnere) {
		this.listaDettagliOnere = listaDettagliOnere != null ? listaDettagliOnere : new ArrayList<DettaglioOnere>();
	}
	
	
}
