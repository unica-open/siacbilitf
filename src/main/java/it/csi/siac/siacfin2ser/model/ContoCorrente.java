/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.business.utility.DummyMapper;
import it.csi.siac.siacfinser.model.codifiche.ModalitaAccreditoSoggetto;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;

/**
 * ContoCorrente.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class ContoCorrente extends ModalitaPagamentoSoggetto{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2581455092136484725L;
	
	public ContoCorrente() {
		// Costruttore vuoto
	}
	
	public ContoCorrente(ModalitaPagamentoSoggetto mps){
		DummyMapper.mapNotNullNotEmpty(mps, this);
	}
	
	
	public String getDescrizioneModalitaAccreditoPagamentoSoggetto() {
		
		final ModalitaAccreditoSoggetto mas = getModalitaAccreditoSoggetto();
		
		
//		ModalitaPagamentoSoggettoCessioni mpsc = getModalitaPagamentoSoggettoCessione();
//		return (mas!=null?mas.getCodice()  + " " + mas.getDescrizione():"") + " " 
//			+ (mpsc!=null?mpsc.getDescrizioneStatoModalitaCessione():"");
		

		return ( mas != null ? mas.getCodice()  + " " + mas.getDescrizione(): "" )  
				+  ( getDescrizione() != null ? " - " + getDescrizione() : "" )   
				+  ( getDenominazioneSede() != null ? " (" + getDenominazioneSede() + " )" : "") ;
		
	}
	
	/*
	 * ModalitaAccreditoSoggetto.codice    ModalitaAccreditoSoggetto.descrizione   - ModalitaPagamentoSoggetto.descrizione    (SedeSecondariaSoggetto.denominazione)

		Es.  CCB  Conto edilizia - IBAN:  IT02L1234512345123456789012  (Settore edilizia – Ufficio Cassa)
	 */
	
	
	
	
	
}
