/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.PrevisioneImpegnatoAccertato;
import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Richiesta al metodo
 * BIL.CapitoloEntrataGestioneService.inserisceCapitoloDiEntrataGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaPrevisioneImpegnatoAccertatoResponse extends ServiceResponse {
	
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	private PrevisioneImpegnatoAccertato previsioneImpegnatoAccertatoSuCapitolo = new PrevisioneImpegnatoAccertato();

	public PrevisioneImpegnatoAccertato getPrevisioneImpegnatoAccertatoSuCapitolo() {
		return previsioneImpegnatoAccertatoSuCapitolo;
	}

	public void setPrevisioneImpegnatoAccertatoSuCapitolo(PrevisioneImpegnatoAccertato previsioneImpegnatoAccertatoSuCapitolo) {
		this.previsioneImpegnatoAccertatoSuCapitolo = previsioneImpegnatoAccertatoSuCapitolo;
	}

	public List<Messaggio> getMessaggi() {
		return messaggi;
	}

	public void setMessaggi(List<Messaggio> messaggi) {
		this.messaggi = messaggi;
	}
	
	public void addMessaggio(Errore errore) {
		if(getMessaggi() == null) {
			setMessaggi(new ArrayList<Messaggio>());
		}
		getMessaggi().add(new Messaggio(errore.getCodice(), errore.getDescrizione()));
	}
	
	

}
