/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ClassePiano;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaClassiPianoAmmortamentoResponse extends ServiceResponse {

	private List<ClassePiano> classiPiano = new ArrayList<ClassePiano>();

	/**
	 * @return the classiPiano
	 */
	public List<ClassePiano> getClassiPiano() {
		return classiPiano;
	}

	/**
	 * @param classiPiano the classiPiano to set
	 */
	public void setClassiPiano(List<ClassePiano> classiPiano) {
		this.classiPiano = classiPiano;
	}
	
	
} 
