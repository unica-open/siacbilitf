/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum PeriodoTipo{
	
	ANNUALE			("SY","Annuale", 12),
	MENSILE			("M", "Mensile", 1),
	TRIMESTRALE		("T","Trimestrale", 3),
	QUADRIMESTRALE	("Q","Quadrimestrale", 4),
	SEMESTRALE		("S","Semestrale", 6),
	
	;
	
	private String codice;
	private String descrizione;
	private Integer numeroMesi;
	
	private PeriodoTipo(String codice, String descrizione, Integer numeroMesi) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.numeroMesi = numeroMesi;
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

	public static PeriodoTipo fromCodice(String codice) {
		for(PeriodoTipo tc : values()) {
			if(tc.getCodice().equals(codice)) {
				return tc;
			}
		}
		return null;
	}

	/**
	 * @return the numeroMesi
	 */
	public Integer getNumeroMesi() {
		return numeroMesi;
	}

	/**
	 * @param numeroMesi the numeroMesi to set
	 */
	public void setNumeroMesi(Integer numeroMesi) {
		this.numeroMesi = numeroMesi;
	}
	
}
