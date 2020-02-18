/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaSoggettoK;
import it.csi.siac.siacfinser.model.ric.SorgenteDatiSoggetto;

/**
 * L'operazione esegue una ricerca della sede identificata dalla chiave passata a parametro.
  * @author andrea.colombo
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSoggettoPerChiave extends AbstractSoggettoServiceRequest{
	
    private Ente ente;
    private ParametroRicercaSoggettoK parametroSoggettoK;
	private SorgenteDatiSoggetto sorgenteDatiSoggetto;

    
    
	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public ParametroRicercaSoggettoK getParametroSoggettoK() {
		return parametroSoggettoK;
	}

	public void setParametroSoggettoK(ParametroRicercaSoggettoK parametroSoggettoK) {
		this.parametroSoggettoK = parametroSoggettoK;
	}

	public SorgenteDatiSoggetto getSorgenteDatiSoggetto() {
		return sorgenteDatiSoggetto;
	}

	public void setSorgenteDatiSoggetto(SorgenteDatiSoggetto sorgenteDatiSoggetto) {
		this.sorgenteDatiSoggetto = sorgenteDatiSoggetto;
	}

	

}
