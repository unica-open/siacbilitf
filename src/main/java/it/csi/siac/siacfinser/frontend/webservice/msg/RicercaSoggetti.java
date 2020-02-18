/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaSoggetto;
import it.csi.siac.siacfinser.model.ric.SorgenteDatiSoggetto;


/**
 * @author andrea.colombo
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSoggetti extends PaginazioneRequest {
	
	private Ente ente;
	private String codiceAmbito;
	private ParametroRicercaSoggetto parametroRicercaSoggetto;
	private SorgenteDatiSoggetto sorgenteDatiSoggetto;

	
	public String getCodiceAmbito() {
		return codiceAmbito;
	}

	public void setCodiceAmbito(String codiceAmbito) {
		this.codiceAmbito = codiceAmbito;
	}

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public ParametroRicercaSoggetto getParametroRicercaSoggetto() {
		return parametroRicercaSoggetto;
	}

	public void setParametroRicercaSoggetto(
			ParametroRicercaSoggetto parametroRicercaSoggetto) {
		this.parametroRicercaSoggetto = parametroRicercaSoggetto;
	}

	public SorgenteDatiSoggetto getSorgenteDatiSoggetto() {
		return sorgenteDatiSoggetto;
	}

	public void setSorgenteDatiSoggetto(SorgenteDatiSoggetto sorgenteDatiSoggetto) {
		this.sorgenteDatiSoggetto = sorgenteDatiSoggetto;
	}

}
