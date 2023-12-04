/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaClassiPianoAmmortamento extends ServiceRequest {
	// Nothing to add
}
