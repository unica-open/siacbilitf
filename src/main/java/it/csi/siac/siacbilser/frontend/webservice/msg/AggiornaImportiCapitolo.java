/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacbilser.model.CapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siacbilser.model.CapitoloUscitaPrevisione;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.ComponenteImportiCapitoloService.aggiornaImportiCapitolo()
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaImportiCapitolo extends ServiceRequest { 

	@XmlElements({
		@XmlElement(name = "capitoloUscitaPrevisione", type = CapitoloUscitaPrevisione.class),
		@XmlElement(name = "capitoloUscitaGestione", type = CapitoloUscitaGestione.class),
		@XmlElement(name = "capitoloEntrataPrevisione", type = CapitoloEntrataPrevisione.class),
		@XmlElement(name = "capitoloEntrataGestione", type = CapitoloEntrataGestione.class),
		@XmlElement(name = "capitolo", type = Capitolo.class),
	})
	private Capitolo<?, ?> capitolo;

	/**
	 * @return the capitolo
	 */
	@XmlTransient
	public Capitolo<?, ?> getCapitolo() {
		return this.capitolo;
	}

	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}

}
