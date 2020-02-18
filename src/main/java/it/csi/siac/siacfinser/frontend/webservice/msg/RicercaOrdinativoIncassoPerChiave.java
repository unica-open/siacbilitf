/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.RicercaOrdinativoIncassoK;

/**
 * Richiesta al metodo FIN.OrdinativoService.ricercaOrdinativoIncassoPerChiave()
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaOrdinativoIncassoPerChiave extends RicercaAttributiMovimentoGestione {

	private Ente ente;
	private RicercaOrdinativoIncassoK pRicercaOrdinativoIncassoK;

	private ParametriPaginazione paginazioneOrdinativiCollegati;
	
	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public RicercaOrdinativoIncassoK getpRicercaOrdinativoIncassoK() {
		return pRicercaOrdinativoIncassoK;
	}

	public void setpRicercaOrdinativoIncassoK(RicercaOrdinativoIncassoK pRicercaOrdinativoIncassoK) {
		this.pRicercaOrdinativoIncassoK = pRicercaOrdinativoIncassoK;
	}

	public ParametriPaginazione getPaginazioneOrdinativiCollegati() {
		return paginazioneOrdinativiCollegati;
	}

	public void setPaginazioneOrdinativiCollegati(ParametriPaginazione paginazioneOrdinativiCollegati) {
		this.paginazioneOrdinativiCollegati = paginazioneOrdinativiCollegati;
	}
}