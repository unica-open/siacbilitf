/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneSpesaCollegata;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class BaseModificaMovimentoGestioneSpesaResponse extends ServiceResponse {
	
	List<ModificaMovimentoGestioneSpesaCollegata> listaModificheMovimentoGestioneSpesaCollegata;

	public List<ModificaMovimentoGestioneSpesaCollegata> getListaModificheMovimentoGestioneSpesaCollegata() {
		return listaModificheMovimentoGestioneSpesaCollegata;
	}

	public void setListaModificheMovimentoGestioneSpesaCollegata(
			List<ModificaMovimentoGestioneSpesaCollegata> listaModificheMovimentoGestioneSpesaCollegata) {
		this.listaModificheMovimentoGestioneSpesaCollegata = listaModificheMovimentoGestioneSpesaCollegata;
	}
}
