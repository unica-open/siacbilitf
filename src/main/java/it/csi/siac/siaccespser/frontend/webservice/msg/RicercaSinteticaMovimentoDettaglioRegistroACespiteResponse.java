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
import it.csi.siac.siacgenser.model.MovimentoDettaglio;

/**
 * Risultati di ricerca sintetici per il registro A
 * @author Marchino Alessandro
 * @version 1.0.0 - 16/10/2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaMovimentoDettaglioRegistroACespiteResponse extends RicercaSinteticaBaseResponse<MovimentoDettaglio> {

	@XmlElementWrapper(name = "listaMovimentiDettaglio")
	@XmlElement(name = "movimentoDettaglio")
	private ListaPaginata<MovimentoDettaglio> movimentiDettaglio = new ListaPaginataImpl<MovimentoDettaglio>();
	
	@Override
	protected ListaPaginataImpl<MovimentoDettaglio> getAsListaPaginata() {
		return (ListaPaginataImpl<MovimentoDettaglio>)movimentiDettaglio;
	}

	/**
	 * @return the movimentiDettaglio
	 */
	@XmlTransient
	public ListaPaginata<MovimentoDettaglio> getMovimentiDettaglio() {
		return movimentiDettaglio;
	}

	/**
	 * @param movimentiDettaglio the movimentiDettaglio to set
	 */
	public void setMovimentiDettaglio(ListaPaginata<MovimentoDettaglio> movimentiDettaglio) {
		this.movimentiDettaglio = movimentiDettaglio;
	}
	

	
}
