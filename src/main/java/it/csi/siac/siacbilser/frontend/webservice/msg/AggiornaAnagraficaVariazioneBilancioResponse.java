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
import it.csi.siac.siacbilser.model.VariazioneImportoCapitolo;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.VariabileProcesso;

/**
 * The Class AggiornaAnagraficaVariazioneBilancioResponse.
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaAnagraficaVariazioneBilancioResponse extends ServiceResponse {
	
	private VariazioneImportoCapitolo variazioneImportoCapitolo;
	private Boolean isProvvedimentoPresenteDefinitivo = Boolean.FALSE;
	
	//checkImporti
	private Boolean isQuadraturaCorrettaStanziamentoCassa = Boolean.FALSE;
	private Boolean isQuadraturaCorrettaStanziamento = Boolean.FALSE;
	
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	
	private Boolean isAttoAmministrativoVariazioneDiBilancioPresenteSeNecessario = Boolean.FALSE;
	
	// SIAC-6881
	private String idTask;
	private String nomeTask;
	@XmlElementWrapper(name="variabiliDiProcesso")
	@XmlElement(name="variabileDiProcesso")
	private List<VariabileProcesso> variabiliDiProcesso = new ArrayList<VariabileProcesso>();
	
	//SIAC-6884 - checkCodElenchi
	private Boolean isCodiciElenchiCongrui = Boolean.TRUE;
	private Boolean checkVariazioniCapitoloFondinoFailed = Boolean.FALSE;

	public Boolean getIsCodiciElenchiCongrui() {
		return isCodiciElenchiCongrui;
	}

	public void setIsCodiciElenchiCongrui(Boolean isCodiciElenchiCongrui) {
		this.isCodiciElenchiCongrui = isCodiciElenchiCongrui;
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
	 * 
	 * @return true se il controllo della quadratura degli importi ha dato esito positivo.
	 */
	public Boolean getIsQuadraturaCorretta() {
		return Boolean.TRUE.equals(getIsQuadraturaCorrettaStanziamento()) && Boolean.TRUE.equals(getIsQuadraturaCorrettaStanziamentoCassa());
	}

	/**
	 * Gets the checks if is provvedimento presente definitivo.
	 *
	 * @return the checks if is provvedimento presente definitivo
	 */
	public Boolean getIsProvvedimentoPresenteDefinitivo() {
		return isProvvedimentoPresenteDefinitivo;
	}

	/**
	 * Sets the checks if is provvedimento presente definitivo.
	 *
	 * @param isProvvedimentoPresenteDefinitivo the new checks if is provvedimento presente definitivo
	 */
	public void setIsProvvedimentoPresenteDefinitivo(Boolean isProvvedimentoPresenteDefinitivo) {
		this.isProvvedimentoPresenteDefinitivo = isProvvedimentoPresenteDefinitivo;
	}
	
	/**
	 * Checks if is quadratura corretta and provvedimento presente definitivo.
	 *
	 * @return the boolean
	 */
	public Boolean isQuadraturaCorrettaAndProvvedimentoPresenteDefinitivo() {
		return Boolean.valueOf(Boolean.TRUE.equals(getIsQuadraturaCorretta()) && Boolean.TRUE.equals(getIsProvvedimentoPresenteDefinitivo()));
	}

	/**
	 * @return the isQuadraturaCorrettaStanziamentoCassa
	 */
	public Boolean getIsQuadraturaCorrettaStanziamentoCassa() {
		return isQuadraturaCorrettaStanziamentoCassa;
	}

	/**
	 * @param isQuadraturaCorrettaStanziamentoCassa the isQuadraturaCorrettaStanziamentoCassa to set
	 */
	public void setIsQuadraturaCorrettaStanziamentoCassa(Boolean isQuadraturaCorrettaStanziamentoCassa) {
		this.isQuadraturaCorrettaStanziamentoCassa = isQuadraturaCorrettaStanziamentoCassa;
	}

	/**
	 * @return the isQuadraturaCorrettaStanziamento
	 */
	public Boolean getIsQuadraturaCorrettaStanziamento() {
		return isQuadraturaCorrettaStanziamento;
	}

	/**
	 * @param isQuadraturaCorrettaStanziamento the isQuadraturaCorrettaStanziamento to set
	 */
	public void setIsQuadraturaCorrettaStanziamento(Boolean isQuadraturaCorrettaStanziamento) {
		this.isQuadraturaCorrettaStanziamento = isQuadraturaCorrettaStanziamento;
	}

	/**
	 * @return messaggi
	 */
	public List<Messaggio> getMessaggi() {
		return messaggi;
	}
	
	/**
	 * @param messaggi the messaggi to set
	 */
	public void setMessaggi(List<Messaggio> messaggi) {
		this.messaggi = messaggi != null ? messaggi : new ArrayList<Messaggio>();
	}

	/**
	 * @return the isAttoAmministrativoVariazioneDiBilancioPresenteSeNecessario
	 */
	public Boolean getIsAttoAmministrativoVariazioneDiBilancioPresenteSeNecessario() {
		return isAttoAmministrativoVariazioneDiBilancioPresenteSeNecessario;
	}

	/**
	 * @param isAttoAmministrativoVariazioneDiBilancioPresenteSeNecessario the isAttoAmministrativoVariazioneDiBilancioPresenteSeNecessario to set
	 */
	public void setIsAttoAmministrativoVariazioneDiBilancioPresenteSeNecessario(Boolean isAttoAmministrativoVariazioneDiBilancioPresenteSeNecessario) {
		this.isAttoAmministrativoVariazioneDiBilancioPresenteSeNecessario = isAttoAmministrativoVariazioneDiBilancioPresenteSeNecessario;
	}

	/**
	 * @return the idTask
	 */
	public String getIdTask() {
		return this.idTask;
	}

	/**
	 * @param idTask the idTask to set
	 */
	public void setIdTask(String idTask) {
		this.idTask = idTask;
	}

	/**
	 * @return the nomeTask
	 */
	public String getNomeTask() {
		return this.nomeTask;
	}

	/**
	 * @param nomeTask the nomeTask to set
	 */
	public void setNomeTask(String nomeTask) {
		this.nomeTask = nomeTask;
	}

	/**
	 * @return the variabiliDiProcesso
	 */
	@XmlTransient
	public List<VariabileProcesso> getVariabiliDiProcesso() {
		return this.variabiliDiProcesso;
	}

	/**
	 * @param variabiliDiProcesso the variabiliDiProcesso to set
	 */
	public void setVariabiliDiProcesso(List<VariabileProcesso> variabiliDiProcesso) {
		this.variabiliDiProcesso = variabiliDiProcesso;
	}

	/**
	 * @return the checkVariazioniCapitoloFondinoFailed
	 */
	public Boolean getCheckVariazioniCapitoloFondinoFailed() {
		return checkVariazioniCapitoloFondinoFailed;
	}

	/**
	 * @param checkVariazioniCapitoloFondinoFailed the checkVariazioniCapitoloFondinoFailed to set
	 */
	public void setCheckVariazioniCapitoloFondinoFailed(Boolean checkVariazioniCapitoloFondinoFailed) {
		this.checkVariazioniCapitoloFondinoFailed = checkVariazioniCapitoloFondinoFailed;
	}
}
