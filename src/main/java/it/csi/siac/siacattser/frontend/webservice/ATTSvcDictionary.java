/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice;

/**
 * Caratteristiche del Service Dictionary di ATT. Contiene la versione corrente
 * dei messaggi del servizio.
 * 
 * 
 * @author 1513
 * 
 */
public interface ATTSvcDictionary {

	String VERSION = "1.0";
	String NAME = "att";
	String NAMESPACE = "http://siac.csi.it/" + ATTSvcDictionary.NAME + "/svc/" + ATTSvcDictionary.VERSION;
	String APPLICATION_CODE = "siacAttSer";

}
