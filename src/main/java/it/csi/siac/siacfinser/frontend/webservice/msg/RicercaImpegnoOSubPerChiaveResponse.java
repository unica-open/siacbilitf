/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Risposta al metodo FIN.ImpegnoService.ricercaImpegnoPerChiave()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaImpegnoOSubPerChiaveResponse extends RicercaImpegnoPerChiaveResponse {
	// Nothing to add
}
