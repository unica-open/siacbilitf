/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model.allegatoattochecklist;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class ChecklistOption extends ChecklistItem {

	private static final long serialVersionUID = -6933049742129618478L;
	
	private ChecklistOptionValue value;


	public ChecklistOption() {}

	public ChecklistOption(String label) {
		super(label);
	}

	public ChecklistOptionValue getValue() {
		return value;
	}

	public void setValue(ChecklistOptionValue value) {
		this.value = value;
	}

}
