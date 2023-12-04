/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacgenser.model.PrimaNota;

/**
 * Risultati di ricerca sintetici per il registro A
 * @author Marchino Alessandro
 * @version 1.0.0 - 16/10/2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaRegistroACespiteResponse extends RicercaSinteticaBaseResponse<PrimaNota> {

	@XmlElementWrapper(name = "listaPrimeNote")
	@XmlElement(name = "primaNota")
	private ListaPaginata<PrimaNota> primeNote = new ListaPaginataImpl<PrimaNota>();
	
	@Override
	protected ListaPaginataImpl<PrimaNota> getAsListaPaginata() {
		return (ListaPaginataImpl<PrimaNota>)primeNote;
	}

	/**
	 * @return the primeNote
	 */
	@XmlTransient
	public ListaPaginata<PrimaNota> getPrimeNote() {
		return this.primeNote;
	}

	/**
	 * @param primeNote the primeNote to set
	 */
	public void setPrimeNote(ListaPaginata<PrimaNota> primeNote) {
		this.primeNote = primeNote;
	}

}
