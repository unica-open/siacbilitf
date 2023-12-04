/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;


/**
 * The Enum DocumentoSpesaModelDetail.
 * 
 * @author Domenico
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum DocumentoSpesaModelDetail implements ModelDetailEnum {
	
	Attr,
	Soggetto,
	Classif,
	// Non esiste un converter apposito
//	CodiceBollo,
	CodicePCC,
	CodiceUfficioDestinatarioPCC,
	CollegatoAdAllegatoAtto,
	DataInizioValiditaStato,
	DocumentiCollegati,
	FatturaFEL,
	ImportoDaPagareNonPagatoInCassaEconomale,
	Onere,
	Ordini,
	RegistroComunicazioniPCC,
	RegistroUnico,
	Stato,
	SubdocumentoIva,
	SubdocumentoSpesa,
	TipoDocumento,
	// SIAC-5311 SIOPE+
	SiopeDocumentoTipo,
	SiopeDocumentoTipoAnalogico,
	
	
	// Totali
	TotaliImportiQuote,
	TotaleImportoDocumentiEntrataFiglio,
	TotaleImportoDocumentiSpesaFiglio,
	TotaliImportiNoteCredito,
	TotaliImportiRilevantiIvaQuote,
	EsisteQuotaRilevanteIva,
	EsisteNCDCollegataADocumento,
	;

}
