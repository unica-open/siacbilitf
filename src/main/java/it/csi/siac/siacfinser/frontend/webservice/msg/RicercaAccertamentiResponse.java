/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;

/**
 * Risposta al metodo FIN.AccertamentoService.ricercaAccertamenti()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaAccertamentiResponse extends PaginazioneResponse {

	private Bilancio bilancio;
	private List<Accertamento> accertamenti = new ArrayList<Accertamento>();

	public List<Accertamento> getAccertamenti() {
		return accertamenti;
	}

	public void setAccertamenti(List<Accertamento> accertamenti) {
		this.accertamenti = accertamenti;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	
}
