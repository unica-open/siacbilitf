/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ModelDetail;
/**
* The Enum SubdocumentoSpesaModelDetail.
*
* @author Domenico
*/
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum SubdocumentoEntrataModelDetail implements ModelDetail {
	
	AccertamentoSubaccertamento,
	AccertamentoSubaccertamentoPdc,
	AttoAmm,
	Attr,
	Classif,
	CommissioniDocumento,
	ContoTesoreria,
	Distinta,
	DocPadre,
	ElencoDocumenti,
	HasSubordinati,
	IsSubordinato,
	ModPag,
	Ordinativo,
	Predocumento,
	ProvvisorioDiCassa,
	SedeSecondariaSoggetto,
	SubdocumentoIva,
	TestataDocumento,
	
	// SIAC-6092
	DocPadreModelDetail,
	;
}