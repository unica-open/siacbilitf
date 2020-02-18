/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.FondiDubbiaEsegibilitaService.inserisceFondiDubbiaEsegibilita()
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceFondiDubbiaEsigibilitaResponse extends ServiceResponse {

	@XmlElementWrapper(name = "fondiDubbiaEsigibilita")
	@XmlElement(name = "accantonamentoFondiDubbiaEsigibilita")
	private List<AccantonamentoFondiDubbiaEsigibilita> accantonamentiFondiDubbiaEsigibilita = new ArrayList<AccantonamentoFondiDubbiaEsigibilita>();

	/**
	 * @return the accantonamentiFondiDubbiaEsigibilita
	 */
	public List<AccantonamentoFondiDubbiaEsigibilita> getAccantonamentiFondiDubbiaEsigibilita() {
		return accantonamentiFondiDubbiaEsigibilita;
	}

	/**
	 * @param accantonamentiFondiDubbiaEsigibilita the accantonamentiFondiDubbiaEsigibilita to set
	 */
	@XmlTransient
	public void setAccantonamentiFondiDubbiaEsigibilita(List<AccantonamentoFondiDubbiaEsigibilita> accantonamentiFondiDubbiaEsigibilita) {
		this.accantonamentiFondiDubbiaEsigibilita = accantonamentiFondiDubbiaEsigibilita != null ? accantonamentiFondiDubbiaEsigibilita : new ArrayList<AccantonamentoFondiDubbiaEsigibilita>();
	}

}
