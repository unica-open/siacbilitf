/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice;

/**
 * Caratteristiche del Service Dictionary di BIL. Contiene la versione corrente
 * dei messaggi del servizio.
 * 
 * 
 * @author Domenico
 * 
 */
public interface GENSvcDictionary {

	String VERSION = "1.0";
	String NAME = "gen";
	String NAMESPACE = "http://siac.csi.it/" + NAME + "/svc/" + VERSION;
	String APPLICATION_CODE = "siacGenSer";
}
