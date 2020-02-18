/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.TipoOperazioneCassa;
import it.csi.siac.siaccorser.model.ServiceResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaTipoOperazioneDiCassaResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaTipiOperazione")	    
	@XmlElement(name = "tipoOperazione")
	private List<TipoOperazioneCassa> tipiOperazione = new ArrayList<TipoOperazioneCassa>();

	/**
	 * @return the tipiOperazione
	 */
	@XmlTransient
	public List<TipoOperazioneCassa> getTipiOperazione() {
		return tipiOperazione;
	}

	/**
	 * @param tipiOperazione the tipiOperazione to set
	 */
	public void setTipiOperazione(List<TipoOperazioneCassa> tipiOperazione) {
		this.tipiOperazione = tipiOperazione;
	}

	
	
	
}
