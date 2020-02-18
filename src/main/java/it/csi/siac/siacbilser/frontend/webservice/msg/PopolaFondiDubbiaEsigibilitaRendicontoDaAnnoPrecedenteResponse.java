/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilitaRendiconto;

/**
 * Risposta al metodo BIL.FondiDubbiaEsegibilitaService.popolaFondiDubbiaEsigibilitaRendicontoDaAnnoPrecedente()
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class PopolaFondiDubbiaEsigibilitaRendicontoDaAnnoPrecedenteResponse extends BasePopolaFondiDubbiaEsigibilitaDaAnnoPrecedenteResponse<AccantonamentoFondiDubbiaEsigibilitaRendiconto> {
	// Nothing to add
}
