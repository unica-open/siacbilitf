/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.fakeimpl;

import it.csi.siac.siacfin2ser.frontend.webservice.GruppoAttivitaIvaService;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaGruppoAttivitaIvaEProrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaGruppoAttivitaIvaEProrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaProrataEChiusuraGruppoIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaProrataEChiusuraGruppoIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceGruppoAttivitaIvaEProrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceGruppoAttivitaIvaEProrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceProrataEChiusuraGruppoIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceProrataEChiusuraGruppoIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioAnnualizzataGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioAnnualizzataGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaGruppoAttivitaIvaResponse;

public class GruppoAttivitaIvaServiceFakeImpl implements GruppoAttivitaIvaService {

	@Override
	public RicercaGruppoAttivitaIvaResponse ricercaGruppoAttivitaIva(RicercaGruppoAttivitaIva parameters) {
		return new RicercaGruppoAttivitaIvaResponse();
	}
	@Override
	public RicercaSinteticaGruppoAttivitaIvaResponse ricercaSinteticaGruppoAttivitaIva(RicercaSinteticaGruppoAttivitaIva parameters) {
		return new RicercaSinteticaGruppoAttivitaIvaResponse();
	}
	@Override
	public RicercaDettaglioGruppoAttivitaIvaResponse ricercaDettaglioGruppoAttivitaIva(RicercaDettaglioGruppoAttivitaIva parameters) {
		return new RicercaDettaglioGruppoAttivitaIvaResponse();
	}
	
	@Override
	public RicercaDettaglioAnnualizzataGruppoAttivitaIvaResponse ricercaDettaglioAnnualizzataGruppoAttivitaIva(RicercaDettaglioAnnualizzataGruppoAttivitaIva parameters) {
		return new RicercaDettaglioAnnualizzataGruppoAttivitaIvaResponse();
	}

	@Override
	public InserisceGruppoAttivitaIvaResponse inserisceGruppoAttivitaIva(InserisceGruppoAttivitaIva parameters) {
		return new InserisceGruppoAttivitaIvaResponse();
	}
	
	@Override
	public InserisceProrataEChiusuraGruppoIvaResponse inserisceProrataEChiusuraGruppoIva(InserisceProrataEChiusuraGruppoIva parameters) {
		return new InserisceProrataEChiusuraGruppoIvaResponse();
	}
	
	@Override
	public InserisceGruppoAttivitaIvaEProrataResponse inserisceGruppoAttivitaIvaEProrata(InserisceGruppoAttivitaIvaEProrata parameters) {
		return new InserisceGruppoAttivitaIvaEProrataResponse();
	}

	@Override
	public AggiornaGruppoAttivitaIvaResponse aggiornaGruppoAttivitaIva(AggiornaGruppoAttivitaIva parameters) {
		return new AggiornaGruppoAttivitaIvaResponse();
	}
	
	@Override
	public AggiornaProrataEChiusuraGruppoIvaResponse aggiornaProrataEChiusuraGruppoIva(AggiornaProrataEChiusuraGruppoIva parameters) {
		return new AggiornaProrataEChiusuraGruppoIvaResponse();
	}
	
	@Override
	public AggiornaGruppoAttivitaIvaEProrataResponse aggiornaGruppoAttivitaIvaEProrata(AggiornaGruppoAttivitaIvaEProrata parameters) {
		return new AggiornaGruppoAttivitaIvaEProrataResponse();
	}

	@Override
	public EliminaGruppoAttivitaIvaResponse eliminaGruppoAttivitaIva(EliminaGruppoAttivitaIva parameters) {
		return new EliminaGruppoAttivitaIvaResponse();
	}
	

}
