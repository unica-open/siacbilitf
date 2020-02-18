/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;

/**
 * Risposta al metodo FIN.MovimentoGestioneService.inserisceAccertamenti()
 * 
 * @author
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceAccertamentiResponse extends ServiceResponse {

	private List<Accertamento> elencoAccertamentiInseriti;
	private RegistrazioneMovFin registrazioneMovFinFIN;

	public List<Accertamento> getElencoAccertamentiInseriti() {
		return elencoAccertamentiInseriti;
	}

	public void setElencoAccertamentiInseriti(List<Accertamento> elencoAccertamentiInseriti) {
		this.elencoAccertamentiInseriti = elencoAccertamentiInseriti;
	}

	/**
	 * Gets the registrazione mov fin FIN.
	 *
	 * @return the registrazioneMovFinFIN
	 */
	public RegistrazioneMovFin getRegistrazioneMovFinFIN() {
		return registrazioneMovFinFIN;
	}

	/**
	 * Sets the registrazione mov fin FIN.
	 *
	 * @param registrazioneMovFinFIN the registrazioneMovFinFIN to set
	 */
	public void setRegistrazioneMovFinFIN(RegistrazioneMovFin registrazioneMovFinFIN) {
		this.registrazioneMovFinFIN = registrazioneMovFinFIN;
	}
	
}
