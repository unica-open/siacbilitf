/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.CapitoloUscitaGestioneService.ricercaVariazioniCapitoloUscitaGestionePerAggiornamentoCapitolo()
 * 
 * @author Marchino Alessandro
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVariazioniCapitoloPerAggiornamentoCapitoloResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "variazioneImportiNumero")
	@XmlElement(name = "numero")
	private List<Integer> variazioneImportiNumero = new ArrayList<Integer>();
	@XmlElementWrapper(name = "variazioneCodificheNumero")
	@XmlElement(name = "numero")
	private List<Integer> variazioneCodificheNumero = new ArrayList<Integer>();
	
	/**
	 * @return the variazioneImportiNumero
	 */
	@XmlTransient
	public List<Integer> getVariazioneImportiNumero() {
		return variazioneImportiNumero;
	}
	/**
	 * @param variazioneImportiNumero the variazioneImportiNumero to set
	 */
	public void setVariazioneImportiNumero(List<Integer> variazioneImportiNumero) {
		this.variazioneImportiNumero = variazioneImportiNumero != null ? variazioneImportiNumero : new ArrayList<Integer>();
	}
	/**
	 * @return the variazioneCodificheNumero
	 */
	@XmlTransient
	public List<Integer> getVariazioneCodificheNumero() {
		return variazioneCodificheNumero;
	}
	/**
	 * @param variazioneCodificheNumero the variazioneCodificheNumero to set
	 */
	public void setVariazioneCodificheNumero(List<Integer> variazioneCodificheNumero) {
		this.variazioneCodificheNumero = variazioneCodificheNumero != null ? variazioneCodificheNumero : new ArrayList<Integer>();
	}
	/**
	 * @return the numeroVariazioniImporti
	 */
	public int getNumeroVariazioniImporti() {
		return getVariazioneImportiNumero().size();
	}
	/**
	 * @return the numeroVariazioniCodifiche
	 */
	public int getNumeroVariazioniCodifiche() {
		return getVariazioneCodificheNumero().size();
	}
	
}
