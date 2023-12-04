/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoIncasso;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceOrdinativoIncassoResponse extends ServiceResponse {
	
	private OrdinativoIncasso ordinativoIncassoInserito;

	//SIAC-8017-CMTO
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
		

	public List<Messaggio> getMessaggi() {
		return messaggi != null? this.messaggi : new ArrayList<Messaggio>();
	}

	public void setMessaggi(List<Messaggio> messaggi) {
		this.messaggi = messaggi;
	}

	public void addMessaggio(Messaggio messaggio) {
		getMessaggi().add(messaggio);
	}
		
	public OrdinativoIncasso getOrdinativoIncassoInserito() {
		return ordinativoIncassoInserito;
	}

	public void setOrdinativoIncassoInserito(
			OrdinativoIncasso ordinativoIncassoInserito) {
		this.ordinativoIncassoInserito = ordinativoIncassoInserito;
	}
	
}
