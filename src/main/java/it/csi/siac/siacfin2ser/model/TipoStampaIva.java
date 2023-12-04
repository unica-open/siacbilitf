/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoStampaIva {
	
	REGISTRO("REG", "Registro"),
	LIQUIDAZIONE_IVA("LIQ", "Liquidazione iva"),
	RIEPILOGO_ANNUALE("RIE", "Riepilogo annuale");
	
	private String codice;
	private String descrizione;
	
	private TipoStampaIva(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	public static TipoStampaIva fromCodice(String codice) {
		for(TipoStampaIva tsi : values()) {
			if(tsi.getCodice().equals(codice)) {
				return tsi;
			}
		}
		return null;
	}
	
}
