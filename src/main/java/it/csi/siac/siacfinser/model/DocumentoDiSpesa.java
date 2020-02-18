/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

/**
 * DocumentoDiSpesa
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class DocumentoDiSpesa extends Documento {

	private static final long serialVersionUID = 5902215917740715839L;
	private AttoDiLiquidazione attoLiqidazione;
	private List<SubDocumentoDiSpesa> subDocumento = new ArrayList<SubDocumentoDiSpesa>();

	public AttoDiLiquidazione getAttoLiqidazione() {
		return attoLiqidazione;
	}

	public void setAttoLiqidazione(AttoDiLiquidazione attoLiqidazione) {
		this.attoLiqidazione = attoLiqidazione;
	}

	public List<SubDocumentoDiSpesa> getSubDocumento() {
		return subDocumento;
	}

	public void setSubDocumento(List<SubDocumentoDiSpesa> subDocumento) {
		this.subDocumento = subDocumento;
	}

}
