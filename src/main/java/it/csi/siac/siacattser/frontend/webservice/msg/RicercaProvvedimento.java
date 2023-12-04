/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.frontend.webservice.msg.base.BaseRicercaProvvedimento;

/**
 * Request al servizio di ricerca provvedimento
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class RicercaProvvedimento extends BaseRicercaProvvedimento {
	
	
}
