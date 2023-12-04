/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.TipoGiustificativo;
import it.csi.siac.siaccorser.model.ServiceResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaTipoGiustificativoResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaTipiGiustificativi")
	@XmlElement(name = "tipoGiustificativo")
	private List<TipoGiustificativo> tipiGiustificativi = new ArrayList<TipoGiustificativo>();

	/**
	 * @return the tipiGiustificativi
	 */
	@XmlTransient
	public List<TipoGiustificativo> getTipiGiustificativi() {
		return tipiGiustificativi;
	}

	/**
	 * @param tipiGiustificativi the tipiGiustificativi to set
	 */
	public void setTipiGiustificativi(List<TipoGiustificativo> tipiGiustificativi) {
		this.tipiGiustificativi = tipiGiustificativi;
	}

}
