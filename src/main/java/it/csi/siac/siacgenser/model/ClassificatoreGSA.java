/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Ambito;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.EntitaExt;

/**
 * Classificatore per GSA
 * 
 * @author Elisa
 * @version 1.0
 * @created 15/12/2017
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class ClassificatoreGSA extends EntitaExt {

	/** Per la serializzazione */
	private static final long serialVersionUID = 6781618291098040089L;

	private Ente ente;
	
	private Integer livello;
	private String codice;
	private String descrizione;
	private Ambito ambito;
	private StatoOperativoClassificatoreGSA  statoOperativoClassificatoreGSA;
	/**
	 * Conto di livello -1 rispetto a this. (i livelli sono 0 based)
	 */
	private ClassificatoreGSA classificatoreGSAPadre;
	/**
	 * 
	 * */
	private List<ClassificatoreGSA> listaClassificatoriGSAFigli;
	
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
	 * Gets the ambito.
	 *
	 * @return the ambito
	 */
	public Ambito getAmbito() {
		return ambito;
	}
	
	/**
	 * Sets the ambito.
	 *
	 * @param ambito the ambito to set
	 */
	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}
	
	/**
	 * @return the statoOperativoClassificatoreGSA
	 */
	public StatoOperativoClassificatoreGSA getStatoOperativoClassificatoreGSA() {
		return statoOperativoClassificatoreGSA;
	}

	/**
	 * @param statoOperativoClassificatoreGSA the statoOperativoClassificatoreGSA to set
	 */
	public void setStatoOperativoClassificatoreGSA(StatoOperativoClassificatoreGSA statoOperativoClassificatoreGSA) {
		this.statoOperativoClassificatoreGSA = statoOperativoClassificatoreGSA;
	}

	/**
	 * Gets the conto padre.
	 *
	 * @return the contoPadre
	 */
	public ClassificatoreGSA getClassificatoreGSAPadre() {
		return classificatoreGSAPadre;
	}
	
	/**
	 * Sets the conto padre.
	 *
	 * @param classificatoreGSAPadre the new classificatore GSA padre
	 */
	public void setClassificatoreGSAPadre(ClassificatoreGSA classificatoreGSAPadre) {
		this.classificatoreGSAPadre = classificatoreGSAPadre;
	}
	
	/**
	 * Gets the conti figli.
	 *
	 * @return the contiFigli
	 */
	public List<ClassificatoreGSA> getListaClassificatoriGSAFigli() {
		return listaClassificatoriGSAFigli;
	}
	
	/**
	 * Sets the conti figli.
	 *
	 * @param listaClassificatoriGSAFigli the new lista classificatori GSA figli
	 */
	public void setListaClassificatoriGSAFigli(List<ClassificatoreGSA> listaClassificatoriGSAFigli) {
		this.listaClassificatoriGSAFigli = listaClassificatoriGSAFigli;
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
				.toString();
	}
	
}