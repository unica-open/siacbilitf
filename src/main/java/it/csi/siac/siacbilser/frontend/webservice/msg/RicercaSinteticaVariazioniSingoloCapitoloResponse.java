/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacbilser.model.CapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siacbilser.model.CapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.model.VariazioneImportoSingoloCapitolo;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Risposta al metodo BIL.CapitoloService.ricercaPaginataVariazioniCapitolo()
 * 
 * @author Alessandro Marchino
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaVariazioniSingoloCapitoloResponse extends RicercaSinteticaBaseResponse<VariazioneImportoSingoloCapitolo> {
	
	@XmlElements(value = {
		@XmlElement(name = "capitoloUscitaPrevisione", type = CapitoloUscitaPrevisione.class),
		@XmlElement(name = "capitoloUscitaGestione", type = CapitoloUscitaGestione.class),
		@XmlElement(name = "capitoloEntrataPrevisione", type = CapitoloEntrataPrevisione.class),
		@XmlElement(name = "capitoloEntrataGestione", type = CapitoloEntrataGestione.class)
	})
	private Capitolo<?, ?> capitolo;
	
	@XmlElementWrapper(name = "listaVariazioni")
	@XmlElement(name = "variazione")
	private ListaPaginata<VariazioneImportoSingoloCapitolo> variazioni = new ListaPaginataImpl<VariazioneImportoSingoloCapitolo>();

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
	 * @return the variazioni
	 */
	@XmlTransient
	public ListaPaginata<VariazioneImportoSingoloCapitolo> getVariazioni() {
		return variazioni;
	}

	/**
	 * @param variazioni the variazioni to set
	 */
	public void setVariazioni(ListaPaginata<VariazioneImportoSingoloCapitolo> variazioni) {
		this.variazioni = variazioni;
	}

	@Override
	protected ListaPaginataImpl<VariazioneImportoSingoloCapitolo> getAsListaPaginata() {
		return (ListaPaginataImpl<VariazioneImportoSingoloCapitolo>) variazioni;
	}

}
