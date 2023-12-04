/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;


/**
 * The Enum DocumentoEntrataModelDetail.
 * 
 * @author Domenico
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum DocumentoEntrataModelDetail implements ModelDetailEnum {
	
	Attr,
	Classif,
//	CodiceBollo,
	DataInizioValiditaStato,
	DocumentiCollegati,
	Sogg,
	Stato,
	SubdocumentoEntrata,
	SubdocumentoIva, 
	TipoDocumento,
	 
	TotaliImportiQuote,
	TotaleImportoDocumentiEntrataFiglio,
	TotaleImportoDocumentiSpesaFiglio,
	TotaliImportiNoteCredito,
	TotaliImportiRilevantiIvaQuote,
	EsisteQuotaRilevanteIva,
	EsisteNCDCollegataADocumento,
	

}
