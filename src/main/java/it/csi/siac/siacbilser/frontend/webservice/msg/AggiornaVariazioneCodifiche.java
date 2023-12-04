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
public class AggiornaVariazioneCodifiche extends ServiceRequest {
	
	private String idAttivita;		
	private Boolean invioOrganoAmministrativo;
	private Boolean invioOrganoLegislativo;
	private Boolean annullaVariazione;	
	private Boolean evolviProcesso = Boolean.FALSE;
	
	private VariazioneCodificaCapitolo variazioneCodificaCapitolo;

	public String getIdAttivita() {
		return idAttivita;
	}

	public void setIdAttivita(String idAttivita) {
		this.idAttivita = idAttivita;
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

	public Boolean getAnnullaVariazione() {
		return annullaVariazione;
	}

	public void setAnnullaVariazione(Boolean annullaVariazione) {
		this.annullaVariazione = annullaVariazione;
	}

	public Boolean getEvolviProcesso() {
		return evolviProcesso;
	}

	public void setEvolviProcesso(Boolean evolviProcesso) {
		this.evolviProcesso = evolviProcesso;
	}

	public VariazioneCodificaCapitolo getVariazioneCodificaCapitolo() {
		return variazioneCodificaCapitolo;
	}

	public void setVariazioneCodificaCapitolo(VariazioneCodificaCapitolo variazioneCodificaCapitolo) {
		this.variazioneCodificaCapitolo = variazioneCodificaCapitolo;
	}
	
	
	
	
	

}
