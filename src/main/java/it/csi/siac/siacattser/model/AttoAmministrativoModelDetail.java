/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ModelDetail;

/**
 * Model detail per il provvedimento
 * @author Marchino Alessandro
 */
@XmlType(namespace = ATTDataDictionary.NAMESPACE)
public enum AttoAmministrativoModelDetail implements ModelDetail {
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
