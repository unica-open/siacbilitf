/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Ambito;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;

/**
 * Cespiti
 * @author 71027
 * @version 1.0
 * @created 31-giu-2018
 */
@XmlType(namespace = CESPDataDictionary.NAMESPACE)
public class CategoriaCespiti extends Codifica {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4640639334155272835L;

	private Ambito ambito;
	private BigDecimal aliquotaAnnua;
	private Ente ente;
	private CategoriaCalcoloTipoCespite categoriaCalcoloTipoCespite;
	private Date dataInizioValiditaFiltro;
	private Boolean annullato;
	
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
	 * @return the aliquotaAnnua
	 */
	public BigDecimal getAliquotaAnnua() {
		return aliquotaAnnua;
	}

	/**
	 * @param aliquotaAnnua the aliquotaAnnua to set
	 */
	public void setAliquotaAnnua(BigDecimal aliquotaAnnua) {
		this.aliquotaAnnua = aliquotaAnnua;
	}

	/**
	 * @return the CategoriaCalcoloTipoCespite
	 */
	public CategoriaCalcoloTipoCespite getCategoriaCalcoloTipoCespite() {
		return categoriaCalcoloTipoCespite;
	}

	/**
	 * Sets the categoria calcolo tipo cespite.
	 *
	 * @param categoriaCalcoloTipoCespite the new categoria calcolo tipo cespite
	 */
	public void setCategoriaCalcoloTipoCespite(CategoriaCalcoloTipoCespite categoriaCalcoloTipoCespite) {
		this.categoriaCalcoloTipoCespite = categoriaCalcoloTipoCespite;
	}

	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	/**
	 * @return the dataInizioValiditaFiltro
	 */
	public Date getDataInizioValiditaFiltro() {
		return dataInizioValiditaFiltro;
	}

	/**
	 * @param dataInizioValiditaFiltro the dataInizioValiditaFiltro to set
	 */
	public void setDataInizioValiditaFiltro(Date dataInizioValiditaFiltro) {
		this.dataInizioValiditaFiltro = dataInizioValiditaFiltro;
	}

	/**
	 * @return the annullato
	 */
	public Boolean getAnnullato() {
		return annullato;
	}

	/**
	 * @param annullato the annullato to set
	 */
	public void setAnnullato(Boolean annullato) {
		this.annullato = annullato;
	}
	
	

	
}