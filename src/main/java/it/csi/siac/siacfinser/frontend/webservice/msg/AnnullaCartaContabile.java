/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.carta.CartaContabile;


/**
 * 
 * @author andrea.colombo
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaCartaContabile extends ServiceRequest {
	
	private Ente ente;
	private Bilancio bilancio;
	private CartaContabile cartaContabileDaAnnullare;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public CartaContabile getCartaContabileDaAnnullare() {
		return cartaContabileDaAnnullare;
	}

	public void setCartaContabileDaAnnullare(
			CartaContabile cartaContabileDaAnnullare) {
		this.cartaContabileDaAnnullare = cartaContabileDaAnnullare;
	}	
}
