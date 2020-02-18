/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

/**
 * Caratteristiche del Data Dictionary di BIL. Contiene la versione corrente del
 * dd
 * 
 * 
 * @author 1513
 * 
 */
public interface BILDataDictionary {

	String VERSION = "1.0";
	String NAME = "bil";
	String NAMESPACE = "http://siac.csi.it/" + NAME + "/data/" + VERSION;
}
