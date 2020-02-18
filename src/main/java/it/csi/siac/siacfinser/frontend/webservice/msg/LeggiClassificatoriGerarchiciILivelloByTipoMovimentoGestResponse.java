/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Missione;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Messaggio di risposta per la lista dei classificatori con livello ricercati
 * per: anno, idEnteProprietario e codiceMovimentoGestione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class LeggiClassificatoriGerarchiciILivelloByTipoMovimentoGestResponse extends
		ServiceResponse {

	private List<Missione> classificatoriMissione = new ArrayList<Missione>();

	public List<Missione> getClassificatoriMissione() {
		return classificatoriMissione;
	}

	public void setClassificatoriMissione(List<Missione> classificatoriMissione) {
		this.classificatoriMissione = classificatoriMissione;
	}

}
