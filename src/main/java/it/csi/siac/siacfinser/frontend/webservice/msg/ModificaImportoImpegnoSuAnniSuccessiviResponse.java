/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.StoricoImpegnoAccertamento;

/**
 * Richiesta al metodo FIN.MovimentoGestioneService.modificaImportoImpegnoSuAnniSuccessivi()
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ModificaImportoImpegnoSuAnniSuccessiviResponse extends ServiceResponse {
	
	private AggiornaImpegnoResponse aggiornaImpegnoResponsePadre;
	private InserisceImpegniResponse inserisceImpegnoResponse;
	
	private List<Impegno> listaImpegniInseriti = new ArrayList<Impegno>();
	private List<Messaggio> listaMessaggi = new ArrayList<Messaggio>();
	/**
	 * @return the aggiornaImpegnoResponsePadre
	 */
	public AggiornaImpegnoResponse getAggiornaImpegnoResponsePadre() {
		return aggiornaImpegnoResponsePadre;
	}
	/**
	 * @param aggiornaImpegnoResponsePadre the aggiornaImpegnoResponsePadre to set
	 */
	public void setAggiornaImpegnoResponsePadre(AggiornaImpegnoResponse aggiornaImpegnoResponsePadre) {
		this.aggiornaImpegnoResponsePadre = aggiornaImpegnoResponsePadre;
	}
	
	/**
	 * @return the listaMessaggi
	 */
	public List<Messaggio> getListaMessaggi() {
		return listaMessaggi;
	}
	/**
	 * @param listaMessaggi the listaMessaggi to set
	 */
	public void setListaMessaggi(List<Messaggio> listaMessaggi) {
		this.listaMessaggi = listaMessaggi;
	}
	
	
	/**
	 * @return the listaImpegniInseriti
	 */
	public List<Impegno> getListaImpegniInseriti() {
		return listaImpegniInseriti;
	}
	/**
	 * @param listaImpegniInseriti the listaImpegniInseriti to set
	 */
	public void setListaImpegniInseriti(List<Impegno> listaImpegniInseriti) {
		this.listaImpegniInseriti = listaImpegniInseriti;
	}
	/**
	 * @return the inserisceImpegnoResponse
	 */
	public InserisceImpegniResponse getInserisceImpegnoResponse() {
		return inserisceImpegnoResponse;
	}
	/**
	 * @param inserisceImpegnoResponse the inserisceImpegnoResponse to set
	 */
	public void setInserisceImpegnoResponse(InserisceImpegniResponse inserisceImpegnoResponse) {
		this.inserisceImpegnoResponse = inserisceImpegnoResponse;
	}
	
}