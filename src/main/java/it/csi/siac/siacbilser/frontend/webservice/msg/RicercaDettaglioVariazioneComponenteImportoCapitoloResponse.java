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
import it.csi.siac.siacbilser.model.DettaglioVariazioneComponenteImportoCapitolo;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * The Class RicercaDettaglioVariazioneComponenteImportoCapitoloResponse.
 * @author Marchino Alessandro
 * @version 1.0.0 - 09/10/2019
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioVariazioneComponenteImportoCapitoloResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaDettaglioVariazioneComponenteImportoCapitolo")
	@XmlElement(name = "dettaglioVariazioneComponenteImportoCapitolo")
	private List<DettaglioVariazioneComponenteImportoCapitolo> listaDettaglioVariazioneComponenteImportoCapitolo = new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();
	
	@XmlElementWrapper(name = "listaDettaglioVariazioneComponenteImportoCapitolo1")
	@XmlElement(name = "dettaglioVariazioneComponenteImportoCapitolo1")
	private List<DettaglioVariazioneComponenteImportoCapitolo> listaDettaglioVariazioneComponenteImportoCapitolo1 = new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();
	
	@XmlElementWrapper(name = "listaDettaglioVariazioneComponenteImportoCapitolo2")
	@XmlElement(name = "dettaglioVariazioneComponenteImportoCapitolo2")
	private List<DettaglioVariazioneComponenteImportoCapitolo> listaDettaglioVariazioneComponenteImportoCapitolo2 = new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();

	/**
	 * @return the listaDettaglioVariazioneComponenteImportoCapitolo
	 */
	@XmlTransient
	public List<DettaglioVariazioneComponenteImportoCapitolo> getListaDettaglioVariazioneComponenteImportoCapitolo() {
		return this.listaDettaglioVariazioneComponenteImportoCapitolo;
	}

	/**
	 * @param listaDettaglioVariazioneComponenteImportoCapitolo the listaDettaglioVariazioneComponenteImportoCapitolo to set
	 */
	public void setListaDettaglioVariazioneComponenteImportoCapitolo(List<DettaglioVariazioneComponenteImportoCapitolo> listaDettaglioVariazioneComponenteImportoCapitolo) {
		this.listaDettaglioVariazioneComponenteImportoCapitolo = listaDettaglioVariazioneComponenteImportoCapitolo != null ? listaDettaglioVariazioneComponenteImportoCapitolo : new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();
	}

	/**
	 * @return the listaDettaglioVariazioneComponenteImportoCapitolo1
	 */
	@XmlTransient
	public List<DettaglioVariazioneComponenteImportoCapitolo> getListaDettaglioVariazioneComponenteImportoCapitolo1() {
		return this.listaDettaglioVariazioneComponenteImportoCapitolo1;
	}

	/**
	 * @param listaDettaglioVariazioneComponenteImportoCapitolo1 the listaDettaglioVariazioneComponenteImportoCapitolo1 to set
	 */
	public void setListaDettaglioVariazioneComponenteImportoCapitolo1(List<DettaglioVariazioneComponenteImportoCapitolo> listaDettaglioVariazioneComponenteImportoCapitolo1) {
		this.listaDettaglioVariazioneComponenteImportoCapitolo1 = listaDettaglioVariazioneComponenteImportoCapitolo1 != null ? listaDettaglioVariazioneComponenteImportoCapitolo1 : new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();
	}

	/**
	 * @return the listaDettaglioVariazioneComponenteImportoCapitolo2
	 */
	@XmlTransient
	public List<DettaglioVariazioneComponenteImportoCapitolo> getListaDettaglioVariazioneComponenteImportoCapitolo2() {
		return this.listaDettaglioVariazioneComponenteImportoCapitolo2;
	}

	/**
	 * @param listaDettaglioVariazioneComponenteImportoCapitolo2 the listaDettaglioVariazioneComponenteImportoCapitolo2 to set
	 */
	public void setListaDettaglioVariazioneComponenteImportoCapitolo2(List<DettaglioVariazioneComponenteImportoCapitolo> listaDettaglioVariazioneComponenteImportoCapitolo2) {
		this.listaDettaglioVariazioneComponenteImportoCapitolo2 = listaDettaglioVariazioneComponenteImportoCapitolo2 != null ? listaDettaglioVariazioneComponenteImportoCapitolo2 : new ArrayList<DettaglioVariazioneComponenteImportoCapitolo>();
	}

}
