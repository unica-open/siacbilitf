/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;


/**
* The Enum SubdocumentoSpesaModelDetail.
* 
* @author Domenico
*/
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum SubdocumentoSpesaModelDetail implements ModelDetailEnum {
	
	AttoAmm,
	Attr,
	Classif,
	CommissioniDocumento,
	DocPadre,
	ElencoDocumenti,
	HasRitenute,
	HasSubordinati,
	ImpegnoSubimpegno,
	ImpegnoSubimpegnoPdc,
	IsSubordinato,
	Liquidazione,
	ModPag,
	Ordinativo,
	Predocumento,
	ProvvisorioDiCassa,
	RegistroComunicazioniPCC,
	SedeSecondariaSoggetto,
	SubdocumentoIva,
	TipoIvaSplitReverse,
	TestataDocumento,
	// SIAC-5115
	SospensioneSubdocumento,
	
	// SIAC-5335
	SiopeTipoDebito,
	SiopeAssenzaMotivazione,
	SiopeScadenzaMotivo,
	// SIAC-5546
	ImpegnoSubimpegnoConDisponibilita,
	LiquidazioneMinimalStato,
	NoteTesoriere,
	ContoTesoreria,
	
	// SIAC-6092
	DocPadreModelDetail,
	
	//SIAC-8153
	StrutturaCompetenteQuota,
	;

}
