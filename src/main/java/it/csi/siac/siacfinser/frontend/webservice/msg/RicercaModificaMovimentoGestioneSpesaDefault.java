/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaModificaMovimentoGestioneSpesaDefault extends ServiceRequest {

	private Accertamento accertamento;
	//SIAC-8609
	private boolean caricaModificheGiaCollegateMaModificabili;

	/**
	 * @return the accertamento
	 */
	public Accertamento getAccertamento() {
		return accertamento;
	}

	/**
	 * @param accertamento the accertamento to set
	 */
	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}

	public boolean isCaricaModificheGiaCollegateMaModificabili() {
		return caricaModificheGiaCollegateMaModificabili;
	}

	public void setCaricaModificheGiaCollegateMaModificabili(boolean caricaModificheGiaCollegateMaModificabili) {
		this.caricaModificheGiaCollegateMaModificabili = caricaModificheGiaCollegateMaModificabili;
	}

	
}
