/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo
 * BIL.CapitoloService.calcolaTotaliStanziamentiDiPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class CalcolaTotaliStanziamentiDiPrevisione extends ServiceRequest {

	private Bilancio bilancio;
	private int annoEsercizio;
	
	// SIAC-6881
	private boolean calcolaComponenti = false;

	public int getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoEsercizio(int annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * @return the calcolaComponenti
	 */
	public boolean isCalcolaComponenti() {
		return this.calcolaComponenti;
	}

	/**
	 * @param calcolaComponenti the calcolaComponenti to set
	 */
	public void setCalcolaComponenti(boolean calcolaComponenti) {
		this.calcolaComponenti = calcolaComponenti;
	}
	
	

}
