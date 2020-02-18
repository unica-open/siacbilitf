/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;

/**
 * Request di base per la ricerca del tipo di classificatore
 * @author Marchino Alessandro
 *
 */
public abstract class RicercaTipoClassificatoreBaseRequest extends ServiceRequest {
	
	private Integer anno;
	@XmlElementWrapper(name = "tipologieClassificatore")
	@XmlElement(name = "tipologiaClassificatore")
	private List<TipologiaClassificatore> tipologieClassificatore = new ArrayList<TipologiaClassificatore>();

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

	/**
	 * @return the tipologieClassificatore
	 */
	@XmlTransient
	public List<TipologiaClassificatore> getTipologieClassificatore() {
		return tipologieClassificatore;
	}

	/**
	 * @param tipologieClassificatore the tipologieClassificatore to set
	 */
	public void setTipologieClassificatore(List<TipologiaClassificatore> tipologieClassificatore) {
		this.tipologieClassificatore = tipologieClassificatore != null ? tipologieClassificatore : new ArrayList<TipologiaClassificatore>();
	}
	
}
