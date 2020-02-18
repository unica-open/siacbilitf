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
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Request al servizio di ricerca componente capitolo
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaTipoComponenteImportiCapitolo extends ServiceRequest {

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
	 * @return the propostaDefaultComponenteImportiCapitoloDaEscludere
	 */
	@XmlTransient
	public PropostaDefaultComponenteImportiCapitolo[] getPropostaDefaultComponenteImportiCapitoloDaEscludere() {
		return propostaDefaultComponenteImportiCapitoloDaEscludere;
	}

	/**
	 * @param propostaDefaultComponenteImportiCapitoloDaEscludere the propostaDefaultComponenteImportiCapitoloDaEscludere to set
	 */
	public void setPropostaDefaultComponenteImportiCapitoloDaEscludere(PropostaDefaultComponenteImportiCapitolo[] propostaDefaultComponenteImportiCapitoloDaEscludere) {
		this.propostaDefaultComponenteImportiCapitoloDaEscludere = propostaDefaultComponenteImportiCapitoloDaEscludere;
	}
	
	
}
