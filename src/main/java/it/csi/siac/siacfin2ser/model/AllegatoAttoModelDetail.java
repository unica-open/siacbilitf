/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;


@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum AllegatoAttoModelDetail implements ModelDetailEnum {
	
	// SIAC-5021
	IsAssociatoAdAlmenoUnaQuotaSpesa,
	IsAssociatoAdUnDocumento,
	IsAssociatoAdUnSubdocumentoSospeso,
	
	DataInizioValiditaStato,
	DatiSoggetto,
	ElencoDocumenti,
	
	
	// SIAC-5043
	ElencoDocumentiConPagatoIncassato,
	DataCompletamento,
	IsAssociatoAdUnSubdocumentoConOrdinativo,
	//SIAC-6261
	ElencoDocumentiModelDetail,
	HasImpegnoConfermaDurcDataFineValidita,
	ElencoSoggettiDurc
	;
}
