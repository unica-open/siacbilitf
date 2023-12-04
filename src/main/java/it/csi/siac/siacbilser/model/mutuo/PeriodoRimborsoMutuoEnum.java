/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

public enum PeriodoRimborsoMutuoEnum {
	Mensile(new PeriodoRimborsoMutuo("M", "Mensile", 1)),
	Bimestrale(new PeriodoRimborsoMutuo("B", "Bimestrale", 2)),
	Trimestrale(new PeriodoRimborsoMutuo("T", "Trimestrale", 3)),
	Quadrimestrale(new PeriodoRimborsoMutuo("Q", "Quadrimestrale", 4)),
	Semestrale(new PeriodoRimborsoMutuo("S", "Semestrale", 6)),
	Annuale(new PeriodoRimborsoMutuo("A", "Annuale", 12)),
	;
	
	
	private PeriodoRimborsoMutuo periodoRimborsoMutuo;
	
	PeriodoRimborsoMutuoEnum(PeriodoRimborsoMutuo periodoRimborsoMutuo) {
		this.periodoRimborsoMutuo = periodoRimborsoMutuo;
	}

	public PeriodoRimborsoMutuo get() {
		return periodoRimborsoMutuo;
	}

	public String getCodice() {
		return periodoRimborsoMutuo.getCodice();
	}

	public String getDescrizione() {
		return periodoRimborsoMutuo.getDescrizione();
	}

	public Integer getNumeroMesi() {
		return periodoRimborsoMutuo.getNumeroMesi();
	}

	
	
}
