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
import it.csi.siac.siacfinser.model.Accertamento;

/**
 * Risposta al metodo BIL.CapitoloEntrataGestioneService.
 * ricercaAccertamentiCapitoloEntrataGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaAccertamentiCapitoloEntrataGestioneResponse extends
		ServiceResponse {

	List<Accertamento> listaAccertamento = new ArrayList<Accertamento>();

	public List<Accertamento> getListaAccertamento() {
		return listaAccertamento;
	}

	public void setListaAccertamento(List<Accertamento> listaAccertamento) {
		this.listaAccertamento = listaAccertamento;
	}

}
