/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.NaturaOnere;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaNaturaOnereResponse extends ServiceResponse {
	
	private List<NaturaOnere> elencoNatureOnere = new ArrayList<NaturaOnere>();

	public List<NaturaOnere> getElencoNatureOnere() {
		return elencoNatureOnere;
	}

	public void setElencoNatureOnere(List<NaturaOnere> elencoNatureOnere) {
		this.elencoNatureOnere = elencoNatureOnere;
	}

}
