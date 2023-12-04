/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;

/**
 * Response della ricerca tipo classificatore
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaTipoClassificatoreResponse extends RicercaTipoClassificatoreBaseResponse {
	// Nothing to add
}
