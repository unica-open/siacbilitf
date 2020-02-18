/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CapitoloEntrataPrevisione;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.CapitoloEntrataPrevisioneService.
 * ricercaPuntualeCapitoloEntrataPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaPuntualeCapitoloEntrataPrevisioneResponse extends
		ServiceResponse {

//	private Bilancio bilancio;
	private CapitoloEntrataPrevisione capitoloEntrataPrevisione;
//	private ImportiCapitoloEP importiCapitoloEntrataPrevsione; //Modificato RTI
//	private StrutturaAmministrativoContabile struttAmmContabile;//Modificato RTI
//	private ElementoPianoDeiConti elementoPianoDeiConti;//Modificato RTI

//	public Bilancio getBilancio() {
//		return bilancio;
//	}
//
//	public void setBilancio(Bilancio bilancio) {
//		this.bilancio = bilancio;
//	}

	public CapitoloEntrataPrevisione getCapitoloEntrataPrevisione() {
		return capitoloEntrataPrevisione;
	}

	public void setCapitoloEntrataPrevisione(
			CapitoloEntrataPrevisione capitoloEntrataPrevisione) {
		this.capitoloEntrataPrevisione = capitoloEntrataPrevisione;
	}

	/*public StrutturaAmministrativoContabile getStruttAmmContabile() {
		return struttAmmContabile;
	}

	public void setStruttAmmContabile(
			StrutturaAmministrativoContabile struttAmmContabile) {
		this.struttAmmContabile = struttAmmContabile;
	}

	public ElementoPianoDeiConti getElementoPianoDeiConti() {
		return elementoPianoDeiConti;
	}

	public void setElementoPianoDeiConti(
			ElementoPianoDeiConti elementoPianoDeiConti) {
		this.elementoPianoDeiConti = elementoPianoDeiConti;
	}

	public ImportiCapitoloEP getImportiCapitoloEntrataPrevsione() {
		return importiCapitoloEntrataPrevsione;
	}

	public void setImportiCapitoloEntrataPrevsione(
			ImportiCapitoloEP importiCapitoloEntrataPrevsione) {
		this.importiCapitoloEntrataPrevsione = importiCapitoloEntrataPrevsione;
	}*/

}
