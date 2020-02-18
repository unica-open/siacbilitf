/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class AccertamentoDettaglioImporti extends Entita {

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
	
	public BigDecimal getTotaleMovimenti(){
		return RiepilogoImportoNumero.sommaImporti(impPredoc,docNonInc,impOrd);
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
