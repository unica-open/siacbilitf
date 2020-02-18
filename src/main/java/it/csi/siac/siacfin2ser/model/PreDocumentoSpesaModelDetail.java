/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ModelDetail;

/**
 * The Enum PreDocumentoSpesaModelDetail.
 * @author Marchino Alessandro
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum PreDocumentoSpesaModelDetail implements ModelDetail {
	
	AttoAmm,
	Capitolo,
	Causale,
	Classif,
	ContoTesoreria,
	DatiAnagrafici,
	ElencoDocumentiAllegato,
	Impegno,
	ImpegnoModelDetail,
	ModPag,
	ProvvisorioDiCassa,
	Sogg,
	Stato,
	SubDocumento,
	VoceMutuo,
	;

}
