/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.StornoUEB;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/** @deprecated da eliminare con le UEB */
@Deprecated
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaStornoUEBResponse extends ServiceResponse {
		
	private ListaPaginata<StornoUEB> storniUEB = new ListaPaginataImpl<StornoUEB>();

	/**
	 * @return the stornoUEB
	 */
	@XmlElementWrapper(name = "listaStorniUEB")	    
	@XmlElement(name = "stornoUEB")
	public ListaPaginata<StornoUEB> getStorniUEB() {
		return storniUEB;
	}

	/**
	 * @param stornoUEB the stornoUEB to set
	 */
	public void setStorniUEB(ListaPaginata<StornoUEB> stornoUEB) {
		this.storniUEB = stornoUEB;
	}

	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<StornoUEB>)storniUEB).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<StornoUEB>)storniUEB).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<StornoUEB>)storniUEB).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<StornoUEB>)storniUEB).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<StornoUEB>)storniUEB).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<StornoUEB>)storniUEB).getPaginaCorrente();
	}
	
	
	
	
	
//	private Integer numeroStorno;
//
//	/**
//	 * @return the numeroStorno
//	 */
//	public Integer getNumeroStorno() {
//		return numeroStorno;
//	}
//
//	/**
//	 * @param numeroStorno the numeroStorno to set
//	 */
//	public void setNumeroStorno(Integer numeroStorno) {
//		this.numeroStorno = numeroStorno;
//	}
	
	
	
	

}
