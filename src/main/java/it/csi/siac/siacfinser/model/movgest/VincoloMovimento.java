/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacfinser.model.movgest;

import java.math.BigDecimal;

import it.csi.siac.siaccorser.model.EntitaEnte;

public abstract class VincoloMovimento extends EntitaEnte {

	/** per la serializzazione */
	private static final long serialVersionUID = 1L;
	
	@Deprecated
	private String codiceVincolo;
    
	private BigDecimal importo;
    private BigDecimal sommaImportiModReimpReanno;

	public String getCodiceVincolo() {
		return codiceVincolo;
	}
	
	public void setCodiceVincolo(String codiceVincolo) {
		this.codiceVincolo = codiceVincolo;
	}
	
	public BigDecimal getImporto() {
		return importo;
	}
	
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

	public BigDecimal getSommaImportiModReimpReanno() {
		return sommaImportiModReimpReanno;
	}

	public void setSommaImportiModReimpReanno(BigDecimal sommaImportiModReimpReanno) {
		this.sommaImportiModReimpReanno = sommaImportiModReimpReanno;
	}
	
}
