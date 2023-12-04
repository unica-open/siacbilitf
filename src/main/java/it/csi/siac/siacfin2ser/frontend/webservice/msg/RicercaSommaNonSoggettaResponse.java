/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CodiceSommaNonSoggetta;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSommaNonSoggettaResponse extends ServiceResponse {
	
	private List<CodiceSommaNonSoggetta> elencoCodiciSommaNonSoggetta = new ArrayList<CodiceSommaNonSoggetta>();

	/**
	 * @return the elencoCodiciSommaNonSoggetta
	 */
	public List<CodiceSommaNonSoggetta> getElencoCodiciSommaNonSoggetta() {
		return elencoCodiciSommaNonSoggetta;
	}

	/**
	 * @param elencoCodiciSommaNonSoggetta the elencoCodiciSommaNonSoggetta to set
	 */
	public void setElencoCodiciSommaNonSoggetta(List<CodiceSommaNonSoggetta> elencoCodiciSommaNonSoggetta) {
		this.elencoCodiciSommaNonSoggetta = elencoCodiciSommaNonSoggetta;
	}



	
}
