/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siacbilser.model.Vincolo;
import it.csi.siac.siaccorser.model.ServiceRequest;

public class AssociaCapitoloAlVincolo extends ServiceRequest {
	
	private Vincolo vincolo;
	private Capitolo<?, ?> capitolo;
	
	public Vincolo getVincolo() {
		return vincolo;
	}
	/**
	 * settare la chiave del vincolo e l'ente di appartenenza
	 * @param vincolo
	 */
	public void setVincolo(Vincolo vincolo) {
		this.vincolo = vincolo;
	}
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}
	
	
	
	

}
