/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ContoCorrentePredocumentoEntrata;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;

/**
 * Request per la ricerca dei totali dei predocumenti di entrata per stato
 * @author Marchino Alessandro
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaTotaliPreDocumentoEntrataPerStato extends ServiceRequest {
	
	private Bilancio bilancio;
	
	//SIAC-6780
	private ContoCorrentePredocumentoEntrata contoCorrente;
	private List<Integer> listaUidSelezionati;
	private RicercaSinteticaPreDocumentoEntrata requestRicerca;
	
	
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return this.bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	/**
	 * @return the contoCorrente
	 */
	public ContoCorrentePredocumentoEntrata getContoCorrente() {
		return contoCorrente;
	}
	/**
	 * @param contoCorrente the contoCorrente to set
	 */
	public void setContoCorrente(ContoCorrentePredocumentoEntrata contoCorrente) {
		this.contoCorrente = contoCorrente;
	}
	/**
	 * @return the listaUidSelezionati
	 */
	public List<Integer> getListaUidSelezionati() {
		return listaUidSelezionati;
	}
	/**
	 * @param listaUidSelezionati the listaUidSelezionati to set
	 */
	public void setListaUidSelezionati(List<Integer> listaUidSelezionati) {
		this.listaUidSelezionati = listaUidSelezionati;
	}
	/**
	 * @return the requestRicerca
	 */
	public RicercaSinteticaPreDocumentoEntrata getRequestRicerca() {
		return requestRicerca;
	}
	/**
	 * @param requestRicerca the requestRicerca to set
	 */
	public void setRequestRicerca(RicercaSinteticaPreDocumentoEntrata requestRicerca) {
		this.requestRicerca = requestRicerca;
	}
	
}
