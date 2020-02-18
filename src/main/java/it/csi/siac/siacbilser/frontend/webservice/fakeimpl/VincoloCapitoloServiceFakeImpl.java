/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.fakeimpl;

import it.csi.siac.siacbilser.frontend.webservice.VincoloCapitoloService;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaVincoloCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaVincoloCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaVincoloCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaVincoloCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AssociaCapitoloAlVincolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AssociaCapitoloAlVincoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceAnagraficaVincolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceAnagraficaVincoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioVincolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioVincoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVincolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVincoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.ScollegaCapitoloAlVincolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.ScollegaCapitoloAlVincoloResponse;

/**
 * Implementazione fake del servizio Gestione Vincolo Capitolo Service
 * 
 * @author rmontuori
 * 
 */
// @WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name =
// "VincoloCapitoloService")
// @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
// @BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class VincoloCapitoloServiceFakeImpl implements VincoloCapitoloService {

	@Override
	public InserisceAnagraficaVincoloResponse inserisceAnagraficaVincolo(InserisceAnagraficaVincolo parameters) {
		return new InserisceAnagraficaVincoloResponse();
	}

	@Override
	public RicercaVincoloResponse ricercaVincolo(RicercaVincolo parameters) {
		return new RicercaVincoloResponse();
	}

	@Override
	public AnnullaVincoloCapitoloResponse annullaVincoloCapitolo(AnnullaVincoloCapitolo parameters) {
		return new AnnullaVincoloCapitoloResponse();
	}

	@Override
	public AggiornaVincoloCapitoloResponse aggiornaVincoloCapitolo(AggiornaVincoloCapitolo parameters) {
		return new AggiornaVincoloCapitoloResponse();
	}

	@Override
	public AssociaCapitoloAlVincoloResponse associaCapitoloAlVincolo(AssociaCapitoloAlVincolo parameters) {
		return new AssociaCapitoloAlVincoloResponse();
	}

	@Override
	public ScollegaCapitoloAlVincoloResponse scollegaCapitoloAlVincolo(ScollegaCapitoloAlVincolo parameters) {
		return new ScollegaCapitoloAlVincoloResponse();
	}

	@Override
	public RicercaDettaglioVincoloResponse ricercaDettaglioVincolo(RicercaDettaglioVincolo parameters) {
		return new RicercaDettaglioVincoloResponse();
	}

}
