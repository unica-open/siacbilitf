/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ElementoContoEconomico;

/**
 * Messaggio di risposta per leggere il tree piano dei conti partendo da una
 * codifica
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class LeggiTreeContoEconomicoResponse extends ServiceResponse {

	private List<ElementoContoEconomico> treeElementoContoEconomico;

	public List<ElementoContoEconomico> getTreeElementoContoEconomico() {
		return treeElementoContoEconomico;
	}

	public void setTreeElementoContoEconomico(
			List<ElementoContoEconomico> treeElementoContoEconomico) {
		this.treeElementoContoEconomico = treeElementoContoEconomico;
	}

}
