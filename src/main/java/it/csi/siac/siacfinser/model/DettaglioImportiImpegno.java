/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.util.number.BigDecimalUtil;
import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class DettaglioImportiImpegno extends EntitaEnte {

	private static final long serialVersionUID = -8784420145007443214L;
	
	//Riferiementi all'impegno rappresentato:
	private BigDecimal numeroMovimento;
	private int annoMovimento;
	private int annoBilancio;
	//

	private RiepilogoImportoNumero docNonLiq;
	
	private RiepilogoImportoNumero impPredoc;
	
	
	private RiepilogoImportoNumero impCartac;
	
	private RiepilogoImportoNumero impCartacSubdoc;
	
	private RiepilogoImportoNumero carteNonReg;
	
	private BigDecimal totModProv;
	
	
	private RiepilogoImportoNumero impLiq;
	
	private RiepilogoImportoNumero impSubdoc;
	
	private RiepilogoImportoNumero impLiqSudoc;

	private BigDecimal totImpCecNoGiust;
	private BigDecimal totImp2NoGiust;
	private BigDecimal totImp2GiustIntegrato;
	
	private BigDecimal totImp2GiustRestituito;
	private BigDecimal totImpCecFattura;
	private BigDecimal totImpCecPafFatt;
	private BigDecimal totCec;
	
	//SIAC-6997
	private StrutturaAmministrativoContabile strutturaCompetente;
	
	
	
	public RiepilogoImportoNumero getDocNonLiq() {
		return docNonLiq;
	}
	public void setDocNonLiq(RiepilogoImportoNumero docNonLiq) {
		this.docNonLiq = docNonLiq;
	}
	public RiepilogoImportoNumero getImpPredoc() {
		return impPredoc;
	}
	public void setImpPredoc(RiepilogoImportoNumero impPredoc) {
		this.impPredoc = impPredoc;
	}
	public RiepilogoImportoNumero getImpCartac() {
		return impCartac;
	}
	public void setImpCartac(RiepilogoImportoNumero impCartac) {
		this.impCartac = impCartac;
	}
	public RiepilogoImportoNumero getImpCartacSubdoc() {
		return impCartacSubdoc;
	}
	public void setImpCartacSubdoc(RiepilogoImportoNumero impCartacSubdoc) {
		this.impCartacSubdoc = impCartacSubdoc;
	}
	public RiepilogoImportoNumero getCarteNonReg() {
		return carteNonReg;
	}
	public void setCarteNonReg(RiepilogoImportoNumero carteNonReg) {
		this.carteNonReg = carteNonReg;
	}
	public BigDecimal getTotModProv() {
		return totModProv;
	}
	public void setTotModProv(BigDecimal totModProv) {
		this.totModProv = totModProv;
	}
	public RiepilogoImportoNumero getImpLiq() {
		return impLiq;
	}
	public void setImpLiq(RiepilogoImportoNumero impLiq) {
		this.impLiq = impLiq;
	}
	public RiepilogoImportoNumero getImpSubdoc() {
		return impSubdoc;
	}
	public void setImpSubdoc(RiepilogoImportoNumero impSubdoc) {
		this.impSubdoc = impSubdoc;
	}
	public RiepilogoImportoNumero getImpLiqSudoc() {
		return impLiqSudoc;
	}
	public void setImpLiqSudoc(RiepilogoImportoNumero impLiqSudoc) {
		this.impLiqSudoc = impLiqSudoc;
	}
	public BigDecimal getTotImpCecNoGiust() {
		return totImpCecNoGiust;
	}
	public void setTotImpCecNoGiust(BigDecimal totImpCecNoGiust) {
		this.totImpCecNoGiust = totImpCecNoGiust;
	}
	public BigDecimal getTotImp2NoGiust() {
		return totImp2NoGiust;
	}
	public void setTotImp2NoGiust(BigDecimal totImp2NoGiust) {
		this.totImp2NoGiust = totImp2NoGiust;
	}
	public BigDecimal getTotImp2GiustIntegrato() {
		return totImp2GiustIntegrato;
	}
	public void setTotImp2GiustIntegrato(BigDecimal totImp2GiustIntegrato) {
		this.totImp2GiustIntegrato = totImp2GiustIntegrato;
	}
	public BigDecimal getTotImp2GiustRestituito() {
		return totImp2GiustRestituito;
	}
	public void setTotImp2GiustRestituito(BigDecimal totImp2GiustRestituito) {
		this.totImp2GiustRestituito = totImp2GiustRestituito;
	}
	public BigDecimal getTotImpCecFattura() {
		return totImpCecFattura;
	}
	public void setTotImpCecFattura(BigDecimal totImpCecFattura) {
		this.totImpCecFattura = totImpCecFattura;
	}
	public BigDecimal getTotImpCecPafFatt() {
		return totImpCecPafFatt;
	}
	public void setTotImpCecPafFatt(BigDecimal totImpCecPafFatt) {
		this.totImpCecPafFatt = totImpCecPafFatt;
	}
	public BigDecimal getTotCec() {
		return totCec;
	}
	public void setTotCec(BigDecimal totCec) {
		this.totCec = totCec;
	}
	
	public BigDecimal getTotaleMovimenti() {
		return BigDecimalUtil.sum(carteNonReg.getImporto(), impPredoc.getImporto(), docNonLiq.getImporto(), totCec, impLiq.getImporto());
	}
	public BigDecimal getNumeroMovimento() {
		return numeroMovimento;
	}
	public void setNumeroMovimento(BigDecimal numeroMovimento) {
		this.numeroMovimento = numeroMovimento;
	}
	public int getAnnoMovimento() {
		return annoMovimento;
	}
	public void setAnnoMovimento(int annoMovimento) {
		this.annoMovimento = annoMovimento;
	}
	public int getAnnoBilancio() {
		return annoBilancio;
	}
	public void setAnnoBilancio(int annoBilancio) {
		this.annoBilancio = annoBilancio;
	}
	/**
	 * @return the strutturaCompetente
	 */
	public StrutturaAmministrativoContabile getStrutturaCompetente() {
		return strutturaCompetente;
	}
	/**
	 * @param strutturaCompetente the strutturaCompetente to set
	 */
	public void setStrutturaCompetente(StrutturaAmministrativoContabile strutturaCompetente) {
		this.strutturaCompetente = strutturaCompetente;
	}
	
}
