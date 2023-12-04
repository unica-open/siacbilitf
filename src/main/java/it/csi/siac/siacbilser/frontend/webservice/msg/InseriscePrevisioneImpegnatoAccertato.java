/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.PrevisioneImpegnatoAccertato;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo
 * BIL.CapitoloEntrataGestioneService.inserisceCapitoloDiEntrataGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InseriscePrevisioneImpegnatoAccertato extends ServiceRequest {

	private PrevisioneImpegnatoAccertato previsioneImpegnatoAccertatoSuCapitolo = new PrevisioneImpegnatoAccertato();

	public PrevisioneImpegnatoAccertato getPrevisioneImpegnatoAccertatoSuCapitolo() {
		return previsioneImpegnatoAccertatoSuCapitolo;
	}

	public void setPrevisioneImpegnatoAccertatoSuCapitolo(PrevisioneImpegnatoAccertato previsioneImpegnatoAccertatoSuCapitolo) {
		this.previsioneImpegnatoAccertatoSuCapitolo = previsioneImpegnatoAccertatoSuCapitolo;
	}
	

}
