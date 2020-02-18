/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ModelDetail;


@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum StampeCassaFileModelDetail implements ModelDetail {
	
	AllegatoAtto,
	Bilancio,
	CassaEconomale,
	File,
	Movimento,
	OperazioneCassa,
	StatoStampa,
	TipoDocumento,
	Valore,
	;

}
