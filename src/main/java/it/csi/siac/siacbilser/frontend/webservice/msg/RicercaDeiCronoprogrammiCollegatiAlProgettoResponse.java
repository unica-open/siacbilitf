/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Cronoprogramma;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDeiCronoprogrammiCollegatiAlProgettoResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaCronoprogrammi")
	@XmlElement(name = "cronoprogramma")
	private List<Cronoprogramma> cronoprogrami = new ArrayList<Cronoprogramma>();

	@XmlTransient
	public List<Cronoprogramma> getCronoprogrami() {
		return cronoprogrami;
	}

	public void setCronoprogrami(List<Cronoprogramma> cronoprogrami) {
		this.cronoprogrami = cronoprogrami;
	}
	
	
	

//	@XmlElementWrapper(name = "listaCronoprogrammi")
//	@XmlElement(name = "cronoprogramma")
//	private ListaPaginata<Cronoprogramma> cronoprogrami = new ListaPaginataImpl<Cronoprogramma>();
//
//	public void setCronoprogrami(ListaPaginata<Cronoprogramma> listaCronoprogrammi) {
//		this.cronoprogrami = listaCronoprogrammi;
//	}
//
//	@XmlTransient
//	public ListaPaginata<Cronoprogramma> getCronoprogrami() {
//		return cronoprogrami;
//	}
//
//	public void setTotaleElementi(int totaleElementi) {
//		((ListaPaginataImpl<Cronoprogramma>) cronoprogrami).setTotaleElementi(totaleElementi);
//	}
//
//	public void setTotalePagine(int totaleElementi) {
//		((ListaPaginataImpl<Cronoprogramma>) cronoprogrami).setTotalePagine(totaleElementi);
//	}
//
//	public void setPaginaCorrente(int totaleElementi) {
//		((ListaPaginataImpl<Cronoprogramma>) cronoprogrami).setPaginaCorrente(totaleElementi);
//	}
//
//	public int getTotaleElementi() {
//		return ((ListaPaginataImpl<Cronoprogramma>) cronoprogrami).getTotaleElementi();
//	}
//
//	public int getTotalePagine() {
//		return ((ListaPaginataImpl<Cronoprogramma>) cronoprogrami).getTotalePagine();
//	}
//
//	public int getPaginaCorrente() {
//		return ((ListaPaginataImpl<Cronoprogramma>) cronoprogrami).getPaginaCorrente();
//	}
}
