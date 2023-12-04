/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
import it.csi.siac.siacbilser.model.fcde.TipoImportazione;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.FondiDubbiaEsegibilitaService.inserisceFondiDubbiaEsegibilita()
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceAccantonamentoFondiDubbiaEsigibilitaImport extends ServiceRequest {

	private AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	private AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio accantonamentoFondiDubbiaEsigibilitaAttributiBilancioOld;
	private TipoImportazione tipoImportazione;

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
	 * @return the accantonamentoFondiDubbiaEsigibilitaAttributiBilancioOld
	 */
	public AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio getAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioOld() {
		return this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancioOld;
	}

	/**
	 * @param accantonamentoFondiDubbiaEsigibilitaAttributiBilancioOld the accantonamentoFondiDubbiaEsigibilitaAttributiBilancioOld to set
	 */
	public void setAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioOld(AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio accantonamentoFondiDubbiaEsigibilitaAttributiBilancioOld) {
		this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancioOld = accantonamentoFondiDubbiaEsigibilitaAttributiBilancioOld;
	}

	/**
	 * @return the tipoImportazione
	 */
	public TipoImportazione getTipoImportazione() {
		return this.tipoImportazione;
	}

	/**
	 * @param tipoImportazione the tipoImportazione to set
	 */
	public void setTipoImportazione(TipoImportazione tipoImportazione) {
		this.tipoImportazione = tipoImportazione;
	}

}
