/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice;

/**
 * Caratteristiche del Service Dictionary di CESP. Contiene la versione corrente
 * dei messaggi del servizio.
 * 
 */
public interface CESPSvcDictionary {

	String VERSION = "1.0";
	String NAME = "cesp";
	String NAMESPACE = "http://siac.csi.it/" + NAME + "/svc/" + VERSION;

	String APPLICATION_CODE = "siacCespSer";
}
