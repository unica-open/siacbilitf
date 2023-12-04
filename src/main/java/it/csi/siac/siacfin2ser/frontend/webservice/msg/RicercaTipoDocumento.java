/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.TipoFamigliaDocumento;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaTipoDocumento extends ServiceRequest {
	
	private Ente ente = null;
	
	//entrata / uscita come Enum tipo code
	private TipoFamigliaDocumento tipoFamDoc;
	
	//flag subordinato boolean 
	private Boolean flagSubordinato = null;
	
	private Boolean flagRegolarizzazione = null;
	

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public TipoFamigliaDocumento getTipoFamDoc() {
		return tipoFamDoc;
	}

	public void setTipoFamDoc(TipoFamigliaDocumento tipoFamDoc) {
		this.tipoFamDoc = tipoFamDoc;
	}

	public Boolean getFlagSubordinato() {
		return flagSubordinato;
	}

	public void setFlagSubordinato(Boolean flagSubordinato) {
		this.flagSubordinato = flagSubordinato;
	}

	public Boolean getFlagRegolarizzazione() {
		return flagRegolarizzazione;
	}

	public void setFlagRegolarizzazione(Boolean flagRegolarizzazione) {
		this.flagRegolarizzazione = flagRegolarizzazione;
	}
}
