/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisciVariazioneMassivaTassoMutuo extends ServiceRequest {
	
	private List<Integer> elencoIdMutui;
	private BigDecimal tassoInteresseEuribor;
	
	public List<Integer> getElencoIdMutui() {
		return elencoIdMutui;
	}
	public void setElencoIdMutui(List<Integer> elencoIdMutui) {
		this.elencoIdMutui = elencoIdMutui;
	}
	public BigDecimal getTassoInteresseEuribor() {
		return tassoInteresseEuribor;
	}
	public void setTassoInteresseEuribor(BigDecimal tassoInteresseEuribor) {
		this.tassoInteresseEuribor = tassoInteresseEuribor;
	}
	
	
}
