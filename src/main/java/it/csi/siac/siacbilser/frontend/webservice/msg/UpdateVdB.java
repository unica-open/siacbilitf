/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.VoceDiBilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class UpdateVdB extends ServiceResponse {

	private VoceDiBilancio voceDibilancio;

	public VoceDiBilancio getVoceDibilancio() {
		return voceDibilancio;
	}

	public void setVoceDibilancio(VoceDiBilancio voceDibilancio) {
		this.voceDibilancio = voceDibilancio;
	}

}
