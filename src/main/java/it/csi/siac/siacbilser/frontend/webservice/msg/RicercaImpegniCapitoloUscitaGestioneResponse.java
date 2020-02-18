/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.model.Impegno;

/**
 * Risposta al metodo
 * BIL.CapitoloUscitaGestioneService.ricercaImpegniCapitoloUscitaGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaImpegniCapitoloUscitaGestioneResponse extends
		ServiceResponse {

	private List<Impegno> listaImpegni = new ArrayList<Impegno>();

	public List<Impegno> getListaImpegni() {
		return listaImpegni;
	}

	public void setListaImpegni(List<Impegno> listaImpegni) {
		this.listaImpegni = listaImpegni;
	}

}
