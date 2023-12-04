/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;

/**
 * The Class CausalePCC.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class CausalePCC extends Codifica {
	//maps the siac_d_pcc_causale
	private static final long serialVersionUID = -3930234782194813064L;
	
	public CausalePCC() {
		// Costruttore vuoto
	}
	
	public CausalePCC(String codice, String descrizione){
		super(codice, descrizione);
	}
	
	public CausalePCC(String codice){
		super(codice, null);
	}
	
	public enum Value {
		
		//"ATTLIQ";"importo sospeso ma in attesa di essere liquidato"
		AttesaLiquidazione,
		//"CONT";"importo sospeso o non liquidabile per la presenza di un contenzioso"
		Contenzioso,
		//ATTNC, "ATTNC";"se documento diverso da nota di credito e importo non liquidabile perché si attende una nota di credito"
		AttesaNotaCredito,
		//"NCRED";"se documento è una nota di credito che si riferisce ad una o più fatture classificate con Stato del debito non liquidabile"
		NotaCredito,
		//"PAGTERZI";"la fattura che sarà pagata da soggetto diverso dall'Amministrazione destinataria della fattura"
		PagataTerzi,
		//"IVARC";"importo non liquidabile perché riferito ad IVA contabilizzata per reverse charge"
		IvaReverseChange,
		;
		
	}
	
}
