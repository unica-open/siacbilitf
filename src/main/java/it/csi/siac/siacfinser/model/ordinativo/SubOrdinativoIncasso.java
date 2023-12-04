/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ordinativo;

import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class SubOrdinativoIncasso extends SubOrdinativo {


	private static final long serialVersionUID = 1L;

	private Date dataScadenza;

	private Accertamento accertamento;
	
	private SubdocumentoEntrata subDocumentoEntrata;
	
	private OrdinativoIncasso ordinativoIncasso;
	
	// private SubAccertamento subAccertamento;
	
	

	public Accertamento getAccertamento() {
		return accertamento;
	}

	/**
	 * @return the subDocumentoEntrata
	 */
	public SubdocumentoEntrata getSubDocumentoEntrata() {
		return subDocumentoEntrata;
	}

	/**
	 * @param subDocumentoEntrata the subDocumentoEntrata to set
	 */
	public void setSubDocumentoEntrata(SubdocumentoEntrata subDocumentoEntrata) {
		this.subDocumentoEntrata = subDocumentoEntrata;
	}

	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}

//	public SubAccertamento getSubAccertamento() {
//		return subAccertamento;
//	}
//
//	public void setSubAccertamento(SubAccertamento subAccertamento) {
//		this.subAccertamento = subAccertamento;
//	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public OrdinativoIncasso getOrdinativoIncasso() {
		return ordinativoIncasso;
	}

	public void setOrdinativoIncasso(OrdinativoIncasso ordinativoIncasso) {
		this.ordinativoIncasso = ordinativoIncasso;
	}
}
