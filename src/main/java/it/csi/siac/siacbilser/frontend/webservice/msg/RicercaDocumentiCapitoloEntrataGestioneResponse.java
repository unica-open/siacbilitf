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
import it.csi.siac.siacfinser.model.DocumentoDiEntrata;

/**
 * Risposta al metodo
 * BIL.CapitoloEntrataGestioneService.ricercaDocumentiCapitoloEntrataGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDocumentiCapitoloEntrataGestioneResponse extends
		ServiceResponse {

	List<DocumentoDiEntrata> listaDocumentiDiEntrata = new ArrayList<DocumentoDiEntrata>();

	public List<DocumentoDiEntrata> getListaDocumentiDiEntrata() {
		return listaDocumentiDiEntrata;
	}

	public void setListaDocumentiDiEntrata(
			List<DocumentoDiEntrata> listaDocumentiDiEntrata) {
		this.listaDocumentiDiEntrata = listaDocumentiDiEntrata;
	}

}
