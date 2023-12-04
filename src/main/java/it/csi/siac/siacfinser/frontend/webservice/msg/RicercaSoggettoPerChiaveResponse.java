/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;
import it.csi.siac.siacfinser.model.soggetto.sedesecondaria.SedeSecondariaSoggetto;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSoggettoPerChiaveResponse extends ServiceResponse{
	
	private Soggetto soggetto;
	
	private List<ModalitaPagamentoSoggetto> listaModalitaPagamentoSoggetto;
	
	private List<SedeSecondariaSoggetto>  listaSecondariaSoggetto;
	// private List<Soggetto>  listaSecondariaSoggetto;
	
	private Soggetto soggettoInModifica;

	public Soggetto getSoggetto() {
		return soggetto;
	}

	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	public List<ModalitaPagamentoSoggetto> getListaModalitaPagamentoSoggetto() {
		return listaModalitaPagamentoSoggetto;
	}

	public void setListaModalitaPagamentoSoggetto(
			List<ModalitaPagamentoSoggetto> listaModalitaPagamentoSoggetto) {
		this.listaModalitaPagamentoSoggetto = listaModalitaPagamentoSoggetto;
	}

	public List<SedeSecondariaSoggetto> getListaSecondariaSoggetto() {
		return listaSecondariaSoggetto;
	}

	public void setListaSecondariaSoggetto(
			List<SedeSecondariaSoggetto> listaSecondariaSoggetto) {
		this.listaSecondariaSoggetto = listaSecondariaSoggetto;
	}

	public Soggetto getSoggettoInModifica() {
		return soggettoInModifica;
	}

	public void setSoggettoInModifica(Soggetto soggettoInModifica) {
		this.soggettoInModifica = soggettoInModifica;
	}

}
