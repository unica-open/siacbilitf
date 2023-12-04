/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class ContaClassificatoriERestituisciSeSingolo extends ServiceRequest {
	
	private TipologiaClassificatore tipologiaClassificatore;
	private Integer anno;

	/**
	 * @return the tipologiaClassificatore
	 */
	public TipologiaClassificatore getTipologiaClassificatore() {
		return tipologiaClassificatore;
	}

	/**
	 * @param tipologiaClassificatore the tipologiaClassificatore to set
	 */
	public void setTipologiaClassificatore(TipologiaClassificatore tipologiaClassificatore) {
		this.tipologiaClassificatore = tipologiaClassificatore;
	}

	/**
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}

	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	
}
