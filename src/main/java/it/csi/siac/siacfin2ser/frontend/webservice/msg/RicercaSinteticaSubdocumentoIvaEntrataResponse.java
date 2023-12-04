/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoIvaEntrata;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaSubdocumentoIvaEntrataResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaSubdocumentoIvaEntrata")	    
	@XmlElement(name = "subdocumentoIvaEntrata")
	private ListaPaginata<SubdocumentoIvaEntrata> listaSubdocumentoIvaEntrata = 
		new ListaPaginataImpl<SubdocumentoIvaEntrata>();

	/**
	 * @return the listaSubdocumentoIvaEntrata
	 */
	@XmlTransient
	public ListaPaginata<SubdocumentoIvaEntrata> getListaSubdocumentoIvaEntrata() {
		return listaSubdocumentoIvaEntrata;
	}

	/**
	 * @param listaSubdocumentoIvaEntrata the listaSubdocumentoIvaEntrata to set
	 */
	public void setListaSubdocumentoIvaEntrata(
			ListaPaginata<SubdocumentoIvaEntrata> listaSubdocumentoIvaEntrata) {
		this.listaSubdocumentoIvaEntrata = listaSubdocumentoIvaEntrata;
	}
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<SubdocumentoIvaEntrata>)listaSubdocumentoIvaEntrata).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<SubdocumentoIvaEntrata>)listaSubdocumentoIvaEntrata).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<SubdocumentoIvaEntrata>)listaSubdocumentoIvaEntrata).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<SubdocumentoIvaEntrata>)listaSubdocumentoIvaEntrata).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<SubdocumentoIvaEntrata>)listaSubdocumentoIvaEntrata).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<SubdocumentoIvaEntrata>)listaSubdocumentoIvaEntrata).getPaginaCorrente();
	}
	

}
