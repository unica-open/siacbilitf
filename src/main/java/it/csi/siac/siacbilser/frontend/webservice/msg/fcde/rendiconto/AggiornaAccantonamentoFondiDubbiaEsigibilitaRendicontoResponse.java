/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.BaseAccantonamentoFondiDubbiaEsigibilitaResponse;

/**
 * Risposta al metodo BIL.FondiDubbiaEsigibilitaService.aggiornaSinteticaFondiDubbiaEsigibilita()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaAccantonamentoFondiDubbiaEsigibilitaRendicontoResponse extends BaseAccantonamentoFondiDubbiaEsigibilitaResponse {
	// Nothing to add
}
