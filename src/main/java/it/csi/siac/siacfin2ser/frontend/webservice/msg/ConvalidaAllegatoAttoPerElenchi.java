/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class ConvalidaAllegatoAttoPerElenchi extends ConvalidaAllegatoAtto {

	//popolare l'id dell'allegatoAtto, gli id degli elenchi e gli id delle quote da convalidare 
	private AllegatoAtto allegatoAtto;
	
	/**
	 * @return the allegatoAtto
	 */
	public AllegatoAtto getAllegatoAtto() {
		return allegatoAtto;
	}

	/**
	 * @param allegatoAtto the allegatoAtto to set
	 */
	public void setAllegatoAtto(AllegatoAtto allegatoAtto) {
		this.allegatoAtto = allegatoAtto;
	}
	
	
}
