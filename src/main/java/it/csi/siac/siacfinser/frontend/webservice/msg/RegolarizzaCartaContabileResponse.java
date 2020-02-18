/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.carta.CartaContabile;


@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RegolarizzaCartaContabileResponse extends ServiceResponse {
	
	private Ente ente;
	private CartaContabile cartaContabile;
	
	public Ente getEnte() {
		return ente;
	}
	
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public CartaContabile getCartaContabile() {
		return cartaContabile;
	}

	public void setCartaContabile(CartaContabile cartaContabile) {
		this.cartaContabile = cartaContabile;
	}	
}
