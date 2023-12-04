/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;


import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaLiquidazioniResponse extends PaginazioneResponse {

	private Ente ente;
	private List<Liquidazione> elencoLiquidazioni;
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public List<Liquidazione> getElencoLiquidazioni() {
		return elencoLiquidazioni;
	}
	public void setElencoLiquidazioni(List<Liquidazione> elencoLiquidazioni) {
		this.elencoLiquidazioni = elencoLiquidazioni;
	}
}
