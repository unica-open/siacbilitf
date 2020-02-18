/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilitaBase;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class BasePopolaFondiDubbiaEsigibilitaResponse<A extends AccantonamentoFondiDubbiaEsigibilitaBase> extends ServiceResponse {

	private Bilancio bilancio;
	
	@XmlElementWrapper(name = "fondiDubbiaEsigibilita")
	@XmlElements({
		@XmlElement(name = "accantonamentoFondiDubbiaEsigibilita", type = AccantonamentoFondiDubbiaEsigibilita.class),
		@XmlElement(name = "accantonamentoFondiDubbiaEsigibilitaRendiconto", type = AccantonamentoFondiDubbiaEsigibilitaRendiconto.class)
	})
	private List<A> accantonamentiFondiDubbiaEsigibilita = new ArrayList<A>();

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * @return the accantonamentiFondiDubbiaEsigibilita
	 */
	public List<A> getAccantonamentiFondiDubbiaEsigibilita() {
		return accantonamentiFondiDubbiaEsigibilita;
	}

	/**
	 * @param accantonamentiFondiDubbiaEsigibilita the accantonamentiFondiDubbiaEsigibilita to set
	 */
	@XmlTransient
	public void setAccantonamentiFondiDubbiaEsigibilita(List<A> accantonamentiFondiDubbiaEsigibilita) {
		this.accantonamentiFondiDubbiaEsigibilita = accantonamentiFondiDubbiaEsigibilita != null ? accantonamentiFondiDubbiaEsigibilita : new ArrayList<A>();
	}

	/**
	 * Aggiunge l'accantonamento alla lista
	 * @param accantonamentoFondiDubbiaEsigibilita l'accantonamento da aggiungere
	 */
	public void addAccantonamentoFondiDubbiaEsigibilita(A accantonamentoFondiDubbiaEsigibilita) {
		if(accantonamentoFondiDubbiaEsigibilita != null) {
			accantonamentiFondiDubbiaEsigibilita.add(accantonamentoFondiDubbiaEsigibilita);
		}
	}
}
