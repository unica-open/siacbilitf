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
public class DettaglioImportiAccertamento extends EntitaEnte {

	private static final long serialVersionUID = -8784420145007443214L;
	
	//Riferiementi all'impegno rappresentato:
	private BigDecimal numeroMovimento;
	private int annoMovimento;
	private int annoBilancio;
	//
	
	private BigDecimal totModProv;
	
	private RiepilogoImportoNumero impPredoc;
	
	private RiepilogoImportoNumero docNonInc;
	
	private RiepilogoImportoNumero impOrd;
	
	private BigDecimal importoAttuale;

	//SIAC-6997
	private StrutturaAmministrativoContabile strutturaCompetente;
	
	
	
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

	public BigDecimal getTotaleMovimenti() {
		return BigDecimalUtil.sum(impPredoc.getImporto(), docNonInc.getImporto(), impOrd.getImporto());
	}
	
	public BigDecimal getDisponibileIncassareSoloOrd() {
		BigDecimal impAtt = BigDecimal.ZERO;
		BigDecimal totOrd = BigDecimal.ZERO;
		if(importoAttuale!=null){
			impAtt = importoAttuale;
		}
		if(impOrd!=null){
			totOrd = impOrd.getImporto();
		}
		return impAtt.subtract(totOrd);
	}
	

	public BigDecimal getTotModProv() {
		return totModProv;
	}

	public void setTotModProv(BigDecimal totModProv) {
		this.totModProv = totModProv;
	}

	public RiepilogoImportoNumero getImpPredoc() {
		return impPredoc;
	}

	public void setImpPredoc(RiepilogoImportoNumero impPredoc) {
		this.impPredoc = impPredoc;
	}

	public RiepilogoImportoNumero getDocNonInc() {
		return docNonInc;
	}

	public void setDocNonInc(RiepilogoImportoNumero docNonInc) {
		this.docNonInc = docNonInc;
	}

	public RiepilogoImportoNumero getImpOrd() {
		return impOrd;
	}

	public void setImpOrd(RiepilogoImportoNumero impOrd) {
		this.impOrd = impOrd;
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

	public BigDecimal getImportoAttuale() {
		return importoAttuale;
	}

	public void setImportoAttuale(BigDecimal importoAttuale) {
		this.importoAttuale = importoAttuale;
	}
	
}
