/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.FondiDubbiaEsigibilitaService.eliminaAccantonamentoFondiDubbiaEsigibilita()
 * 
 * @author Alessandro Marchino
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class EliminaAccantonamentoFondiDubbiaEsigibilita extends ServiceRequest {

	@XmlElementWrapper(name = "listaAccantonamentoFondiDubbiaEsigibilita")
	@XmlElement(name = "accantonamentoFondiDubbiaEsigibilita")
	private List<AccantonamentoFondiDubbiaEsigibilita> listaAccantonamentoFondiDubbiaEsigibilita = new ArrayList<AccantonamentoFondiDubbiaEsigibilita>();

	/**
	 * @return the listaAccantonamentoFondiDubbiaEsigibilita
	 */
	@XmlTransient
	public List<AccantonamentoFondiDubbiaEsigibilita> getListaAccantonamentoFondiDubbiaEsigibilita() {
		return this.listaAccantonamentoFondiDubbiaEsigibilita;
	}

	/**
	 * @param listaAccantonamentoFondiDubbiaEsigibilita the listaAccantonamentoFondiDubbiaEsigibilita to set
	 */
	public void setListaAccantonamentoFondiDubbiaEsigibilita(List<AccantonamentoFondiDubbiaEsigibilita> listaAccantonamentoFondiDubbiaEsigibilita) {
		this.listaAccantonamentoFondiDubbiaEsigibilita = listaAccantonamentoFondiDubbiaEsigibilita;
	}

}
