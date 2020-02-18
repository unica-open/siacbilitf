/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.carta.CartaContabile;

/**
 * Risposta al metodo FIN.CartaContabileService.ricercaCartaContabilePerChiave()
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaCartaContabilePerChiaveResponse extends RicercaAttributiMovimentoGestioneResponse {

	private CartaContabile cartaContabile;

	public CartaContabile getCartaContabile() {
		return cartaContabile;
	}

	public void setCartaContabile(CartaContabile cartaContabile) {
		this.cartaContabile = cartaContabile;
	} 	
}
