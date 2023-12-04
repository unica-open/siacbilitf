/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;

import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacbilser.model.CapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siacbilser.model.CapitoloUscitaPrevisione;
import it.csi.siac.siaccorser.model.ServiceResponse;


/**
 * Classe base di response per le verifiche di annullabilit&agrave; del capitolo
 * @author Marchino Alessandro
 */
public abstract class VerificaAnnullabilitaCapitoloBaseResponse<C extends Capitolo<?, ?>> extends ServiceResponse {
	
	private boolean annullabilitaCapitolo;
	@XmlElements({
		@XmlElement(name="capitoloUscitaPrevisione",  type=CapitoloUscitaPrevisione.class),
		@XmlElement(name="capitoloUscitaGestione",    type=CapitoloUscitaGestione.class),
		@XmlElement(name="capitoloEntrataPrevisione", type=CapitoloEntrataPrevisione.class),
		@XmlElement(name="capitoloEntrataGestione",   type=CapitoloEntrataGestione.class)
	})
	private C capitolo;

	public boolean isAnnullabilitaCapitolo() {
		return annullabilitaCapitolo;
	}

	public void setAnnullabilitaCapitolo(boolean annullabilitaCapitolo) {
		this.annullabilitaCapitolo = annullabilitaCapitolo;
	}

	/**
	 * @return the capitolo
	 */
	@XmlTransient
	public C getCapitolo() {
		return capitolo;
	}

	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(C capitolo) {
		this.capitolo = capitolo;
	}

}
