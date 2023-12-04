/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * CassaPrevidenzialeFEL
 * 
 * @author Valentina
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class CassaPrevidenzialeFEL extends EntitaEnte{
	

	private static final long serialVersionUID = 8791766309942429960L;
	
	
	private Integer progressivo;
	private BigDecimal aliquotaCassa;
	private BigDecimal importoContributoCassa;
	private BigDecimal imponibileCassa;
	private BigDecimal aliquotaIva;
	private String riferimentoAmministrazione;
	private Boolean ritenuta; 
	
	private FatturaFEL fattura;
	private TipoCassaFEL tipoCassaFEL;
	private NaturaFEL naturaFEL;
	/**
	 * @return the progressivo
	 */
	public Integer getProgressivo() {
		return progressivo;
	}
	/**
	 * @param progressivo the progressivo to set
	 */
	public void setProgressivo(Integer progressivo) {
		this.progressivo = progressivo;
	}
	/**
	 * @return the aliquotaCassa
	 */
	public BigDecimal getAliquotaCassa() {
		return aliquotaCassa;
	}
	/**
	 * @param aliquotaCassa the aliquotaCassa to set
	 */
	public void setAliquotaCassa(BigDecimal aliquotaCassa) {
		this.aliquotaCassa = aliquotaCassa;
	}
	/**
	 * @return the importoContributoCassa
	 */
	public BigDecimal getImportoContributoCassa() {
		return importoContributoCassa;
	}
	/**
	 * @param importoContributoCassa the importoContributoCassa to set
	 */
	public void setImportoContributoCassa(BigDecimal importoContributoCassa) {
		this.importoContributoCassa = importoContributoCassa;
	}
	/**
	 * @return the imponibileCassa
	 */
	public BigDecimal getImponibileCassa() {
		return imponibileCassa;
	}
	/**
	 * @param imponibileCassa the imponibileCassa to set
	 */
	public void setImponibileCassa(BigDecimal imponibileCassa) {
		this.imponibileCassa = imponibileCassa;
	}
	/**
	 * @return the aliquotaIva
	 */
	public BigDecimal getAliquotaIva() {
		return aliquotaIva;
	}
	/**
	 * @param aliquotaIva the aliquotaIva to set
	 */
	public void setAliquotaIva(BigDecimal aliquotaIva) {
		this.aliquotaIva = aliquotaIva;
	}
	/**
	 * @return the riferimentoAmministrazione
	 */
	public String getRiferimentoAmministrazione() {
		return riferimentoAmministrazione;
	}
	/**
	 * @param riferimentoAmministrazione the riferimentoAmministrazione to set
	 */
	public void setRiferimentoAmministrazione(String riferimentoAmministrazione) {
		this.riferimentoAmministrazione = riferimentoAmministrazione;
	}
	/**
	 * @return the ritenuta
	 */
	public Boolean getRitenuta() {
		return ritenuta;
	}
	/**
	 * @param ritenuta the ritenuta to set
	 */
	public void setRitenuta(Boolean ritenuta) {
		this.ritenuta = ritenuta;
	}
	/**
	 * @return the fattura
	 */
	public FatturaFEL getFattura() {
		return fattura;
	}
	/**
	 * @param fattura the fattura to set
	 */
	public void setFattura(FatturaFEL fattura) {
		this.fattura = fattura;
	}
	/**
	 * @return the tipoCassaFEL
	 */
	public TipoCassaFEL getTipoCassaFEL() {
		return tipoCassaFEL;
	}
	/**
	 * @param tipoCassaFEL the tipoCassaFEL to set
	 */
	public void setTipoCassaFEL(TipoCassaFEL tipoCassaFEL) {
		this.tipoCassaFEL = tipoCassaFEL;
	}
	/**
	 * @return the naturaFEL
	 */
	public NaturaFEL getNaturaFEL() {
		return naturaFEL;
	}
	/**
	 * @param naturaFEL the naturaFEL to set
	 */
	public void setNaturaFEL(NaturaFEL naturaFEL) {
		this.naturaFEL = naturaFEL;
	}
	
	
	
	
	
}
