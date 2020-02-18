/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.client;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCapitoloDiUscitaPrevisione;
import it.csi.siac.siaccorser.model.Esito;

@Deprecated
public class CapitoloUscitaPrevisioneServiceClientTest {

	private CapitoloUscitaPrevisioneServiceClient client;

	@Before
	public void setUp() throws Exception {
		client = new CapitoloUscitaPrevisioneServiceClient();
		client.setEndpoint("http://dev-spjb601-sl01.self.csi.it:12110/siacbilser/CapitoloUscitaPrevisioneService?wsdl");
	}

	@Test
	public void testInserisceCapitoloDiUscitaPrevisione() {

		InserisceCapitoloDiUscitaPrevisione req = new InserisceCapitoloDiUscitaPrevisione();


		Assert.assertTrue("risposta serivio in errore",
				client.getPort().inserisceCapitoloDiUscitaPrevisione(req)
						.getEsito().equals(Esito.SUCCESSO));
	}

}
