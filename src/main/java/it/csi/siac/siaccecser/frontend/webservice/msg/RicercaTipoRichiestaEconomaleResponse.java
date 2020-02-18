/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.TipoRichiestaEconomale;
import it.csi.siac.siaccorser.model.ServiceResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaTipoRichiestaEconomaleResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaTipiRichiestaEconomale")
	@XmlElement(name = "tipoRichiestaEconomale")
	private List<TipoRichiestaEconomale> tipiRichiestaEconomale = new ArrayList<TipoRichiestaEconomale>();

	/**
	 * @return the tipiRichiestaEconomale
	 */
	@XmlTransient
	public List<TipoRichiestaEconomale> getTipiRichiestaEconomale() {
		return tipiRichiestaEconomale;
	}

	/**
	 * @param tipiRichiestaEconomale the tipiRichiestaEconomale to set
	 */
	public void setTipiRichiestaEconomale(List<TipoRichiestaEconomale> tipiRichiestaEconomale) {
		this.tipiRichiestaEconomale = tipiRichiestaEconomale;
	}
	
}
