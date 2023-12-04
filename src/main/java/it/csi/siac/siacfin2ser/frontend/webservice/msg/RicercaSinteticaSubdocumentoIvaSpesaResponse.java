/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoIvaSpesa;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaSubdocumentoIvaSpesaResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaSubdocumentoIvaSpesa")	    
	@XmlElement(name = "subdocumentoIvaSpesa")
	private ListaPaginata<SubdocumentoIvaSpesa> listaSubdocumentoIvaSpesa = 
		new ListaPaginataImpl<SubdocumentoIvaSpesa>();

	/**
	 * @return the listaSubdocumentoIvaSpesa
	 */
	@XmlTransient
	public ListaPaginata<SubdocumentoIvaSpesa> getListaSubdocumentoIvaSpesa() {
		return listaSubdocumentoIvaSpesa;
	}

	/**
	 * @param listaSubdocumentoIvaSpesa the listaSubdocumentoIvaSpesa to set
	 */
	public void setListaSubdocumentoIvaSpesa(
			ListaPaginata<SubdocumentoIvaSpesa> listaSubdocumentoIvaSpesa) {
		this.listaSubdocumentoIvaSpesa = listaSubdocumentoIvaSpesa;
	}
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<SubdocumentoIvaSpesa>)listaSubdocumentoIvaSpesa).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<SubdocumentoIvaSpesa>)listaSubdocumentoIvaSpesa).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<SubdocumentoIvaSpesa>)listaSubdocumentoIvaSpesa).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<SubdocumentoIvaSpesa>)listaSubdocumentoIvaSpesa).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<SubdocumentoIvaSpesa>)listaSubdocumentoIvaSpesa).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<SubdocumentoIvaSpesa>)listaSubdocumentoIvaSpesa).getPaginaCorrente();
	}
	

}
