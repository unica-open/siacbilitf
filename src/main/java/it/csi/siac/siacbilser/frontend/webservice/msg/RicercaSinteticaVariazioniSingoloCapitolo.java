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
import it.csi.siac.siacbilser.model.ric.SegnoImporti;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;

/**
 * Richiesta al metodo
 * BIL.CapitoloService.ricercaVariazioniCapitolo()
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaVariazioniSingoloCapitolo extends RicercaSinteticaBaseRequest {

	@XmlElements(value={
		@XmlElement(name="capitoloUscitaPrevisione", type=CapitoloUscitaPrevisione.class),
		@XmlElement(name="capitoloEntrataPrevisione", type=CapitoloEntrataPrevisione.class),
		@XmlElement(name="capitoloUscitaGestione", type=CapitoloUscitaGestione.class),
		@XmlElement(name="capitoloEntrataGestione", type=CapitoloEntrataGestione.class)
	})
	private Capitolo<?, ?> capitolo;
	private Ente ente;
	private Bilancio bilancio;
	private SegnoImporti segnoImportiVariazione;

	/**
	 * @return the capitolo
	 */
	@XmlTransient
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}

	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}

	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

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
	 * @return the segnoImportiVariazione
	 */
	public SegnoImporti getSegnoImportiVariazione() {
		return segnoImportiVariazione;
	}

	/**
	 * @param segnoImportiVariazione the segnoImportiVariazione to set
	 */
	public void setSegnoImportiVariazione(SegnoImporti segnoImportiVariazione) {
		this.segnoImportiVariazione = segnoImportiVariazione;
	}

}
