/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.Conto;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaDettaglioContoResponse extends ServiceResponse {

	private Conto conto;
	private Boolean contiFiglioSenzaFigli;
	
	/**
	 * @return the conto
	 */
	public Conto getConto() {
		return conto;
	}

	/**
	 * @param conto the conto to set
	 */
	public void setConto(Conto conto) {
		this.conto = conto;
	}
	
	/**
	 * True se nessuno dei conti figlio ha ulteriori figli.
	 * @return
	 */
	public Boolean getContiFiglioSenzaFigli() {
		return contiFiglioSenzaFigli;
	}

	public void setContiFiglioSenzaFigli(Boolean contiFiglioSenzaFigli) {
		this.contiFiglioSenzaFigli = contiFiglioSenzaFigli;
	}
}
