/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;

/**
 * Richiesta al metodo BIL.FondiDubbiaEsegibilitaService.popolaFondiDubbiaEsigibilitaRendicontoDaAnnoPrecedente()
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class PopolaFondiDubbiaEsigibilitaRendicontoDaAnnoCorrente extends BasePopolaFondiDubbiaEsigibilita {
	// Nothing to add
}
