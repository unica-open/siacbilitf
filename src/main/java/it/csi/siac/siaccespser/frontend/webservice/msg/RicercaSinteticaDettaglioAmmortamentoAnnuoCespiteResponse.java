/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/**
 * 
 */
package it.csi.siac.siaccespser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.DettaglioAmmortamentoAnnuoCespite;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
/**
 * @author antonino
 * @version 1.0.0 - 30-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaDettaglioAmmortamentoAnnuoCespiteResponse extends RicercaSinteticaBaseResponse<DettaglioAmmortamentoAnnuoCespite> {

	@XmlElementWrapper(name = "dettagliammortamentoannuo")
	@XmlElement(name = "dettaglioammortamentoannuo")
	private ListaPaginata<DettaglioAmmortamentoAnnuoCespite> listaDettaglioAmmortamentoAnnuoCespite = new ListaPaginataImpl<DettaglioAmmortamentoAnnuoCespite>();
	
	private BigDecimal totaleImportoAmmortato;
	
	@Override
	protected ListaPaginataImpl<DettaglioAmmortamentoAnnuoCespite> getAsListaPaginata() {
		return (ListaPaginataImpl<DettaglioAmmortamentoAnnuoCespite>) getListaDettaglioAmmortamentoAnnuoCespite();
	}

	/**
	 * @return the listaTipoBeneCespite
	 */
	@XmlTransient
	public ListaPaginata<DettaglioAmmortamentoAnnuoCespite> getListaDettaglioAmmortamentoAnnuoCespite() {
		return listaDettaglioAmmortamentoAnnuoCespite;
	}

	/**
	 * @param listaTipoBeneCespite the listaTipoBeneCespite to set
	 */
	public void setListaDettaglioAmmortamentoAnnuoCespite(ListaPaginata<DettaglioAmmortamentoAnnuoCespite> listaDettaglioAmmortamentoAnnuoCespite) {
		this.listaDettaglioAmmortamentoAnnuoCespite = listaDettaglioAmmortamentoAnnuoCespite;
	}

	/**
	 * @return the totaleImportoAmmortato
	 */
	public BigDecimal getTotaleImportoAmmortato() {
		return totaleImportoAmmortato;
	}

	/**
	 * @param totaleImportoAmmortato the totaleImportoAmmortato to set
	 */
	public void setTotaleImportoAmmortato(BigDecimal totaleImportoAmmortato) {
		this.totaleImportoAmmortato = totaleImportoAmmortato;
	}

	
}
