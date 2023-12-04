/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;
import it.csi.siac.siacfin2ser.model.Subdocumento;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaQuoteElencoResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "subdocumenti")
	@XmlElements({
		@XmlElement(name="subdocumentoSpesa", type=SubdocumentoSpesa.class),
		@XmlElement(name="subdocumentoEntrata", type=SubdocumentoEntrata.class)
	})
	// Subdocumenti di spesa e di entrata
	private ListaPaginata<Subdocumento<?, ?>> subdocumenti = new ListaPaginataImpl<Subdocumento<?,?>>();
	private ElencoDocumentiAllegato elencoDocumentiAllegato;
	
	//SIAC-5589 cambiare nome in RicercaSinteticaQuoteElencoResponse

	/**
	 * @return the subdocumenti
	 */
	@XmlTransient
	public ListaPaginata<Subdocumento<?, ?>> getSubdocumenti() {
		return subdocumenti;
	}

	/**
	 * @param subdocumenti the subdocumenti to set
	 */
	public void setSubdocumenti(ListaPaginata<Subdocumento<?, ?>> subdocumenti) {
		this.subdocumenti = subdocumenti;
	}
	
	/**
	 * @return the elencoDocumentiAllegato
	 */
	public ElencoDocumentiAllegato getElencoDocumentiAllegato() {
		return elencoDocumentiAllegato;
	}

	/**
	 * @param elencoDocumentiAllegato the elencoDocumentiAllegato to set
	 */
	public void setElencoDocumentiAllegato(ElencoDocumentiAllegato elencoDocumentiAllegato) {
		this.elencoDocumentiAllegato = elencoDocumentiAllegato;
	}

	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<Subdocumento<?,?>>)subdocumenti).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<Subdocumento<?,?>>)subdocumenti).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<Subdocumento<?,?>>)subdocumenti).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<Subdocumento<?,?>>)subdocumenti).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<Subdocumento<?,?>>)subdocumenti).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<Subdocumento<?,?>>)subdocumenti).getPaginaCorrente();
	}

	
}
