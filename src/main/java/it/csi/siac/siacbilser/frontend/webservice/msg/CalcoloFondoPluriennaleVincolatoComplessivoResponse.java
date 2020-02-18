/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.FondoPluriennaleVincolatoTotale;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class CalcoloFondoPluriennaleVincolatoComplessivoResponse extends ServiceResponse {
	
	private List<FondoPluriennaleVincolatoTotale> listaFondoPluriennaleVincolatoTotale = new ArrayList<FondoPluriennaleVincolatoTotale>();

	public List<FondoPluriennaleVincolatoTotale> getListaFondoPluriennaleVincolatoTotale() {
		return listaFondoPluriennaleVincolatoTotale;
	}

	public void setListaFondoPluriennaleVincolatoTotale(
			List<FondoPluriennaleVincolatoTotale> listaFondoPluriennaleVincolatoTotale) {
		this.listaFondoPluriennaleVincolatoTotale = listaFondoPluriennaleVincolatoTotale;
	}
	
	

	
	
	
	
	
	

}
