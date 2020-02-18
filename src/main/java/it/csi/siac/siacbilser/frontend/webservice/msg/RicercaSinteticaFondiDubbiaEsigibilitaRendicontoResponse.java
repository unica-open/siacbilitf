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
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Risposta al metodo BIL.FondiDubbiaEsigibilitaRendicontoService.ricercaSinteticaFondiDubbiaEsigibilitaRendiconto()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaFondiDubbiaEsigibilitaRendicontoResponse extends RicercaSinteticaBaseResponse<AccantonamentoFondiDubbiaEsigibilitaRendiconto> {

	@XmlElementWrapper(name = "listaFondi")
	@XmlElement(name = "accantonamentoFondoDubbiaEsigibilitaRendiconto")
	private ListaPaginata<AccantonamentoFondiDubbiaEsigibilitaRendiconto> accantonamentiFondiDubbiaEsigibilitaRendiconto = new ListaPaginataImpl<AccantonamentoFondiDubbiaEsigibilitaRendiconto>();

	@Override
	protected ListaPaginataImpl<AccantonamentoFondiDubbiaEsigibilitaRendiconto> getAsListaPaginata() {
		return (ListaPaginataImpl<AccantonamentoFondiDubbiaEsigibilitaRendiconto>)accantonamentiFondiDubbiaEsigibilitaRendiconto;
	}

	/**
	 * @return the accantonamentiFondiDubbiaEsigibilitaRendiconto
	 */
	@XmlTransient
	public ListaPaginata<AccantonamentoFondiDubbiaEsigibilitaRendiconto> getAccantonamentiFondiDubbiaEsigibilitaRendiconto() {
		return accantonamentiFondiDubbiaEsigibilitaRendiconto;
	}

	/**
	 * @param accantonamentiFondiDubbiaEsigibilitaRendiconto the accantonamentiFondiDubbiaEsigibilitaRendiconto to set
	 */
	public void setAccantonamentiFondiDubbiaEsigibilitaRendiconto(ListaPaginata<AccantonamentoFondiDubbiaEsigibilitaRendiconto> accantonamentiFondiDubbiaEsigibilitaRendiconto) {
		this.accantonamentiFondiDubbiaEsigibilitaRendiconto = accantonamentiFondiDubbiaEsigibilitaRendiconto;
	}
	

}
