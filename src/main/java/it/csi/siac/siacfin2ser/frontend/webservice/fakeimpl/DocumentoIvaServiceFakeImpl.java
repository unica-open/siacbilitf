/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.fakeimpl;

import it.csi.siac.siacfin2ser.frontend.webservice.DocumentoIvaService;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAliquotaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAliquotaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAttivitaIvaLegateAGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAttivitaIvaLegateAGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoRegistrazioneIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoRegistrazioneIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaValuta;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaValutaResponse;

public class DocumentoIvaServiceFakeImpl implements DocumentoIvaService {

	@Override
	public RicercaTipoRegistrazioneIvaResponse ricercaTipoRegistrazioneIva(RicercaTipoRegistrazioneIva parameters) {
		return new RicercaTipoRegistrazioneIvaResponse();
	}

	@Override
	public RicercaAttivitaIvaResponse ricercaAttivitaIva(RicercaAttivitaIva parameters) {
		return new RicercaAttivitaIvaResponse();
	}
	
	@Override
	public RicercaAttivitaIvaLegateAGruppoAttivitaIvaResponse ricercaAttivitaIvaLegateAGruppoAttivitaIva(RicercaAttivitaIvaLegateAGruppoAttivitaIva parameters) {
		return new RicercaAttivitaIvaLegateAGruppoAttivitaIvaResponse();
	}

	@Override
	public RicercaAliquotaIvaResponse ricercaAliquotaIva(RicercaAliquotaIva parameters) {
		return new RicercaAliquotaIvaResponse();
	}

	@Override
	public RicercaValutaResponse ricercaValuta(RicercaValuta parameters) {
		return new RicercaValutaResponse();
	}

}
