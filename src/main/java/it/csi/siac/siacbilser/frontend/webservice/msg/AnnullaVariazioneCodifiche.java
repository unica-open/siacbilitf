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
public class AnnullaVariazioneCodifiche extends ServiceRequest {
	
	//Fields dedicati alla gestione del processo
	private String idAttivita;		
	
	
	//Variazione da aggiornare
	private VariazioneCodificaCapitolo  variazioneCodificaCapitolo;
	
	public String getIdAttivita() {
		return idAttivita;
	}
	
	public void setIdAttivita(String idAttivita) {
		this.idAttivita = idAttivita;
	}
	
	public VariazioneCodificaCapitolo getVariazioneCodificaCapitolo() {
		return variazioneCodificaCapitolo;
	}
	
	public void setVariazioneImportoCapitolo(VariazioneCodificaCapitolo variazioneImportoCapitolo) {
		this.variazioneCodificaCapitolo = variazioneImportoCapitolo;
	}

}
