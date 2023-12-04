/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;

/**
 * <ol>
 *     <li>Rimborso spese (RI)</li>
 *     <li>Pagamento Fatture (FA)</li>
 *     <li>Anticipo spese (AS)</li>
 *     <li>Anticipo per trasferta dipendenti (AT)</li>
 *     <li>Anticipo per missione (AM)</li>
 * </ol>
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.24
 */

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class TipoRichiestaEconomale extends Codifica {

	private static final long serialVersionUID = -2884249411005107376L;
	
	private Boolean rendiconto = Boolean.FALSE;
	
	public TipoRichiestaEconomale() {
		super();
	}

	public TipoRichiestaEconomale(Codifica c) {
		super(c);
		this.setUid(c.getUid());
	}

	public TipoRichiestaEconomale(String codice, String descrizione) {
		super(codice, descrizione);
	}

	/**
	 * @return the rendiconto
	 */
	public Boolean getRendiconto() {
		return rendiconto;
	}

	/**
	 * @param rendiconto the rendiconto to set
	 */
	public void setRendiconto(Boolean rendiconto) {
		this.rendiconto = rendiconto;
	}
	
	

}