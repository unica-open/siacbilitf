/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.codifiche;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * 
 *  Classe di soggetto:  esempio TAS = TASSISTI
 *
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ClasseSoggetto  extends Codifica {

	private static final long serialVersionUID = 4353222111609312977L;
	
	@Override
	public String toString() {
		return this.getDescrizione();
	}

}
