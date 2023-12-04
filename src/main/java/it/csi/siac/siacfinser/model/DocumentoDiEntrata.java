/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * DocumentoDiEntrata
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class DocumentoDiEntrata extends Documento {

	private static final long serialVersionUID = 8182493797935435642L;
	private double importo;

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

}
