/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;

import javax.xml.bind.annotation.XmlType;

/**
 * Tipo Impresa.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class TipoImpresa extends ClassificatoreGenerico {

	private static final long serialVersionUID = 9165719596244548458L;

}
