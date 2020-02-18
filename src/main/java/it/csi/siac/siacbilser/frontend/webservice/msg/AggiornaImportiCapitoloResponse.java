/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.frontend.webservice.msg.base.BaseComponenteImportiCapitoloResponse;

/**
 * Risposta al metodo BIL.ComponenteImportiCapitoloService.aggiornaImportiCapitolo()
 * Risposta al metodo BIL.CapitoloService.aggiornaStanziamentiCapitoliVariati()
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaImportiCapitoloResponse extends BaseComponenteImportiCapitoloResponse {
	// Nothing to add
}
