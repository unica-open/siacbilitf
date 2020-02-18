/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.file.File;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ReportServiceResponse;

import javax.xml.bind.annotation.XmlType;

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
