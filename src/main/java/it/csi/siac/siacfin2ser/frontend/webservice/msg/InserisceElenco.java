/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceElenco extends ServiceRequest {
	
	//serve?
	private Bilancio bilancio;
	private ElencoDocumentiAllegato elencoDocumentiAllegato;
	//Opzionale: AllegatoAtto a cui e' associato l'ElencoDocumentiAllegato
	//private AllegatoAtto allegatoAtto;
	// SIAC-5001
	private boolean accettaElencoSenzaSubdocumenti;
	
	/**
	 * @return the elencoDocumentiAllegato
	 */
	public ElencoDocumentiAllegato getElencoDocumentiAllegato() {
		return elencoDocumentiAllegato;
	}
	/**
	 * @param elencoDocumentiAllegato the elencoDocumentiAllegato to set
	 */
	public void setElencoDocumentiAllegato(ElencoDocumentiAllegato elencoDocumentiAllegato) {
		this.elencoDocumentiAllegato = elencoDocumentiAllegato;
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
	 * @return the accettaElencoSenzaSubdocumenti
	 */
	@XmlTransient
	public boolean isAccettaElencoSenzaSubdocumenti() {
		return accettaElencoSenzaSubdocumenti;
	}
	/**
	 * @param accettaElencoSenzaSubdocumenti the accettaElencoSenzaSubdocumenti to set
	 */
	public void setAccettaElencoSenzaSubdocumenti(boolean accettaElencoSenzaSubdocumenti) {
		this.accettaElencoSenzaSubdocumenti = accettaElencoSenzaSubdocumenti;
	}
	
	

}
