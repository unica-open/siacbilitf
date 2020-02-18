/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.FondoPluriennaleVincolatoUscitaCronoprogramma;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class CalcoloFondoPluriennaleVincolatoSpesaResponse extends ServiceResponse {
	
	private List<FondoPluriennaleVincolatoUscitaCronoprogramma> listaFondoPluriennaleVincolatoUscitaCronoprogramma = new ArrayList<FondoPluriennaleVincolatoUscitaCronoprogramma>();
	
	
	public List<FondoPluriennaleVincolatoUscitaCronoprogramma> getListaFondoPluriennaleVincolatoUscitaCronoprogramma() {
		return listaFondoPluriennaleVincolatoUscitaCronoprogramma;
	}
	public void setListaFondoPluriennaleVincolatoUscitaCronoprogramma(
			List<FondoPluriennaleVincolatoUscitaCronoprogramma> listaFondoPluriennaleVincolatoUscitaCronoprogramma) {
		this.listaFondoPluriennaleVincolatoUscitaCronoprogramma = listaFondoPluriennaleVincolatoUscitaCronoprogramma;
	}
		
	

}
