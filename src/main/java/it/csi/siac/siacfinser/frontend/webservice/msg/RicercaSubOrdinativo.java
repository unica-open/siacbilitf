/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaSubOrdinativoIncasso;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaSubOrdinativoPagamento;


@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSubOrdinativo extends PaginazioneRequest {
	
	private Ente ente;
	private Bilancio bilancio;
	private ParametroRicercaSubOrdinativoPagamento parametroRicercaSubOrdinativoPagamento;
	private ParametroRicercaSubOrdinativoIncasso parametroRicercaSubOrdinativoIncasso;
	
	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public ParametroRicercaSubOrdinativoPagamento getParametroRicercaSubOrdinativoPagamento() {
		return parametroRicercaSubOrdinativoPagamento;
	}

	public void setParametroRicercaSubOrdinativoPagamento(
			ParametroRicercaSubOrdinativoPagamento parametroRicercaSubOrdinativoPagamento) {
		this.parametroRicercaSubOrdinativoPagamento = parametroRicercaSubOrdinativoPagamento;
	}

	public ParametroRicercaSubOrdinativoIncasso getParametroRicercaSubOrdinativoIncasso() {
		return parametroRicercaSubOrdinativoIncasso;
	}

	public void setParametroRicercaSubOrdinativoIncasso(
			ParametroRicercaSubOrdinativoIncasso parametroRicercaSubOrdinativoIncasso) {
		this.parametroRicercaSubOrdinativoIncasso = parametroRicercaSubOrdinativoIncasso;
	}

}
