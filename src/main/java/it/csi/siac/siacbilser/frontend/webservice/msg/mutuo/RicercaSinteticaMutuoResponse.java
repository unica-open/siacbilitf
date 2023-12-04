/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.mutuo.Mutuo;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaMutuoResponse extends BaseRicercaMutuoServiceResponse {

	@XmlElementWrapper(name = "listaMutui")
	@XmlElement(name = "mutuo")
	private ListaPaginata<Mutuo> mutui = new ListaPaginataImpl<Mutuo>();

	public void setMutui(ListaPaginata<Mutuo> listaMutuo) {
		this.mutui = listaMutuo;
	}

	@XmlTransient
	public ListaPaginata<Mutuo> getMutui() {
		return mutui;
	}

	public void setTotaleElementi(int totaleElementi) {
		((ListaPaginataImpl<Mutuo>) mutui).setTotaleElementi(totaleElementi);
	}

	public void setTotalePagine(int totaleElementi) {
		((ListaPaginataImpl<Mutuo>) mutui).setTotalePagine(totaleElementi);
	}

	public void setPaginaCorrente(int totaleElementi) {
		((ListaPaginataImpl<Mutuo>) mutui).setPaginaCorrente(totaleElementi);
	}

	public int getTotaleElementi() {
		return ((ListaPaginataImpl<Mutuo>) mutui).getTotaleElementi();
	}

	public int getTotalePagine() {
		return ((ListaPaginataImpl<Mutuo>) mutui).getTotalePagine();
	}

	public int getPaginaCorrente() {
		return ((ListaPaginataImpl<Mutuo>) mutui).getPaginaCorrente();
	}


	
}
