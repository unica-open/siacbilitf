/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.fakeimpl;

import it.csi.siac.siacfin2ser.frontend.webservice.DocumentoIvaSpesaService;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaIvaDifferitaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaIvaDifferitaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoSubdocumentoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaSubdocumentoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ContaDatiCollegatiSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ContaDatiCollegatiSubdocumentoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaIvaDifferitaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaIvaDifferitaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceSubdocumentoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioSubdocumentoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNoteCreditoIvaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNoteCreditoIvaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeSubdocumentoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaSubdocumentoIvaSpesaResponse;

public class DocumentoIvaSpesaServiceFakeImpl implements
		DocumentoIvaSpesaService {

	@Override
	public RicercaPuntualeSubdocumentoIvaSpesaResponse ricercaPuntualeSubdocumentoIvaSpesa(RicercaPuntualeSubdocumentoIvaSpesa parameters) {
		return new RicercaPuntualeSubdocumentoIvaSpesaResponse();
	}

	@Override
	public RicercaSinteticaSubdocumentoIvaSpesaResponse ricercaSinteticaSubdocumentoIvaSpesa(RicercaSinteticaSubdocumentoIvaSpesa parameters) {
		return new RicercaSinteticaSubdocumentoIvaSpesaResponse();
	}

	@Override
	public RicercaDettaglioSubdocumentoIvaSpesaResponse ricercaDettaglioSubdocumentoIvaSpesa(RicercaDettaglioSubdocumentoIvaSpesa parameters) {
		return new RicercaDettaglioSubdocumentoIvaSpesaResponse();
	}

	@Override
	public InserisceSubdocumentoIvaSpesaResponse inserisceSubdocumentoIvaSpesa(InserisceSubdocumentoIvaSpesa parameters) {
		return new InserisceSubdocumentoIvaSpesaResponse();
	}

	@Override
	public AggiornaSubdocumentoIvaSpesaResponse aggiornaSubdocumentoIvaSpesa(AggiornaSubdocumentoIvaSpesa parameters) {
		return new AggiornaSubdocumentoIvaSpesaResponse();
	}

	@Override
	public AggiornaStatoSubdocumentoIvaSpesaResponse aggiornaStatoSubdocumentoIvaSpesa(AggiornaStatoSubdocumentoIvaSpesa parameters) {
		return new AggiornaStatoSubdocumentoIvaSpesaResponse();
	}

	@Override
	public InserisceNotaCreditoIvaSpesaResponse inserisceNotaCreditoIvaSpesa(InserisceNotaCreditoIvaSpesa parameters) {
		return new InserisceNotaCreditoIvaSpesaResponse();
	}

	@Override
	public AggiornaNotaCreditoIvaSpesaResponse aggiornaNotaCreditoIvaSpesa(AggiornaNotaCreditoIvaSpesa parameters) {
		return new AggiornaNotaCreditoIvaSpesaResponse();
	}

	@Override
	public InserisceQuotaIvaDifferitaSpesaResponse inserisceQuotaIvaDifferitaSpesa(InserisceQuotaIvaDifferitaSpesa parameters) {
		return new InserisceQuotaIvaDifferitaSpesaResponse();
	}

	@Override
	public AggiornaQuotaIvaDifferitaSpesaResponse aggiornaQuotaIvaDifferitaSpesa(AggiornaQuotaIvaDifferitaSpesa parameters) {
		return new AggiornaQuotaIvaDifferitaSpesaResponse();
	}

	@Override
	public RicercaNoteCreditoIvaDocumentoSpesaResponse ricercaNoteCreditoIvaDocumentoSpesa(RicercaNoteCreditoIvaDocumentoSpesa parameters) {
		return new RicercaNoteCreditoIvaDocumentoSpesaResponse();
	}

	@Override
	public ContaDatiCollegatiSubdocumentoIvaSpesaResponse contaDatiCollegatiSubdocumentoIvaSpesa(ContaDatiCollegatiSubdocumentoIvaSpesa parameters) {
		return new ContaDatiCollegatiSubdocumentoIvaSpesaResponse();
	}

}
