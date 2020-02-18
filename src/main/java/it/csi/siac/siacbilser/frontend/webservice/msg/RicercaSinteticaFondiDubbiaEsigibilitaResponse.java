/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Risposta al metodo BIL.FondiDubbiaEsigibilitaService.ricercaSinteticaFondiDubbiaEsigibilita()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaFondiDubbiaEsigibilitaResponse extends RicercaSinteticaBaseResponse<AccantonamentoFondiDubbiaEsigibilita> {

	@XmlElementWrapper(name = "listaFondi")
	@XmlElement(name = "accantonamentoFondoDubbiaEsigibilita")
	private ListaPaginata<AccantonamentoFondiDubbiaEsigibilita> accantonamentiFondiDubbiaEsigibilita = new ListaPaginataImpl<AccantonamentoFondiDubbiaEsigibilita>();

	@Override
	protected ListaPaginataImpl<AccantonamentoFondiDubbiaEsigibilita> getAsListaPaginata() {
		return (ListaPaginataImpl<AccantonamentoFondiDubbiaEsigibilita>)accantonamentiFondiDubbiaEsigibilita;
	}

	/**
	 * @return the accantonamentiFondiDubbiaEsigibilita
	 */
	@XmlTransient
	public ListaPaginata<AccantonamentoFondiDubbiaEsigibilita> getAccantonamentiFondiDubbiaEsigibilita() {
		return accantonamentiFondiDubbiaEsigibilita;
	}

	/**
	 * @param accantonamentiFondiDubbiaEsigibilita the accantonamentiFondiDubbiaEsigibilita to set
	 */
	public void setAccantonamentiFondiDubbiaEsigibilita(ListaPaginata<AccantonamentoFondiDubbiaEsigibilita> accantonamentiFondiDubbiaEsigibilita) {
		this.accantonamentiFondiDubbiaEsigibilita = accantonamentiFondiDubbiaEsigibilita;
	}
	

}
