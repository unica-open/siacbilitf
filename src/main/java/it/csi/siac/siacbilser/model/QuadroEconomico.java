/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.EntitaExt;

/**
 * QuadroEconomico
 * 
 * @author Elisa
 * @version 1.0
 * @created 15/12/2017
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class QuadroEconomico extends EntitaExt {

	/** Per la serializzazione */
	private static final long serialVersionUID = 6781618291098040089L;

	private Ente ente;
	
	private Integer livello;
	private String codice;
	private String descrizione;
	//private Ambito ambito;
	private StatoOperativoQuadroEconomico  statoOperativoQuadroEconomico;
	private ParteQuadroEconomico           parteQuadroEconomico;
	//quadro_economico_id_padre INTEGER,	
	//parte_id INTEGER NOT NULL,
	

	/**
	 * Conto di livello -1 rispetto a this. (i livelli sono 0 based)
	 */
	private QuadroEconomico quadroEconomicoPadre;
	/**
	 * 
	 * */
	private List<QuadroEconomico> listaQuadroEconomicoFigli;
	
	/**
	 * Gets the ente.
	 *
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	
	/**
	 * Sets the ente.
	 *
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	
	/**
	 * Gets the livello.
	 *
	 * @return the livello
	 */
	public Integer getLivello() {
		return livello;
	}
	
	/**
	 * Sets the livello.
	 *
	 * @param livello the livello to set
	 */
	public void setLivello(Integer livello) {
		this.livello = livello;
	}
	
	/**
	 * Gets the codice.
	 *
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	
	/**
	 * Sets the codice.
	 *
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	/**
	 * Gets the descrizione.
	 *
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	/**
	 * Sets the descrizione.
	 *
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	/**
	 * @return the statoOperativoQuadroEconomico
	 */
	public StatoOperativoQuadroEconomico getStatoOperativoQuadroEconomico() {
		return statoOperativoQuadroEconomico;
	}

	/**
	 * @param statoOperativoQuadroEconomico the statoOperativoQuadroEconomico to set
	 */
	public void setStatoOperativoQuadroEconomico(StatoOperativoQuadroEconomico statoOperativoQuadroEconomico) {
		this.statoOperativoQuadroEconomico = statoOperativoQuadroEconomico;
	}


	
	/**
	 * @return the parteQuadroEconomico
	 */
	public ParteQuadroEconomico getParteQuadroEconomico() {
		return parteQuadroEconomico;
	}

	/**
	 * @param parteQuadroEconomico the parteQuadroEconomico to set
	 */
	public void setParteQuadroEconomico(ParteQuadroEconomico parteQuadroEconomico) {
		this.parteQuadroEconomico = parteQuadroEconomico;
	}

	/**
	 * @return the quadroEconomicoPadre
	 */
	public QuadroEconomico getQuadroEconomicoPadre() {
		return quadroEconomicoPadre;
	}

	/**
	 * @param quadroEconomicoPadre the quadroEconomicoPadre to set
	 */
	public void setQuadroEconomicoPadre(QuadroEconomico quadroEconomicoPadre) {
		this.quadroEconomicoPadre = quadroEconomicoPadre;
	}


	
	/**
	 * @return the listaQuadroEconomicoFigli
	 */
	public List<QuadroEconomico> getListaQuadroEconomicoFigli() {
		return listaQuadroEconomicoFigli;
	}

	/**
	 * @param listaQuadroEconomicoFigli the listaQuadroEconomicoFigli to set
	 */
	public void setListaQuadroEconomicoFigli(List<QuadroEconomico> listaQuadroEconomicoFigli) {
		this.listaQuadroEconomicoFigli = listaQuadroEconomicoFigli;
	}

	/**
	 * Restituisce il testo come codice - descrizione
	 * @return il testo
	 */
	public String getTesto() {
		return new StringBuilder()
				.append(codice)
				.append(" - ")
				.append(descrizione)
				.append(" - ")
				.append(parteQuadroEconomico != null? parteQuadroEconomico.getCodice() : "")
				.toString();
	}
	
}