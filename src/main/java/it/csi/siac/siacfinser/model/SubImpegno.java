/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.math.BigDecimal;

// import it.csi.siac.siacattser.model.AttoAmministrativo;
// import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import javax.xml.bind.annotation.XmlType;

/**
 * SubImpegno
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class SubImpegno extends Impegno {

	private static final long serialVersionUID = 2417888191421765744L;
	
	private Integer idMovimentoPadre;
	private BigDecimal numeroImpegnoPadre;
	//PROVA COLOMBO
	private int annoImpegnoPadre;
//	private Timestamp dataCreazioneTs;
	
	//SIAC-6929
	private BigDecimal importoInizialePadre;
	private BigDecimal importoAttualePadre;
	private String descrizionePadre;
	
	

	public Integer getIdMovimentoPadre() {
		return idMovimentoPadre;
	}

	public void setIdMovimentoPadre(Integer idMovimentoPadre) {
		this.idMovimentoPadre = idMovimentoPadre;
	}

	public BigDecimal getNumeroImpegnoPadre() {
		return numeroImpegnoPadre;
	}

	public void setNumeroImpegnoPadre(BigDecimal numeroImpegnoPadre) {
		this.numeroImpegnoPadre = numeroImpegnoPadre;
	}

	public int getAnnoImpegnoPadre() {
		return annoImpegnoPadre;
	}

	public void setAnnoImpegnoPadre(int annoImpegnoPadre) {
		this.annoImpegnoPadre = annoImpegnoPadre;
	}

	/**
	 * @return the importoInizialePadre
	 */
	public BigDecimal getImportoInizialePadre() {
		return importoInizialePadre;
	}

	/**
	 * @param importoInizialePadre the importoInizialePadre to set
	 */
	public void setImportoInizialePadre(BigDecimal importoInizialePadre) {
		this.importoInizialePadre = importoInizialePadre;
	}

	/**
	 * @return the importoAttualePadre
	 */
	public BigDecimal getImportoAttualePadre() {
		return importoAttualePadre;
	}

	/**
	 * @param importoAttualePadre the importoAttualePadre to set
	 */
	public void setImportoAttualePadre(BigDecimal importoAttualePadre) {
		this.importoAttualePadre = importoAttualePadre;
	}

	/**
	 * @return the descrizionePadre
	 */
	public String getDescrizionePadre() {
		return descrizionePadre;
	}

	/**
	 * @param descrizionePadre the descrizionePadre to set
	 */
	public void setDescrizionePadre(String descrizionePadre) {
		this.descrizionePadre = descrizionePadre;
	}

//	public Timestamp getDataCreazioneTs() {
//		return dataCreazioneTs;
//	}
//
//	public void setDataCreazioneTs(Timestamp dataCreazioneTs) {
//		this.dataCreazioneTs = dataCreazioneTs;
//	}
}