/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import javax.xml.bind.annotation.XmlType;

/**
 * Note Tesoriere.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class NoteTesoriere extends Codifica {

	private static final long serialVersionUID = 1681016154952266945L;

}
