/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.VariazioneImportoCapitolo;
import it.csi.siac.siaccorser.frontend.webservice.msg.report.excel.ExcelReportServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;

/**
 * The Class StampaExcelVariazioneImporto.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class VariazioneBilancioExcelReport extends ExcelReportServiceRequest {
	
	private VariazioneImportoCapitolo variazioneImportoCapitolo;

	public VariazioneImportoCapitolo getVariazioneImportoCapitolo() {
		return variazioneImportoCapitolo;
	}

	public void setVariazioneImportoCapitolo(VariazioneImportoCapitolo variazioneImportoCapitolo) {
		this.variazioneImportoCapitolo = variazioneImportoCapitolo;
	}


}
