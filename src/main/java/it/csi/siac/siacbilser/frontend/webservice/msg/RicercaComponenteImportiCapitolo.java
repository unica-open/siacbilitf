/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Request al servizio di ricerca componente capitolo
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class RicercaComponenteImportiCapitolo extends ServiceRequest {

	private Capitolo<?, ?> capitolo;
	
	//SIAC-7349 - INIZIO - SR90 - MR - 03/04/2020 Aggiunta property per abilitare calcolo disponibilita impegnare del capitolo
	private boolean abilitaCalcoloDisponibilita;
	
	public boolean isAbilitaCalcoloDisponibilita() {
		return abilitaCalcoloDisponibilita;
	}
	public void setAbilitaCalcoloDisponibilita(boolean abilitaCalcoloDisponibilita) {
		this.abilitaCalcoloDisponibilita = abilitaCalcoloDisponibilita;
	}//SIAC-7349 - FINE

	/**
	 * @return the capitolo
	 */
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}
	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}
}
