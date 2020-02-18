/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.fakeimpl;

import it.csi.siac.siacfin2ser.frontend.webservice.DocumentoService;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaRelazioneDocumenti;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaRelazioneDocumentiResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAttivitaOnere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAttivitaOnereResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCausale770;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCausale770Response;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCodiceBollo;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCodiceBolloResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCodicePCC;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCodicePCCResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCodiceUfficioDestinatarioPCC;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCodiceUfficioDestinatarioPCCResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNaturaOnere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNaturaOnereResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNoteTesoriere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNoteTesoriereResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteDaAssociare;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteDaAssociareResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSommaNonSoggetta;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSommaNonSoggettaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoAvviso;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoAvvisoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoDocumento;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoDocumentoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoImpresa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoImpresaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoOnere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoOnereResponse;

public class DocumentoServiceFakeImpl implements DocumentoService {

	@Override
	public RicercaTipoDocumentoResponse ricercaTipoDocumento( RicercaTipoDocumento parameters) {
		return new RicercaTipoDocumentoResponse();
	}

	@Override
	public RicercaCodiceBolloResponse ricercaCodiceBollo(RicercaCodiceBollo parameters) {
		return new RicercaCodiceBolloResponse();
	}

	@Override
	public RicercaTipoImpresaResponse ricercaTipoImpresa(RicercaTipoImpresa parameters) {
		return new RicercaTipoImpresaResponse();
	}

	@Override
	public RicercaTipoAvvisoResponse ricercaTipoAvviso(RicercaTipoAvviso parameters) {
		return new RicercaTipoAvvisoResponse();
	}

	@Override
	public RicercaNaturaOnereResponse ricercaNaturaOnere(RicercaNaturaOnere parameters) {
		return new RicercaNaturaOnereResponse();
	}

	@Override
	public RicercaTipoOnereResponse ricercaTipoOnere(RicercaTipoOnere parameters) {
		return new RicercaTipoOnereResponse();
	}
	
	@Override
	public RicercaAttivitaOnereResponse ricercaAttivitaOnere(RicercaAttivitaOnere parameters) {
		return new RicercaAttivitaOnereResponse();
	}

	@Override
	public RicercaCausale770Response ricercaCausale770(RicercaCausale770 parameters) {
		return new RicercaCausale770Response();
	}

	@Override
	public RicercaNoteTesoriereResponse ricercaNoteTesoriere(RicercaNoteTesoriere parameters) {
		return new RicercaNoteTesoriereResponse();
	}

	@Override
	public RicercaCodicePCCResponse ricercaCodicePCC(RicercaCodicePCC parameters) {
		return new RicercaCodicePCCResponse();
	}

	@Override
	public RicercaCodiceUfficioDestinatarioPCCResponse ricercaCodiceUfficioDestinatarioPCC(RicercaCodiceUfficioDestinatarioPCC parameters) {
		return new RicercaCodiceUfficioDestinatarioPCCResponse();
	}

	@Override
	public RicercaQuoteDaAssociareResponse ricercaQuoteDaAssociare(RicercaQuoteDaAssociare parameters) {
		return new RicercaQuoteDaAssociareResponse();
	}

	@Override
	public AggiornaRelazioneDocumentiResponse collegaDocumenti(AggiornaRelazioneDocumenti parameters) {
		return new AggiornaRelazioneDocumentiResponse();
	}

	@Override
	public AggiornaRelazioneDocumentiResponse scollegaDocumenti(AggiornaRelazioneDocumenti parameters) {
		return new AggiornaRelazioneDocumentiResponse();
	}

	@Override
	public RicercaSommaNonSoggettaResponse ricercaSommaNonSoggetta(RicercaSommaNonSoggetta parameters) {
		return new RicercaSommaNonSoggettaResponse();
	}

}
