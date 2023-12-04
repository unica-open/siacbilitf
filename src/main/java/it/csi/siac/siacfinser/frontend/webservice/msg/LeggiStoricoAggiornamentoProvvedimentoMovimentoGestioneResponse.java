/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.AttoAmministrativoStoricizzato;

/**
 * Messaggio di risposta per leggere lo storico dei cambiamenti del provvedimento 
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class LeggiStoricoAggiornamentoProvvedimentoMovimentoGestioneResponse
		extends ServiceResponse {
	
	private List<AttoAmministrativoStoricizzato> storicoAttoAmministrativi = new ArrayList<AttoAmministrativoStoricizzato>();

	/**
	 * @return the storicoAttoAmministrativi
	 */
	public List<AttoAmministrativoStoricizzato> getStoricoAttoAmministrativi() {
		return storicoAttoAmministrativi;
	}

	/**
	 * @param storicoAttoAmministrativi the storicoAttoAmministrativi to set
	 */
	public void setStoricoAttoAmministrativi(
			List<AttoAmministrativoStoricizzato> storicoAttoAmministrativi) {
		this.storicoAttoAmministrativi = storicoAttoAmministrativi;
	}
	
	

}
