/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.BaseAccantonamentoFondiDubbiaEsigibilitaResponse;

/**
 * Risposta al metodo BIL.FondiDubbiaEsigibilitaService.ripristinaSinteticaFondiDubbiaEsigibilita()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RipristinaAccantonamentoFondiDubbiaEsigibilitaGestioneResponse extends BaseAccantonamentoFondiDubbiaEsigibilitaResponse {
	// Nothing to add
}
