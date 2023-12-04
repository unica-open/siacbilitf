/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilitaGestione;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.FondiDubbiaEsigibilitaService.aggiornaAccantonamentoFondiDubbiaEsigibilitaGestione()
 * 
 * @author Alessandro Marchino
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaAccantonamentoFondiDubbiaEsigibilitaGestione extends ServiceRequest {

	@XmlElementWrapper(name = "listaAccantonamentoFondiDubbiaEsigibilitaGestione")
	@XmlElement(name = "accantonamentoFondiDubbiaEsigibilitaGestione")
	private List<AccantonamentoFondiDubbiaEsigibilitaGestione> listaAccantonamentoFondiDubbiaEsigibilitaGestione = new ArrayList<AccantonamentoFondiDubbiaEsigibilitaGestione>();

	/**
	 * @return the listaAccantonamentoFondiDubbiaEsigibilitaGestione
	 */
	@XmlTransient
	public List<AccantonamentoFondiDubbiaEsigibilitaGestione> getListaAccantonamentoFondiDubbiaEsigibilitaGestione() {
		return this.listaAccantonamentoFondiDubbiaEsigibilitaGestione;
	}

	/**
	 * @param listaAccantonamentoFondiDubbiaEsigibilitaGestione the listaAccantonamentoFondiDubbiaEsigibilitaGestione to set
	 */
	public void setListaAccantonamentoFondiDubbiaEsigibilitaGestione(List<AccantonamentoFondiDubbiaEsigibilitaGestione> listaAccantonamentoFondiDubbiaEsigibilitaGestione) {
		this.listaAccantonamentoFondiDubbiaEsigibilitaGestione = listaAccantonamentoFondiDubbiaEsigibilitaGestione;
	}


}
