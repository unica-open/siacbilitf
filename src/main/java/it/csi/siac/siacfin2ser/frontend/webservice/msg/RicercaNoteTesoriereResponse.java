/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.NoteTesoriere;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaNoteTesoriereResponse extends ServiceResponse {
	
	List<NoteTesoriere> elencoNoteTesoriere = new ArrayList<NoteTesoriere>();

	public List<NoteTesoriere> getElencoNoteTesoriere() {
		return elencoNoteTesoriere;
	}

	public void setElencoNoteTesoriere(List<NoteTesoriere> elencoNoteTesoriere) {
		this.elencoNoteTesoriere = elencoNoteTesoriere;
	}

}
