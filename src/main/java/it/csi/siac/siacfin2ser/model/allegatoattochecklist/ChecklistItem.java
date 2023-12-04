/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model.allegatoattochecklist;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnteExt;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public abstract class ChecklistItem extends EntitaEnteExt  {
	
	private static final long serialVersionUID = 2525986815689225643L;
	
	private String label;

	public ChecklistItem() {
		super();
	}

	public ChecklistItem(String label) {
		this();
		setLabel(label);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
