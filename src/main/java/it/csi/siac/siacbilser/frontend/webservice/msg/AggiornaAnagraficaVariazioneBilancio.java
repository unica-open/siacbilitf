/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.VariazioneImportoCapitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaAnagraficaVariazioneBilancio extends ServiceRequest {
	
	//Fields dedicati alla gestione del processo
	private String idAttivita;		
	private Boolean invioOrganoAmministrativo;
	private Boolean invioOrganoLegislativo;
	private Boolean annullaVariazione;	
	private Boolean evolviProcesso = Boolean.FALSE;
	
	boolean saltaCheckStanziamentoCassa = false;
	
	//Variazione da aggiornare
	private VariazioneImportoCapitolo  variazioneImportoCapitolo;
	private boolean saltaCheckNecessarioAttoAmministrativoVariazioneDiBilancio;
	
	
	//SIAC-6884
	private boolean regionePiemonte;
	private boolean aggiornamentoDaVariazioneDecentrata;
	private String aggiornamentoVariazionieDecentrataFromAction;
	
	/**
	 * @return the aggiornamentoVariazionieDecentrataFromAction
	 */
	public String getAggiornamentoVariazionieDecentrataFromAction() {
		return aggiornamentoVariazionieDecentrataFromAction;
	}

	/**
	 * @param aggiornamentoVariazionieDecentrataFromAction the aggiornamentoVariazionieDecentrataFromAction to set
	 */
	public void setAggiornamentoVariazionieDecentrataFromAction(String aggiornamentoVariazionieDecentrataFromAction) {
		this.aggiornamentoVariazionieDecentrataFromAction = aggiornamentoVariazionieDecentrataFromAction;
	}

	public boolean isRegionePiemonte() {
		return regionePiemonte;
	}

	public void setRegionePiemonte(boolean regionePiemonte) {
		this.regionePiemonte = regionePiemonte;
	}

	/**
	 * Gets the variazione importo capitolo.
	 *
	 * @return the variazione importo capitolo
	 */
	public VariazioneImportoCapitolo getVariazioneImportoCapitolo() {
		return variazioneImportoCapitolo;
	}

	/**
	 * Sets the variazione importo capitolo.
	 *
	 * @param variazioneImportoCapitolo the new variazione importo capitolo
	 */
	public void setVariazioneImportoCapitolo(VariazioneImportoCapitolo variazioneImportoCapitolo) {
		this.variazioneImportoCapitolo = variazioneImportoCapitolo;
	}

	/**
	 * Gets the invio organo amministrativo.
	 *
	 * @return the invio organo amministrativo
	 */
	public Boolean getInvioOrganoAmministrativo() {
		return invioOrganoAmministrativo;
	}

	/**
	 * Sets the invio organo amministrativo.
	 *
	 * @param invioOrganoAmministrativo the new invio organo amministrativo
	 */
	public void setInvioOrganoAmministrativo(Boolean invioOrganoAmministrativo) {
		this.invioOrganoAmministrativo = invioOrganoAmministrativo;
	}

	/**
	 * Gets the invio organo legislativo.
	 *
	 * @return the invio organo legislativo
	 */
	public Boolean getInvioOrganoLegislativo() {
		return invioOrganoLegislativo;
	}

	/**
	 * Sets the invio organo legislativo.
	 *
	 * @param invioOrganoLegislativo the new invio organo legislativo
	 */
	public void setInvioOrganoLegislativo(Boolean invioOrganoLegislativo) {
		this.invioOrganoLegislativo = invioOrganoLegislativo;
	}

	/**
	 * Gets the annulla variazione.
	 *
	 * @return the annulla variazione
	 */
	public Boolean getAnnullaVariazione() {
		return annullaVariazione;
	}

	/**
	 * Sets the annulla variazione.
	 *
	 * @param annullaVariazione the new annulla variazione
	 */
	public void setAnnullaVariazione(Boolean annullaVariazione) {
		this.annullaVariazione = annullaVariazione;
	}

	/**
	 * Gets the evolvi processo.
	 *
	 * @return the evolvi processo
	 */
	public Boolean getEvolviProcesso() {
		if(evolviProcesso==null){
			evolviProcesso = Boolean.FALSE;
		}
		return evolviProcesso;
	}

	/**
	 * Sets the evolvi processo.
	 *
	 * @param evolviProcesso the new evolvi processo
	 */
	public void setEvolviProcesso(Boolean evolviProcesso) {
		this.evolviProcesso = evolviProcesso;
	}

	/**
	 * Id dell'istanza di processo a cui è associata la variazione di bilancio.
	 *
	 * @return the id attivita
	 */
	public String getIdAttivita() {
		return idAttivita;
	}

	/**
	 * Id dell'istanza di processo a cui è associata la variazione di bilancio.
	 * 
	 * @param idAttivita
	 */
	public void setIdAttivita(String idAttivita) {
		this.idAttivita = idAttivita;
	}

	/**
	 * @return the saltaCheckStanziamentoCassa
	 */
	public boolean isSaltaCheckStanziamentoCassa() {
		return saltaCheckStanziamentoCassa;
	}

	/**
	 * @param saltaCheckStanziamentoCassa the saltaCheckStanziamentoCassa to set
	 */
	public void setSaltaCheckStanziamentoCassa(boolean saltaCheckStanziamentoCassa) {
		this.saltaCheckStanziamentoCassa = saltaCheckStanziamentoCassa;
	}

	/**
	 * Checks if is salta check necessario atto amministrativo variazione di bilancio.
	 *
	 * @return true, if is salta check necessario atto amministrativo variazione di bilancio
	 */
	public boolean isSaltaCheckNecessarioAttoAmministrativoVariazioneDiBilancio() {
		return this.saltaCheckNecessarioAttoAmministrativoVariazioneDiBilancio;
	}

	/**
	 * Sets the salta check necessario atto amministrativo variazione di bilancio.
	 *
	 * @param saltaCheckNecessarioAttoAmministrativoVariazioneDiBilancio the new salta check necessario atto amministrativo variazione di bilancio
	 */
	public void setSaltaCheckNecessarioAttoAmministrativoVariazioneDiBilancio(boolean saltaCheckNecessarioAttoAmministrativoVariazioneDiBilancio) {
		this.saltaCheckNecessarioAttoAmministrativoVariazioneDiBilancio = saltaCheckNecessarioAttoAmministrativoVariazioneDiBilancio;
	}

	/**
	 * @return the aggiornamentoDaVariazioneDecentrata
	 */
	public boolean isAggiornamentoDaVariazioneDecentrata() {
		return aggiornamentoDaVariazioneDecentrata;
	}

	/**
	 * @param aggiornamentoDaVariazioneDecentrata the aggiornamentoDaVariazioneDecentrata to set
	 */
	public void setAggiornamentoDaVariazioneDecentrata(boolean aggiornamentoDaVariazioneDecentrata) {
		this.aggiornamentoDaVariazioneDecentrata = aggiornamentoDaVariazioneDecentrata;
	}

}
