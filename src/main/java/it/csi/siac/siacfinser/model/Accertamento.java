/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * Accertamento
 * 
 * @author fabio
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Accertamento extends AccertamentoAbstract {

	private static final long serialVersionUID = 3522968003577273122L;
	
	//SIAC-6997
	private String strutturaCompetente;
	private StrutturaAmministrativoContabile strutturaCompetenteLetta;
	

	private DettaglioImportiAccertamento dettaglioImportiAccertamento;

	public Accertamento(){
		super();
	}

	public Accertamento(MovimentoGestione movimentoGestione) {
		super(movimentoGestione);
	}

	private DettaglioImportiAccertamento getDettaglioImportiAccertamentoInstance() {
		if (dettaglioImportiAccertamento == null) {
			dettaglioImportiAccertamento = new DettaglioImportiAccertamento();
		}
		return dettaglioImportiAccertamento;
	}
	
	public void setImportoIncassato(BigDecimal importoIncassato) {
		getDettaglioImportiAccertamentoInstance().setImpOrd(new RiepilogoImportoNumero(importoIncassato));
	}
	public BigDecimal getImportoIncassato() {
		try {
			return dettaglioImportiAccertamento.getImpOrd().getImporto();
		}
		catch (NullPointerException e) {
			return null;
		}
	}	
	
	/**
	 * @return the strutturaCompetenteLetta
	 */
	public StrutturaAmministrativoContabile getStrutturaCompetenteLetta() {
		return strutturaCompetenteLetta;
	}

	/**
	 * @param strutturaCompetenteLetta the strutturaCompetenteLetta to set
	 */
	public void setStrutturaCompetenteLetta(StrutturaAmministrativoContabile strutturaCompetenteLetta) {
		this.strutturaCompetenteLetta = strutturaCompetenteLetta;
	}

	/**
	 * @return the strutturaCompetente
	 */
	public String getStrutturaCompetente() {
		return strutturaCompetente;
	}

	/**
	 * @param strutturaCompetente the strutturaCompetente to set
	 */
	public void setStrutturaCompetente(String strutturaCompetente) {
		this.strutturaCompetente = strutturaCompetente;
	}
	
	@SuppressWarnings("unchecked")
	public List<Accertamento> getDettagliPerBilancio() {
		return (List<Accertamento>) super.getDettagliPerBilancio();
		
	}	

}
