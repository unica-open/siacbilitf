/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;


@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class FondoPluriennaleVincolatoEntrataCronoprogramma extends FondoPluriennaleVincolatoCronoprogramma {

	/**
	 * 
	 */
	private static final long serialVersionUID = -568064934014865770L;
	
	private TitoloSpesa titoloSpesa;
	
	public FondoPluriennaleVincolatoEntrataCronoprogramma() {
		// Costruttore vuoto
	}
	
	public FondoPluriennaleVincolatoEntrataCronoprogramma(Integer anno, /*DettaglioEntrataCronoprogramma dec*/ TitoloSpesa titoloSpesa) {
		super(anno);
		this.titoloSpesa = titoloSpesa;
	}
	
	public TitoloSpesa getTitoloSpesa() {
		return titoloSpesa;
	}

	public void setTitoloSpesa(TitoloSpesa titoloSpesa) {
		this.titoloSpesa = titoloSpesa;
	}

	@Override
	public String toString() {
		return "Entrata: "+this.getImporto()+ " FPV:"+this.getImportoFPV()+ " anno: "+ this.getAnno() 
		+ " TitoloSpesa: "+(this.getTitoloSpesa()!=null?this.getTitoloSpesa().getCodice() + "("+this.getTitoloSpesa().getUid()+")":"null");
	}
	

}
