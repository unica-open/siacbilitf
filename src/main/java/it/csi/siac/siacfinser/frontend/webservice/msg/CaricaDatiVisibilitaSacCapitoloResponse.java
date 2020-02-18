/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class CaricaDatiVisibilitaSacCapitoloResponse extends ServiceResponse{


	private boolean visibiliAll;
	private List<Integer> idSacVisibili;
	
	
	public boolean isVisibiliAll() {
		return visibiliAll;
	}
	public void setVisibiliAll(boolean visibiliAll) {
		this.visibiliAll = visibiliAll;
	}
	public List<Integer> getIdSacVisibili() {
		return idSacVisibili;
	}
	public void setIdSacVisibili(List<Integer> idSacVisibili) {
		this.idSacVisibili = idSacVisibili;
	}
	
	
}
