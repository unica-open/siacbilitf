/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;


import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.liquidazione.LiquidazioneAtti;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaEstesaLiquidazioniResponse extends PaginazioneResponse {


	private List<LiquidazioneAtti> elencoLiquidazioni;
	

	public List<LiquidazioneAtti> getElencoLiquidazioni() {
		return elencoLiquidazioni;
	}
	public void setElencoLiquidazioni(List<LiquidazioneAtti> elencoLiquidazioni) {
		this.elencoLiquidazioni = elencoLiquidazioni;
	}
}
