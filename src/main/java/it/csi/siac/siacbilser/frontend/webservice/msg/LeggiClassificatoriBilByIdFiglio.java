/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;


@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiClassificatoriBilByIdFiglio extends ServiceRequest {

	private int anno;
	private int idEnteProprietario;
	private int idFiglio;

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getIdEnteProprietario() {
		return idEnteProprietario;
	}

	public void setIdEnteProprietario(int idEnteProprietario) {
		this.idEnteProprietario = idEnteProprietario;
	}

	public int getIdFiglio() {
		return idFiglio;
	}

	public void setIdFiglio(int idPadre) {
		this.idFiglio = idPadre;
	}

}
