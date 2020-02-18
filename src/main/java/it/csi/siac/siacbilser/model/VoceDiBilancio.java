/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import it.csi.siac.siaccorser.model.Entita;

/**
 * Voce di Bilancio, usato solo per TEST
 * 
 * @author alagna
 * @version $Id: $
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class VoceDiBilancio extends Entita {

	private static final long serialVersionUID = 6618873159674571806L;
	private String codice;
	private String descrizione;
	private BigInteger importo;

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public BigInteger getImporto() {
		return importo;
	}

	public void setImporto(BigInteger importo) {
		this.importo = importo;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}


}
