/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;


@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum StampeCassaFileModelDetail implements ModelDetailEnum {
	
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
