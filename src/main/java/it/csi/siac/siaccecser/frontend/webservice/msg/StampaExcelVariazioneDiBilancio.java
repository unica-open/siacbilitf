/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.VariazioneImportoCapitolo;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ReportServiceRequest;

/**
 * The Class StampaExcelVariazioneImporto.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class StampaExcelVariazioneDiBilancio extends ReportServiceRequest {
	
	private VariazioneImportoCapitolo variazioneImportoCapitolo;
	private Boolean xlsx;

	/**
	 * @return the variazioneImportoCapitolo
	 */
	public VariazioneImportoCapitolo getVariazioneImportoCapitolo() {
		return variazioneImportoCapitolo;
	}

	/**
	 * @param variazioneImportoCapitolo the variazioneImportoCapitolo to set
	 */
	public void setVariazioneImportoCapitolo(VariazioneImportoCapitolo variazioneImportoCapitolo) {
		this.variazioneImportoCapitolo = variazioneImportoCapitolo;
	}

	/**
	 * @return the xlsx
	 */
	public Boolean getXlsx() {
		return xlsx;
	}

	/**
	 * @param xlsx the xlsx to set
	 */
	public void setXlsx(Boolean xlsx) {
		this.xlsx = xlsx;
	}
	
	

}
