/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.SedeSecondariaSoggetto;


/**
 * Risposta al metodo FIN.SoggettoService.annullaSedeInModifica()
 * 
 * @author paolos
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaSedeInModificaResponse extends ServiceResponse {
	
	private SedeSecondariaSoggetto sedeAggiornata;

	public SedeSecondariaSoggetto getSedeAggiornata() {
		return sedeAggiornata;
	}

	public void setSedeAggiornata(SedeSecondariaSoggetto sedeAggiornata) {
		this.sedeAggiornata = sedeAggiornata;
	}
	

}
