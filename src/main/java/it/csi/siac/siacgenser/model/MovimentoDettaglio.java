/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Ambito;
import it.csi.siac.siacbilser.model.Missione;
import it.csi.siac.siacbilser.model.Programma;
import it.csi.siac.siaccespser.model.Cespite;
import it.csi.siac.siaccorser.model.EntitaEnte;

/**

 * @version 1.0
 * @created 14-apr-2015
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class MovimentoDettaglio extends EntitaEnte{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8660312376853173950L;
	
	private Integer numeroRiga;
	private BigDecimal importo;
	private OperazioneSegnoConto segno;
//	private Boolean segno;
	private String descrizione;
	
	private Conto conto;
	private MovimentoEP movimentoEP;

	// Lotto N
	private Ambito ambito;
	
	// SIAC-5281
	private Missione missione;
	private Programma programma;
	
	//cespiti: aggiunti questi campi, da valutare la modellizzazione
	private List<Cespite> cespiti;
	private BigDecimal importoInventariato;
	
	
	

	
	

	/**
	 * @return the numeroRiga
	 */
	public Integer getNumeroRiga() {
		return numeroRiga;
	}

	/**
	 * @param numeroRiga the numeroRiga to set
	 */
	public void setNumeroRiga(Integer numeroRiga) {
		this.numeroRiga = numeroRiga;
	}

	/**
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}

	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

//	/**
//	 * @return the segno
//	 */
//	public Boolean getSegno() {
//		return segno;
//	}
//
//	/**
//	 * @param segno the segno to set
//	 */
//	public void setSegno(Boolean segno) {
//		this.segno = segno;
//	}
	
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	/**
	 * @return the segno
	 */
	public OperazioneSegnoConto getSegno() {
		return segno;
	}

	/**
	 * @param segno the segno to set
	 */
	public void setSegno(OperazioneSegnoConto segno) {
		this.segno = segno;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the conto
	 */
	public Conto getConto() {
		return conto;
	}

	/**
	 * @param conto the conto to set
	 */
	public void setConto(Conto conto) {
		this.conto = conto;
	}

	/**
	 * @return the movimentoEP
	 */
	public MovimentoEP getMovimentoEP() {
		return movimentoEP;
	}

	/**
	 * @param movimentoEP the movimentoEP to set
	 */
	public void setMovimentoEP(MovimentoEP movimentoEP) {
		this.movimentoEP = movimentoEP;
	}

	/**
	 * @return the ambito
	 */
	public Ambito getAmbito() {
		return ambito;
	}

	/**
	 * @param ambito the ambito to set
	 */
	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}

	/**
	 * @return the missione
	 */
	public Missione getMissione() {
		return missione;
	}

	/**
	 * @param missione the missione to set
	 */
	public void setMissione(Missione missione) {
		this.missione = missione;
	}

	/**
	 * @return the programma
	 */
	public Programma getProgramma() {
		return programma;
	}

	/**
	 * @param programma the programma to set
	 */
	public void setProgramma(Programma programma) {
		this.programma = programma;
	}
	
	/**
	 * @return the cespiti
	 */
	public List<Cespite> getCespiti() {
		return cespiti;
	}

	/**
	 * @param cespiti the cespiti to set
	 */
	public void setCespiti(List<Cespite> cespiti) {
		this.cespiti = cespiti;
	}

	/**
	 * @return the importoDare
	 */
	public BigDecimal getImportoDare() {
		return OperazioneSegnoConto.DARE.equals(segno) ? importo : null;
	}
	
	/**
	 * @return the importoAvere
	 */
	public BigDecimal getImportoAvere() {
		return OperazioneSegnoConto.AVERE.equals(segno) ? importo : null;
	}

	/**
	 * @return the importoInventariato
	 */
	public BigDecimal getImportoInventariato() {
		return importoInventariato;
	}

	/**
	 * @param importoInventariato the importoInventariato to set
	 */
	public void setImportoInventariato(BigDecimal importoInventariato) {
		this.importoInventariato = importoInventariato;
	}
	
	
	
}