/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siaccorser.model.EntitaEnteExt;


@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class VariazioneMutuo extends EntitaEnteExt  {

	private static final long serialVersionUID = -4273997741163421877L;
	
	private TipoVariazioneMutuo tipoVariazioneMutuo;
	private RataMutuo rataMutuo;
	private Integer annoFineAmmortamento;
	private Integer numeroRataFinale;
	private BigDecimal tassoInteresseEuribor;
	private Mutuo mutuo;
	
	public TipoVariazioneMutuo getTipoVariazioneMutuo() {
		return tipoVariazioneMutuo;
	}
	public void setTipoVariazioneMutuo(TipoVariazioneMutuo tipoVariazioneMutuo) {
		this.tipoVariazioneMutuo = tipoVariazioneMutuo;
	}
	
	public RataMutuo getRataMutuo() {
		return rataMutuo;
	}
	public void setRataMutuo(RataMutuo rataMutuo) {
		this.rataMutuo = rataMutuo;
	}
	public Integer getAnnoFineAmmortamento() {
		return annoFineAmmortamento;
	}
	public void setAnnoFineAmmortamento(Integer annoFineAmmortamento) {
		this.annoFineAmmortamento = annoFineAmmortamento;
	}
	public Integer getNumeroRataFinale() {
		return numeroRataFinale;
	}
	public void setNumeroRataFinale(Integer numeroRataFinale) {
		this.numeroRataFinale = numeroRataFinale;
	}
	public BigDecimal getTassoInteresseEuribor() {
		return tassoInteresseEuribor;
	}
	public void setTassoInteresseEuribor(BigDecimal tassoInteresseEuribor) {
		this.tassoInteresseEuribor = tassoInteresseEuribor;
	}
	public Mutuo getMutuo() {
		return mutuo;
	}
	public void setMutuo(Mutuo mutuo) {
		this.mutuo = mutuo;
	}
}
