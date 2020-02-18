/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.RicercaCartaContabileK;

/**
 * Richiesta al metodo FIN.CartaContabileService.ricercaCartaContabilePerChiave()
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaCartaContabilePerChiave extends RicercaAttributiMovimentoGestione {

	private Ente ente;
	private RicercaCartaContabileK pRicercaCartaContabileK;
	
	private DatiOpzionaliCapitoli datiOpzionaliCapitoli;
	
	private boolean cercaMdpCessionePerChiaveModPag = false;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public RicercaCartaContabileK getpRicercaCartaContabileK() {
		return pRicercaCartaContabileK;
	}

	public void setpRicercaCartaContabileK(RicercaCartaContabileK pRicercaCartaContabileK) {
		this.pRicercaCartaContabileK = pRicercaCartaContabileK;
	}

	public DatiOpzionaliCapitoli getDatiOpzionaliCapitoli() {
		return datiOpzionaliCapitoli;
	}

	public void setDatiOpzionaliCapitoli(DatiOpzionaliCapitoli datiOpzionaliCapitoli) {
		this.datiOpzionaliCapitoli = datiOpzionaliCapitoli;
	}

	public boolean getCercaMdpCessionePerChiaveModPag()
	{
		return cercaMdpCessionePerChiaveModPag;
	}

	public void setCercaMdpCessionePerChiaveModPag(boolean cercaMdpCessionePerChiaveModPag)
	{
		this.cercaMdpCessionePerChiaveModPag = cercaMdpCessionePerChiaveModPag;
	}
	
}