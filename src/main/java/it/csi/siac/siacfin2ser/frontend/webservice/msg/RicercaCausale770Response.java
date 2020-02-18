/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.Causale770;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaCausale770Response extends ServiceResponse {
	
	private List<Causale770> elencoCausali = new ArrayList<Causale770>();

	public List<Causale770> getElencoCausali() {
		return elencoCausali;
	}

	public void setElencoCausali(List<Causale770> elencoCausali) {
		this.elencoCausali = elencoCausali;
	}
}
