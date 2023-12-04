/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum AliquotaIvaTipo {
	// siac_d_iva_aliquota_tipo

	ISTITUZIONALE("Istituzionale"), 
	PROMISQUA("Promisqua"), 
	COMMERCIALE("Commerciale"),
	;

	private String descrizione;

	private AliquotaIvaTipo(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

}
