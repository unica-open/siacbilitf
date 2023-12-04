/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.msg.report.ReportServiceRequest;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;
import it.csi.siac.siacfin2ser.model.allegatoattochecklist.Checklist;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class StampaAllegatoAtto extends ReportServiceRequest {
	
	private AllegatoAtto allegatoAtto;
	
	private Bilancio bilancio;
	
	private Integer annoEsercizio;

	
	// SIAC-8804
	private Checklist allegatoAttoChecklist;

	
	/**
	 * @return the allegatoAtto
	 */
	public AllegatoAtto getAllegatoAtto() {
		return allegatoAtto;
	}

	/**
	 * @param allegatoAtto the allegatoAtto to set
	 */
	public void setAllegatoAtto(AllegatoAtto allegatoAtto) {
		this.allegatoAtto = allegatoAtto;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	public Checklist getAllegatoAttoChecklist() {
		return allegatoAttoChecklist;
	}

	public void setAllegatoAttoChecklist(Checklist allegatoAttoChecklist) {
		this.allegatoAttoChecklist = allegatoAttoChecklist;
	}

	

}
