/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoChiusura {
	
	MENSILE("M", "Mensile", Periodo.mensile(), PeriodoTipo.MENSILE),
	TRIMESTRALE("T", "Trimestrale", Periodo.trimestrale(), PeriodoTipo.TRIMESTRALE),
	ANNUALE("A", "Annuale", Periodo.annuale(), PeriodoTipo.ANNUALE);
	
	private String codice;
	private String descrizione;
	private List<Periodo> periodi;
	private PeriodoTipo periodoTipo;
	
	private TipoChiusura(String codice, String descrizione, List<Periodo> periodi, PeriodoTipo periodoTipo) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.periodi = periodi;
		this.setPeriodoTipo(periodoTipo);
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

	/**
	 * @return the periodi
	 */
	public List<Periodo> getPeriodi() {
		return periodi;
	}

	public static TipoChiusura fromCodice(String codice) {
		for(TipoChiusura tc : values()) {
			if(tc.getCodice().equals(codice)) {
				return tc;
			}
		}
		return null;
	}

	public PeriodoTipo getPeriodoTipo() {
		return periodoTipo;
	}

	public void setPeriodoTipo(PeriodoTipo periodoTipo) {
		this.periodoTipo = periodoTipo;
	}
	
}
