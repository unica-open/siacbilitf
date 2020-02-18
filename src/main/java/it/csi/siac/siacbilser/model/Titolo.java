/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;

/**
 * Titolo
 * 
 * @author rmontuori
 * 
 */
@XmlType(name = "titolo", namespace = BILDataDictionary.NAMESPACE)
@XmlSeeAlso({ TitoloSpesa.class, TitoloEntrata.class, Macroaggregato.class,
		TipologiaTitolo.class, CategoriaTipologiaTitolo.class })
public abstract class Titolo extends ClassificatoreGerarchico {

	private static final long serialVersionUID = -3703187143583130193L;

	public Titolo() {
		super();
	}

	public Titolo(String codice, String descrizione) {
		super(codice, descrizione);
	}

}
