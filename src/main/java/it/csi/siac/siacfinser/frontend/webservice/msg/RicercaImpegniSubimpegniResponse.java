/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;

/**
 * 
 * @author
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaImpegniSubimpegniResponse  extends RicercaAttributiMovimentoGestioneResponse {

	private Bilancio bilancio;
	private List<Impegno> listaImpegni;
	
	public Bilancio getBilancio() {
		return bilancio;
	}
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	public List<Impegno> getListaImpegni() {
		return listaImpegni;
	}
	public void setListaImpegni(List<Impegno> listaImpegni) {
		this.listaImpegni = listaImpegni;
	}
	
}
