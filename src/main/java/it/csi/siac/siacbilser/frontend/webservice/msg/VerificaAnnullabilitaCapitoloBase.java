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
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Classe base di request per le verifiche di annullabilit&agrave; del capitolo
 * @author Marchino Alessandro
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class VerificaAnnullabilitaCapitoloBase<C extends Capitolo<?, ?>> extends ServiceRequest {
	
	private Ente ente;
	private Bilancio bilancio;
	@XmlElements({
		@XmlElement(name="capitoloUscitaPrevisione",  type=CapitoloUscitaPrevisione.class),
		@XmlElement(name="capitoloUscitaGestione",    type=CapitoloUscitaGestione.class),
		@XmlElement(name="capitoloEntrataPrevisione", type=CapitoloEntrataPrevisione.class),
		@XmlElement(name="capitoloEntrataGestione",   type=CapitoloEntrataGestione.class)
	})
	private C capitolo;
	

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
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
