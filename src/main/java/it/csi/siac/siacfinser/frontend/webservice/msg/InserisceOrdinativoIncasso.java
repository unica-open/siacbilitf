/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoIncasso;


@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceOrdinativoIncasso extends InserisceOrdinativo {
	
	private OrdinativoIncasso ordinativoIncasso;

	private List<Errore> elencoControlliDaNonEffettuare;
	
	public OrdinativoIncasso getOrdinativoIncasso() {
		return ordinativoIncasso;
	}

	public void setOrdinativoIncasso(OrdinativoIncasso ordinativoIncasso) {
		this.ordinativoIncasso = ordinativoIncasso;
	}

	public List<Errore> getElencoControlliDaNonEffettuare() {
		return elencoControlliDaNonEffettuare;
	}

	public void setElencoControlliDaNonEffettuare(
			List<Errore> elencoControlliDaNonEffettuare) {
		this.elencoControlliDaNonEffettuare = elencoControlliDaNonEffettuare;
	}
	
}
