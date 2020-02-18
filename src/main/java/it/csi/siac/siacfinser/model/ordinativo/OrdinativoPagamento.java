/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ordinativo;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.codifiche.CommissioneDocumento;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class OrdinativoPagamento extends Ordinativo {

	private static final long serialVersionUID = 1L;

	private static String tipoOrdinativo = "S";

	private List<SubOrdinativoPagamento> elencoSubOrdinativiDiPagamento;

	private CommissioneDocumento commissioneDocumento;

	private CapitoloUscitaGestione capitoloUscitaGestione;
	
	private Boolean canAllegareReversali;
	
	
	//nuovi campi per siope plus:
	private String cig;

	public String getTipoOrdinativo() {
		return tipoOrdinativo;
	}

	public void setTipoOrdinativo(String tipoOrdinativo) {
		OrdinativoPagamento.tipoOrdinativo = tipoOrdinativo;
	}

	public List<SubOrdinativoPagamento> getElencoSubOrdinativiDiPagamento() {
		return elencoSubOrdinativiDiPagamento;
	}

	public void setElencoSubOrdinativiDiPagamento(List<SubOrdinativoPagamento> elencoSubOrdinativiDiPagamento) {
		this.elencoSubOrdinativiDiPagamento = elencoSubOrdinativiDiPagamento;
	}

	public CommissioneDocumento getCommissioneDocumento() {
		return commissioneDocumento;
	}

	public void setCommissioneDocumento(
			CommissioneDocumento commissioneDocumento) {
		this.commissioneDocumento = commissioneDocumento;
	}

	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
		return capitoloUscitaGestione;
	}

	public void setCapitoloUscitaGestione(CapitoloUscitaGestione capitoloUscitaGestione) {
		this.capitoloUscitaGestione = capitoloUscitaGestione;
	}

	public String getCig() {
		return cig;
	}

	public void setCig(String cig) {
		this.cig = cig;
	}

	public Boolean getCanAllegareReversali() {
		return canAllegareReversali;
	}

	public void setCanAllegareReversali(Boolean canAllegareReversali) {
		this.canAllegareReversali = canAllegareReversali;
	}

}
