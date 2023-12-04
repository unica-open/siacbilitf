/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.frontend.webservice.msg.base.ModelDetailFinServiceRequest;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneEntrata;

/**
 * Richiesta al metodo FIN.movimentoGestioneService.ricercaImpegnoPerChiave()
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaModulareModificaMovimentoSpesaCollegata extends ModelDetailFinServiceRequest {
	
	private Accertamento accertamento;
	
	private ModificaMovimentoGestioneEntrata modifica;
	
	public Accertamento getAccertamento() {
		return accertamento;
	}

	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}

	public ModificaMovimentoGestioneEntrata getModifica() {
		return modifica;
	}

	public void setModifica(ModificaMovimentoGestioneEntrata modifica) {
		this.modifica = modifica;
	}

}
