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
import it.csi.siac.siacfinser.model.ordinativo.SubOrdinativoIncasso;
import it.csi.siac.siacfinser.model.ordinativo.SubOrdinativoPagamento;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSubOrdinativoResponse extends PaginazioneResponse {
	
	private Ente ente;
	private List<SubOrdinativoPagamento> elencoSubOrdinativoPagamento;
	private List<SubOrdinativoIncasso> elencoSubOrdinativoIncasso;
	
	private BigDecimal totImporti;
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public BigDecimal getTotImporti() {
		return totImporti;
	}
	public void setTotImporti(BigDecimal totImporti) {
		this.totImporti = totImporti;
	}
	public List<SubOrdinativoPagamento> getElencoSubOrdinativoPagamento() {
		return elencoSubOrdinativoPagamento;
	}
	public void setElencoSubOrdinativoPagamento(
			List<SubOrdinativoPagamento> elencoSubOrdinativoPagamento) {
		this.elencoSubOrdinativoPagamento = elencoSubOrdinativoPagamento;
	}
	public List<SubOrdinativoIncasso> getElencoSubOrdinativoIncasso() {
		return elencoSubOrdinativoIncasso;
	}
	public void setElencoSubOrdinativoIncasso(List<SubOrdinativoIncasso> elencoSubOrdinativoIncasso) {
		this.elencoSubOrdinativoIncasso = elencoSubOrdinativoIncasso;
	}
	
}
