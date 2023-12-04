/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

/**
 * Ritenute Acconto.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class RitenuteDocumento extends EntitaEnte {
	
	private static final long serialVersionUID = 7056653277960707026L;
	
	//siac_r_doc_attr
	private BigDecimal importoEsente = BigDecimal.ZERO;
	private BigDecimal importoRivalsa = BigDecimal.ZERO;
	private BigDecimal importoCassaPensioni = BigDecimal.ZERO;
	private BigDecimal importoIVA = BigDecimal.ZERO;
	
	private List<DettaglioOnere> listaOnere = new ArrayList<DettaglioOnere>();

	/**
	 * @return the importoEsente
	 */
	public BigDecimal getImportoEsente() {
		return importoEsente;
	}

	/**
	 * @param importoEsente the importoEsente to set
	 */
	public void setImportoEsente(BigDecimal importoEsente) {
		this.importoEsente = importoEsente;
	}

	/**
	 * @return the importoRivalsa
	 */
	public BigDecimal getImportoRivalsa() {
		return importoRivalsa;
	}

	/**
	 * @param importoRivalsa the importoRivalsa to set
	 */
	public void setImportoRivalsa(BigDecimal importoRivalsa) {
		this.importoRivalsa = importoRivalsa;
	}

	/**
	 * @return the importoCassaPensioni
	 */
	public BigDecimal getImportoCassaPensioni() {
		return importoCassaPensioni;
	}

	/**
	 * @param importoCassaPensioni the importoCassaPensioni to set
	 */
	public void setImportoCassaPensioni(BigDecimal importoCassaPensioni) {
		this.importoCassaPensioni = importoCassaPensioni;
	}

	/**
	 * @return the importoIVA
	 */
	public BigDecimal getImportoIVA() {
		return importoIVA;
	}

	/**
	 * @param importoIVA the importoIVA to set
	 */
	public void setImportoIVA(BigDecimal importoIVA) {
		this.importoIVA = importoIVA;
	}

	/**
	 * @return the listaOnere
	 */
	public List<DettaglioOnere> getListaOnere() {
		return listaOnere;
	}

	/**
	 * @param listaOnere the listaOnere to set
	 */
	public void setListaOnere(List<DettaglioOnere> listaOnere) {
		this.listaOnere = listaOnere;
	}
	
}
