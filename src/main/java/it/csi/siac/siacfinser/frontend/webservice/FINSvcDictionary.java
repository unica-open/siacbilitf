/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice;

/**
 * Caratteristiche del Service Dictionary di FIN. Contiene la versione corrente
 * dei messaggi del servizio.
 * 
 * 
 * @author 
 * 
 */
public interface FINSvcDictionary {

	String VERSION = "1.0";
	String NAME = "fin";
	String NAMESPACE = "http://siac.csi.it/" + FINSvcDictionary.NAME + "/svc/" + FINSvcDictionary.VERSION;
	String APPLICATION_CODE = "siacFinSer";
}
