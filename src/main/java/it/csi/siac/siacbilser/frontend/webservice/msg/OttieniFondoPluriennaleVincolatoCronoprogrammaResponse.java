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
import it.csi.siac.siacbilser.model.FondoPluriennaleVincolatoUscitaCronoprogramma;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * 
 * 
 * @author Elisa Chiari
 * @version 1.0.0 - 12/12/20161
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class OttieniFondoPluriennaleVincolatoCronoprogrammaResponse extends ServiceResponse {
	
	private List<FondoPluriennaleVincolatoEntrata> listaFondoPluriennaleVincolatoEntrata = new ArrayList<FondoPluriennaleVincolatoEntrata>();	
	
	private List<FondoPluriennaleVincolatoUscitaCronoprogramma> listaFondoPluriennaleVincolatoUscitaCronoprogramma = new ArrayList<FondoPluriennaleVincolatoUscitaCronoprogramma>();
	
	/**
	 * @return the listaFondoPluriennaleVincolatoEntrataCronoprogramma
	 */
	public List<FondoPluriennaleVincolatoEntrata> getListaFondoPluriennaleVincolatoEntrata() {
		return listaFondoPluriennaleVincolatoEntrata;
	}

	/**
	 * @param listaFondoPluriennaleVincolatoEntrataCronoprogramma the listaFondoPluriennaleVincolatoEntrataCronoprogramma to set
	 */
	public void setListaFondoPluriennaleVincolatoEntrata(List<FondoPluriennaleVincolatoEntrata> listaFondoPluriennaleVincolatoEntrataCronoprogramma) {
		this.listaFondoPluriennaleVincolatoEntrata = listaFondoPluriennaleVincolatoEntrataCronoprogramma;
	}

	/**
	 * @return the lista FondoPluriennaleVincolatoUscitaCronoprogramma
	 */
	public List<FondoPluriennaleVincolatoUscitaCronoprogramma> getListaFondoPluriennaleVincolatoUscitaCronoprogramma() {
		return listaFondoPluriennaleVincolatoUscitaCronoprogramma;
	}

	/**
	 * @param listaFondoPluriennaleVincolatoUscitaCronoprogramma the listaFondoPluriennaleVincolatoUscitaCronoprogramma to set
	 */
	public void setListaFondoPluriennaleVincolatoUscitaCronoprogramma(List<FondoPluriennaleVincolatoUscitaCronoprogramma> listaFondoPluriennaleVincolatoUscitaCronoprogramma) {
		this.listaFondoPluriennaleVincolatoUscitaCronoprogramma = listaFondoPluriennaleVincolatoUscitaCronoprogramma;
	}

}
