/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.movgest;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.Avanzovincolo;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class VincoloImpegno extends Entita {

	private static final long serialVersionUID = 1L;
	
	private Avanzovincolo avanzoVincolo;
	private Accertamento accertamento;
	
	private String codiceVincolo;
    private BigDecimal importo;
    
    
	public Accertamento getAccertamento() {
		return accertamento;
	}
	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
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
	public Avanzovincolo getAvanzoVincolo() {
		return avanzoVincolo;
	}
	public void setAvanzoVincolo(Avanzovincolo avanzoVincolo) {
		this.avanzoVincolo = avanzoVincolo;
	}
	
}
