/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.fakeimpl;


import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamenti;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamentiResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamentoPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamentoPerChiaveResponse;

/**
 * Implementazione di default del servizio FIN.AccertamentoService
 * 
 * @author rmontuori
 * 
 */

public class AccertamentoServiceFakeImpl{

	public InserisceAccertamentoResponse inserisceAccertamento(
			InserisceAccertamento parameters) {
		return new InserisceAccertamentoResponse();
	}

	public AggiornaAccertamentoResponse aggiornaAccertamento(
			AggiornaAccertamento parameters) {
		return new AggiornaAccertamentoResponse();
	}

	public RicercaAccertamentoPerChiaveResponse ricercaAccertamentoPerChiave(
			RicercaAccertamentoPerChiave parameters) {
		return new RicercaAccertamentoPerChiaveResponse();
	}

	public RicercaAccertamentiResponse ricercaAccertamenti(
			RicercaAccertamenti parameters) {
		return new RicercaAccertamentiResponse();
	}

	public AnnullaAccertamentoResponse annullaAccertamento(
			AnnullaAccertamento parameters) {
		return new AnnullaAccertamentoResponse();
	}

}
