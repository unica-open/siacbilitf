/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siacbilser.model.ModelDetail;

import javax.xml.bind.annotation.XmlType;

/**
 * The Enum TipoOnereModelDetail.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoOnereModelDetail implements ModelDetail {	
	
	Attr,
    //Con questo converter si ottengono anche Impegno/Accertamento della Casusale.
    Causali,
//    CausaliImpegno,
//    CausaliAccertamento,
    Attivita;

}