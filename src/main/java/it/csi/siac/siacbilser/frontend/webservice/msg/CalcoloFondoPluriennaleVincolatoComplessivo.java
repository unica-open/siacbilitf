/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Progetto;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * The Class CalcoloFondoPluriennaleVincolatoComplessivo.
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class CalcoloFondoPluriennaleVincolatoComplessivo extends ServiceRequest {
	
	private Progetto progetto;
	private Integer anno;
	
	/**
	 * Gets the progetto.
	 *
	 * @return the progetto
	 */
	public Progetto getProgetto() {
		return progetto;
	}
	
	/**
	 * Sets the progetto.
	 *
	 * @param progetto the progetto to set
	 */
	public void setProgetto(Progetto progetto) {
		this.progetto = progetto;
	}
	
	/**
	 * Gets the anno.
	 *
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}
	
	/**
	 * Sets the anno.
	 *
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	


}
