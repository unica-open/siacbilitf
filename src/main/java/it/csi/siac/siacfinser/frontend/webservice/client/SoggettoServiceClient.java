/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import it.csi.siac.siaccorser.frontend.webservice.client.BaseServiceClient;
import it.csi.siac.siaccorser.frontend.webservice.exception.SystemException;
import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.errore.ErroreCore;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.frontend.webservice.SoggettoService;


/**
 * Client del servizio FIN SoggettoService
 * 
 * @author paolos
 * 
 */
@Deprecated
public class SoggettoServiceClient extends BaseServiceClient{
	
	private SoggettoService port;
	
	
	public SoggettoServiceClient(){
		super();
	}
	
	/**
	 * Costruttore cui occorre passare l'endpoint
	 * 
	 * @param endpoint
	 * @throws SystemException
	 */
	private void createService()
			throws SystemException {
		try {
			wsdlURL = new URL(endpoint + "?wsdl");
			serviceName = new QName(FINSvcDictionary.NAMESPACE,
									"SoggettoService");
			service = Service.create(wsdlURL, serviceName);
			port = service.getPort(SoggettoService.class);
			
			((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

		} catch (MalformedURLException e) {
			throw new SystemException(
					new Errore(ErroreCore.ERRORE_DI_SISTEMA.toString(),
							wsdlURL.toString()));
		}
	}
	
	public SoggettoService getPort() {
		if (service==null)
			createService();
		
		return port;
	}

}
