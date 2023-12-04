/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Avanzovincolo extends EntitaEnte {

	private static final long serialVersionUID = 3522968003577273122L;
	
	private BigDecimal avavImportoMassimale;
	private BigDecimal disponibileAvanzovincolo;
	
	private TipoAvanzovincolo tipoAvanzovincolo;

	public BigDecimal getAvavImportoMassimale() {
		return avavImportoMassimale;
	}

	public void setAvavImportoMassimale(BigDecimal avavImportoMassimale) {
		this.avavImportoMassimale = avavImportoMassimale;
	}

	public TipoAvanzovincolo getTipoAvanzovincolo() {
		return tipoAvanzovincolo;
	}

	public void setTipoAvanzovincolo(TipoAvanzovincolo tipoAvanzovincolo) {
		this.tipoAvanzovincolo = tipoAvanzovincolo;
	}

	public BigDecimal getDisponibileAvanzovincolo() {
		return disponibileAvanzovincolo;
	}

	public void setDisponibileAvanzovincolo(BigDecimal disponibileAvanzovincolo) {
		this.disponibileAvanzovincolo = disponibileAvanzovincolo;
	}
	
}
