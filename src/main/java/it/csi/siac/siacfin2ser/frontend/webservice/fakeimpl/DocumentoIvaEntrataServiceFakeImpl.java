/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.fakeimpl;

import it.csi.siac.siacfin2ser.frontend.webservice.DocumentoIvaEntrataService;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaControregistrazione;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaControregistrazioneResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaIvaDifferitaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaIvaDifferitaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoSubdocumentoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaSubdocumentoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ContaDatiCollegatiSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ContaDatiCollegatiSubdocumentoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceControregistrazione;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceControregistrazioneResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaIvaDifferitaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaIvaDifferitaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceSubdocumentoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioSubdocumentoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNoteCreditoIvaDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNoteCreditoIvaDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeSubdocumentoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaSubdocumentoIvaEntrataResponse;

public class DocumentoIvaEntrataServiceFakeImpl implements DocumentoIvaEntrataService {

	@Override
	public RicercaPuntualeSubdocumentoIvaEntrataResponse ricercaPuntualeSubdocumentoIvaEntrata(RicercaPuntualeSubdocumentoIvaEntrata parameters) {
		return new RicercaPuntualeSubdocumentoIvaEntrataResponse();
	}

	@Override
	public RicercaSinteticaSubdocumentoIvaEntrataResponse ricercaSinteticaSubdocumentoIvaEntrata(RicercaSinteticaSubdocumentoIvaEntrata parameters) {
		return new RicercaSinteticaSubdocumentoIvaEntrataResponse();
	}

	@Override
	public RicercaDettaglioSubdocumentoIvaEntrataResponse ricercaDettaglioSubdocumentoIvaEntrata(RicercaDettaglioSubdocumentoIvaEntrata parameters) {
		return new RicercaDettaglioSubdocumentoIvaEntrataResponse();
	}

	@Override
	public InserisceSubdocumentoIvaEntrataResponse inserisceSubdocumentoIvaEntrata(InserisceSubdocumentoIvaEntrata parameters) {
		return new InserisceSubdocumentoIvaEntrataResponse();
	}

	@Override
	public AggiornaSubdocumentoIvaEntrataResponse aggiornaSubdocumentoIvaEntrata(AggiornaSubdocumentoIvaEntrata parameters) {
		return new AggiornaSubdocumentoIvaEntrataResponse();
	}

	@Override
	public AggiornaStatoSubdocumentoIvaEntrataResponse aggiornaStatoSubdocumentoIvaEntrata(AggiornaStatoSubdocumentoIvaEntrata parameters) {
		return new AggiornaStatoSubdocumentoIvaEntrataResponse();
	}

	@Override
	public InserisceNotaCreditoIvaEntrataResponse inserisceNotaCreditoIvaEntrata(InserisceNotaCreditoIvaEntrata parameters) {
		return new InserisceNotaCreditoIvaEntrataResponse();
	}

	@Override
	public AggiornaNotaCreditoIvaEntrataResponse aggiornaNotaCreditoIvaEntrata(AggiornaNotaCreditoIvaEntrata parameters) {
		return new AggiornaNotaCreditoIvaEntrataResponse();
	}

	@Override
	public InserisceQuotaIvaDifferitaEntrataResponse inserisceQuotaIvaDifferitaEntrata(InserisceQuotaIvaDifferitaEntrata parameters) {
		return new InserisceQuotaIvaDifferitaEntrataResponse();
	}

	@Override
	public AggiornaQuotaIvaDifferitaEntrataResponse aggiornaQuotaIvaDifferitaEntrata(AggiornaQuotaIvaDifferitaEntrata parameters) {
		return new AggiornaQuotaIvaDifferitaEntrataResponse();
	}

	@Override
	public InserisceControregistrazioneResponse inserisceControregistrazione(InserisceControregistrazione parameters) {
		return new InserisceControregistrazioneResponse();
	}
	
	@Override
	public AggiornaControregistrazioneResponse aggiornaControregistrazione(AggiornaControregistrazione parameters) {
		return new AggiornaControregistrazioneResponse();
	}

	@Override
	public RicercaNoteCreditoIvaDocumentoEntrataResponse ricercaNoteCreditoIvaDocumentoEntrata(RicercaNoteCreditoIvaDocumentoEntrata parameters) {
		return new RicercaNoteCreditoIvaDocumentoEntrataResponse();
	}

	@Override
	public ContaDatiCollegatiSubdocumentoIvaEntrataResponse contaDatiCollegatiSubdocumentoIvaEntrata(ContaDatiCollegatiSubdocumentoIvaEntrata parameters) {
		return new ContaDatiCollegatiSubdocumentoIvaEntrataResponse();
	}

}
