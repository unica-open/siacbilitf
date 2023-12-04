/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
import it.csi.siac.siacbilser.model.fcde.modeldetail.AccantonamentoFondiDubbiaEsigibilitaGestioneModelDetail;
import it.csi.siac.siacbilser.model.fcde.modeldetail.AccantonamentoFondiDubbiaEsigibilitaModelDetail;
import it.csi.siac.siacbilser.model.fcde.modeldetail.AccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail;
import it.csi.siac.siaccommon.model.ModelDetailEnum;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.model.CapitoloEntrataGestioneModelDetail;
import it.csi.siac.siacfin2ser.model.CapitoloEntrataPrevisioneModelDetail;

/**
 * Richiesta al metodo BIL.FondiDubbiaEsigibilitaService.ricercaAccantonamentoFondiDubbiaEsigibilita()
 * 
 * @author Alessandro Marchino
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaAccantonamentoFondiDubbiaEsigibilita extends ServiceRequest {

	private AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	
	@XmlElementWrapper(name = "modelDetailEnums")
	@XmlElements({
		@XmlElement(name = "accantonamentoFondiDubbiaEsigibilitaModelDetail", type = AccantonamentoFondiDubbiaEsigibilitaModelDetail.class),
		@XmlElement(name = "accantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail", type = AccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail.class),
		@XmlElement(name = "accantonamentoFondiDubbiaEsigibilitaGestioneModelDetail", type = AccantonamentoFondiDubbiaEsigibilitaGestioneModelDetail.class),
		@XmlElement(name = "capitoloEntrataPrevisioneModelDetail", type = CapitoloEntrataPrevisioneModelDetail.class),
		@XmlElement(name = "capitoloEntrataGestioneModelDetail", type = CapitoloEntrataGestioneModelDetail.class),
	})
	private ModelDetailEnum[] modelDetailEnums;
	/**
	 * @return the accantonamentoFondiDubbiaEsigibilitaAttributiBilancio
	 */
	public AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio getAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio() {
		return this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	}
	/**
	 * @param accantonamentoFondiDubbiaEsigibilitaAttributiBilancio the accantonamentoFondiDubbiaEsigibilitaAttributiBilancio to set
	 */
	public void setAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio(
			AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio accantonamentoFondiDubbiaEsigibilitaAttributiBilancio) {
		this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancio = accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	}
	/**
	 * @return the modelDetailEnums
	 */
	@XmlTransient
	public ModelDetailEnum[] getModelDetails() {
		return this.modelDetailEnums;
	}
	/**
	 * @param modelDetailEnums the modelDetailEnums to set
	 */
	public void setModelDetails(ModelDetailEnum... modelDetails) {
		this.modelDetailEnums = modelDetails;
	}

}
