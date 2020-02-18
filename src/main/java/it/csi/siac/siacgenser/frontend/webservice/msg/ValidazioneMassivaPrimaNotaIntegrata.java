/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ClassificatoreGSA;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class ValidazioneMassivaPrimaNotaIntegrata extends ServiceRequest {

	// La request tramite cui trovare tutte le prime note per le quali effettuare la validazione
	private RicercaSinteticaPrimaNotaIntegrataValidabile ricercaSinteticaPrimaNotaIntegrataValidabile;
	// SIAC-5336
	private ClassificatoreGSA classificatoreGSA;
	// SIAC-5853
	private Date dataRegistrazioneLibroGiornale;

	/**
	 * @return the ricercaSinteticaPrimaNotaIntegrataValidabile
	 */
	public RicercaSinteticaPrimaNotaIntegrataValidabile getRicercaSinteticaPrimaNotaIntegrataValidabile() {
		return ricercaSinteticaPrimaNotaIntegrataValidabile;
	}

	/**
	 * @param ricercaSinteticaPrimaNotaIntegrataValidabile the ricercaSinteticaPrimaNotaIntegrataValidabile to set
	 */
	public void setRicercaSinteticaPrimaNotaIntegrataValidabile(RicercaSinteticaPrimaNotaIntegrataValidabile ricercaSinteticaPrimaNotaIntegrataValidabile) {
		this.ricercaSinteticaPrimaNotaIntegrataValidabile = ricercaSinteticaPrimaNotaIntegrataValidabile;
	}

	/**
	 * @return the classificatoreGSA
	 */
	public ClassificatoreGSA getClassificatoreGSA() {
		return this.classificatoreGSA;
	}

	/**
	 * @param classificatoreGSA the classificatoreGSA to set
	 */
	public void setClassificatoreGSA(ClassificatoreGSA classificatoreGSA) {
		this.classificatoreGSA = classificatoreGSA;
	}

	/**
	 * @return the dataRegistrazioneLibroGiornale
	 */
	public Date getDataRegistrazioneLibroGiornale() {
		return this.dataRegistrazioneLibroGiornale;
	}

	/**
	 * @param dataRegistrazioneLibroGiornale the dataRegistrazioneLibroGiornale to set
	 */
	public void setDataRegistrazioneLibroGiornale(Date dataRegistrazioneLibroGiornale) {
		this.dataRegistrazioneLibroGiornale = dataRegistrazioneLibroGiornale;
	}

}
