/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/


package it.csi.siac.siacbilser.model.movimentogestione;

import it.csi.siac.siaccommon.model.ComposedModelDetail;
import it.csi.siac.siacfin2ser.model.AccertamentoModelDetail;
import it.csi.siac.siacfin2ser.model.CapitoloEntrataGestioneModelDetail;

public class AccertamentoCapitoloComposedModelDetail implements ComposedModelDetail {
	
	public AccertamentoModelDetail modelDetailEnum;
	public CapitoloEntrataGestioneModelDetail[] modelDetailComponents;
	
	public AccertamentoCapitoloComposedModelDetail() {
	}

	public AccertamentoCapitoloComposedModelDetail(AccertamentoModelDetail modelDetailEnum, CapitoloEntrataGestioneModelDetail...components) {
		this();
		this.modelDetailEnum = modelDetailEnum;
		this.modelDetailComponents = components;
	}

	@Override
	public AccertamentoModelDetail getModelDetailEnum() {
		return modelDetailEnum;
	}

	@Override
	public CapitoloEntrataGestioneModelDetail[] getModelDetailComponents() {
		return modelDetailComponents;
	}

	
	
	// new ProvaComposedModelDetail(MovimentoModelDetail.Capitolo, CapitoloModelDetail.Classificatori, CapitoloModelDetail.Pippo)
	
	
	
	//MovimentoModelDetail.Capitolo, CapitoloModelDetail.Classificatori, CapitoloModelDetail.Pippo 
	
	//     MovimentoGestioneCapitoloDecorator + CapitoloClassificatoriDecorator, CapitoloPippoDecorator
	
	/**
	 it.csi.siac.siaccommon.model.ModelDetailEnum è un'interfaccia e JAXB non può gestire interfacce.
	this problem is related to the following location:
		at it.csi.siac.siaccommon.model.ModelDetailEnum
		at public it.csi.siac.siaccommon.model.ModelDetailEnum it.csi.siac.siacbilser.model.mutuo.MutuoAttoAmministrativoComposedModelDetail.modelDetailEnum
		at it.csi.siac.siacbilser.model.mutuo.MutuoAttoAmministrativoComposedModelDetail
		at public it.csi.siac.siacbilser.model.mutuo.MutuoAttoAmministrativoComposedModelDetail[] it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.BaseRicercaMutuoServiceRequest.getComposedModelDetails()
		at it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.BaseRicercaMutuoServiceRequest

	 */
}
