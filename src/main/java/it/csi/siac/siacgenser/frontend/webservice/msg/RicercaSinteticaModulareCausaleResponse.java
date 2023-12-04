/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.CausaleEP;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaModulareCausaleResponse extends RicercaSinteticaBaseResponse<CausaleEP> {

	@XmlElementWrapper(name = "listaCausali")
	@XmlElement(name = "causale")
	private ListaPaginata<CausaleEP> causali = new ListaPaginataImpl<CausaleEP>();
	
	@XmlTransient
	public ListaPaginata<CausaleEP> getCausali() {
		return causali;
	}

	public void setCausali(ListaPaginata<CausaleEP> causale) {
		this.causali = causale;
	}
	
	@Override
	protected ListaPaginataImpl<CausaleEP> getAsListaPaginata() {
		return (ListaPaginataImpl<CausaleEP>)causali;
	}
	
}
