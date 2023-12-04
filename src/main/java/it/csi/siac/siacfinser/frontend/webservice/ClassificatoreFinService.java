/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice;

import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiClassificatoriGenericiByTipoMovimentoGest;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiClassificatoriGenericiByTipoMovimentoGestResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiClassificatoriGenericiByTipoOrdinativoGest;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiClassificatoriGenericiByTipoOrdinativoGestResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiClassificatoriGerarchiciByIdPadre;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiClassificatoriGerarchiciByIdPadreResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiClassificatoriGerarchiciILivelloByTipoMovimentoGest;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiClassificatoriGerarchiciILivelloByTipoMovimentoGestResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiTreeContoEconomico;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiTreeContoEconomicoResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio per la gestione dei Classificatori di FIN
 * 
 * @author rmontuori
 * @version $Id: $
 */
@WebService(targetNamespace = FINSvcDictionary.NAMESPACE, name = "ClassificatoreFinService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ClassificatoreFinService {


	@WebMethod
	@WebResult
	LeggiClassificatoriGerarchiciByIdPadreResponse leggiClassificatoriGerarchiciByIdPadre(@WebParam LeggiClassificatoriGerarchiciByIdPadre request);
	

	@WebMethod
	@WebResult
	LeggiClassificatoriGenericiByTipoMovimentoGestResponse leggiClassificatoriGenericiByTipoMovimentoGest(@WebParam LeggiClassificatoriGenericiByTipoMovimentoGest request);

	@WebMethod
	@WebResult
	LeggiClassificatoriGenericiByTipoOrdinativoGestResponse leggiClassificatoriGenericiByTipoOrdinativoGest(@WebParam LeggiClassificatoriGenericiByTipoOrdinativoGest request);

	@WebMethod
	@WebResult
	LeggiClassificatoriGerarchiciILivelloByTipoMovimentoGestResponse leggiClassificatoriGerarchiciILivelloByTipoMovimentoGest(@WebParam LeggiClassificatoriGerarchiciILivelloByTipoMovimentoGest request);
	
//	@WebMethod
//	@WebResult
//	LeggiTreePianoDeiContiResponse leggiTreePianoDeiConti(@WebParam LeggiTreePianoDeiConti request);
//	
	@WebMethod
	@WebResult
	LeggiTreeContoEconomicoResponse leggiTreeContoEconomico(@WebParam LeggiTreeContoEconomico request);
	
//	@WebMethod
//	@WebResult
//	LeggiTreeSiopeResponse leggiTreeContoEconomico(@WebParam LeggiTreeSiope request);
	
	
}

