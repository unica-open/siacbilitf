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
import it.csi.siac.siacfinser.model.SubImpegno;

/**
 * 
 * @author
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSinteticaImpegniSubimpegniRORResponse  extends RicercaAttributiMovimentoGestioneResponse {

	private Bilancio bilancio;
	private List<SubImpegno> listaSubImpegni;
	
	public Bilancio getBilancio() {
		return bilancio;
	}
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	/**
	 * @return the listaSubImpegni
	 */
	public List<SubImpegno> getListaSubImpegni() {
		return listaSubImpegni;
	}
	/**
	 * @param listaSubImpegni the listaSubImpegni to set
	 */
	public void setListaSubImpegni(List<SubImpegno> listaSubImpegni) {
		this.listaSubImpegni = listaSubImpegni;
	}
	
	
}
