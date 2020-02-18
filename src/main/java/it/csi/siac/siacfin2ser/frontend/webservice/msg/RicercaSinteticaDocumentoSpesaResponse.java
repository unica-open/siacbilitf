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
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaDocumentoSpesaResponse extends ServiceResponse {
	
	private BigDecimal importoTotale = BigDecimal.ZERO;
	
	@XmlElementWrapper(name = "listaDocumentiSpesa")
	@XmlElement(name = "documentoSpesa")
	private ListaPaginata<DocumentoSpesa> documenti = new ListaPaginataImpl<DocumentoSpesa>();

	@XmlTransient
	public ListaPaginata<DocumentoSpesa> getDocumenti() {
		return documenti;
	}

	public void setDocumenti(
			ListaPaginata<DocumentoSpesa> listaDocumentoSpesa) {
		this.documenti = listaDocumentoSpesa;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<DocumentoSpesa>)documenti).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<DocumentoSpesa>)documenti).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<DocumentoSpesa>)documenti).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<DocumentoSpesa>)documenti).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<DocumentoSpesa>)documenti).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<DocumentoSpesa>)documenti).getPaginaCorrente();
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
