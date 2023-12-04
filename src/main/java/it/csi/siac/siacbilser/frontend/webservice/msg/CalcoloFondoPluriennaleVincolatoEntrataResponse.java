/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.FondoPluriennaleVincolatoEntrata;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class CalcoloFondoPluriennaleVincolatoEntrataResponse extends ServiceResponse {
	
	private List<FondoPluriennaleVincolatoEntrata> listaFondoPluriennaleVincolatoEntrata = new ArrayList<FondoPluriennaleVincolatoEntrata>();
	
	
	public List<FondoPluriennaleVincolatoEntrata> getListaFondoPluriennaleVincolatoEntrata() {
		return listaFondoPluriennaleVincolatoEntrata;
	}
	public void setListaFondoPluriennaleVincolatoEntrata(
			List<FondoPluriennaleVincolatoEntrata> listaFondoPluriennaleVincolatoEntrata) {
		this.listaFondoPluriennaleVincolatoEntrata = listaFondoPluriennaleVincolatoEntrata;
	}
	
	
	
	

}
