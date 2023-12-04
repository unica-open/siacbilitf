/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CodiceUfficioDestinatarioPCC;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaCodiceUfficioDestinatarioPCCResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaCodiciUfficiDestinatariPcc")
	@XmlElement(name = "codiceUfficioDestinatarioPCC")
	private List<CodiceUfficioDestinatarioPCC> codiciUfficiDestinatariPcc = new ArrayList<CodiceUfficioDestinatarioPCC>();

	/**
	 * @return the codiciUfficiDestinatariPcc
	 */
	@XmlTransient
	public List<CodiceUfficioDestinatarioPCC> getCodiciUfficiDestinatariPcc() {
		return codiciUfficiDestinatariPcc;
	}

	/**
	 * @param codiciUfficiDestinatariPcc the codiciUfficiDestinatariPcc to set
	 */
	public void setCodiciUfficiDestinatariPcc(List<CodiceUfficioDestinatarioPCC> codiciUfficiDestinatariPcc) {
		this.codiciUfficiDestinatariPcc = codiciUfficiDestinatariPcc;
	}

}
