/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.progetto;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Progetto;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class BaseCalcoloProspettoRiassuntivoCronoprogramma extends ServiceRequest {
	
	private Progetto progetto;
	
	private Integer anno;



	public BaseCalcoloProspettoRiassuntivoCronoprogramma(Progetto progetto) {
		super();
		this.progetto = progetto;
	}

	public BaseCalcoloProspettoRiassuntivoCronoprogramma() {
		super();
	}

	public BaseCalcoloProspettoRiassuntivoCronoprogramma(Progetto progetto,
			Integer anno) {
		super();
		this.progetto = progetto;
		this.anno = anno;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	/**
	 * @return the progetto
	 */
	public Progetto getProgetto() {
		return progetto;
	}

	/**
	 * @param progetto the progetto to set
	 */
	public void setProgetto(Progetto progetto) {
		this.progetto = progetto;
	}
	
	

}
