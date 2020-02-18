/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;

/**
 * Risposta al metodo FIN.ImpegnoService.aggiornaImpegno()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaImpegnoResponse extends ServiceResponse {

	private Impegno impegno;
	
	private RegistrazioneMovFin registrazioneMovFinFIN;

	public Impegno getImpegno() {
		return impegno;
	}

	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

	/**
	 * @return the registrazioneMovFinInserita
	 */
	public RegistrazioneMovFin getRegistrazioneMovFinFIN() {
		return registrazioneMovFinFIN;
	}

	/**
	 * @param registrazioneMovFinInserita the registrazioneMovFinInserita to set
	 */
	public void setRegistrazioneMovFinFIN(RegistrazioneMovFin registrazioneMovFinFIN) {
		this.registrazioneMovFinFIN = registrazioneMovFinFIN;
	}
	
}
