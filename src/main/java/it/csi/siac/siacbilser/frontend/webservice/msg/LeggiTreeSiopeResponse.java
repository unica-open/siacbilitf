/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.SiopeEntrata;
import it.csi.siac.siacbilser.model.SiopeSpesa;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Messaggio di risposta per leggere il tree siope
 * 
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiTreeSiopeResponse extends ServiceResponse {

	private List<SiopeEntrata> treeSiopeEntrata = new ArrayList<SiopeEntrata>();
	private List<SiopeSpesa> treeSiopeSpesa = new ArrayList<SiopeSpesa>();
	
	
	public List<SiopeEntrata> getTreeSiopeEntrata() {
		return treeSiopeEntrata;
	}

	public void setTreeSiopeEntrata(List<SiopeEntrata> treeSiopeEntrata) {
		this.treeSiopeEntrata = treeSiopeEntrata;
	}

	public List<SiopeSpesa> getTreeSiopeSpesa() {
		return treeSiopeSpesa;
	}

	public void setTreeSiopeSpesa(List<SiopeSpesa> treeSiopeSpesa) {
		this.treeSiopeSpesa = treeSiopeSpesa;
	}
	
	
	

}
