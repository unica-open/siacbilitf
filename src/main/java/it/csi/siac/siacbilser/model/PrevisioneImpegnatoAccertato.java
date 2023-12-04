/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * DettaglioVariazioneImportoCapitolo
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class PrevisioneImpegnatoAccertato extends EntitaEnte implements Cloneable {

	/** Per la serializzazione*/
	private static final long serialVersionUID = -5397555802754249437L;
	private BigDecimal importoPrevAnno1 = BigDecimal.ZERO;
	private BigDecimal importoPrevAnno2 = BigDecimal.ZERO;
	private BigDecimal importoPrevAnno3 = BigDecimal.ZERO;
	private String note;

	@XmlElements({
		@XmlElement(name = "capitoloUscitaGestione", type = CapitoloUscitaGestione.class),
		@XmlElement(name = "capitoloEntrataGestione", type = CapitoloEntrataGestione.class),
	})
	private Capitolo<?,?> capitolo;

	public BigDecimal getImportoPrevAnno1() {
		return importoPrevAnno1;
	}

	public void setImportoPrevAnno1(BigDecimal importoPrevAnno1) {
		this.importoPrevAnno1 = importoPrevAnno1;
	}

	public BigDecimal getImportoPrevAnno2() {
		return importoPrevAnno2;
	}

	public void setImportoPrevAnno2(BigDecimal importoPrevAnno2) {
		this.importoPrevAnno2 = importoPrevAnno2;
	}

	public BigDecimal getImportoPrevAnno3() {
		return importoPrevAnno3;
	}

	public void setImportoPrevAnno3(BigDecimal importoPrevAnno3) {
		this.importoPrevAnno3 = importoPrevAnno3;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	@XmlTransient
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}

	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}
	
	public void setCapitoloUscitaGestione(CapitoloUscitaGestione capitolo) {
		this.capitolo = capitolo;
	}

	public void setCapitoloEntrataGestione(CapitoloEntrataGestione capitolo) {
		this.capitolo = capitolo;
	}

	

	
	


}
