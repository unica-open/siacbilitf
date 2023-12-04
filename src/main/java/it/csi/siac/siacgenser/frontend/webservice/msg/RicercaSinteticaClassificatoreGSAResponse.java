/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ClassificatoreGSA;

/**
 * @author Elisa
 * @version 1.0.0 - 19/12/2017
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaClassificatoreGSAResponse extends RicercaSinteticaBaseResponse<ClassificatoreGSA> {
	
	@XmlElementWrapper(name = "listaClassificatoriGSA")	    
	@XmlElement(name = "classificatoreGSA")
	private ListaPaginata<ClassificatoreGSA> classificatoriGSA = new ListaPaginataImpl<ClassificatoreGSA>();
	
	/**
	 * Gets the classificatori GSA.
	 *
	 * @return the classificatori GSA
	 */
	@XmlTransient
	public ListaPaginata<ClassificatoreGSA> getClassificatoriGSA() {
		return classificatoriGSA;
	}

	/**
	 * Sets the classificatori GSA.
	 *
	 * @param classificatoriGSA the new classificatori GSA
	 */
	public void setClassificatoriGSA(ListaPaginata<ClassificatoreGSA> classificatoriGSA) {
		this.classificatoriGSA = classificatoriGSA;
	}

	@Override
	protected ListaPaginataImpl<ClassificatoreGSA> getAsListaPaginata() {
		return (ListaPaginataImpl<ClassificatoreGSA>) getClassificatoriGSA();
	}
	
}
