/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pcc.frontend.webservice.msg;

import it.csi.siac.pcc.frontend.webservice.PCCSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = PCCSvcDictionary.NAMESPACE)
public class InviaOperazioniPCC extends ServiceRequest {
	// Nothing to add
}
