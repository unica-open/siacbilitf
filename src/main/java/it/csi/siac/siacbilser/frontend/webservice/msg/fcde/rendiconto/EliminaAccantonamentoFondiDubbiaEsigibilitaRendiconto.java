/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.FondiDubbiaEsigibilitaService.eliminaAccantonamentoFondiDubbiaEsigibilitaRendiconto()
 * 
 * @author Alessandro Marchino
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class EliminaAccantonamentoFondiDubbiaEsigibilitaRendiconto extends ServiceRequest {

	@XmlElementWrapper(name = "listaAccantonamentoFondiDubbiaEsigibilitaRendiconto")
	@XmlElement(name = "accantonamentoFondiDubbiaEsigibilitaRendiconto")
	private List<AccantonamentoFondiDubbiaEsigibilitaRendiconto> listaAccantonamentoFondiDubbiaEsigibilitaRendiconto = new ArrayList<AccantonamentoFondiDubbiaEsigibilitaRendiconto>();

	/**
	 * @return the listaAccantonamentoFondiDubbiaEsigibilitaRendiconto
	 */
	@XmlTransient
	public List<AccantonamentoFondiDubbiaEsigibilitaRendiconto> getListaAccantonamentoFondiDubbiaEsigibilitaRendiconto() {
		return this.listaAccantonamentoFondiDubbiaEsigibilitaRendiconto;
	}

	/**
	 * @param listaAccantonamentoFondiDubbiaEsigibilitaRendiconto the listaAccantonamentoFondiDubbiaEsigibilitaRendiconto to set
	 */
	public void setListaAccantonamentoFondiDubbiaEsigibilitaRendiconto(List<AccantonamentoFondiDubbiaEsigibilitaRendiconto> listaAccantonamentoFondiDubbiaEsigibilitaRendiconto) {
		this.listaAccantonamentoFondiDubbiaEsigibilitaRendiconto = listaAccantonamentoFondiDubbiaEsigibilitaRendiconto;
	}

}
