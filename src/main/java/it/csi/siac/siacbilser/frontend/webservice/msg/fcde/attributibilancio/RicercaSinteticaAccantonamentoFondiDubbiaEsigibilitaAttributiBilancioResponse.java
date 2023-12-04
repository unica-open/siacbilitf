/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Risposta del metodo BIL.FondiDubbiaEsigibilitaService.ricercaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio()
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse extends RicercaSinteticaBaseResponse<AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio> {

	@XmlElementWrapper(name="listaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio")
	@XmlElement(name="accantonamentoFondiDubbiaEsigibilitaAttributiBilancio")
	private ListaPaginata<AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio> listaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio = new ListaPaginataImpl<AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio>();

	/**
	 * @return the listaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio
	 */
	@XmlTransient
	public ListaPaginata<AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio> getListaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio() {
		return this.listaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	}

	/**
	 * @param listaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio the listaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio to set
	 */
	public void setListaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio(ListaPaginata<AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio> listaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio) {
		this.listaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio = listaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	}

	@Override
	protected ListaPaginataImpl<AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio> getAsListaPaginata() {
		return (ListaPaginataImpl<AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio>) listaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	}

}
