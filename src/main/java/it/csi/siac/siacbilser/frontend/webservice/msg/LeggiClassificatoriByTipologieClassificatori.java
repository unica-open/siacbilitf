/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiClassificatoriByTipologieClassificatori extends ServiceRequest {
	
	private Bilancio bilancio;
	private List<TipologiaClassificatore> listaTipologieClassificatori = new ArrayList<TipologiaClassificatore>();
	private Ente ente;
	
	/**
	 * @return the anno
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	/**
	 * @return the tipologiaClassificatore
	 */
	public List<TipologiaClassificatore> getListaTipologieClassificatori() {
		return listaTipologieClassificatori;
	}
	/**
	 * @param tipologiaClassificatore the tipologiaClassificatore to set
	 */
	public void setListaTipologieClassificatori(List<TipologiaClassificatore> listaTipologieClassificatori) {
		this.listaTipologieClassificatori = listaTipologieClassificatori != null ? listaTipologieClassificatori : new ArrayList<TipologiaClassificatore>();
	}

	/**
	 * @return the ente
	 * */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the Ente to set
	 * */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	
}
