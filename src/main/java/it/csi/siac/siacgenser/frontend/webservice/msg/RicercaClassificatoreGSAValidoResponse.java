/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ClassificatoreGSA;

/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 04/01/2018
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaClassificatoreGSAValidoResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaClassificatoriGSA")
	@XmlElement(name = "classificatoreGSA")
	private List<ClassificatoreGSA> classificatoriGSA = new ArrayList<ClassificatoreGSA>();

	/**
	 * @return the classificatoriGSA
	 */
	@XmlTransient
	public List<ClassificatoreGSA> getClassificatoriGSA() {
		return this.classificatoriGSA;
	}

	/**
	 * @param classificatoriGSA the classificatoriGSA to set
	 */
	public void setClassificatoriGSA(List<ClassificatoreGSA> classificatoriGSA) {
		this.classificatoriGSA = classificatoriGSA;
	}
	
}
