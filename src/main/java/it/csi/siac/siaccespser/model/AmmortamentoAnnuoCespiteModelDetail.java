/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ModelDetail;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public enum AmmortamentoAnnuoCespiteModelDetail implements ModelDetail {
	
	DettaglioAmmortamentoAnnuoCespite,
	DettaglioAmmortamentoAnnuoCespiteModelDetail,
	DettaglioAmmortamentoAnnuoCespiteAnnoSpecificoModelDetail,
	Cespite,
	
	
	;
	

}
