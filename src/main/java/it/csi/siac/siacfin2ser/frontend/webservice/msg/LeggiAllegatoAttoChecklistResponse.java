/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.allegatoattochecklist.Checklist;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class LeggiAllegatoAttoChecklistResponse extends ServiceResponse {
	
	private Checklist allegatoAttoChecklist;

	public Checklist getAllegatoAttoChecklist() {
		return allegatoAttoChecklist;
	}

	public void setAllegatoAttoChecklist(Checklist allegatoAttoChecklist) {
		this.allegatoAttoChecklist = allegatoAttoChecklist;
	}

}
