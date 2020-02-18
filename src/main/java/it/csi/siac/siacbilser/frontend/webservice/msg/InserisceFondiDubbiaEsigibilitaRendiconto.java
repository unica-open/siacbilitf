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
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.FondiDubbiaEsegibilitaService.inserisceFondiDubbiaEsegibilitaRendiconto()
 * 
 * @author Alessandro Marchino
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceFondiDubbiaEsigibilitaRendiconto extends ServiceRequest {

	@XmlElementWrapper(name = "fondiDubbiaEsigibilitaRendiconto")
	@XmlElement(name = "accantonamentoFondiDubbiaEsigibilitaRendiconto")
	private List<AccantonamentoFondiDubbiaEsigibilitaRendiconto> accantonamentiFondiDubbiaEsigibilitaRendiconto = new ArrayList<AccantonamentoFondiDubbiaEsigibilitaRendiconto>();

	/**
	 * @return the accantonamentiFondiDubbiaEsigibilitaRendiconto
	 */
	public List<AccantonamentoFondiDubbiaEsigibilitaRendiconto> getAccantonamentiFondiDubbiaEsigibilitaRendiconto() {
		return accantonamentiFondiDubbiaEsigibilitaRendiconto;
	}

	/**
	 * @param accantonamentiFondiDubbiaEsigibilitaRendiconto the accantonamentiFondiDubbiaEsigibilitaRendiconto to set
	 */
	@XmlTransient
	public void setAccantonamentiFondiDubbiaEsigibilitaRendiconto(List<AccantonamentoFondiDubbiaEsigibilitaRendiconto> accantonamentiFondiDubbiaEsigibilitaRendiconto) {
		this.accantonamentiFondiDubbiaEsigibilitaRendiconto = accantonamentiFondiDubbiaEsigibilitaRendiconto != null ? accantonamentiFondiDubbiaEsigibilitaRendiconto : new ArrayList<AccantonamentoFondiDubbiaEsigibilitaRendiconto>();
	}


}
