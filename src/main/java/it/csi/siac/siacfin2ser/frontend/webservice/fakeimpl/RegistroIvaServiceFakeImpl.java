/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.fakeimpl;

import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.RegistroIvaService;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AllineaProtocolloRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AllineaProtocolloRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.BloccaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.BloccaRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RecuperaProtocolloRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RecuperaProtocolloRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.SbloccaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.SbloccaRegistroIvaResponse;

public class RegistroIvaServiceFakeImpl implements RegistroIvaService {

	@Override
	public InserisceRegistroIvaResponse inserisceRegistroIva(InserisceRegistroIva parameters) {
		return new InserisceRegistroIvaResponse();
	}

	@Override
	public AggiornaRegistroIvaResponse aggiornaRegistroIva(AggiornaRegistroIva parameters) {
		return new AggiornaRegistroIvaResponse();
	}

	@Override
	public RicercaRegistroIvaResponse ricercaRegistroIva(RicercaRegistroIva parameters) {
		return new RicercaRegistroIvaResponse();
	}

	@Override
	public EliminaRegistroIvaResponse eliminaRegistroIva(EliminaRegistroIva parameters) {
		return new EliminaRegistroIvaResponse();
	}

	@Override
	public
	RicercaDettaglioRegistroIvaResponse ricercaDettaglioRegistroIva(RicercaDettaglioRegistroIva parameters) {
		return new RicercaDettaglioRegistroIvaResponse();
	}

	@Override
	public
	RicercaSinteticaRegistroIvaResponse ricercaSinteticaRegistroIva( RicercaSinteticaRegistroIva parameters) {
		return new RicercaSinteticaRegistroIvaResponse();
	}

	@Override
	public BloccaRegistroIvaResponse bloccaRegistroIva(BloccaRegistroIva parameters) {
		return new BloccaRegistroIvaResponse();
	}

	@Override
	public SbloccaRegistroIvaResponse sbloccaRegistroIva(SbloccaRegistroIva parameters) {
		return new SbloccaRegistroIvaResponse();
	}

	@Override
	public AllineaProtocolloRegistroIvaResponse allineaProtocolloRegistroIva(AllineaProtocolloRegistroIva parameters) {
		return new AllineaProtocolloRegistroIvaResponse();
	}
	
	@Override
	public RecuperaProtocolloRegistroIvaResponse recuperaProtocolloRegistroIva(RecuperaProtocolloRegistroIva parameters) {
		return new RecuperaProtocolloRegistroIvaResponse();
	}

	@Override
	public AsyncServiceResponse allineaProtocolloRegistroIvaAsync(AsyncServiceRequestWrapper<AllineaProtocolloRegistroIva> parameters) {
		return new AsyncServiceResponse();
	}

	@Override
	public AsyncServiceResponse recuperaProtocolloRegistroIvaAsync(AsyncServiceRequestWrapper<RecuperaProtocolloRegistroIva> parameters) {
		return new AsyncServiceResponse();
	}

	
}
