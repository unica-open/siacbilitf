/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.frontend.webservice.msg.base.BaseRicercaProvvedimentoResponse;
import it.csi.siac.siacattser.model.AttoAmministrativo;

@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class RicercaPuntualeProvvedimentoResponse extends BaseRicercaProvvedimentoResponse {
	
	private AttoAmministrativo attoAmministrativo;

	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}

	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}
}
