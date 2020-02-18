/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * 
 * @author 1513
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaModificaImportoMovimentoGestioneEntrata extends ServiceRequest {
	// Nothing to add
}
