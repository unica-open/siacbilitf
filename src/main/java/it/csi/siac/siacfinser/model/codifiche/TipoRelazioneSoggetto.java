/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.codifiche;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * Enum che mappa le tipologie di relazioni tra i soggetti
 * 
 * @author luca.romanello
 *
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public enum TipoRelazioneSoggetto {
	SEDE_SECONDARIA, CATENA, CSC, CSI, SUCCESSORE
}
