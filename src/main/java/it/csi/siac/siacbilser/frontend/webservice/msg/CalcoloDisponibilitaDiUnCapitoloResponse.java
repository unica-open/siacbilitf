/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.CapitoloService.calcoloDisponibilitaDiUnCapitolo()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class CalcoloDisponibilitaDiUnCapitoloResponse extends ServiceResponse {

	private BigDecimal disponibilitaRichiesta;

	public BigDecimal getDisponibilitaRichiesta() {
		return disponibilitaRichiesta;
	}

	public void setDisponibilitaRichiesta(BigDecimal disponibilitaRichiesta) {
		this.disponibilitaRichiesta = disponibilitaRichiesta;
	}

}
