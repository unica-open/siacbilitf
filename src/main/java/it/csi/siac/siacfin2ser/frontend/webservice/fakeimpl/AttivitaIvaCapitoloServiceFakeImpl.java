/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.fakeimpl;

import it.csi.siac.siacfin2ser.frontend.webservice.AttivitaIvaCapitoloService;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaRelazioneAttivitaIvaCapitolo;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaRelazioneAttivitaIvaCapitoloResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceRelazioneAttivitaIvaCapitolo;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceRelazioneAttivitaIvaCapitoloResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaRelazioneAttivitaIvaCapitolo;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaRelazioneAttivitaIvaCapitoloResponse;

public class AttivitaIvaCapitoloServiceFakeImpl implements AttivitaIvaCapitoloService {

	@Override
	public RicercaRelazioneAttivitaIvaCapitoloResponse ricercaRelazioneAttivitaIvaCapitolo(RicercaRelazioneAttivitaIvaCapitolo parameters) {
		return new RicercaRelazioneAttivitaIvaCapitoloResponse();
	}

	@Override
	public InserisceRelazioneAttivitaIvaCapitoloResponse inserisceRelazioneAttivitaIvaCapitolo(InserisceRelazioneAttivitaIvaCapitolo parameters) {
		return new InserisceRelazioneAttivitaIvaCapitoloResponse();
	}

	@Override
	public EliminaRelazioneAttivitaIvaCapitoloResponse eliminaRelazioneAttivitaIvaCapitolo(EliminaRelazioneAttivitaIvaCapitolo parameters) {
		return new EliminaRelazioneAttivitaIvaCapitoloResponse();
	}

}
