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
import it.csi.siac.siacgenser.model.MovimentoEP;

/**
 * Risultati di ricerca sintetici per il registro A
 * @author Marchino Alessandro
 * @version 1.0.0 - 16/10/2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
@Deprecated
public class RicercaSinteticaMovimentoEPRegistroACespiteResponse extends RicercaSinteticaBaseResponse<MovimentoEP> {

	@XmlElementWrapper(name = "listaMovimentoEP")
	@XmlElement(name = "movimentoEP")
	private ListaPaginata<MovimentoEP> movimentiEP = new ListaPaginataImpl<MovimentoEP>();
	
	@Override
	protected ListaPaginataImpl<MovimentoEP> getAsListaPaginata() {
		return (ListaPaginataImpl<MovimentoEP>)movimentiEP;
	}

	/**
	 * @return the primeNote
	 */
	@XmlTransient
	public ListaPaginata<MovimentoEP> getMovimentiEP() {
		return this.movimentiEP;
	}

	/**
	 * Sets the movimenti EP.
	 *
	 * @param movimentiEP the new movimenti EP
	 */
	public void setMovimentiEP(ListaPaginata<MovimentoEP> movimentiEP) {
		this.movimentiEP = movimentiEP;
	}

}
