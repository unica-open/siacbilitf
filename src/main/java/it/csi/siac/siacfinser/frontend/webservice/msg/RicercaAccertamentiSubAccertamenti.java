/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaAccSubAcc;

/**
 * Richiesta al metodo FIN.MutuoService.ricercaImpegniSubImpegni()
 * 
 * @author
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaAccertamentiSubAccertamenti extends  RicercaAttributiMovimentoGestione { 

	private Ente ente;
	private ParametroRicercaAccSubAcc parametroRicercaAccSubAcc;
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public ParametroRicercaAccSubAcc getParametroRicercaAccSubAcc() {
		return parametroRicercaAccSubAcc;
	}
	public void setParametroRicercaAccSubAcc(
			ParametroRicercaAccSubAcc parametroRicercaAccSubAcc) {
		this.parametroRicercaAccSubAcc = parametroRicercaAccSubAcc;
	}
}
