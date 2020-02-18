/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ClassificatoreEP;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaClassificatoriEPResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaClassificatoriEP")
	@XmlElement(name = "classificatoreEP")
	private List<ClassificatoreEP> listaClassificatori = new ArrayList<ClassificatoreEP>();

	/**
	 * @return the listaClassificatori
	 */
	@XmlTransient
	public List<ClassificatoreEP> getListaClassificatori() {
		return listaClassificatori;
	}

	/**
	 * @param listaClassificatori the listaClassificatori to set
	 */
	public void setListaClassificatori(List<ClassificatoreEP> listaClassificatori) {
		this.listaClassificatori = listaClassificatori != null ? listaClassificatori : new ArrayList<ClassificatoreEP>();
	}
	
	/**
	 * @param tipologiaClassificatore the tipologiaClassificatore to filter by
	 * @return the listaClassificatori by tipologiaClassificatore
	 */
	public List<ClassificatoreEP> getListaClassificatori(TipologiaClassificatore tipologiaClassificatore) {
		final List<ClassificatoreEP> result = new ArrayList<ClassificatoreEP>();
		
		if(listaClassificatori != null && tipologiaClassificatore != null) {
			for(ClassificatoreEP cg : listaClassificatori) {
				if(cg.getTipoClassificatore() != null && tipologiaClassificatore.name().equals(cg.getTipoClassificatore().getCodice())) {
					result.add(cg);
				}
			}
		}
		
		return result;
	}
	
}
