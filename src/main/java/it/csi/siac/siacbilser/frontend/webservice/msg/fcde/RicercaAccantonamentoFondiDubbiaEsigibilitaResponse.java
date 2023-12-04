/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;

/**
 * Risposta al metodo BIL.FondiDubbiaEsigibilitaService.ricercaSinteticaFondiDubbiaEsigibilita()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaAccantonamentoFondiDubbiaEsigibilitaResponse extends BaseAccantonamentoFondiDubbiaEsigibilitaResponse {
	// Nothing to add
}
