/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

/**
 * Caratteristiche del Data Dictionary di BIL. Contiene la versione corrente del
 * dd
 * 
 * 
 * @author 
 * 
 */
public interface FINDataDictionary {

	String VERSION = "1.0";
	String NAME = "fin";
	String NAMESPACE = "http://siac.csi.it/" + FINDataDictionary.NAME + "/data/" + FINDataDictionary.VERSION;
}
