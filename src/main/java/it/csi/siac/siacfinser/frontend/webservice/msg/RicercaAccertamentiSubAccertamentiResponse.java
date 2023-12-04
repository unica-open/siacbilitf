/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;

/**
 * 
 * @author
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaAccertamentiSubAccertamentiResponse  extends RicercaAttributiMovimentoGestioneResponse {

	private Bilancio bilancio;
	private List<Accertamento> listaAccertamenti;
	
	public Bilancio getBilancio() {
		return bilancio;
	}
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	public List<Accertamento> getListaAccertamenti() {
		return listaAccertamenti;
	}
	public void setListaAccertamenti(List<Accertamento> listaAccertamenti) {
		this.listaAccertamenti = listaAccertamenti;
	}
}
