/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaDocumentoEntrataResponse extends ServiceResponse {
	
	private BigDecimal importoTotale = BigDecimal.ZERO;
	
	@XmlElementWrapper(name = "listaDocumentiEntrata")	    
	@XmlElement(name = "documentoEntrata")
	private ListaPaginata<DocumentoEntrata> documenti = new ListaPaginataImpl<DocumentoEntrata>();

	@XmlTransient
	public ListaPaginata<DocumentoEntrata> getDocumenti() {
		return documenti;
	}

	public void setDocumenti(
			ListaPaginata<DocumentoEntrata> listaDocumentoEntrata) {
		this.documenti = listaDocumentoEntrata;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<DocumentoEntrata>)documenti).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<DocumentoEntrata>)documenti).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<DocumentoEntrata>)documenti).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<DocumentoEntrata>)documenti).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<DocumentoEntrata>)documenti).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<DocumentoEntrata>)documenti).getPaginaCorrente();
	}
	
	/**
	 * @return the importoTotale
	 */
	public BigDecimal getImportoTotale() {
		return importoTotale;
	}

	/**
	 * @param importoTotale the importoTotale to set
	 */
	public void setImportoTotale(BigDecimal importoTotale) {
		this.importoTotale = importoTotale != null ? importoTotale : BigDecimal.ZERO;
	}

}
