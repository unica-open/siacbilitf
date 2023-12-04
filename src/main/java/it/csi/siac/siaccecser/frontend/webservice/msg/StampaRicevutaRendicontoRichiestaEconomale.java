/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.RendicontoRichiesta;
import it.csi.siac.siaccorser.frontend.webservice.msg.report.ReportServiceRequest;
import it.csi.siac.siaccorser.model.Bilancio;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class StampaRicevutaRendicontoRichiestaEconomale extends ReportServiceRequest {
	
	
	private RendicontoRichiesta rendicontoRichiesta;
	private Bilancio bilancio;

	/**
	 * @return the rendicontoRichiesta
	 */
	public final RendicontoRichiesta getRendicontoRichiesta() {
		return rendicontoRichiesta;
	}

	/**
	 * @param rendicontoRichiesta the rendicontoRichiesta to set
	 */
	public final void setRendicontoRichiesta(RendicontoRichiesta rendicontoRichiesta) {
		this.rendicontoRichiesta = rendicontoRichiesta;
	}

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	
	
	
	
	

}
