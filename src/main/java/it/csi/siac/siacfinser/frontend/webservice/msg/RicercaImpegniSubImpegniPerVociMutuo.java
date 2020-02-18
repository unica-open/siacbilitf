/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaImpSub;

/**
 * Richiesta al metodo FIN.MutuoService.ricercaImpegniSubImpegni()
 * 
 * @author
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaImpegniSubImpegniPerVociMutuo extends  RicercaAttributiMovimentoGestione { 

	private Ente ente;
	private ParametroRicercaImpSub parametroRicercaImpSub;
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public ParametroRicercaImpSub getParametroRicercaImpSub() {
		return parametroRicercaImpSub;
	}
	public void setParametroRicercaImpSub(
			ParametroRicercaImpSub parametroRicercaImpSub) {
		this.parametroRicercaImpSub = parametroRicercaImpSub;
	}

}
