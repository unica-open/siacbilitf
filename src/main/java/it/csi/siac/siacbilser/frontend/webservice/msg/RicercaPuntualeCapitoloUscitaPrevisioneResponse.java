/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CapitoloUscitaPrevisione;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo
 * BIL.CapitoloUscitaPrevisioneService.ricercaPuntualeCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaPuntualeCapitoloUscitaPrevisioneResponse extends
		ServiceResponse {

//	private Bilancio bilancio;
	private CapitoloUscitaPrevisione capitoloUscitaPrevisione;
	//Modificato RTI. Tolto per ridondanza all'interno di CapitoloUscitaPrevisione
	//private ImportiCapitoloUP importiCapitoloUP;
	//Modificato RTI. Tolto per ridondanza all'interno di CapitoloUscitaPrevisione
	//private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
	//Modificato RTI. Tolto per ridondanza all'interno di CapitoloUscitaPrevisione
	//private ElementoPianoDeiConti elementoPianoDeiConti;

//	public Bilancio getBilancio() {
//		return bilancio;
//	}
//
//	public void setBilancio(Bilancio bilancio) {
//		this.bilancio = bilancio;
//	}

	public CapitoloUscitaPrevisione getCapitoloUscitaPrevisione() {
		return capitoloUscitaPrevisione;
	}

	public void setCapitoloUscitaPrevisione(
			CapitoloUscitaPrevisione capitoloUscitaPrevisione) {
		this.capitoloUscitaPrevisione = capitoloUscitaPrevisione;
	}
/*
	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}

	public void setStrutturaAmministrativoContabile(
			StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}

	public ElementoPianoDeiConti getElementoPianoDeiConti() {
		return elementoPianoDeiConti;
	}

	public void setElementoPianoDeiConti(
			ElementoPianoDeiConti elementoPianoDeiConti) {
		this.elementoPianoDeiConti = elementoPianoDeiConti;
	}

	public ImportiCapitoloUP getImportiCapitoloUP() {
		return importiCapitoloUP;
	}

	public void setImportiCapitoloUP(ImportiCapitoloUP importiCapitoloUP) {
		this.importiCapitoloUP = importiCapitoloUP;
	}*/

}
