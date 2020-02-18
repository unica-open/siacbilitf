/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaImpegno;


/**
 * L operazione esegue una ricerca di impegni identificata sulla base dei valori passati nella maschera di ricerca specifica
 * 
 * @author GianMarco
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaImpegniGlobal extends PaginazioneRequest{

	
	private ParametroRicercaImpegno parametroRicercaImpegno;
	private Ente ente;
	
	
	public ParametroRicercaImpegno getParametroRicercaImpegno() {
		return parametroRicercaImpegno;
	}
	public void setParametroRicercaImpegno(
			ParametroRicercaImpegno parametroRicercaImpegno) {
		this.parametroRicercaImpegno = parametroRicercaImpegno;
	}
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	
	
	
}
