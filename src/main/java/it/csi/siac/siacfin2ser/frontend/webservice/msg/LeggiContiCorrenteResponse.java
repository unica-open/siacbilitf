/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ContoCorrente;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class LeggiContiCorrenteResponse extends ServiceResponse {
	
	private List<ContoCorrente> contiCorrenti = new ArrayList<ContoCorrente>();

	/**
	 * @return the contiCorrenti
	 */
	public List<ContoCorrente> getContiCorrenti() {
		return contiCorrenti;
	}

	/**
	 * @param contiCorrenti the contiCorrenti to set
	 */
	public void setContiCorrenti(List<ContoCorrente> contiCorrenti) {
		this.contiCorrenti = contiCorrenti;
	}

	

}
