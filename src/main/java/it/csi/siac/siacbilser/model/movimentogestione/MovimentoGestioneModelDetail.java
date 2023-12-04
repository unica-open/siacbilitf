/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/


package it.csi.siac.siacbilser.model.movimentogestione;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siaccommon.model.ModelDetailEnum;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum MovimentoGestioneModelDetail implements ModelDetailEnum {	

	Stato,

	;
}
