/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;

/**
 * Risposta al metodo FIN.AccertamentoService.aggiornaAccertamento()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaAccertamentoResponse extends ServiceResponse {

	private Accertamento accertamento;
	
	private RegistrazioneMovFin registrazioneMovFinFIN;

	public Accertamento getAccertamento() {
		return accertamento;
	}

	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}

	/**
	 * @return the registrazioneMovFinFIN
	 */
	public RegistrazioneMovFin getRegistrazioneMovFinFIN() {
		return registrazioneMovFinFIN;
	}

	/**
	 * @param registrazioneMovFinFIN the registrazioneMovFinFIN to set
	 */
	public void setRegistrazioneMovFinFIN(RegistrazioneMovFin registrazioneMovFinFIN) {
		this.registrazioneMovFinFIN = registrazioneMovFinFIN;
	}
	
	

}
