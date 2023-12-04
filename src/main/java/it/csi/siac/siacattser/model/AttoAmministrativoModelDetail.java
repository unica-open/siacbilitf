/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;

/**
 * Model detail per il provvedimento
 * @author Marchino Alessandro
 */
@XmlType(namespace = ATTDataDictionary.NAMESPACE)
public enum AttoAmministrativoModelDetail implements ModelDetailEnum {
	// Tipo di atto
	TipoAtto,
	// Stato operativo
	StatoOperativo,
	// SAC
	StrutturaAmmContabile,
	// Allegato atto
	AllegatoAtto,
	;
}
