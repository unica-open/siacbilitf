/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siaccommon.util.date.DateUtil;
import it.csi.siac.siaccorser.model.EntitaEnteExt;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RataMutuo extends EntitaEnteExt  {

	private static final long serialVersionUID = 1773626769401484024L;

	private Integer anno;
	private Integer numeroRataPiano;
	private Integer numeroRataAnno;
	private BigDecimal importoTotale;
	private BigDecimal importoQuotaInteressi;
	private BigDecimal importoQuotaCapitale;
	private BigDecimal importoQuotaOneri;
	private BigDecimal debitoIniziale;
	private BigDecimal debitoResiduo;
	private Date dataScadenza;
	
	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public Integer getNumeroRataPiano() {
		return numeroRataPiano;
	}

	public void setNumeroRataPiano(Integer numeroRataPiano) {
		this.numeroRataPiano = numeroRataPiano;
	}

	public Integer getNumeroRataAnno() {
		return numeroRataAnno;
	}

	public void setNumeroRataAnno(Integer numeroRataAnno) {
		this.numeroRataAnno = numeroRataAnno;
	}

	public BigDecimal getImportoTotale() {
		return importoTotale;
	}

	public void setImportoTotale(BigDecimal importoTotale) {
		this.importoTotale = importoTotale;
	}

	public BigDecimal getImportoQuotaInteressi() {
		return importoQuotaInteressi;
	}

	public void setImportoQuotaInteressi(BigDecimal importoQuotaInteressi) {
		this.importoQuotaInteressi = importoQuotaInteressi;
	}

	public BigDecimal getImportoQuotaCapitale() {
		return importoQuotaCapitale;
	}

	public void setImportoQuotaCapitale(BigDecimal importoQuotaCapitale) {
		this.importoQuotaCapitale = importoQuotaCapitale;
	}

	public BigDecimal getImportoQuotaOneri() {
		return importoQuotaOneri;
	}

	public void setImportoQuotaOneri(BigDecimal importoQuotaOneri) {
		this.importoQuotaOneri = importoQuotaOneri;
	}
	
	public BigDecimal getDebitoIniziale() {
		return debitoIniziale;
	}

	public void setDebitoIniziale(BigDecimal debitoIniziale) {
		this.debitoIniziale = debitoIniziale;
	}

	public BigDecimal getDebitoResiduo() {
		return debitoResiduo;
	}

	public void setDebitoResiduo(BigDecimal debitoResiduo) {
		this.debitoResiduo = debitoResiduo;
	}

	public Date getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public Boolean isScaduta() {
		return DateUtil.dayBeforeToday(getDataScadenza());
	}

	public void calcDebitoResiduo() {
		setDebitoResiduo(debitoIniziale.subtract(importoQuotaCapitale));
	}
}
