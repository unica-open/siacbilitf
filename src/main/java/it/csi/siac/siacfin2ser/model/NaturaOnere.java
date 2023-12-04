/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import javax.xml.bind.annotation.XmlType;

/**
 * Natura Onere.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class NaturaOnere extends Codifica {

	private static final long serialVersionUID = -8253317464019565094L;
	
	public boolean isSplitReverse(){
		return "SP".equals(getCodice());
	}
}
