/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.VariazioneImportoCapitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Classe di request per l'inserimento dell'anagrafica della variazione di bilancio
 * @author Pro Logic
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceAnagraficaVariazioneBilancio extends ServiceRequest {
	
	private Boolean invioOrganoAmministrativo;
	private Boolean invioOrganoLegislativo;
	private Boolean caricaResidui;
	
	boolean saltaCheckStanziamentoCassa = false;
	
	
	private VariazioneImportoCapitolo  variazioneImportoCapitolo;

	/**
	 * @return the VariazioneImportoCapitolo
	 */
	public VariazioneImportoCapitolo getVariazioneImportoCapitolo() {
		return variazioneImportoCapitolo;
	}

	/**
	 * @param variazioneImportoCapitolo the variazioneImportoCapitolo to set
	 */
	public void setVariazioneImportoCapitolo(VariazioneImportoCapitolo variazioneImportoCapitolo) {
		this.variazioneImportoCapitolo = variazioneImportoCapitolo;
	}

	/**
	 * @return the invioOrganoAmministrativo
	 */
	public Boolean getInvioOrganoAmministrativo() {
		return invioOrganoAmministrativo;
	}

	/**
	 * @param invioOrganoAmministrativo the invioOrganoAmministrativo to set
	 */
	public void setInvioOrganoAmministrativo(Boolean invioOrganoAmministrativo) {
		this.invioOrganoAmministrativo = invioOrganoAmministrativo;
	}

	/**
	 * @return the invioOrganoLegislativo
	 */
	public Boolean getInvioOrganoLegislativo() {
		return invioOrganoLegislativo;
	}

	/**
	 * @param invioOrganoLegislativo the invioOrganoLegislativo to set
	 */
	public void setInvioOrganoLegislativo(Boolean invioOrganoLegislativo) {
		this.invioOrganoLegislativo = invioOrganoLegislativo;
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
	 * @return the caricaResidui
	 */
	public Boolean getCaricaResidui() {
		return caricaResidui;
	}

	/**
	 * @param caricaResidui the caricaResidui to set
	 */
	public void setCaricaResidui(Boolean caricaResidui) {
		this.caricaResidui = caricaResidui;
	}

}
