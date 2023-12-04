/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.movgest;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.Avanzovincolo;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class VincoloImpegno extends VincoloMovimento {

	private static final long serialVersionUID = 1L;
	
	private Avanzovincolo avanzoVincolo;
	private Accertamento accertamento;
	
    //SIAC-7349 - 30/06/2020 - GM
    private BigDecimal diCuiPending;
    
    public Accertamento getAccertamento() {
		return accertamento;
	}
    
	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}
	
	public Avanzovincolo getAvanzoVincolo() {
		return avanzoVincolo;
	}
	
	public void setAvanzoVincolo(Avanzovincolo avanzoVincolo) {
		this.avanzoVincolo = avanzoVincolo;
	}
	
	public BigDecimal getDiCuiPending() {
		return diCuiPending;
	}
	
	public void setDiCuiPending(BigDecimal diCuiPending) {
		this.diCuiPending = diCuiPending;
	}
	
}
