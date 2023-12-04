/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacgenser.model.PrimaNota;

/**
 * Cespiti
 * 
 * @author 71027
 * @version 1.0
 * @created 31-giu-2018
 */
@XmlType(namespace = CESPDataDictionary.NAMESPACE)
public class DettaglioAmmortamentoAnnuoCespite extends EntitaEnte {

	/** Per la serializzazione */
	private static final long serialVersionUID = 2066722439497422553L;

	private Integer anno;
	private BigDecimal quotaAnnuale;
	private Date dataAmmortamento;
	private PrimaNota primaNota;	
	private AmmortamentoAnnuoCespite ammortamentoAnnuoCespite;
	//TODO:valutare
	private String registrazioneDefinitivaAmmortamento;
	
	//TODO: Scelta effettuata in analogia a dataInizioValidita filtro di causale ep, tipo bene ecc ecc. valutare se sia la scelta migliore.
	private Integer annoDettaglioAmmortamentoFiltro;
	
	

	/**
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}

	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	/**
	 * @return the quotaAnnuale
	 */
	public BigDecimal getQuotaAnnuale() {
		return quotaAnnuale;
	}

	/**
	 * @param quotaAnnuale the quotaAnnuale to set
	 */
	public void setQuotaAnnuale(BigDecimal quotaAnnuale) {
		this.quotaAnnuale = quotaAnnuale;
	}
	
	/**
	 * @return the dataAmmortamento
	 */
	public Date getDataAmmortamento() {
		return dataAmmortamento;
	}

	/**
	 * @param dataAmmortamento the dataAmmortamento to set
	 */
	public void setDataAmmortamento(Date dataAmmortamento) {
		this.dataAmmortamento = dataAmmortamento;
	}

	/**
	 * @return the primaNota
	 */
	public PrimaNota getPrimaNota() {
		return primaNota;
	}

	/**
	 * @param primaNota the primaNota to set
	 */
	public void setPrimaNota(PrimaNota primaNota) {
		this.primaNota = primaNota;
	}

	
	

	
	

	/**
	 * @return the ammortamentoAnnuoCespite
	 */
	public AmmortamentoAnnuoCespite getAmmortamentoAnnuoCespite() {
		return ammortamentoAnnuoCespite;
	}

	/**
	 * @param ammortamentoAnnuoCespite the ammortamentoAnnuoCespite to set
	 */
	public void setAmmortamentoAnnuoCespite(AmmortamentoAnnuoCespite ammortamentoAnnuoCespite) {
		this.ammortamentoAnnuoCespite = ammortamentoAnnuoCespite;
	}

	/**
	 * @return the registrazioneDefinitivaAmmortamento
	 */
	public String getRegistrazioneDefinitivaAmmortamento() {
		return registrazioneDefinitivaAmmortamento;
	}

	/**
	 * @param registrazioneDefinitivaAmmortamento the registrazioneDefinitivaAmmortamento to set
	 */
	public void setRegistrazioneDefinitivaAmmortamento(String registrazioneDefinitivaAmmortamento) {
		this.registrazioneDefinitivaAmmortamento = registrazioneDefinitivaAmmortamento;
	}

	/**
	 * @return the annoDettaglioAmmortamentoFiltro
	 */
	public Integer getAnnoDettaglioAmmortamentoFiltro() {
		return annoDettaglioAmmortamentoFiltro;
	}

	/**
	 * @param annoDettaglioAmmortamentoFiltro the annoDettaglioAmmortamentoFiltro to set
	 */
	public void setAnnoDettaglioAmmortamentoFiltro(Integer annoDettaglioAmmortamentoFiltro) {
		this.annoDettaglioAmmortamentoFiltro = annoDettaglioAmmortamentoFiltro;
	}
	
}