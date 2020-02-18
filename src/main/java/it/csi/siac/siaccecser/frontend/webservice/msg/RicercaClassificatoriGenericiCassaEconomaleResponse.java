/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaClassificatoriGenericiCassaEconomaleResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaClassificatoriGenerici")
	@XmlElement(name = "classificatoreGenerico")
	private List<ClassificatoreGenerico> listaClassificatori = new ArrayList<ClassificatoreGenerico>();

	/**
	 * @return the listaClassificatori
	 */
	@XmlTransient
	public List<ClassificatoreGenerico> getListaClassificatori() {
		return listaClassificatori;
	}

	/**
	 * @param listaClassificatori the listaClassificatori to set
	 */
	public void setListaClassificatori(
			List<ClassificatoreGenerico> listaClassificatori) {
		this.listaClassificatori = listaClassificatori;
	}
	
	/**
	 * @param tipologiaClassificatore the tipologiaClassificatore to filter by
	 * @return the listaClassificatori by tipologiaClassificatore
	 */
	public List<ClassificatoreGenerico> getListaClassificatori(TipologiaClassificatore tipologiaClassificatore) {
		final List<ClassificatoreGenerico> result = new ArrayList<ClassificatoreGenerico>();
		
		if(listaClassificatori != null && tipologiaClassificatore != null) {
			for(ClassificatoreGenerico cg : listaClassificatori) {
				if(cg.getTipoClassificatore() != null && tipologiaClassificatore.name().equals(cg.getTipoClassificatore().getCodice())) {
					result.add(cg);
				}
			}
		}
		
		return result;
	}
	
}
