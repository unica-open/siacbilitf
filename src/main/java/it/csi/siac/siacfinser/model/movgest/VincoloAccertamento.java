/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.movgest;

import java.math.BigDecimal;

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.Impegno;

public class VincoloAccertamento extends Entita {

	private static final long serialVersionUID = 1L;
	
	private Impegno impegno;
	private String codiceVincolo;
    private BigDecimal importo;
    
    
	public Impegno getImpegno() {
		return impegno;
	}
	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}
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
    

}
