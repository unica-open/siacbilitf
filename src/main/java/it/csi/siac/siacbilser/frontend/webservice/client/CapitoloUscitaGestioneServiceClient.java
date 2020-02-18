/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.frontend.webservice.CapitoloUscitaGestioneService;
import it.csi.siac.siaccorser.frontend.webservice.client.BaseServiceClient;
import it.csi.siac.siaccorser.frontend.webservice.exception.SystemException;
import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.errore.ErroreCore;

/**
 * Client del servizio Bilancio CapitoloUscitaGestioneService
 * 
 * @author rmontuori
 * @deprecated utilizzare l'instanaziazione via Spring
 */
@Deprecated
public class CapitoloUscitaGestioneServiceClient extends BaseServiceClient{

	private CapitoloUscitaGestioneService port;
	
	public CapitoloUscitaGestioneServiceClient(){
		super();
	}

	/**
	 * Costruttore cui occorre passare l'endpoint
	 * 
	 * @param endpoint
	 * @throws SystemException
	 */
	private void createService() {
		try {
			wsdlURL = new URL(endpoint + "?wsdl");
			serviceName = new QName(BILSvcDictionary.NAMESPACE,
					"CapitoloUscitaGestioneService");
			service = Service.create(wsdlURL, serviceName);
			port = service.getPort(CapitoloUscitaGestioneService.class);
			
			((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

		} catch (MalformedURLException e) {
			throw new SystemException(
					new Errore(ErroreCore.ERRORE_DI_SISTEMA.toString(),
							wsdlURL.toString()));
		}
	}

	public CapitoloUscitaGestioneService getPort() {
		if (service==null)
			createService();
		
		return port;
	}
	
}
