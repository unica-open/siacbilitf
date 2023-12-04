/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;

/**
 * <ul>
 *     <li>contanti</li>
 *     <li>c/c bancario</li>
 * </ul>
 * 
 * In caso di cassa mista l'economo deve scegliere su quale cassa effettua
 * l'operazione altrimenti deve utilizzare scelto pre la cassa
 * 
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.12
 */


@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class ModalitaPagamentoCassa extends Codifica {

	private static final long serialVersionUID = -9148065551803493095L;
	
	private Ente ente;
	private TipoDiCassa tipoDiCassa;

	public ModalitaPagamentoCassa(){
		super();
	}
	
	public ModalitaPagamentoCassa(Codifica c) {
		super(c);
		this.setUid(c.getUid());
	}

	public ModalitaPagamentoCassa(String codice, String descrizione) {
		super(codice, descrizione);
	}

	
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	/**
	 * @return the tipoDiCassa
	 */
	public TipoDiCassa getTipoDiCassa() {
		return tipoDiCassa;
	}

	/**
	 * @param tipoDiCassa the tipoDiCassa to set
	 */
	public void setTipoDiCassa(TipoDiCassa tipoDiCassa) {
		this.tipoDiCassa = tipoDiCassa;
	}
	
}