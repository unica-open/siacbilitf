/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.VariazioneCodificaCapitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceVariazioneCodifiche extends ServiceRequest {
	
	private Boolean invioOrganoAmministrativo;
	private Boolean invioOrganoLegislativo;
	
	private VariazioneCodificaCapitolo variazioneCodificaCapitolo;

	public VariazioneCodificaCapitolo getVariazioneCodificaCapitolo() {
		return variazioneCodificaCapitolo;
	}

	public void setVariazioneCodificaCapitolo(VariazioneCodificaCapitolo variazioneCodificaCapitolo) {
		this.variazioneCodificaCapitolo = variazioneCodificaCapitolo;
	}

	public Boolean getInvioOrganoAmministrativo() {
		return invioOrganoAmministrativo;
	}

	public void setInvioOrganoAmministrativo(Boolean invioOrganoAmministrativo) {
		this.invioOrganoAmministrativo = invioOrganoAmministrativo;
	}

	public Boolean getInvioOrganoLegislativo() {
		return invioOrganoLegislativo;
	}

	public void setInvioOrganoLegislativo(Boolean invioOrganoLegislativo) {
		this.invioOrganoLegislativo = invioOrganoLegislativo;
	}
	
	
	
	

}
