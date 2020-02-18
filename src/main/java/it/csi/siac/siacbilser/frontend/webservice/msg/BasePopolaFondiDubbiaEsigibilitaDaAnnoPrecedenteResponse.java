/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilitaBase;

/**
 * Risposta al metodo
 * BIL.FondiDubbiaEsegibilitaService.popolaFondiDubbiaEsigibilitaDaGestioneAnnoPrecedente()
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class BasePopolaFondiDubbiaEsigibilitaDaAnnoPrecedenteResponse<A extends AccantonamentoFondiDubbiaEsigibilitaBase> extends BasePopolaFondiDubbiaEsigibilitaResponse<A> {
	// Nothing to add
}
