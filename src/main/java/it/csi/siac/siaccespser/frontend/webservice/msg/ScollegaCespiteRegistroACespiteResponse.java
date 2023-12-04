/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/**
 * 
 */
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * @author antonino
 * @version 1.0.0 - 31-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class ScollegaCespiteRegistroACespiteResponse extends ServiceResponse {
	// Nothing to add
}
