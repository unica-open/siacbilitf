/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;




/**
 * StrutturaAmmContabileFlatStoricizzato
 * Rappresenta il legame lo storico della struttura amministrativa
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class StrutturaAmmContabileFlatStoricizzato extends StrutturaAmministrativoContabileFlat {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date dataFineValidita;
	private Date dataModifica;
	private Date dataCancellazione;
	/**
	 * @return the dataFineValidita
	 */
	@XmlSchemaType(name = "dateTime")
	public Date getDataFineValidita() {
		return dataFineValidita;
	}
	/**
	 * @param dataFineValidita the dataFineValidita to set
	 */
	public void setDataFineValidita(Date dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}
	/**
	 * @return the dataModifica
	 */
	@XmlSchemaType(name = "dateTime")
	public Date getDataModifica() {
		return dataModifica;
	}
	/**
	 * @param dataModifica the dataModifica to set
	 */
	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}
	/**
	 * @return the dataCancellazione
	 */
	@XmlSchemaType(name = "dateTime")
	public Date getDataCancellazione() {
		return dataCancellazione;
	}
	/**
	 * @param dataCancellazione the dataCancellazione to set
	 */
	public void setDataCancellazione(Date dataCancellazione) {
		this.dataCancellazione = dataCancellazione;
	}

	
}

