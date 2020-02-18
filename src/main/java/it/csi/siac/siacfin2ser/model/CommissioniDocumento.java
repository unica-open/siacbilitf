/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum CommissioniDocumento {

	BENEFICIARIO("Beneficiario"),
	ESENTE("Esente"),
	CARICO_ENTE("Carico ente");
	
	private String descrizione;
	
	private CommissioniDocumento(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDescrizione() {
		return descrizione;
	}

}
