/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.custom.stilo.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfinser.model.MovimentoGestione;



@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaMovimentoGestioneResponse extends ServiceResponse{

	
	private List<MovimentoGestione> movimentiGestione = new ArrayList<MovimentoGestione>();

	/**
	 * @return the movimentiGestione
	 */
	public List<MovimentoGestione> getMovimentiGestione() {
		return movimentiGestione;
	}

	/**
	 * @param movimentiGestione the movimentiGestione to set
	 */
	public void setMovimentiGestione(List<MovimentoGestione> movimentiGestione) {
		this.movimentiGestione = movimentiGestione;
	}

	
}
