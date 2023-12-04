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
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.VariabileProcesso;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class DefinisceAnagraficaVariazioneBilancio extends ServiceRequest {
	
	//Fields dedicati alla gestione del processo
	private String idAttivita;
	
	private VariazioneImportoCapitolo variazioneImportoCapitolo;
	
	boolean saltaCheckStanziamentoCassa = false;
	
	@XmlElementWrapper(name="variabiliProcesso")
	@XmlElement(name="variabileProcesso")
	private List<VariabileProcesso> listaVariabiliProcesso = new ArrayList<VariabileProcesso>();

	public VariazioneImportoCapitolo getVariazioneImportoCapitolo() {
		return variazioneImportoCapitolo;
	}

	public void setVariazioneImportoCapitolo(VariazioneImportoCapitolo variazioneImportoCapitolo) {
		this.variazioneImportoCapitolo = variazioneImportoCapitolo;
	}

	public String getIdAttivita() {
		return idAttivita;
	}

	public void setIdAttivita(String idAttivita) {
		this.idAttivita = idAttivita;
	}

	@XmlTransient
	public List<VariabileProcesso> getListaVariabiliProcesso() {
		return listaVariabiliProcesso;
	}

	public void setListaVariabiliProcesso(List<VariabileProcesso> listaVariabiliProcesso) {
		this.listaVariabiliProcesso = listaVariabiliProcesso;
	}

	public boolean isSaltaCheckStanziamentoCassa() {
		return false;
		// return saltaCheckStanziamentoCassa;
	}

	/**
	 * @param saltaCheckStanziamentoCassa the saltaCheckStanziamentoCassa to set
	 */
	public void setSaltaCheckStanziamentoCassa(boolean saltaCheckStanziamentoCassa) {
		this.saltaCheckStanziamentoCassa = saltaCheckStanziamentoCassa;
	}
	
	
	
	

}
