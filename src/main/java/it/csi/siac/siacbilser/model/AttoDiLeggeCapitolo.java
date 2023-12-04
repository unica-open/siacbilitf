/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoDiLegge;
import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * AttoDiLeggeCapitolo
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class AttoDiLeggeCapitolo extends EntitaEnte {

	private static final long serialVersionUID = -3805423243334413883L;

	private Date dataInizioFinanz;
	private Date dataFineFinanz;
	private String descrizione;
	private String gerarchia;
	private AttoDiLegge attoDiLegge;

	public AttoDiLegge getAttoDiLegge() {
		return attoDiLegge;
	}

	public void setAttoDiLegge(AttoDiLegge attoDiLegge) {
		this.attoDiLegge = attoDiLegge;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getGerarchia() {
		return gerarchia;
	}

	public void setGerarchia(String gerarchia) {
		this.gerarchia = gerarchia;
	}

	@XmlSchemaType(name = "date")
	public Date getDataInizioFinanz() {
		return dataInizioFinanz;
	}

	public void setDataInizioFinanz(Date dataInizioFinanz) {
		this.dataInizioFinanz = dataInizioFinanz;
	}

	@XmlSchemaType(name = "date")
	public Date getDataFineFinanz() {
		return dataFineFinanz;
	}

	public void setDataFineFinanz(Date dataFineFinanz) {
		this.dataFineFinanz = dataFineFinanz;
	}

}
