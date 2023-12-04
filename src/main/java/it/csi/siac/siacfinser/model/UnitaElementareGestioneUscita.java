/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

/**
 * UnitaElementareGestioneUscita
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class UnitaElementareGestioneUscita extends UnitaElementareGestione {

	private static final long serialVersionUID = -3439630263779690983L;
	private List<Impegno> impegni = new ArrayList<Impegno>();

	public List<Impegno> getImpegni() {
		return impegni;
	}

	public void setImpegni(List<Impegno> impegni) {
		this.impegni = impegni;
	}

}
