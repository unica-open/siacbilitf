/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.MacrotipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.PropostaDefaultComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.SottotipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.TipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.model.ImpegnabileComponenteImportiCapitolo;

/**
 * Request al servizio di ricerca componente capitolo
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaTipoComponenteImportiCapitolo extends RicercaSinteticaBaseRequest {

	private TipoComponenteImportiCapitolo tipoComponenteImportiCapitolo;
	
	@XmlElementWrapper(name="macrotipiComponenteImportiCapitoloDaEscludere")
	@XmlElement(name="macrotipoComponenteImportiCapitoloDaEscludere")
	private MacrotipoComponenteImportiCapitolo[] macrotipoComponenteImportiCapitoloDaEscludere;
	@XmlElementWrapper(name="sottotipiComponenteImportiCapitoloDaEscludere")
	@XmlElement(name="sottotipoComponenteImportiCapitoloDaEscludere")
	private SottotipoComponenteImportiCapitolo[] sottotipoComponenteImportiCapitoloDaEscludere;
	@XmlElementWrapper(name="propostaDefaultComponenteImportiCapitoloDaEscludere")
	@XmlElement(name="propostaDefaultComponenteImportiCapitoloDaEscludere")
	private PropostaDefaultComponenteImportiCapitolo[] propostaDefaultComponenteImportiCapitoloDaEscludere;

	//SIAC-7349
	@XmlElementWrapper(name="impegnabileComponenteImportiCapitoloDaEscludere")
	@XmlElement(name="impegnabileComponenteImportiCapitoloDaEscludere")
	private ImpegnabileComponenteImportiCapitolo[] impegnabileComponenteImportiCapitoloDaEscludere;

	// SIAC-7189
	private boolean soloValidiPerBilancio = false;
	
	//SIAC-7873
	private Boolean saltaControlloSuDateValidita = Boolean.FALSE;
	
	/**
	 * @return the tipoComponenteImportiCapitolo
	 */
	public TipoComponenteImportiCapitolo getTipoComponenteImportiCapitolo() {
		return tipoComponenteImportiCapitolo;
	}

	/**
	 * @param tipoComponenteImportiCapitolo the tipoComponenteImportiCapitolo to set
	 */
	public void setTipoComponenteImportiCapitolo(TipoComponenteImportiCapitolo tipoComponenteImportiCapitolo) {
		this.tipoComponenteImportiCapitolo = tipoComponenteImportiCapitolo;
	}

	/**
	 * @return the macrotipoComponenteImportiCapitoloDaEscludere
	 */
	@XmlTransient
	public MacrotipoComponenteImportiCapitolo[] getMacrotipoComponenteImportiCapitoloDaEscludere() {
		return macrotipoComponenteImportiCapitoloDaEscludere;
	}

	/**
	 * @param macrotipoComponenteImportiCapitoloDaEscludere the macrotipoComponenteImportiCapitoloDaEscludere to set
	 */
	public void setMacrotipoComponenteImportiCapitoloDaEscludere(MacrotipoComponenteImportiCapitolo... macrotipoComponenteImportiCapitoloDaEscludere) {
		this.macrotipoComponenteImportiCapitoloDaEscludere = macrotipoComponenteImportiCapitoloDaEscludere;
	}

	/**
	 * @return the sottotipoComponenteImportiCapitoloDaEscludere
	 */
	@XmlTransient
	public SottotipoComponenteImportiCapitolo[] getSottotipoComponenteImportiCapitoloDaEscludere() {
		return sottotipoComponenteImportiCapitoloDaEscludere;
	}

	/**
	 * @param sottotipoComponenteImportiCapitoloDaEscludere the sottotipoComponenteImportiCapitoloDaEscludere to set
	 */
	public void setSottotipoComponenteImportiCapitoloDaEscludere(SottotipoComponenteImportiCapitolo... sottotipoComponenteImportiCapitoloDaEscludere) {
		this.sottotipoComponenteImportiCapitoloDaEscludere = sottotipoComponenteImportiCapitoloDaEscludere;
	}

	/**
	 * @return the soloValidiPerBilancio
	 */
	public boolean isSoloValidiPerBilancio() {
		return this.soloValidiPerBilancio;
	}

	/**
	 * @param soloValidiPerBilancio the soloValidiPerBilancio to set
	 */
	public void setSoloValidiPerBilancio(boolean soloValidiPerBilancio) {
		this.soloValidiPerBilancio = soloValidiPerBilancio;
	}

	/**
	 * @return the propostaDefaultComponenteImportiCapitoloDaEscludere
	 */
	@XmlTransient
	public PropostaDefaultComponenteImportiCapitolo[] getPropostaDefaultComponenteImportiCapitoloDaEscludere() {
		return propostaDefaultComponenteImportiCapitoloDaEscludere;
	}

	/**
	 * @param propostaDefaultComponenteImportiCapitoloDaEscludere the propostaDefaultComponenteImportiCapitoloDaEscludere to set
	 */
	public void setPropostaDefaultComponenteImportiCapitoloDaEscludere(
			PropostaDefaultComponenteImportiCapitolo... propostaDefaultComponenteImportiCapitoloDaEscludere) {
		this.propostaDefaultComponenteImportiCapitoloDaEscludere = propostaDefaultComponenteImportiCapitoloDaEscludere;
	}

	/**
	 * @return the impegnabileComponenteImportiCapitoloDaEscludere
	 */
	@XmlTransient
	public ImpegnabileComponenteImportiCapitolo[] getImpegnabileComponenteImportiCapitoloDaEscludere() {
		return impegnabileComponenteImportiCapitoloDaEscludere;
	}

	/**
	 * @param impegnabileComponenteImportiCapitoloDaEscludere the impegnabileComponenteImportiCapitoloDaEscludere to set
	 */
	public void setImpegnabileComponenteImportiCapitoloDaEscludere(
			ImpegnabileComponenteImportiCapitolo... impegnabileComponenteImportiCapitoloDaEscludere) {
		this.impegnabileComponenteImportiCapitoloDaEscludere = impegnabileComponenteImportiCapitoloDaEscludere;
	}

	/**
	 * @return the saltaControlloSuDateValidita
	 */
	public Boolean getSaltaControlloSuDateValidita() {
		return saltaControlloSuDateValidita;
	}

	/**
	 * @param saltaControlloSuDateValidita the saltaControlloSuDateValidita to set
	 */
	public void setSaltaControlloSuDateValidita(Boolean saltaControlloSuDateValidita) {
		this.saltaControlloSuDateValidita = saltaControlloSuDateValidita;
	}

}
