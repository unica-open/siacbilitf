/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;

/**
 * Caratterizza una causale.
 * Utilizzati per automatizzare le scritture  innescate da eventi finanziari.
 * Ciascun ente avr' a disposizione un set di classificatori da identificare con
 * codice-descrizione e lista valori ammessi sulla base dei quali identificare una
 * causale.
 * 
 * Classificatori sono previsti a sistema per tutti gli enti.
 * <ul>
 * 	<li>CL1  =  Rilevante IVA: 'no', 'si contestuale', 'si differita'  (per FIN
 * corrisponde al flag rilevante IVA del Capitolo collegato al
 * MovimentofinanziarioDaRegistrare e ai parametri di configurazione a livello di
 * ente 'Esigibilit' Differita Iva Acquisti' e 'Esigibilit' Differita Iva
 * Vendite') </li>
 * 	<li>CL2  =  Valore: '= a valore contabile', 'MINORE del valore contabile',
 * 'MAGGIORE del valore contabile'</li>
 * 	<li>CL3 =  Modalit' di acquisizione: 'Acquisto in unica soluzione del bene',
 * 'Immobilizzazioni materiali in costruzione', 'Pagamento a mezzo SAL', 'Bene
 * demaniale'</li>
 * 	<li>CL4 =  Tipologia documento collegato: corrispondono al TipoDocumento , ad
 * es.  FTV, NCD, per le spese FATT, NCD</li>
 * 	<li>CL5  =   Tipo onere fiscale  : corrisponde al TipoOnere collegato
 * all'evento,  ad es.  INPS CARICO ENTE, RITENUTA INPS , RITENUTA IRPEF</li>
 * </ul>
 * @author 1080
 * @version 1.0
 * @created 06-mar-2015 16.31.24
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class ClassificatoreEP extends ClassificatoreGenerico {

	
	private static final long serialVersionUID = 4922431003745781401L;
	
	private CausaleEP causaleEP;

	/**
	 * @return the causaleEP
	 */
	public CausaleEP getCausaleEP() {
		return causaleEP;
	}

	/**
	 * @param causaleEP the causaleEP to set
	 */
	public void setCausaleEP(CausaleEP causaleEP) {
		this.causaleEP = causaleEP;
	}



}