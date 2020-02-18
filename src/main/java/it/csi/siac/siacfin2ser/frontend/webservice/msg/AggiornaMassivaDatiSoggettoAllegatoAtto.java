/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;
import it.csi.siac.siacfin2ser.model.DatiSoggettoAllegato;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaMassivaDatiSoggettoAllegatoAtto extends ServiceRequest {
	
	private AllegatoAtto allegatoAtto;
	private ElencoDocumentiAllegato elencoDocumentiAllegato;
	private DatiSoggettoAllegato datiSoggettoAllegato;
	/**
	 * @return the allegatoAtto
	 */
	public AllegatoAtto getAllegatoAtto() {
		return allegatoAtto;
	}
	/**
	 * @param allegatoAtto the allegatoAtto to set
	 */
	public void setAllegatoAtto(AllegatoAtto allegatoAtto) {
		this.allegatoAtto = allegatoAtto;
	}
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
	 * @return the datiSoggettoAllegato
	 */
	public DatiSoggettoAllegato getDatiSoggettoAllegato() {
		return datiSoggettoAllegato;
	}
	/**
	 * @param datiSoggettoAllegato the datiSoggettoAllegato to set
	 */
	public void setDatiSoggettoAllegato(DatiSoggettoAllegato datiSoggettoAllegato) {
		this.datiSoggettoAllegato = datiSoggettoAllegato;
	}
	

}
