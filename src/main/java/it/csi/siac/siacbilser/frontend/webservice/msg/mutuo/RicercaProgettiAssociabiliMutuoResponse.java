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
import it.csi.siac.siacbilser.model.Progetto;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaProgettiAssociabiliMutuoResponse extends ServiceResponse {
	
	
	@XmlElementWrapper(name = "listaProgetti")
	@XmlElement(name = "progetto")
	private ListaPaginata<Progetto> progetti = new ListaPaginataImpl<Progetto>();

	public void setProgetti(ListaPaginata<Progetto> progetti) {
		this.progetti = progetti;
	}
	
	@XmlTransient
	public ListaPaginata<Progetto> getProgetti() {
		return progetti;
	}

	public void setTotaleElementi(int totaleElementi) {
		((ListaPaginataImpl<Progetto>) progetti).setTotaleElementi(totaleElementi);
	}

	public void setTotalePagine(int totaleElementi) {
		((ListaPaginataImpl<Progetto>) progetti).setTotalePagine(totaleElementi);
	}

	public void setPaginaCorrente(int totaleElementi) {
		((ListaPaginataImpl<Progetto>) progetti).setPaginaCorrente(totaleElementi);
	}

	public int getTotaleElementi() {
		return ((ListaPaginataImpl<Progetto>) progetti).getTotaleElementi();
	}

	public int getTotalePagine() {
		return ((ListaPaginataImpl<Progetto>) progetti).getTotalePagine();
	}

	public int getPaginaCorrente() {
		return ((ListaPaginataImpl<Progetto>) progetti).getPaginaCorrente();
	}
}
