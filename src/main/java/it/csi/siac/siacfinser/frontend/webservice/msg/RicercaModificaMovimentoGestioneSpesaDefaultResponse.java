/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneSpesaCollegata;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaModificaMovimentoGestioneSpesaDefaultResponse extends BaseModificaMovimentoGestioneSpesaResponse {
	
	private List<ModificaMovimentoGestioneSpesaCollegata> listaModificheSpesaGiaCollegateConResiduoACollegareZero = new ArrayList<ModificaMovimentoGestioneSpesaCollegata>();

	public List<ModificaMovimentoGestioneSpesaCollegata> getListaModificheSpesaGiaCollegateConResiduoACollegareZero() {
		return listaModificheSpesaGiaCollegateConResiduoACollegareZero;
	}

	public void setListaModificheSpesaGiaCollegateConResiduoACollegareZero(
			List<ModificaMovimentoGestioneSpesaCollegata> listaModificheSpesaGiaCollegateConResiduoACollegareZero) {
		this.listaModificheSpesaGiaCollegateConResiduoACollegareZero = listaModificheSpesaGiaCollegateConResiduoACollegareZero;
	}

	
	public void addModificaSpesaGiaCollegateConResiduoACollegareZero(ModificaMovimentoGestioneSpesaCollegata toAdd) {
		if(getListaModificheSpesaGiaCollegateConResiduoACollegareZero() == null) {
			setListaModificheSpesaGiaCollegateConResiduoACollegareZero(new ArrayList<ModificaMovimentoGestioneSpesaCollegata>());
		}
		getListaModificheSpesaGiaCollegateConResiduoACollegareZero().add(toAdd);
	}
}
