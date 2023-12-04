/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;

/**
 * The Enum TipoOnereModelDetail.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoOnereModelDetail implements ModelDetailEnum {	
	
	Attr,
    //Con questo converter si ottengono anche Impegno/Accertamento della Casusale.
    Causali,
//    CausaliImpegno,
//    CausaliAccertamento,
    Attivita;

}