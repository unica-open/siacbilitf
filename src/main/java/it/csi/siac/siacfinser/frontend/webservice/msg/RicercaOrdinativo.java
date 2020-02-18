/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaOrdinativoIncasso;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaOrdinativoPagamento;


@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaOrdinativo extends PaginazioneRequest {
	
	private Ente ente;
	private Bilancio bilancio;
	private ParametroRicercaOrdinativoPagamento parametroRicercaOrdinativoPagamento;
	private ParametroRicercaOrdinativoIncasso parametroRicercaOrdinativoIncasso;
	
	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public ParametroRicercaOrdinativoPagamento getParametroRicercaOrdinativoPagamento() {
		return parametroRicercaOrdinativoPagamento;
	}

	public void setParametroRicercaOrdinativoPagamento(
			ParametroRicercaOrdinativoPagamento parametroRicercaOrdinativoPagamento) {
		this.parametroRicercaOrdinativoPagamento = parametroRicercaOrdinativoPagamento;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public ParametroRicercaOrdinativoIncasso getParametroRicercaOrdinativoIncasso() {
		return parametroRicercaOrdinativoIncasso;
	}

	public void setParametroRicercaOrdinativoIncasso(
			ParametroRicercaOrdinativoIncasso parametroRicercaOrdinativoIncasso) {
		this.parametroRicercaOrdinativoIncasso = parametroRicercaOrdinativoIncasso;
	}

}
