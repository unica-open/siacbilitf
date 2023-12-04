/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.MovimentoGestione;

/**
 * Messaggio di richiesta per leggere lo storico dei cambiamenti del provvedimento 
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class LeggiStoricoAggiornamentoStrutturaCompetenteMovimentoGestione extends
		ServiceRequest {

	private MovimentoGestione movimento;

	/**
	 * @return the movimento
	 */
	public MovimentoGestione getMovimento() {
		return movimento;
	}

	/**
	 * @param movimento the movimento to set
	 */
	public void setMovimento(MovimentoGestione movimento) {
		this.movimento = movimento;
	}
	
	
}
