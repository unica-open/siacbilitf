/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class EmetteOrdinativoDiPagamentoSingoloResponse extends ServiceResponse {

	private SubdocumentoSpesa subdocumentoScartato;
	private Messaggio messaggio;
	private OrdinativoPagamento ordinativo;
	
	private Map<Integer,Liquidazione> liquidazioniCache = new HashMap<Integer,Liquidazione>();
	private Map<Integer,DocumentoSpesa> documentiCache = new HashMap<Integer,DocumentoSpesa>();
	private Map<Integer,Soggetto> soggettiCache = new HashMap<Integer,Soggetto>();

	
	/**
	 * @return the subdocumentoScartato
	 */
	public SubdocumentoSpesa getSubdocumentoScartato() {
		return subdocumentoScartato;
	}
	/**
	 * @param subdocumentoScartato the subdocumentoScartato to set
	 */
	public void setSubdocumentoScartato(SubdocumentoSpesa subdocumentoScartato) {
		this.subdocumentoScartato = subdocumentoScartato;
	}
	/**
	 * @return the messaggio
	 */
	public Messaggio getMessaggio() {
		return messaggio;
	}
	/**
	 * @param messaggio the messaggio to set
	 */
	public void setMessaggio(Messaggio messaggio) {
		this.messaggio = messaggio;
	}
	/**
	 * @return the ordinativo
	 */
	public OrdinativoPagamento getOrdinativo() {
		return ordinativo;
	}
	/**
	 * @param ordinativo the ordinativo to set
	 */
	public void setOrdinativo(OrdinativoPagamento ordinativo) {
		this.ordinativo = ordinativo;
	}
	/**
	 * @return the liquidazioniCache
	 */
	public Map<Integer, Liquidazione> getLiquidazioniCache() {
		return liquidazioniCache;
	}
	/**
	 * @param liquidazioniCache the liquidazioniCache to set
	 */
	public void setLiquidazioniCache(Map<Integer, Liquidazione> liquidazioniCache) {
		this.liquidazioniCache = liquidazioniCache;
	}
	/**
	 * @return the documentiCache
	 */
	public Map<Integer, DocumentoSpesa> getDocumentiCache() {
		return documentiCache;
	}
	/**
	 * @param documentiCache the documentiCache to set
	 */
	public void setDocumentiCache(Map<Integer, DocumentoSpesa> documentiCache) {
		this.documentiCache = documentiCache;
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
	
	
}
