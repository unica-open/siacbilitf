/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.client;

import it.csi.siac.siaccorser.frontend.webservice.client.BaseServiceClient;
import it.csi.siac.siaccorser.frontend.webservice.exception.SystemException;
import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.errore.ErroreCore;
import it.csi.siac.siacfinser.frontend.webservice.CartaContabileService;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

@Deprecated
public class CartaContabileServiceClient extends BaseServiceClient{
	
	CartaContabileService port;
	
	public CartaContabileServiceClient(){
		super();
	}

	private void createService()
			throws SystemException {
		try {
			wsdlURL = new URL(endpoint + "?wsdl");
			serviceName = new QName(FINSvcDictionary.NAMESPACE,
									"CartaContabileService");
			service = Service.create(wsdlURL, serviceName);
			port = service.getPort(CartaContabileService.class);
			
			((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

		} catch (MalformedURLException e) {
			throw new SystemException(
					new Errore(ErroreCore.ERRORE_DI_SISTEMA.toString(),
							wsdlURL.toString()));
		}
	}
	
	public CartaContabileService getPort() {
		if (service==null)
			createService();
		
		return port;
	}
}
