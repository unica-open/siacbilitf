/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo
 * BIL.CapitoloUscitaGestioneService.ricercaPuntualeCapitoloEntrataGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaPuntualeCapitoloEntrataGestioneResponse extends
		ServiceResponse {

//	private Bilancio bilancio;
//	private FaseEStatoAttualeBilancio faseEStatoAttualeBilancio;
	private CapitoloEntrataGestione capitoloEntrataGestione;
//	private ImportiCapitoloEG importiCapitoloEG;
//	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
//	private ElementoPianoDeiConti elementoPdC;

//	public Bilancio getBilancio() {
//		return bilancio;
//	}
//
//	public void setBilancio(Bilancio bilancio) {
//		this.bilancio = bilancio;
//	}

//	public FaseEStatoAttualeBilancio getFaseEStatoAttualeBilancio() {
//		return faseEStatoAttualeBilancio;
//	}
//
//	public void setFaseEStatoAttualeBilancio(
//			FaseEStatoAttualeBilancio faseEStatoAttualeBilancio) {
//		this.faseEStatoAttualeBilancio = faseEStatoAttualeBilancio;
//	}

	public CapitoloEntrataGestione getCapitoloEntrataGestione() {
		return capitoloEntrataGestione;
	}

	public void setCapitoloEntrataGestione(
			CapitoloEntrataGestione capitoloEntrataGestione) {
		this.capitoloEntrataGestione = capitoloEntrataGestione;
	}

//	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
//		return strutturaAmministrativoContabile;
//	}
//
//	public void setStrutturaAmministrativoContabile(
//			StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
//		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
//	}

//	public ElementoPianoDeiConti getElementoPdC() {
//		return elementoPdC;
//	}
//
//	public void setElementoPdC(ElementoPianoDeiConti elementoPdC) {
//		this.elementoPdC = elementoPdC;
//	}
//
//	public ImportiCapitoloEG getImportiCapitoloEG() {
//		return importiCapitoloEG;
//	}
//
//	public void setImportiCapitoloEG(ImportiCapitoloEG importiCapitoloEG) {
//		this.importiCapitoloEG = importiCapitoloEG;
//	}

}
