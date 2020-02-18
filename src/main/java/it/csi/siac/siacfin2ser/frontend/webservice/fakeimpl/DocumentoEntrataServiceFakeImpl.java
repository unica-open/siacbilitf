/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.fakeimpl;

import it.csi.siac.siacfin2ser.frontend.webservice.DocumentoEntrataService;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDocumentoDiEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDocumentoDiEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaImportiQuoteDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaImportiQuoteDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoDocumentoDiEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoDocumentoDiEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaNotaCreditoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaNotaCreditoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaProvvisorioQuoteEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaProvvisorioQuoteEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AttivaRegistrazioniContabiliEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AttivaRegistrazioniContabiliEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaQuotaDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaQuotaDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EmettiFatturaFelEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EmettiFatturaFelEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoPerProvvisoriEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoPerProvvisoriEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioQuotaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioQuotaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDocumentiCollegatiByDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDocumentiCollegatiByDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaModulareDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaModulareDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteByDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteByDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteDaEmettereEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteDaEmettereEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotePerProvvisorioEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotePerProvvisorioEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteByDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteByDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.SpezzaQuotaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.SpezzaQuotaEntrataResponse;

public class DocumentoEntrataServiceFakeImpl implements DocumentoEntrataService {

	@Override
	public RicercaDettaglioDocumentoEntrataResponse ricercaDettaglioDocumentoEntrata(RicercaDettaglioDocumentoEntrata parameters) {
		return new RicercaDettaglioDocumentoEntrataResponse();
	}

	@Override
	public RicercaPuntualeDocumentoEntrataResponse ricercaPuntualeDocumentoEntrata(RicercaPuntualeDocumentoEntrata parameters) {
		return new RicercaPuntualeDocumentoEntrataResponse();
	}

	@Override
	public RicercaSinteticaDocumentoEntrataResponse ricercaSinteticaDocumentoEntrata(RicercaSinteticaDocumentoEntrata parameters) {
		return new RicercaSinteticaDocumentoEntrataResponse();
	}

	@Override
	public InserisceDocumentoEntrataResponse inserisceDocumentoEntrata(InserisceDocumentoEntrata parameters) {
		return new InserisceDocumentoEntrataResponse();
	}

	@Override
	public InserisceQuotaDocumentoEntrataResponse inserisceQuotaDocumentoEntrata(InserisceQuotaDocumentoEntrata parameters) {
		return new InserisceQuotaDocumentoEntrataResponse();
	}

	@Override
	public AggiornaQuotaDocumentoEntrataResponse aggiornaQuotaDocumentoEntrata(AggiornaQuotaDocumentoEntrata parameters) {
		return new AggiornaQuotaDocumentoEntrataResponse();
	}

	@Override
	public AggiornaDocumentoDiEntrataResponse aggiornaDocumentoDiEntrata(AggiornaDocumentoDiEntrata parameters) {
		return new AggiornaDocumentoDiEntrataResponse();
	}

	@Override
	public InserisceNotaCreditoEntrataResponse inserisceNotaCreditoEntrata(InserisceNotaCreditoEntrata parameters) {
		return new InserisceNotaCreditoEntrataResponse();
	}

	@Override
	public AggiornaStatoDocumentoDiEntrataResponse aggiornaStatoDocumentoDiEntrata(AggiornaStatoDocumentoDiEntrata parameters) {
		return new AggiornaStatoDocumentoDiEntrataResponse();
	}

	@Override
	public AnnullaDocumentoEntrataResponse annullaDocumentoEntrata(AnnullaDocumentoEntrata parameters) {
		return new AnnullaDocumentoEntrataResponse();
	}

	@Override
	public EliminaQuotaDocumentoEntrataResponse eliminaQuotaDocumentoEntrata(EliminaQuotaDocumentoEntrata parameters) {
		return new EliminaQuotaDocumentoEntrataResponse();
	}

	@Override
	public RicercaQuotaEntrataResponse ricercaQuotaEntrata(RicercaQuotaEntrata parameters) {
		return new RicercaQuotaEntrataResponse();
	}

	@Override
	public RicercaQuoteByDocumentoEntrataResponse ricercaQuoteByDocumentoEntrata(RicercaQuoteByDocumentoEntrata parameters) {
		return new RicercaQuoteByDocumentoEntrataResponse();
	}

	@Override
	public RicercaDocumentiCollegatiByDocumentoEntrataResponse ricercaDocumentiCollegatiByDocumentoEntrata(RicercaDocumentiCollegatiByDocumentoEntrata parameters) {
		return new RicercaDocumentiCollegatiByDocumentoEntrataResponse();
	}

