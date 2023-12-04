/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

/**
 * Caratteristiche del Data Dictionary di CESP. Contiene la versione corrente del dd
 */
public interface CESPDataDictionary {

	String VERSION = "1.0";
	String NAME = "cesp";
	String NAMESPACE = "http://siac.csi.it/" + NAME + "/data/" + VERSION;
}
