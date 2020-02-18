/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.fakeimpl;

import it.csi.siac.siacfin2ser.frontend.webservice.DocumentoSpesaService;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaAttributiQuotaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaAttributiQuotaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDocumentoDiSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDocumentoDiSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaImportiQuoteDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaImportiQuoteDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaOnereSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaOnereSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoDocumentoDiSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoDocumentoDiSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaNotaCreditoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaNotaCreditoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaProvvisorioQuoteSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaProvvisorioQuoteSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AttivaRegistrazioniContabiliSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AttivaRegistrazioniContabiliSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaOnereSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaOnereSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaQuotaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaQuotaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoPerProvvisoriSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoPerProvvisoriSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisciOnereSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisciOnereSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ProporzionaImportiSplitReverse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ProporzionaImportiSplitReverseResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioQuotaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioQuotaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDocumentiCollegatiByDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDocumentiCollegatiByDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaModulareDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaModulareDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaOnereByDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaOnereByDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteByDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteByDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteDaEmettereSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteDaEmettereSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotePerProvvisorioSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotePerProvvisorioSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteByDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteByDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.SpezzaQuotaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.SpezzaQuotaSpesaResponse;

public class DocumentoSpesaServiceFakeImpl implements DocumentoSpesaService {

	@Override
	public RicercaPuntualeDocumentoSpesaResponse ricercaPuntualeDocumentoSpesa(RicercaPuntualeDocumentoSpesa parameters) {
		return new RicercaPuntualeDocumentoSpesaResponse();
	}

	@Override
	public RicercaSinteticaDocumentoSpesaResponse ricercaSinteticaDocumentoSpesa(RicercaSinteticaDocumentoSpesa parameters) {
		return new RicercaSinteticaDocumentoSpesaResponse();
	}

	@Override
	public RicercaDettaglioDocumentoSpesaResponse ricercaDettaglioDocumentoSpesa(RicercaDettaglioDocumentoSpesa parameters) {
		return new RicercaDettaglioDocumentoSpesaResponse();
	}

	@Override
	public InserisceDocumentoSpesaResponse inserisceDocumentoSpesa(InserisceDocumentoSpesa parameters) {
		return new InserisceDocumentoSpesaResponse();
	}

	@Override
	public InserisceQuotaDocumentoSpesaResponse inserisceQuotaDocumentoSpesa(InserisceQuotaDocumentoSpesa parameters) {
		return new InserisceQuotaDocumentoSpesaResponse();
	}

	@Override
	public AggiornaQuotaDocumentoSpesaResponse aggiornaQuotaDocumentoSpesa(AggiornaQuotaDocumentoSpesa parameters) {
		return new AggiornaQuotaDocumentoSpesaResponse();
	}

	@Override
	public AggiornaDocumentoDiSpesaResponse aggiornaDocumentoDiSpesa(AggiornaDocumentoDiSpesa parameters) {
		return new AggiornaDocumentoDiSpesaResponse();
	}

	@Override
	public AggiornaStatoDocumentoDiSpesaResponse aggiornaStatoDocumentoDiSpesa(AggiornaStatoDocumentoDiSpesa parameters) {
		return new AggiornaStatoDocumentoDiSpesaResponse();
	}

	@Override
	public AnnullaDocumentoSpesaResponse annullaDocumentoSpesa(AnnullaDocumentoSpesa parameters) {
		return new AnnullaDocumentoSpesaResponse();
	}

	@Override
	public EliminaQuotaDocumentoSpesaResponse eliminaQuotaDocumentoSpesa(EliminaQuotaDocumentoSpesa parameters) {
		return new EliminaQuotaDocumentoSpesaResponse();
	}

	@Override
	public RicercaQuotaSpesaResponse ricercaQuotaSpesa(RicercaQuotaSpesa parameters) {
		return new RicercaQuotaSpesaResponse();
	}
	
	@Override
	public RicercaDettaglioQuotaSpesaResponse ricercaDettaglioQuotaSpesa(RicercaDettaglioQuotaSpesa parameters) {
		return new RicercaDettaglioQuotaSpesaResponse();
	}

	@Override
	public RicercaQuoteByDocumentoSpesaResponse ricercaQuoteByDocumentoSpesa(RicercaQuoteByDocumentoSpesa parameters) {
		return new RicercaQuoteByDocumentoSpesaResponse();
	}

	@Override
	public InserisciOnereSpesaResponse inserisciOnereSpesa(InserisciOnereSpesa parameters) {
		return new InserisciOnereSpesaResponse();
	}

	@Override
	public AggiornaOnereSpesaResponse aggiornaOnereSpesa(AggiornaOnereSpesa parameters) {
		return new AggiornaOnereSpesaResponse();
	}

	@Override
	public EliminaOnereSpesaResponse eliminaOnereSpesa(EliminaOnereSpesa parameters) {
		return new EliminaOnereSpesaResponse();
	}

	@Override
	public RicercaOnereByDocumentoSpesaResponse ricercaOnereByDocumentoSpesa(RicercaOnereByDocumentoSpesa parameters) {
		return new RicercaOnereByDocumentoSpesaResponse();
	}

	@Override
	public InserisceNotaCreditoSpesaResponse inserisceNotaCreditoSpesa(InserisceNotaCreditoSpesa parameters) {
		return new InserisceNotaCreditoSpesaResponse();
	}

