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
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.VariabileProcesso;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceAnagraficaVariazioneBilancioResponse extends ServiceResponse {
	
	private VariazioneImportoCapitolo  variazioneImportoCapitolo;
	
	private Boolean isQuadraturaCorrettaStanziamento = Boolean.FALSE;
	private Boolean isQuadraturaCorrettaStanziamentoCassa = Boolean.FALSE;
	private Boolean isProvvedimentoPresenteDefinitivo = Boolean.FALSE;
	
	// SIAC-6881
	private String idTask;
	private String nomeTask;
	@XmlElementWrapper(name="variabiliDiProcesso")
	@XmlElement(name="variabileDiProcesso")
	private List<VariabileProcesso> variabiliDiProcesso = new ArrayList<VariabileProcesso>();

	/**
	 * @return the variazioneImportoCapitolo
	 */
	public VariazioneImportoCapitolo getVariazioneImportoCapitolo() {
		return this.variazioneImportoCapitolo;
	}

	/**
	 * @param variazioneImportoCapitolo the variazioneImportoCapitolo to set
	 */
	public void setVariazioneImportoCapitolo(VariazioneImportoCapitolo variazioneImportoCapitolo) {
		this.variazioneImportoCapitolo = variazioneImportoCapitolo;
	}

	/**
	 * 
	 * @return true se il controllo della quadratura degli importi ha dato esito positivo.
	 */
	public Boolean getIsQuadraturaCorretta() {
		return Boolean.TRUE.equals(getIsQuadraturaCorrettaStanziamento()) 
				&& Boolean.TRUE.equals(getIsQuadraturaCorrettaStanziamentoCassa());
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
	 * @return the isProvvedimentoPresenteDefinitivo
	 */
	public Boolean getIsProvvedimentoPresenteDefinitivo() {
		return this.isProvvedimentoPresenteDefinitivo;
	}

	/**
	 * @param isProvvedimentoPresenteDefinitivo the isProvvedimentoPresenteDefinitivo to set
	 */
	public void setIsProvvedimentoPresenteDefinitivo(Boolean isProvvedimentoPresenteDefinitivo) {
		this.isProvvedimentoPresenteDefinitivo = isProvvedimentoPresenteDefinitivo;
	}

	/**
	 * @return is quadratura corretta and is provvedimento definitivo
	 */
	public Boolean isQuadraturaCorrettaAndProvvedimentoPresenteDefinitivo() {
		return Boolean.valueOf(Boolean.TRUE.equals(getIsQuadraturaCorretta()) && Boolean.TRUE.equals(isProvvedimentoPresenteDefinitivo));
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
}
