/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siaccorser.model.EntitaEnte;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class PeriodoRimborsoMutuo extends EntitaEnte {
	private static final long serialVersionUID = 1521685119926160528L;

	private String codice;
	private String descrizione;
	private Integer numeroMesi;

	public PeriodoRimborsoMutuo() {
		super();
	}

	public PeriodoRimborsoMutuo(String codice, String descrizione, Integer numeroMesi) {
		this();
		this.codice = codice;
		this.descrizione = descrizione;
		this.numeroMesi = numeroMesi;
	}
	
	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Integer getNumeroMesi() {
		return numeroMesi;
	}

	public void setNumeroMesi(Integer numeroMesi) {
		this.numeroMesi = numeroMesi;
	}

}
