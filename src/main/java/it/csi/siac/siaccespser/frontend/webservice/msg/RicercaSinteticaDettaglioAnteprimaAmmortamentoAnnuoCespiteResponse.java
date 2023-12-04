/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/**
 * 
 */
package it.csi.siac.siaccespser.frontend.webservice.msg;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.DettaglioAnteprimaAmmortamentoAnnuoCespite;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * @author elisa
 * @version 1.0.0 - 27-09-2018
 * @version 1.0.0 - 31-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaDettaglioAnteprimaAmmortamentoAnnuoCespiteResponse extends RicercaSinteticaBaseResponse<DettaglioAnteprimaAmmortamentoAnnuoCespite> {

	@XmlElementWrapper(name="dettagliAnteprimaAmmortamentoAnnuoCespite")
	@XmlElement(name="dettaglioAnteprima")
	private ListaPaginata<DettaglioAnteprimaAmmortamentoAnnuoCespite> listaDettaglioAnteprimaAmmortamentoAnnuoCespite = new ListaPaginataImpl<DettaglioAnteprimaAmmortamentoAnnuoCespite>(new ArrayList<DettaglioAnteprimaAmmortamentoAnnuoCespite>());
	
	@Override
	protected ListaPaginataImpl<DettaglioAnteprimaAmmortamentoAnnuoCespite> getAsListaPaginata() {
		return (ListaPaginataImpl<DettaglioAnteprimaAmmortamentoAnnuoCespite>) getListaDettaglioAnteprimaAmmortamentoAnnuoCespite();
	}

	/**
	 * @return the listaDettaglioAnteprimaAmmortamentoAnnuoCespite
	 */
	@XmlTransient
	public ListaPaginata<DettaglioAnteprimaAmmortamentoAnnuoCespite> getListaDettaglioAnteprimaAmmortamentoAnnuoCespite() {
		return listaDettaglioAnteprimaAmmortamentoAnnuoCespite;
	}

	/**
	 * @param listaDettaglioAnteprimaAmmortamentoAnnuoCespite the listaDettaglioAnteprimaAmmortamentoAnnuoCespite to set
	 */
	public void setListaDettaglioAnteprimaAmmortamentoAnnuoCespite(ListaPaginata<DettaglioAnteprimaAmmortamentoAnnuoCespite> listaDettaglioAnteprimaAmmortamentoAnnuoCespite) {
		this.listaDettaglioAnteprimaAmmortamentoAnnuoCespite = listaDettaglioAnteprimaAmmortamentoAnnuoCespite;
	}

	
	
}
