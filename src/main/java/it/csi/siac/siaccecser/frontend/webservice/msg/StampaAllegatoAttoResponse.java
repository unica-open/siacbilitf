/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.msg.report.ReportServiceResponse;
import it.csi.siac.siaccorser.model.file.File;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class StampaAllegatoAttoResponse extends ReportServiceResponse {
	
	private File report;

	/**
	 * @return the report
	 */
	public File getReport() {
		return report;
	}

	/**
	 * @param report the report to set
	 */
	public void setReport(File report) {
		this.report = report;
	}


}
