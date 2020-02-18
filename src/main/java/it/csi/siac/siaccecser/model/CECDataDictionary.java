/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

/**
 * Caratteristiche del Data Dictionary di CEC. Contiene la versione corrente del
 * dd
 * 
 * 
 * @author Domenico
 * 
 */
public interface CECDataDictionary {

	String VERSION = "1.0";
	String NAME = "cec";
	String NAMESPACE = "http://siac.csi.it/" + NAME + "/data/" + VERSION;
}
