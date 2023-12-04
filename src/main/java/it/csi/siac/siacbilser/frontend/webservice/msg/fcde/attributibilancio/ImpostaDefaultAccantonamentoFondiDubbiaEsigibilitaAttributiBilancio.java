/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.fcde.StatoAccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siacbilser.model.fcde.TipoAccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siacbilser.model.fcde.modeldetail.AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetail;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.FondiDubbiaEsigibilitaService.ricercaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio()
 * 
 * @author Alessandro Todesco
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class ImpostaDefaultAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio extends ServiceRequest {

	Bilancio bilancio;
	private TipoAccantonamentoFondiDubbiaEsigibilita tipoAccantonamentoFondiDubbiaEsigibilita;
	private StatoAccantonamentoFondiDubbiaEsigibilita statoAccantonamentoFondiDubbiaEsigibilita;
	private AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetail[] accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails;

	
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
	 * @return the tipoAccantonamentoFondiDubbiaEsigibilita
	 */
	public TipoAccantonamentoFondiDubbiaEsigibilita getTipoAccantonamentoFondiDubbiaEsigibilita() {
		return tipoAccantonamentoFondiDubbiaEsigibilita;
	}

	/**
	 * @param tipoAccantonamentoFondiDubbiaEsigibilita the tipoAccantonamentoFondiDubbiaEsigibilita to set
	 */
	public void setTipoAccantonamentoFondiDubbiaEsigibilita(
			TipoAccantonamentoFondiDubbiaEsigibilita tipoAccantonamentoFondiDubbiaEsigibilita) {
		this.tipoAccantonamentoFondiDubbiaEsigibilita = tipoAccantonamentoFondiDubbiaEsigibilita;
	}

	/**
	 * @return the statoAccantonamentoFondiDubbiaEsigibilita
	 */
	public StatoAccantonamentoFondiDubbiaEsigibilita getStatoAccantonamentoFondiDubbiaEsigibilita() {
		return statoAccantonamentoFondiDubbiaEsigibilita;
	}

	/**
	 * @param statoAccantonamentoFondiDubbiaEsigibilita the statoAccantonamentoFondiDubbiaEsigibilita to set
	 */
	public void setStatoAccantonamentoFondiDubbiaEsigibilita(
			StatoAccantonamentoFondiDubbiaEsigibilita statoAccantonamentoFondiDubbiaEsigibilita) {
		this.statoAccantonamentoFondiDubbiaEsigibilita = statoAccantonamentoFondiDubbiaEsigibilita;
	}

	/**
	 * @return the accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails
	 */
	public AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetail[] getAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails() {
		return accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails;
	}

	/**
	 * @param accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails the accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails to set
	 */
	public void setAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails(
			AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetail[] accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails) {
		this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails = accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails;
	}
	
}
