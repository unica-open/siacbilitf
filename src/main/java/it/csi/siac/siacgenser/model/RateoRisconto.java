/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * Rateo Risconto
 * 
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class RateoRisconto extends EntitaEnte {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5206375163585170601L;
	
	
	private Integer anno;
	private BigDecimal importo;
	private PrimaNota primaNota;
	
	
	
	
	
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
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}
	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
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
	
	public Date getDataCreazioneRateoRisconto() {
		return this.getDataCreazione();
	}

	public void setDataCreazioneRateoRisconto(Date dataCreazioneRateoRisconto) {
		this.setDataCreazione(dataCreazioneRateoRisconto);
	}
	public Date getDataModificaRateoRisconto() {
		return this.getDataModifica();
	}
	public void setDataModificaRateoRisconto(Date dataModificaRateoRisconto) {
		this.setDataModifica(dataModificaRateoRisconto);
	}
	
}