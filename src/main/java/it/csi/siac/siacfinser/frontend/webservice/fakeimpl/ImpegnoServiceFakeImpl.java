/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.fakeimpl;

import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaImpegno;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaImpegnoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaImpegno;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaImpegnoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceImpegno;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceImpegnoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegni;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegniResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegnoPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegnoPerChiaveResponse;

/**
 * Implementazione di default del servizio FIN.ImpegnoService
 * 
 * @author alagna
 * 
 */
public class ImpegnoServiceFakeImpl{

	public InserisceImpegnoResponse inserisceImpegno(InserisceImpegno parameters) {
		return new InserisceImpegnoResponse();
	}

	public AggiornaImpegnoResponse aggiornaImpegno(AggiornaImpegno parameters) {
		return new AggiornaImpegnoResponse();
	}

	public RicercaImpegnoPerChiaveResponse ricercaImpegnoPerChiave(
			RicercaImpegnoPerChiave parameters) {
		return new RicercaImpegnoPerChiaveResponse();
	}

	public RicercaImpegniResponse ricercaImpegni(RicercaImpegni parameters) {
		return new RicercaImpegniResponse();
	}

	public AnnullaImpegnoResponse annullaImpegno(AnnullaImpegno parameters) {
		return new AnnullaImpegnoResponse();
	}

}
