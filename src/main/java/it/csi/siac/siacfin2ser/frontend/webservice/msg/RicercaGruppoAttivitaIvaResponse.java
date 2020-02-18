/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.GruppoAttivitaIva;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaGruppoAttivitaIvaResponse extends ServiceResponse {
	
	private Bilancio bilancio;
	private List<GruppoAttivitaIva> listaGruppoIva = new ArrayList<GruppoAttivitaIva>();
	
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	/**
	 * @return the listaGruppoAttivitaIva
	 */
	public List<GruppoAttivitaIva> getListaGruppoAttivitaIva() {
		return listaGruppoIva;
	}
	/**
	 * @param listaGruppoAttivitaIva the listaGruppoAttivitaIva to set
	 */
	public void setListaGruppoAttivitaIva(
			List<GruppoAttivitaIva> listaGruppoAttivitaIva) {
		this.listaGruppoIva = listaGruppoAttivitaIva;
	}
	
	
	
	
	
	
}
