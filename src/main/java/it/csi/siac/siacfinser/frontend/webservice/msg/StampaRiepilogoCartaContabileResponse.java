/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;


import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.file.File;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ReportServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Risposta al metodo FIN.CartaContabileService.ricercaCartaContabilePerChiave()
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class StampaRiepilogoCartaContabileResponse extends ReportServiceResponse {
	
	private File report;

	public File getReport() {
		return report;
	}

	public void setReport(File report) {
		this.report = report;
	}
	
}
