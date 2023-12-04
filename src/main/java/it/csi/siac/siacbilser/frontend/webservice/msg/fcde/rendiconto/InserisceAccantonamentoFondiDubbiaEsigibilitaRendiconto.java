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
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.FondiDubbiaEsegibilitaService.inserisceFondiDubbiaEsegibilita()
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceAccantonamentoFondiDubbiaEsigibilitaRendiconto extends ServiceRequest {

	private AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;

	@XmlElementWrapper(name = "listaAccantonamentoFondiDubbiaEsigibilitaRendiconto")
	@XmlElement(name = "accantonamentoFondiDubbiaEsigibilitaRendiconto")
	private List<AccantonamentoFondiDubbiaEsigibilitaRendiconto> listaAccantonamentoFondiDubbiaEsigibilitaRendiconto = new ArrayList<AccantonamentoFondiDubbiaEsigibilitaRendiconto>();

	/**
	 * @return the accantonamentoFondiDubbiaEsigibilitaAttributiBilancio
	 */
	public AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio getAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio() {
		return this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	}

	/**
	 * @param accantonamentoFondiDubbiaEsigibilitaAttributiBilancio the accantonamentoFondiDubbiaEsigibilitaAttributiBilancio to set
	 */
	public void setAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio(AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio accantonamentoFondiDubbiaEsigibilitaAttributiBilancio) {
		this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancio = accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	}

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
