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
public enum PreDocumentoEntrataModelDetail implements ModelDetail {
	
	Accertamento,
	AttoAmm,
	Capitolo,
	Causale,
	Classif,
	DatiAnagrafici,
	ElencoDocumentiAllegato,
	ProvvisorioDiCassa,
	Sogg,
	Stato,
	SubDocumento,
	;

}
