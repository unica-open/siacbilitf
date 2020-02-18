/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;


@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceOrdinativoPagamento extends InserisceOrdinativo {
	
	private OrdinativoPagamento ordinativoPagamento;
	
	private boolean registraGen = true;
	
	private boolean usaDatiLoginOrig = false;
	
	public OrdinativoPagamento getOrdinativoPagamento() {
		return ordinativoPagamento;
	}

	public void setOrdinativoPagamento(OrdinativoPagamento ordinativoPagamento) {
		this.ordinativoPagamento = ordinativoPagamento;
	}

	public boolean isRegistraGen() {
		return registraGen;
	}

	@XmlTransient
	public void setRegistraGen(boolean registraGen) {
		this.registraGen = registraGen;
	}

	public boolean isUsaDatiLoginOrig() {
		return usaDatiLoginOrig;
	}

	public void setUsaDatiLoginOrig(boolean usaDatiLoginOrig) {
		this.usaDatiLoginOrig = usaDatiLoginOrig;
	}
	
}
