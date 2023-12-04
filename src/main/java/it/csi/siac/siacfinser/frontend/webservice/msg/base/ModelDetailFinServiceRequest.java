/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg.base;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneSpesaCollegataFinModelDetail;

/**
 * Classe base di request con i model detail 
 * 
 * @author Marchino Alessandro
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public abstract class ModelDetailFinServiceRequest extends ServiceRequest {
	
	@XmlElementWrapper(name="modelDetailEnums")
	@XmlElements({
		@XmlElement(name="accantonamentoFondiDubbiaEsigibilitaModelDetail", type=ModificaMovimentoGestioneSpesaCollegataFinModelDetail.class),
	})
	private ModelDetailEnum[] modelDetailEnums;

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
