/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import it.csi.siac.siacbilser.model.ModelDetail;

import javax.xml.bind.annotation.XmlType;

/**
 * The Enum ContoModelDetail.
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum PrimaNotaModelDetail implements ModelDetail {	
	
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
	;
	
	
	

}