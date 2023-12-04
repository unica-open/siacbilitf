/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.frontend.webservice.msg.report.excel.ExcelReportServiceResponse;

/**
 * The Class StampaExcelAccantonamentoFondiDubbiaEsigibilitaResponse.
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioExcelReportResponse extends ExcelReportServiceResponse {}