/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Richiesta al metodo FIN.movimentoGestioneService.ricercaImpegnoPerChiave()
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaImpegnoOSubPerChiave extends RicercaImpegnoPerChiave {

	private BigDecimal numeroSubImpegno;

	public BigDecimal getNumeroSubImpegno() {
		return numeroSubImpegno;
	}

	public void setNumeroSubImpegno(BigDecimal numeroSubImpegno) {
		this.numeroSubImpegno = numeroSubImpegno;
	}
	
}
