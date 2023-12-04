/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model.allegatoattochecklist;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class ChecklistText extends ChecklistItem {
	private static final long serialVersionUID = -2284142415768139659L;

	private String value;

	public ChecklistText() {}

	public ChecklistText(String label) {
		super(label);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
