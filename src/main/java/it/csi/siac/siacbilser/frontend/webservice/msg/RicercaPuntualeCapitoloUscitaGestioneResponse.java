/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo
 * BIL.CapitoloUscitaGestioneService.ricercaPuntualeCapitoloUscitaGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaPuntualeCapitoloUscitaGestioneResponse extends
		ServiceResponse {

//	private Bilancio bilancio;
//	private FaseEStatoAttualeBilancio faseEStatoAttualeBilancio;
	private CapitoloUscitaGestione capitoloUscitaGestione;
	//private ImportiCapitoloUG ImportiCapitoloUG;
	//private StrutturaAmministrativoContabile struttAmmContabile;
	//private ElementoPianoDeiConti elementoPdC;

//	public Bilancio getBilancio() {
//		return bilancio;
//	}
//
//	public void setBilancio(Bilancio bilancio) {
//		this.bilancio = bilancio;
//	}
//
//	public FaseEStatoAttualeBilancio getFaseEStatoAttualeBilancio() {
//		return faseEStatoAttualeBilancio;
//	}
//
//	public void setFaseEStatoAttualeBilancio(
//			FaseEStatoAttualeBilancio faseEStatoAttualeBilancio) {
//		this.faseEStatoAttualeBilancio = faseEStatoAttualeBilancio;
//	}

	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
		return capitoloUscitaGestione;
	}

	public void setCapitoloUscitaGestione(CapitoloUscitaGestione capitoloUscitaGestione) {
		this.capitoloUscitaGestione = capitoloUscitaGestione;
	}

//	public StrutturaAmministrativoContabile getStruttAmmContabile() {
//		return struttAmmContabile;
//	}
//
//	public void setStruttAmmContabile(
//			StrutturaAmministrativoContabile struttAmmContabile) {
//		this.struttAmmContabile = struttAmmContabile;
//	}
//
//	public ElementoPianoDeiConti getElementoPdC() {
//		return elementoPdC;
//	}
//
//	public void setElementoPdC(ElementoPianoDeiConti elementoPdC) {
//		this.elementoPdC = elementoPdC;
//	}
//
//	public ImportiCapitoloUG getImportiCapitoloUG() {
//		return ImportiCapitoloUG;
//	}
//
//	public void setImportiCapitoloUG(ImportiCapitoloUG importiCapitoloUG) {
//		ImportiCapitoloUG = importiCapitoloUG;
//	}
}
