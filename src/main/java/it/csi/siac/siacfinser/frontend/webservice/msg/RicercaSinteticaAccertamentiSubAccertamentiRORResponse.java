/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.SubAccertamento;

/**
 * 
 * @author
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSinteticaAccertamentiSubAccertamentiRORResponse  extends RicercaAttributiMovimentoGestioneResponse {

	private Bilancio bilancio;
	private List<SubAccertamento> listaSubAccertamenti;
	
	public Bilancio getBilancio() {
		return bilancio;
	}
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	/**
	 * @return the listaSubAccertamenti
	 */
	public List<SubAccertamento> getListaSubAccertamenti() {
		return listaSubAccertamenti;
	}
	/**
	 * @param listaSubAccertamenti the listaSubAccertamenti to set
	 */
	public void setListaSubAccertamenti(List<SubAccertamento> listaSubAccertamenti) {
		this.listaSubAccertamenti = listaSubAccertamenti;
	}
	
}
