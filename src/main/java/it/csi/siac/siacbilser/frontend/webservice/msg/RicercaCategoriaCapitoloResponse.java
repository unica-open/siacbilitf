/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/**
 * 
 */
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CategoriaCapitolo;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * @author paggio
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaCategoriaCapitoloResponse extends ServiceResponse {
	
	List<CategoriaCapitolo> elencoCategoriaCapitolo = new ArrayList<CategoriaCapitolo>();

	public List<CategoriaCapitolo> getElencoCategoriaCapitolo() {
		return elencoCategoriaCapitolo;
		
	}

	public void setElencoCategoriaCapitolo(List<CategoriaCapitolo> elencoCategoriaCapitolo) {
		this.elencoCategoriaCapitolo = elencoCategoriaCapitolo;
	}

}
