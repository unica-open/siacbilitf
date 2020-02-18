/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CodiceBollo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaCodiceBolloResponse extends ServiceResponse {
	
	List<CodiceBollo> elencoCodiciBollo = new ArrayList<CodiceBollo>();

	public List<CodiceBollo> getElencoCodiciBollo() {
		return elencoCodiciBollo;
	}

	public void setElencoCodiciBollo(List<CodiceBollo> elencoCodiciBollo) {
		this.elencoCodiciBollo = elencoCodiciBollo;
	}
	
}
