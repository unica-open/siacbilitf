/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoIncasso;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaOrdinativoResponse extends PaginazioneResponse {
	
	private Ente ente;
	private List<OrdinativoPagamento> elencoOrdinativoPagamento;
	private List<OrdinativoIncasso> elencoOrdinativoIncasso;
	
	private BigDecimal totImporti;
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public List<OrdinativoPagamento> getElencoOrdinativoPagamento() {
		return elencoOrdinativoPagamento;
	}
	public void setElencoOrdinativoPagamento(
			List<OrdinativoPagamento> elencoOrdinativoPagamento) {
		this.elencoOrdinativoPagamento = elencoOrdinativoPagamento;
	}
	public List<OrdinativoIncasso> getElencoOrdinativoIncasso() {
		return elencoOrdinativoIncasso;
	}
	public void setElencoOrdinativoIncasso(
			List<OrdinativoIncasso> elencoOrdinativoIncasso) {
		this.elencoOrdinativoIncasso = elencoOrdinativoIncasso;
	}
	public BigDecimal getTotImporti() {
		return totImporti;
	}
	public void setTotImporti(BigDecimal totImporti) {
		this.totImporti = totImporti;
	}
	
}
