/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class DettaglioBaseCronoprogramma extends Entita {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6230129092697839542L;
	
	private Ente ente;
	private Cronoprogramma cronoprogramma;
	
	private Integer numeroArticolo;
	private Integer numeroCapitolo;
	private Integer numeroUEB;
	
	private String descrizioneCapitolo;
	private String descrizioneArticolo;	
	
	private Integer annoCompetenza;	
	
	
	@ImportoPersistente private BigDecimal stanziamento = BigDecimal.ZERO;
	
	


	public Ente getEnte() {
		return ente;
	}


	public void setEnte(Ente ente) {
		this.ente = ente;
	}


	public Integer getNumeroArticolo() {
		return numeroArticolo;
	}


	public void setNumeroArticolo(Integer numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}


	public Integer getNumeroCapitolo() {
		return numeroCapitolo;
	}


	public void setNumeroCapitolo(Integer numeroCapitolo) {
		this.numeroCapitolo = numeroCapitolo;
	}


	public Integer getNumeroUEB() {
		return numeroUEB;
	}


	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
	}


	public String getDescrizioneCapitolo() {
		return descrizioneCapitolo;
	}


	public void setDescrizioneCapitolo(String descrizioneCapitolo) {
		this.descrizioneCapitolo = descrizioneCapitolo;
	}


	public String getDescrizioneArticolo() {
		return descrizioneArticolo;
	}


	public void setDescrizioneArticolo(String descrizioneArticolo) {
		this.descrizioneArticolo = descrizioneArticolo;
	}


	public Integer getAnnoCompetenza() {
		return annoCompetenza;
	}


	public void setAnnoCompetenza(Integer annoCompetenza) {
		this.annoCompetenza = annoCompetenza;
	}


	public BigDecimal getStanziamento() {
		return stanziamento;
	}


	public void setStanziamento(BigDecimal stanziamento) {
		this.stanziamento = stanziamento;
	}

	public Cronoprogramma getCronoprogramma() {
		return cronoprogramma;
	}

	/** 
	 * Impostare solo l'uid del cronoprogramma
	 * @param cronoprogramma
	 */
	public void setCronoprogramma(Cronoprogramma cronoprogramma) {
		this.cronoprogramma = cronoprogramma;
	}

	
	

}
