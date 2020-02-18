/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;

/**
 * Valori previsti :
 * 
 * DE - DOCUMENTO ENTRATA
 * DS - DOCUMENTO SPESA
 * OP - ORDINATIVO PAGAMENTO (MANDATO)
 * OI - ORDINATIVO INCASSO (REVERSALE)
 * I - IMPEGNO
 * A - ACCERTAMENTO
 * L - LIQUIDAZIONE
 * 
 * P - PRIMA NOTA PURA
 * EP - EPILOGATIVO
 * CO - CONTO D'ORDINE
 * @author prologicMMA
 * @version 1.0
 * @created 06-mar-2015 16.31.26
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class TipoEvento extends Codifica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2218161382396476659L;


	private Boolean spesa;
	//dovrebbe sempre essere 1
	private List<TipoCausale> listaTipoCausaleEP = new ArrayList<TipoCausale>();
	
	/**
	 * @return the spesa
	 */
	public Boolean getSpesa() {
		return spesa;
	}

	/**
	 * @param spesa the spesa to set
	 */
	public void setSpesa(Boolean spesa) {
		this.spesa = spesa;
	}


	/**
	 * @return the listaTipoCausaleEP
	 */
	public final List<TipoCausale> getListaTipoCausaleEP() {
		return listaTipoCausaleEP;
	}


	/**
	 * @param listaTipoCausaleEP the listaTipoCausaleEP to set
	 */
	public final void setListaTipoCausaleEP(List<TipoCausale> listaTipoCausaleEP) {
		this.listaTipoCausaleEP = listaTipoCausaleEP;
	}

	
	/**
	 * @return the spesa
	 */
	public boolean isTipoSpesa() {
		return spesa == null || Boolean.TRUE.equals(spesa);
	}
	
	/**
	 * @return the spesa
	 */
	public boolean isTipoEntrata() {
		return spesa == null || Boolean.FALSE.equals(spesa);
	}



}