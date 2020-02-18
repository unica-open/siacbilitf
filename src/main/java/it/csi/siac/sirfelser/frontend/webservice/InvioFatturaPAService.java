/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.InvioFatturaPAResponse;
import it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.ObjectFactoryInvioFat;
import it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.model.ObjectFactoryModelInvioFat;
import it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice.DatiPortaleFattureType;
import it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice.EmbeddedXMLType;
import it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice.InformazioniAggiuntiveType;
import it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice.ObjectFactoryServ;

//@DataBinding(org.apache.cxf.jaxb.JAXBDataBinding.class)
@WebService(targetNamespace = "http://www.csi.it/sirfel/InvioFatturaPA-1.0", name = "InvioFatturaPA")
@XmlSeeAlso({ObjectFactoryServ.class, ObjectFactoryInvioFat.class, ObjectFactoryModelInvioFat.class})
public interface InvioFatturaPAService{
	
	/**
	 * Invio della fattura PA
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebResult(name = "Result", targetNamespace = "http://www.csi.it/sirfel/InvioFatturaPA-1.0")
	@RequestWrapper(localName = "InvioFatturaPA", targetNamespace = "http://www.csi.it/sirfel/InvioFatturaPA-1.0", className = "it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.InvioFatturaPA")
	@WebMethod(operationName = "InvioFatturaPA", action = "http://www.csi.it/sirfel/InvioFatturaPA-1.0/InvioFatturaPA")
	@ResponseWrapper(localName = "InvioFatturaPAResponse", targetNamespace = "http://www.csi.it/sirfel/InvioFatturaPA-1.0", className = "it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.InvioFatturaPAResponse")
	InvioFatturaPAResponse.Result invioFatturaPA(
		@WebParam(name = "DatiPortaleFatture", targetNamespace = "http://www.csi.it/sirfel/InvioFatturaPA-1.0") DatiPortaleFattureType datiPortaleFatture,
		@WebParam(name = "FatturaElettronica", targetNamespace = "http://www.csi.it/sirfel/InvioFatturaPA-1.0") EmbeddedXMLType fatturaElettronica,
		@WebParam(name = "CodiceEnte", targetNamespace = "http://www.csi.it/sirfel/InvioFatturaPA-1.0") java.lang.String codiceEnte,
		@WebParam(name = "InformazioniAggiuntive", targetNamespace = "http://www.csi.it/sirfel/InvioFatturaPA-1.0") InformazioniAggiuntiveType informazioniAggiuntive);

}
