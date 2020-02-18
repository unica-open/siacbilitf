/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * ClassificazioneCofogProgramma
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ClassificazioneCofogProgramma extends ClassificazioneCofog {

	private static final long serialVersionUID = -8488365691977040472L;

	private BigDecimal percentuale;

	public BigDecimal getPercentuale() {
		return percentuale;
	}

	public void setPercentuale(BigDecimal percentuale) {
		this.percentuale = percentuale;
	}
	
	public Date getDataFineValiditaClassificazioneCofogProgramma() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaClassificazioneCofogProgramma(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
