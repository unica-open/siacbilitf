/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;

/**
 * Response della ricerca del tipo di classificatore generico
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaTipoClassificatoreGenericoResponse extends RicercaTipoClassificatoreBaseResponse {
	// Nothing to add
}
