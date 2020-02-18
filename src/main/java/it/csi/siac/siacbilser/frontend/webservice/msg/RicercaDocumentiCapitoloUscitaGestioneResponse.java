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
import it.csi.siac.siacfinser.model.DocumentoDiSpesa;

/**
 * Risposta al metodo
 * BIL.CapitoloUscitaGestioneService.ricercaDoucmentiCapitoloUscitaGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDocumentiCapitoloUscitaGestioneResponse extends
		ServiceResponse {

	private List<DocumentoDiSpesa> listaDocumenti = new ArrayList<DocumentoDiSpesa>();

	public List<DocumentoDiSpesa> getListaDocumenti() {
		return listaDocumenti;
	}

	public void setListaDocumenti(List<DocumentoDiSpesa> listaDocumenti) {
		this.listaDocumenti = listaDocumenti;
	}

}
