/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.MezziDiTrasporto;
import it.csi.siac.siaccorser.model.ServiceResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaMezziDiTrasportoResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaMezziDiTrasporto")
	@XmlElement(name = "mezzoDiTrasporto")
	private List<MezziDiTrasporto> mezziDiTrasporto = new ArrayList<MezziDiTrasporto>();

	/**
	 * @return the mezziDiTrasporto
	 */
	@XmlTransient
	public List<MezziDiTrasporto> getMezziDiTrasporto() {
		return mezziDiTrasporto;
	}

	/**
	 * @param mezziDiTrasporto the mezziDiTrasporto to set
	 */
	public void setMezziDiTrasporto(List<MezziDiTrasporto> mezziDiTrasporto) {
		this.mezziDiTrasporto = mezziDiTrasporto;
	}

}
