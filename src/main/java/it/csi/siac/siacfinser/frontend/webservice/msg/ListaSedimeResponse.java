/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.codifiche.CodificaExtFin;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ListaSedimeResponse  extends ServiceResponse {

	

	private List<CodificaExtFin> listaSedime;

	public List<CodificaExtFin> getListaSedime() {
		return listaSedime;
	}

	public void setListaSedime(List<CodificaExtFin> listaSedime) {
		this.listaSedime = listaSedime;
	}
	

}
