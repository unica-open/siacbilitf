/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.VariazioneCodificaCapitolo;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaVariazioneCodificheResponse extends ServiceResponse {
		
	private String idAttivita;	
	private VariazioneCodificaCapitolo variazioneCodificaCapitolo;
	
	private Boolean isProvvedimentoPresente = Boolean.FALSE;

	public VariazioneCodificaCapitolo getVariazioneCodificaCapitolo() {
		return variazioneCodificaCapitolo;
	}

	public void setVariazioneCodificaCapitolo(VariazioneCodificaCapitolo variazioneCodificaCapitolo) {
		this.variazioneCodificaCapitolo = variazioneCodificaCapitolo;
	}

	public String getIdAttivita() {
		return idAttivita;
	}

	public void setIdAttivita(String idAttivita) {
		this.idAttivita = idAttivita;
	}

	public Boolean getIsProvvedimentoPresente() {
		return isProvvedimentoPresente;
	}

	public void setIsProvvedimentoPresente(Boolean isProvvedimentoPresente) {
		this.isProvvedimentoPresente = isProvvedimentoPresente;
	}

}
