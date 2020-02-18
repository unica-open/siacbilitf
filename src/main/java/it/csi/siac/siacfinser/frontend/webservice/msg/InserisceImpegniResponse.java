/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;

/**
 * Risposta al metodo FIN.MovimentoGestioneService.inserisceImpegni()
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceImpegniResponse extends ServiceResponse {

	private List<Impegno> elencoImpegniInseriti;
	private RegistrazioneMovFin registrazioneMovFinFIN;

	/**
	 * Gets the elenco impegni inseriti.
	 *
	 * @return the elenco impegni inseriti
	 */
	public List<Impegno> getElencoImpegniInseriti() {
		return elencoImpegniInseriti;
	}

	/**
	 * Sets the elenco impegni inseriti.
	 *
	 * @param elencoImpegniInseriti the new elenco impegni inseriti
	 */
	public void setElencoImpegniInseriti(List<Impegno> elencoImpegniInseriti) {
		this.elencoImpegniInseriti = elencoImpegniInseriti;
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