	@Override
	public AggiornaNotaCreditoSpesaResponse aggiornaNotaCreditoSpesa(AggiornaNotaCreditoSpesa parameters) {
		return new AggiornaNotaCreditoSpesaResponse();
	}

	@Override
	public RicercaDocumentiCollegatiByDocumentoSpesaResponse ricercaDocumentiCollegatiByDocumentoSpesa(RicercaDocumentiCollegatiByDocumentoSpesa parameters) {
		return new RicercaDocumentiCollegatiByDocumentoSpesaResponse();
	}


	@Override
	public InserisceDocumentoSpesaResponse inserisceTestataDocumentoSpesa(InserisceDocumentoSpesa parameters) {
		return new InserisceDocumentoSpesaResponse();
	}

	@Override
	public AggiornaDocumentoDiSpesaResponse aggiornaTestataDocumentoDiSpesa(AggiornaDocumentoDiSpesa parameters) {
		return new AggiornaDocumentoDiSpesaResponse();
	}

	@Override
	public RicercaSinteticaDocumentoSpesaResponse ricercaSinteticaTestataDocumentoSpesa(RicercaSinteticaDocumentoSpesa parameters) {
		return new RicercaSinteticaDocumentoSpesaResponse();
	}

	@Override
	public AnnullaNotaCreditoSpesaResponse annullaNotaCreditoSpesa(AnnullaNotaCreditoSpesa parameters) {
		return new AnnullaNotaCreditoSpesaResponse();
	}

	@Override
	public AggiornaAttributiQuotaDocumentoSpesaResponse aggiornaAttributiQuotaDocumentoSpesa(AggiornaAttributiQuotaDocumentoSpesa parameters) {
		return new AggiornaAttributiQuotaDocumentoSpesaResponse();
	}

	@Override
	public RicercaQuoteDaEmettereSpesaResponse ricercaQuoteDaEmettereSpesa(RicercaQuoteDaEmettereSpesa parameters) {
		return new RicercaQuoteDaEmettereSpesaResponse();
	}

	@Override
	public AttivaRegistrazioniContabiliSpesaResponse attivaRegistrazioniContabiliSpesa(AttivaRegistrazioniContabiliSpesa parameters) {
		return new AttivaRegistrazioniContabiliSpesaResponse();
	}

	@Override
	public AggiornaImportiQuoteDocumentoSpesaResponse aggiornaImportoQuoteDocumentoSpesa(AggiornaImportiQuoteDocumentoSpesa parameters) {
		return new AggiornaImportiQuoteDocumentoSpesaResponse();
	}

	@Override
	public AggiornaImportiQuoteDocumentoSpesaResponse aggiornaImportoDaDedurreQuoteDocumentoSpesa(AggiornaImportiQuoteDocumentoSpesa parameters) {
		return new AggiornaImportiQuoteDocumentoSpesaResponse();
	}

	@Override
	public ProporzionaImportiSplitReverseResponse proporzionaImportiSplitReverse(ProporzionaImportiSplitReverse parameters) {
		return new ProporzionaImportiSplitReverseResponse();
	}

	@Override
	public RicercaQuotePerProvvisorioSpesaResponse ricercaQuotePerProvvisorioSpesa(RicercaQuotePerProvvisorioSpesa parameters) {
		return new RicercaQuotePerProvvisorioSpesaResponse();
	}

	@Override
	public InserisceDocumentoPerProvvisoriSpesaResponse inserisceDocumentoPerProvvisoriSpesa(InserisceDocumentoPerProvvisoriSpesa parameters) {
		return new InserisceDocumentoPerProvvisoriSpesaResponse();
	}

	@Override
	public AssociaProvvisorioQuoteSpesaResponse associaProvvisorioQuoteSpesa(AssociaProvvisorioQuoteSpesa parameters) {
		return new AssociaProvvisorioQuoteSpesaResponse();
	}

	@Override
	public RicercaSinteticaModulareQuoteByDocumentoSpesaResponse ricercaSinteticaModulareQuoteByDocumentoSpesa(RicercaSinteticaModulareQuoteByDocumentoSpesa parameters) {
		return new RicercaSinteticaModulareQuoteByDocumentoSpesaResponse();
	}

	@Override
	public RicercaModulareDocumentoSpesaResponse ricercaModulareDocumentoSpesa(RicercaModulareDocumentoSpesa parameters) {
		return new RicercaModulareDocumentoSpesaResponse();
	}

	@Override
	public RicercaSinteticaModulareDocumentoSpesaResponse ricercaSinteticaModulareDocumentoSpesa(RicercaSinteticaModulareDocumentoSpesa parameters) {
		return new RicercaSinteticaModulareDocumentoSpesaResponse();
	}

	@Override
	public SpezzaQuotaSpesaResponse spezzaQuotaSpesa(SpezzaQuotaSpesa parameters) {
		return new SpezzaQuotaSpesaResponse();
	}

	@Override
	public RicercaSinteticaModulareQuoteSpesaResponse ricercaSinteticaModulareQuoteSpesa(RicercaSinteticaModulareQuoteSpesa parameters) {
		return new RicercaSinteticaModulareQuoteSpesaResponse();
	}

}
