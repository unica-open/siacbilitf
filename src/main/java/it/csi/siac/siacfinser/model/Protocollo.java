/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * Protocollo
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Protocollo extends EntitaEnte {

	private static final long serialVersionUID = 6158347134670674499L;

	private Date dataProtocollo;
	private int numero;

	@XmlSchemaType(name = "date")
	public Date getDataProtocollo() {
		return dataProtocollo;
	}

	public void setDataProtocollo(Date dataProtocollo) {
		this.dataProtocollo = dataProtocollo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
