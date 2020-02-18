/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoIncasso;

/**
 * Parametri per la ricerca dell'Ordinativo Incasso per chiave
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RicercaOrdinativoIncassoK extends RicercaOrdinativoK  {

    	private static final long serialVersionUID = -6576315117619313331L;
	
    	private OrdinativoIncasso ordinativoIncasso;
	
		public OrdinativoIncasso getOrdinativoIncasso() {
		    return ordinativoIncasso;
		}
	
		public void setOrdinativoIncasso(OrdinativoIncasso ordinativoIncasso) {
		    this.ordinativoIncasso = ordinativoIncasso;
		}
}
