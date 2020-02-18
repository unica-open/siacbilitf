/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.codifiche.TipoRelazioneSoggetto;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * Aggiorna il legame che un soggetto ha con altri soggetti censiti in archivio.
 * Il legame &eacute; dal soggetto a uno o pi&uacute; dei suoi precedenti. 
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaLegameSoggetti extends AbstractSoggettoServiceRequest {
	
	private Ente ente;
	private Soggetto soggettoCorrente;
	private Soggetto soggettoPrecedente;
	private TipoRelazioneSoggetto tipoLegame;	
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public Soggetto getSoggettoCorrente() {
		return soggettoCorrente;
	}
	public void setSoggettoCorrente(Soggetto soggettoCorrente) {
		this.soggettoCorrente = soggettoCorrente;
	}
	public Soggetto getSoggettoPrecedente() {
		return soggettoPrecedente;
	}
	public void setSoggettoPrecedente(Soggetto soggettoPrecedente) {
		this.soggettoPrecedente = soggettoPrecedente;
	}
	public TipoRelazioneSoggetto getTipoLegame() {
		return tipoLegame;
	}
	public void setTipoLegame(TipoRelazioneSoggetto tipoLegame) {
		this.tipoLegame = tipoLegame;
	}		
}
