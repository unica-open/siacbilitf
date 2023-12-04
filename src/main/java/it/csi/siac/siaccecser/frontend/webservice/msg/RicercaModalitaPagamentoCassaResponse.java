/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.ModalitaPagamentoCassa;
import it.csi.siac.siaccorser.model.ServiceResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaModalitaPagamentoCassaResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaModalitaPagamentoCassa")	    
	@XmlElement(name = "modalitaPagamentoCassa")
	private List<ModalitaPagamentoCassa> modalitaPagamentoCassa = new ArrayList<ModalitaPagamentoCassa>();

	/**
	 * @return the modalitaPagamentoCassa
	 */
	@XmlTransient
	public List<ModalitaPagamentoCassa> getModalitaPagamentoCassa() {
		return modalitaPagamentoCassa;
	}

	/**
	 * @param modalitaPagamentoCassa the modalitaPagamentoCassa to set
	 */
	public void setModalitaPagamentoCassa(
			List<ModalitaPagamentoCassa> modalitaPagamentoCassa) {
		this.modalitaPagamentoCassa = modalitaPagamentoCassa;
	}

	
	
}
