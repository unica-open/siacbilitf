/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfinser.model.MovimentoGestione;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class RicercaMovimentiGestioneMutuoResponse<T extends MovimentoGestione> extends ServiceResponse {

	@XmlElementWrapper(name = "listaMovimenti")
	@XmlElement(name = "movimento")
	private ListaPaginata<T> movimenti = new ListaPaginataImpl<T>();

	protected void setMovimenti(ListaPaginata<T> listaMovimenti) {
		this.movimenti = listaMovimenti;
	}

	protected ListaPaginata<T> getMovimenti() {
		return movimenti;
	}

	public void setTotaleElementi(int totaleElementi) {
		((ListaPaginataImpl<T>) movimenti).setTotaleElementi(totaleElementi);
	}

	public void setTotalePagine(int totaleElementi) {
		((ListaPaginataImpl<T>) movimenti).setTotalePagine(totaleElementi);
	}

	public void setPaginaCorrente(int totaleElementi) {
		((ListaPaginataImpl<T>) movimenti).setPaginaCorrente(totaleElementi);
	}

	public int getTotaleElementi() {
		return ((ListaPaginataImpl<T>) movimenti).getTotaleElementi();
	}

	public int getTotalePagine() {
		return ((ListaPaginataImpl<T>) movimenti).getTotalePagine();
	}

	public int getPaginaCorrente() {
		return ((ListaPaginataImpl<T>) movimenti).getPaginaCorrente();
	}

	
}