	@Override
	public AggiornaNotaCreditoEntrataResponse aggiornaNotaCreditoEntrata(AggiornaNotaCreditoEntrata parameters) {
		return new AggiornaNotaCreditoEntrataResponse();
	}


	@Override
	public InserisceDocumentoEntrataResponse inserisceTestataDocumentoEntrata(InserisceDocumentoEntrata parameters) {
		return new InserisceDocumentoEntrataResponse();
	}

	@Override
	public AggiornaDocumentoDiEntrataResponse aggiornaTestataDocumentoDiEntrata(AggiornaDocumentoDiEntrata parameters) {
		return new AggiornaDocumentoDiEntrataResponse();
	}

	@Override
	public RicercaSinteticaDocumentoEntrataResponse ricercaSinteticaTestataDocumentoEntrata(RicercaSinteticaDocumentoEntrata parameters) {
		return new RicercaSinteticaDocumentoEntrataResponse();
	}

	@Override
	public AnnullaNotaCreditoEntrataResponse annullaNotaCreditoEntrata(AnnullaNotaCreditoEntrata parameters) {
		return new AnnullaNotaCreditoEntrataResponse();
	}

	@Override
	public RicercaDettaglioQuotaEntrataResponse ricercaDettaglioQuotaEntrata(RicercaDettaglioQuotaEntrata parameters) {
		return new RicercaDettaglioQuotaEntrataResponse();
	}

	@Override
	public RicercaQuoteDaEmettereEntrataResponse ricercaQuoteDaEmettereEntrata(RicercaQuoteDaEmettereEntrata parameters) {
		return new RicercaQuoteDaEmettereEntrataResponse();
	}

	@Override
	public AttivaRegistrazioniContabiliEntrataResponse attivaRegistrazioniContabiliEntrata(AttivaRegistrazioniContabiliEntrata parameters) {
		return new AttivaRegistrazioniContabiliEntrataResponse();
	}

	@Override
	public AggiornaImportiQuoteDocumentoEntrataResponse aggiornaImportoQuoteDocumentoEntrata(AggiornaImportiQuoteDocumentoEntrata parameters) {
		return new AggiornaImportiQuoteDocumentoEntrataResponse();
	}

	@Override
	public AggiornaImportiQuoteDocumentoEntrataResponse aggiornaImportoDaDedurreQuoteDocumentoEntrata(AggiornaImportiQuoteDocumentoEntrata parameters) {
		return new AggiornaImportiQuoteDocumentoEntrataResponse();
	}

	@Override
	public RicercaQuotePerProvvisorioEntrataResponse ricercaQuotePerProvvisorioEntrata(RicercaQuotePerProvvisorioEntrata parameters) {
		return new RicercaQuotePerProvvisorioEntrataResponse();
	}

	@Override
	public AssociaProvvisorioQuoteEntrataResponse associaProvvisorioQuoteEntrata(AssociaProvvisorioQuoteEntrata parameters) {
		return new AssociaProvvisorioQuoteEntrataResponse();
	}

	@Override
	public InserisceDocumentoPerProvvisoriEntrataResponse inserisceDocumentoPerProvvisoriEntrata(InserisceDocumentoPerProvvisoriEntrata parameters) {
		return new InserisceDocumentoPerProvvisoriEntrataResponse();
	}

	@Override
	public RicercaSinteticaModulareQuoteByDocumentoEntrataResponse ricercaSinteticaModulareQuoteByDocumentoEntrata(RicercaSinteticaModulareQuoteByDocumentoEntrata parameters) {
		return new RicercaSinteticaModulareQuoteByDocumentoEntrataResponse();
	}

	@Override
	public RicercaModulareDocumentoEntrataResponse ricercaModulareDocumentoEntrata(RicercaModulareDocumentoEntrata parameters) {
		return new RicercaModulareDocumentoEntrataResponse();
	}

	@Override
	public RicercaSinteticaModulareDocumentoEntrataResponse ricercaSinteticaModulareDocumentoEntrata(RicercaSinteticaModulareDocumentoEntrata parameters) {
		return new RicercaSinteticaModulareDocumentoEntrataResponse();
	}

	@Override
	public SpezzaQuotaEntrataResponse spezzaQuotaEntrata(SpezzaQuotaEntrata parameters) {
		return new SpezzaQuotaEntrataResponse();
	}

	@Override
	public RicercaSinteticaModulareQuoteEntrataResponse ricercaSinteticaModulareQuoteEntrata(RicercaSinteticaModulareQuoteEntrata parameters) {
		return new RicercaSinteticaModulareQuoteEntrataResponse();
	}

	// SIAC-6565
	@Override
	public EmettiFatturaFelEntrataResponse emettiFatturaFelEntrata(EmettiFatturaFelEntrata parameters) {
		return new EmettiFatturaFelEntrataResponse();
	}

}
