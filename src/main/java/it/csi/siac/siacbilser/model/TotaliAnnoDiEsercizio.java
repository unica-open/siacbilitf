/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * TotaliAnnoDiEsercizio
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class TotaliAnnoDiEsercizio extends EntitaEnte {

	private static final long serialVersionUID = -794223454606271443L;

	private BigDecimal totStanziamentiCompetenzaEntrata;
	private BigDecimal totStanziamentiResiduiEntrata;
	private BigDecimal totStanziamentiDiCassaEntrata;
	private BigDecimal totStanziamentiDiCompetenzaSpesa;
	private BigDecimal totaleStanziamentiResiduiSpesa;
	private BigDecimal totaleStanziamentiDiCassaSpesa;
	
	// SIAC-6881
	@XmlElementWrapper(name = "listaComponenteImportiCapitoloSpesa")
	@XmlElement(name = "componenteImportiCapitolo")
	private List<ComponenteImportiCapitolo> listaComponenteImportiCapitoloSpesa = new ArrayList<ComponenteImportiCapitolo>();
	@XmlElementWrapper(name = "listaComponenteImportiCapitoloEntrata")
	@XmlElement(name = "componenteImportiCapitolo")
	private List<ComponenteImportiCapitolo> listaComponenteImportiCapitoloEntrata = new ArrayList<ComponenteImportiCapitolo>();
	
	public BigDecimal getTotStanziamentiCompetenzaEntrata() {
		return totStanziamentiCompetenzaEntrata;
	}
	public void setTotStanziamentiCompetenzaEntrata(
			BigDecimal totStanziamentiCompetenzaEntrata) {
		this.totStanziamentiCompetenzaEntrata = totStanziamentiCompetenzaEntrata;
	}
	public BigDecimal getTotStanziamentiResiduiEntrata() {
		return totStanziamentiResiduiEntrata;
	}
	public void setTotStanziamentiResiduiEntrata(
			BigDecimal totStanziamentiResiduiEntrata) {
		this.totStanziamentiResiduiEntrata = totStanziamentiResiduiEntrata;
	}
	public BigDecimal getTotStanziamentiDiCassaEntrata() {
		return totStanziamentiDiCassaEntrata;
	}
	public void setTotStanziamentiDiCassaEntrata(
			BigDecimal totStanziamentiDiCassaEntrata) {
		this.totStanziamentiDiCassaEntrata = totStanziamentiDiCassaEntrata;
	}
	public BigDecimal getTotStanziamentiDiCompetenzaSpesa() {
		return totStanziamentiDiCompetenzaSpesa;
	}
	public void setTotStanziamentiDiCompetenzaSpesa(
			BigDecimal totStanziamentiDiCompetenzaSpesa) {
		this.totStanziamentiDiCompetenzaSpesa = totStanziamentiDiCompetenzaSpesa;
	}
	public BigDecimal getTotaleStanziamentiResiduiSpesa() {
		return totaleStanziamentiResiduiSpesa;
	}
	public void setTotaleStanziamentiResiduiSpesa(
			BigDecimal totaleStanziamentiResiduiSpesa) {
		this.totaleStanziamentiResiduiSpesa = totaleStanziamentiResiduiSpesa;
	}
	public BigDecimal getTotaleStanziamentiDiCassaSpesa() {
		return totaleStanziamentiDiCassaSpesa;
	}
	public void setTotaleStanziamentiDiCassaSpesa(
			BigDecimal totaleStanziamentiDiCassaSpesa) {
		this.totaleStanziamentiDiCassaSpesa = totaleStanziamentiDiCassaSpesa;
	}
	/**
	 * @return the listaComponenteImportiCapitoloSpesa
	 */
	@XmlTransient
	public List<ComponenteImportiCapitolo> getListaComponenteImportiCapitoloSpesa() {
		return this.listaComponenteImportiCapitoloSpesa;
	}
	/**
	 * @param listaComponenteImportiCapitoloSpesa the listaComponenteImportiCapitoloSpesa to set
	 */
	public void setListaComponenteImportiCapitoloSpesa(
			List<ComponenteImportiCapitolo> listaComponenteImportiCapitoloSpesa) {
		this.listaComponenteImportiCapitoloSpesa = listaComponenteImportiCapitoloSpesa;
	}
	/**
	 * @return the listaComponenteImportiCapitoloEntrata
	 */
	@XmlTransient
	public List<ComponenteImportiCapitolo> getListaComponenteImportiCapitoloEntrata() {
		return this.listaComponenteImportiCapitoloEntrata;
	}
	/**
	 * @param listaComponenteImportiCapitoloEntrata the listaComponenteImportiCapitoloEntrata to set
	 */
	public void setListaComponenteImportiCapitoloEntrata(
			List<ComponenteImportiCapitolo> listaComponenteImportiCapitoloEntrata) {
		this.listaComponenteImportiCapitoloEntrata = listaComponenteImportiCapitoloEntrata;
	}
}
