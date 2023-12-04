/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import javax.xml.bind.annotation.XmlType;
/**
 * Tipo Avviso.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class TipoAvviso extends ClassificatoreGenerico {

	private static final long serialVersionUID = 2484721400808741285L;

}
