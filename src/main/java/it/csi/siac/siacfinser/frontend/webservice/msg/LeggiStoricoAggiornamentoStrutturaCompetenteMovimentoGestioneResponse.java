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
import it.csi.siac.siacfinser.model.StrutturaAmmContabileFlatStoricizzato;

/**
 * Messaggio di risposta per leggere lo storico dei cambiamenti del provvedimento 
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class LeggiStoricoAggiornamentoStrutturaCompetenteMovimentoGestioneResponse
		extends ServiceResponse {
	
	private List<StrutturaAmmContabileFlatStoricizzato> storicoStrutturaCompetente = new ArrayList<StrutturaAmmContabileFlatStoricizzato>();

	/**
	 * @return the storicoStrutturaCompetente
	 */
	public List<StrutturaAmmContabileFlatStoricizzato> getStoricoStrutturaCompetente() {
		return storicoStrutturaCompetente;
	}

	/**
	 * @param storicoStrutturaCompetente the storicoStrutturaCompetente to set
	 */
	public void setStoricoStrutturaCompetente(List<StrutturaAmmContabileFlatStoricizzato> storicoStrutturaCompetente) {
		this.storicoStrutturaCompetente = storicoStrutturaCompetente;
	}
 

	 
	
	

}
