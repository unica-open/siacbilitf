/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.fakeimpl;

import it.csi.siac.siacbilser.frontend.webservice.ClassificatoreBilService;
import it.csi.siac.siacbilser.frontend.webservice.msg.ContaClassificatoriERestituisciSeSingolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.ContaClassificatoriERestituisciSeSingoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoreGerarchicoByCodiceAndTipoAndAnno;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoreGerarchicoByCodiceAndTipoAndAnnoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriBilByIdFiglio;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriBilByIdFiglioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriBilByIdPadre;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriBilByIdPadreResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriByRelazione;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriByRelazioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriByTipoElementoBil;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriByTipoElementoBilResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriByTipologieClassificatori;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriByTipologieClassificatoriResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriGenericiByTipoElementoBil;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriGenericiByTipoElementoBilResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiElementoPianoDeiContiByCodiceAndAnno;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiElementoPianoDeiContiByCodiceAndAnnoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiTreePianoDeiConti;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiTreePianoDeiContiResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiTreeSiope;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiTreeSiopeResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeClassificatore;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeClassificatoreResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaClassificatore;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaClassificatoreResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoClassificatore;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoClassificatoreGenerico;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoClassificatoreGenericoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoClassificatoreResponse;

/**
 * Implementazione fake del servizio BIL.ClassificatoreBilServiceFakeImpl
 * 
 * @author rmontuori
 * 
 */
public class ClassificatoreBilServiceFakeImpl implements ClassificatoreBilService {

	@Override
	public LeggiClassificatoriGenericiByTipoElementoBilResponse leggiClassificatoriGenericiByTipoElementoBil(LeggiClassificatoriGenericiByTipoElementoBil request) {
		return new LeggiClassificatoriGenericiByTipoElementoBilResponse();
	}

	@Override
	public LeggiClassificatoriByTipoElementoBilResponse leggiClassificatoriByTipoElementoBil(LeggiClassificatoriByTipoElementoBil request) {
		return new LeggiClassificatoriByTipoElementoBilResponse();
	}

	@Override
	public LeggiTreePianoDeiContiResponse leggiTreePianoDeiConti(LeggiTreePianoDeiConti request) {
		return new LeggiTreePianoDeiContiResponse();
	}

	@Override
	public LeggiClassificatoriBilByIdPadreResponse leggiClassificatoriByIdPadre(LeggiClassificatoriBilByIdPadre request) {
		return new LeggiClassificatoriBilByIdPadreResponse();
	}
	
	@Override
	public LeggiTreeSiopeResponse leggiTreeSiopeSpesa(LeggiTreeSiope request) {
		return new LeggiTreeSiopeResponse();
	}

	@Override
	public LeggiTreeSiopeResponse leggiTreeSiopeEntrata(LeggiTreeSiope request) {
		return new LeggiTreeSiopeResponse();
	}

	@Override
	public LeggiClassificatoriByRelazioneResponse leggiClassificatoriByRelazione(LeggiClassificatoriByRelazione request) {
		return new LeggiClassificatoriByRelazioneResponse();
	}

	@Override
	public LeggiClassificatoreGerarchicoByCodiceAndTipoAndAnnoResponse leggiClassificatoreGerarchicoByCodiceAndTipoAndAnno(LeggiClassificatoreGerarchicoByCodiceAndTipoAndAnno request) {
		return new LeggiClassificatoreGerarchicoByCodiceAndTipoAndAnnoResponse();
	}

	@Override
	public LeggiElementoPianoDeiContiByCodiceAndAnnoResponse leggiElementoPianoDeiContiByCodiceAndAnno(LeggiElementoPianoDeiContiByCodiceAndAnno request) {
		return new LeggiElementoPianoDeiContiByCodiceAndAnnoResponse();
	}

	@Override
	public RicercaSinteticaClassificatoreResponse ricercaSinteticaClassificatore(RicercaSinteticaClassificatore request) {
		return new RicercaSinteticaClassificatoreResponse();
	}

	@Override
	public ContaClassificatoriERestituisciSeSingoloResponse contaClassificatoriERestituisciSeSingolo(ContaClassificatoriERestituisciSeSingolo request) {
		return new ContaClassificatoriERestituisciSeSingoloResponse();
	}

	@Override
	public LeggiClassificatoriBilByIdFiglioResponse leggiClassificatoriByIdFiglio(LeggiClassificatoriBilByIdFiglio request) {
		return new LeggiClassificatoriBilByIdFiglioResponse();
	}

	@Override
	public LeggiClassificatoriByTipologieClassificatoriResponse leggiClassificatoriByTipologieClassificatori(LeggiClassificatoriByTipologieClassificatori request) {
		return new LeggiClassificatoriByTipologieClassificatoriResponse();
	}

	@Override
	public RicercaPuntualeClassificatoreResponse ricercaPuntualeClassificatore(RicercaPuntualeClassificatore request) {
		return new RicercaPuntualeClassificatoreResponse();
	}

	@Override
	public RicercaTipoClassificatoreResponse ricercaTipoClassificatore(RicercaTipoClassificatore request) {
		return new RicercaTipoClassificatoreResponse();
	}

	@Override
	public RicercaTipoClassificatoreGenericoResponse ricercaTipoClassificatoreGenerico(RicercaTipoClassificatoreGenerico request) {
		return new RicercaTipoClassificatoreGenericoResponse();
	}

}
