/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Messaggio di risposta per leggere il tree piano dei conti partendo da una
 * codifica, versione attuale macroaggregato (uscita) o categoria (entrata) id
 * codifica
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiTreePianoDeiContiResponse extends ServiceResponse {

	private List<ElementoPianoDeiConti> treeElementoPianoDeiConti;

	public List<ElementoPianoDeiConti> getTreeElementoPianoDeiConti() {
		return treeElementoPianoDeiConti;
	}

	public void setTreeElementoPianoDeiConti(
			List<ElementoPianoDeiConti> treeElementoPianoDeiConti) {
		this.treeElementoPianoDeiConti = treeElementoPianoDeiConti;
	}

}
