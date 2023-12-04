/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.codifiche;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfinser.model.FINDataDictionary;


@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class CodiceBollo extends Codifica{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7611523913004740998L;

}
