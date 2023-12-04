/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;

/**
 * VariazioneImportoCapitoloModelDetail.
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum VariazioneImportoCapitoloModelDetail implements ModelDetailEnum {

	Bilancio,
	;
}
