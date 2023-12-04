/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import javax.xml.bind.annotation.XmlType;

/**
 * Attivit&agrave; Onere.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class AttivitaOnere extends Codifica {

	private static final long serialVersionUID = -2710414936285863481L;

}
