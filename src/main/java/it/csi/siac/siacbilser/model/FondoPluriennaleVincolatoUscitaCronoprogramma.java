/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;


@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class FondoPluriennaleVincolatoUscitaCronoprogramma extends FondoPluriennaleVincolatoCronoprogramma {

	/**
	 * 
	 */
	private static final long serialVersionUID = -568064934014865770L;
	

	private Missione missione;
	private Programma programma;	
	private TitoloSpesa titoloSpesa;
	
	
	public FondoPluriennaleVincolatoUscitaCronoprogramma() {
		// Costruttore vuoto
	}
	
	public FondoPluriennaleVincolatoUscitaCronoprogramma(Integer anno, DettaglioUscitaCronoprogramma duc) {
		super(anno);
		this.missione = duc.getMissione();
		this.programma = duc.getProgramma();
		this.titoloSpesa = duc.getTitoloSpesa();
	}
	
	
	
	
	public Missione getMissione() {
		return missione;
	}
	public void setMissione(Missione missione) {
		this.missione = missione;
	}
	public Programma getProgramma() {
		return programma;
	}
	public void setProgramma(Programma programma) {
		this.programma = programma;
	}
	public TitoloSpesa getTitoloSpesa() {
		return titoloSpesa;
	}
	public void setTitoloSpesa(TitoloSpesa titoloSpesa) {
		this.titoloSpesa = titoloSpesa;
	}

	

	@Override
	public String toString() {
		return "Spesa  : "+this.getImporto()+ " FPV:"+this.getImportoFPV()+" anno: "+ this.getAnno() 
				+ " Missione: "+(this.getMissione()!=null?this.getMissione().getCodice() + "("+this.getMissione().getUid()+")":"null")
				+ " Programma: "+(this.getProgramma()!=null?this.getProgramma().getCodice() + "("+this.getProgramma().getUid()+")":"null")
				+ " TitoloSpesa: "+(this.getTitoloSpesa()!=null? this.getTitoloSpesa().getCodice() + "("+this.getTitoloSpesa().getUid()+")":"null");
	}


}
