/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Risposta al metodo FIN.ImpegnoService.annullaImpegno()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaImpegnoResponse extends ServiceResponse {
	// Nothing to add
}
