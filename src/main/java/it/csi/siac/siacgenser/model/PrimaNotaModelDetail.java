/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;

/**
 * The Enum ContoModelDetail.
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum PrimaNotaModelDetail implements ModelDetailEnum {	
	
	TipoCausale, 
	Ambito, 
	StatoOperativo, 
	StatoInventario,
	RateoRisconto, 
	Soggetto, 
	MovimentiEp,
	MovimentiEpModelDetail,
	MovimentiEpDettaglioConto,
	StatoAccettazionePrimaNotaProvvisoria,
	StatoAccettazionePrimaNotaDefinitiva,
//	MovimentiEpRegistrazioneMovFinWithLogicalKey, 
//	PrimeNoteCollegate,
	Bilancio,
	ContoInventario,
	PrimaNotaInventario,
	//SIAC-8134
	PrimaNotaStrutturaCompetente
	;
	
	
	

}