/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * The Class DettaglioUscitaCronoprogramma.
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class DettaglioUscitaCronoprogramma extends DettaglioBaseCronoprogramma {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6230129092697839542L;
	

	private Integer annoEntrata;	
	
	//@ImportoPersistente private BigDecimal stanziamento = BigDecimal.ZERO;
	
	private Missione missione;
	private Programma programma;
	private TitoloSpesa titoloSpesa;
	
	//SIAC-6255
	private Capitolo<?,?> capitolo;
	private QuadroEconomico quadroEconomico;
	private BigDecimal importoQuadroEconomico;
	


	/**
	 * Gets the missione.
	 *
	 * @return the missione
	 */
	public Missione getMissione() {
		return missione;
	}


	/**
	 * Sets the missione.
	 *
	 * @param missione the new missione
	 */
	public void setMissione(Missione missione) {
		this.missione = missione;
	}


	/**
	 * Gets the programma.
	 *
	 * @return the programma
	 */
	public Programma getProgramma() {
		return programma;
	}


	/**
	 * Sets the programma.
	 *
	 * @param programma the new programma
	 */
	public void setProgramma(Programma programma) {
		this.programma = programma;
	}


	/**
	 * Gets the titolo spesa.
	 *
	 * @return the titolo spesa
	 */
	public TitoloSpesa getTitoloSpesa() {
		return titoloSpesa;
	}


	/**
	 * Sets the titolo spesa.
	 *
	 * @param titoloSpesa the new titolo spesa
	 */
	public void setTitoloSpesa(TitoloSpesa titoloSpesa) {
		this.titoloSpesa = titoloSpesa;
	}


	/**
	 * Gets the capitolo.
	 *
	 * @return the capitolo
	 */
	public Capitolo<?,?> getCapitolo() {
		return capitolo;
	}


	/**
	 * Sets the capitolo.
	 *
	 * @param capitoloUscitaPrevisione the capitolo uscita previsione
	 */
	public void setCapitolo(Capitolo<?,?> capitoloUscitaPrevisione) {
		this.capitolo = capitoloUscitaPrevisione;
	}

	/**
	 * @return the quadroEconomico
	 */
	public QuadroEconomico getQuadroEconomico() {
		return quadroEconomico;
	}


	/**
	 * @param quadroEconomico the quadroEconomico to set
	 */
	public void setQuadroEconomico(QuadroEconomico quadroEconomico) {
		this.quadroEconomico = quadroEconomico;
	}


	/**
	 * @return the importoQuadroEconmico
	 */
	public BigDecimal getImportoQuadroEconomico() {
		return importoQuadroEconomico;
	}


	/**
	 * @param importoQuadroEconmico the importoQuadroEconmico to set
	 */
	public void setImportoQuadroEconomico(BigDecimal importoQuadroEconmico) {
		this.importoQuadroEconomico = importoQuadroEconmico;
	}


	/**
	 * Gets the anno entrata.
	 *
	 * @return the anno entrata
	 */
	public Integer getAnnoEntrata() {
		return annoEntrata;
	}

	/**
	 * Anno di entrata previsto a cui si riferisce questo dettaglio di uscita.
	 * @param annoEntrata
	 */
	public void setAnnoEntrata(Integer annoEntrata) {
		this.annoEntrata = annoEntrata;
	}
	


	@Override
	public String toString() {
		return "Spesa  : "+this.getStanziamento()+ " anno: "+ this.getAnnoCompetenza() +"(entrata: "+this.getAnnoEntrata()+ ") "
				+ " Missione: "+(this.getMissione()!=null?this.getMissione().getCodice() + "("+this.getMissione().getUid()+")":"null")
				+ " Programma: "+ (this.getProgramma()!=null?this.getProgramma().getCodice() + "("+this.getProgramma().getUid()+")":"null")
				+ " TitoloSpesa: "+ (this.getTitoloSpesa()!=null? this.getTitoloSpesa().getCodice() + "("+this.getTitoloSpesa().getUid()+")":"null");		
	}

	/**
	 * @return the dataFineValiditaDettaglioUscitaCronoprogramma
	 */
	public Date getDataFineValiditaDettaglioUscitaCronoprogramma() {
		return getDataFineValidita();
	}

	/**
	 * @param dataFineValiditaDettaglioUscitaCronoprogramma the dataFineValiditaDettaglioUscitaCronoprogramma to set
	 */
	public void setDataFineValiditaDettaglioUscitaCronoprogramma(Date dataFineValiditaDettaglioUscitaCronoprogramma) {
		setDataFineValidita(dataFineValiditaDettaglioUscitaCronoprogramma);
	}
	
}
