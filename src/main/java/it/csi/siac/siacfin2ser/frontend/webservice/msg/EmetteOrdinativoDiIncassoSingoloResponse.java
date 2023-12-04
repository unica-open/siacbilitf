/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoIncasso;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class EmetteOrdinativoDiIncassoSingoloResponse extends ServiceResponse {

	private SubdocumentoEntrata subdocumentoScartato;
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	private OrdinativoIncasso ordinativo;
	
	private Map<Integer,DocumentoEntrata> documentiEntrataCache = new HashMap<Integer,DocumentoEntrata>();
	private Map<Integer,Accertamento> accertamentiCache = new HashMap<Integer,Accertamento>();
	private Map<Integer,Soggetto> soggettiCache = new HashMap<Integer,Soggetto>();

	
	
	/**
	 * @return the subdocumentoScartato
	 */
	public SubdocumentoEntrata getSubdocumentoScartato() {
		return subdocumentoScartato;
	}
	/**
	 * @param subdocumentoScartato the subdocumentoScartato to set
	 */
	public void setSubdocumentoScartato(SubdocumentoEntrata subdocumentoScartato) {
		this.subdocumentoScartato = subdocumentoScartato;
	}
	/**
	 * @return the ordinativo
	 */
	public OrdinativoIncasso getOrdinativo() {
		return ordinativo;
	}
	/**
	 * @param ordinativo the ordinativo to set
	 */
	public void setOrdinativo(OrdinativoIncasso ordinativo) {
		this.ordinativo = ordinativo;
	}
	
	/**
	 * @return the documentiEntrataCache
	 */
	public Map<Integer, DocumentoEntrata> getDocumentiEntrataCache() {
		return documentiEntrataCache;
	}
	/**
	 * @param documentiEntrataCache the documentiEntrataCache to set
	 */
	public void setDocumentiEntrataCache(
			Map<Integer, DocumentoEntrata> documentiEntrataCache) {
		this.documentiEntrataCache = documentiEntrataCache;
	}
	/**
	 * @return the accertamentiCache
	 */
	public Map<Integer, Accertamento> getAccertamentiCache() {
		return accertamentiCache;
	}
	/**
	 * @param accertamentiCache the accertamentiCache to set
	 */
	public void setAccertamentiCache(Map<Integer, Accertamento> accertamentiCache) {
		this.accertamentiCache = accertamentiCache;
	}
	/**
	 * @return the soggettiCache
	 */
	public Map<Integer, Soggetto> getSoggettiCache() {
		return soggettiCache;
	}
	/**
	 * @param soggettiCache the soggettiCache to set
	 */
	public void setSoggettiCache(Map<Integer, Soggetto> soggettiCache) {
		this.soggettiCache = soggettiCache;
	}
	/**
	 * @return the messaggi
	 */
	public List<Messaggio> getMessaggi() {
		return messaggi;
	}
	/**
	 * @param messaggi the messaggi to set
	 */
	public void setMessaggi(List<Messaggio> messaggi) {
		this.messaggi = messaggi;
	}
	
	public void addMessaggio(Messaggio messaggio) {
		messaggi.add(messaggio);
	}

	public void addMessaggi(List<Messaggio> messaggi) {
		this.messaggi.addAll(messaggi);
	}

	
	
}
