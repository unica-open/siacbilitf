/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.msg.report.ReportServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class StampaRiepilogoAnnualeIvaResponse extends ReportServiceResponse {
	// Nothing to add
}
