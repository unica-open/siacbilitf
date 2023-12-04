/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ordinativo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacfin2ser.model.CausaleEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class OrdinativoIncasso extends Ordinativo {

	private static final long serialVersionUID = 1L;
	
	private static String tipoOrdinativo = "E";
	
	private CapitoloEntrataGestione capitoloEntrataGestione;

	private List<SubOrdinativoIncasso> elencoSubOrdinativiDiIncasso;
	
	private List<SubdocumentoEntrata> quote = new ArrayList<SubdocumentoEntrata>();
	
	private boolean collegatoAPagamento = false;
	
	private CausaleEntrata causale;

	/**
	 * @return the collegatoAPagamento
	 */
	public boolean isCollegatoAPagamento() {
		return collegatoAPagamento;
	}

	/**
	 * @param collegatoAPagamento the collegatoAPagamento to set
	 */
	public void setCollegatoAPagamento(boolean collegatoAPagamento) {
		this.collegatoAPagamento = collegatoAPagamento;
	}

	/**
	 * @return the quote
	 */
	public List<SubdocumentoEntrata> getQuote() {
		return quote;
	}

	/**
	 * @param quote the quote to set
	 */
	public void setQuote(List<SubdocumentoEntrata> quote) {
		this.quote = quote;
	}

	public String getTipoOrdinativo() {
		return tipoOrdinativo;
	}

	public void setTipoOrdinativo(String tipoOrdinativo) {
		OrdinativoIncasso.tipoOrdinativo = tipoOrdinativo;
	}

	public List<SubOrdinativoIncasso> getElencoSubOrdinativiDiIncasso() {
		return elencoSubOrdinativiDiIncasso;
	}

	public void setElencoSubOrdinativiDiIncasso(
			List<SubOrdinativoIncasso> elencoSubOrdinativiDiIncasso) {
		this.elencoSubOrdinativiDiIncasso = elencoSubOrdinativiDiIncasso;
	}

	public CapitoloEntrataGestione getCapitoloEntrataGestione() {
		return capitoloEntrataGestione;
	}

	public void setCapitoloEntrataGestione(
			CapitoloEntrataGestione capitoloEntrataGestione) {
		this.capitoloEntrataGestione = capitoloEntrataGestione;
	}

	public CausaleEntrata getCausale() {
		return causale;
	}

	public void setCausale(CausaleEntrata causale) {
		this.causale = causale;
	}

}
