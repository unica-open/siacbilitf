/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.model;

/**
 * Caratteristiche del Data Dictionary di ATT. Contiene la versione corrente del
 * dd
 * 
 * 
 * @author 1513
 * 
 */
public interface ATTDataDictionary {

	String VERSION = "1.0";
	String NAME = "att";
	String NAMESPACE = "http://siac.csi.it/" + ATTDataDictionary.NAME + "/data/" + ATTDataDictionary.VERSION;
}
