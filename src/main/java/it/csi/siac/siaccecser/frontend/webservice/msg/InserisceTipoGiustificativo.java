/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.TipoGiustificativo;
import it.csi.siac.siaccorser.model.ServiceRequest;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class InserisceTipoGiustificativo extends ServiceRequest {

	private TipoGiustificativo tipoGiustificativo;

	/**
	 * @return the tipoGiustificativo
	 */
	public TipoGiustificativo getTipoGiustificativo() {
		return tipoGiustificativo;
	}

	/**
	 * @param tipoGiustificativo the tipGiustificativo to set
	 */
	public void setTipoGiustificativo(TipoGiustificativo tipoGiustificativo) {
		this.tipoGiustificativo = tipoGiustificativo;
	}
	
	
}
