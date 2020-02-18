/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.codifiche.CodificaExtFin;
import it.csi.siac.siacfinser.model.codifiche.CodificaFin;



/**
 * Risposta al metodo FIN.SoggettoService.listeSoggetto()
 * 
 * @author paolos
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ListeGestioneSoggettoResponse extends ServiceResponse {

	
	//private List<Nazione> listaNazioni;

	//private List<NaturaGiuridica> listaNaturaGiuridica;
	
	//private List<NaturaGiuridicaSoggetto> listaGiuridicaSoggetto;
	
	//private List<ComuneNascita> listaComuni;
	
	//private List<ClasseSoggetto> listaClasseSoggetto;
	
	private List<CodificaExtFin> listaNaturaGiuridica;
	
	private List<CodificaFin> listaGiuridicaSoggetto;
	
	private List<CodificaFin> listaComuni;
	
	private List<CodificaFin> listaClasseSoggetto;
	private List<CodificaFin> listaNazioni;
	private List<CodificaFin> listaTipoIndirizzoSede;

	public List<CodificaFin> getListaTipoIndirizzoSede() {
		return listaTipoIndirizzoSede;
	}

	public void setListaTipoIndirizzoSede(List<CodificaFin> listaTipoIndirizzoSede) {
		this.listaTipoIndirizzoSede = listaTipoIndirizzoSede;
	}

	public List<CodificaFin> getListaNazioni() {
		return listaNazioni;
	}

	public void setListaNazioni(List<CodificaFin> listaNazioni) {
		this.listaNazioni = listaNazioni;
	}

	public List<CodificaExtFin> getListaNaturaGiuridica() {
		return listaNaturaGiuridica;
	}

	public void setListaNaturaGiuridica(List<CodificaExtFin> listaNaturaGiuridica) {
		this.listaNaturaGiuridica = listaNaturaGiuridica;
	}

	

	public List<CodificaFin> getListaComuni() {
		return listaComuni;
	}

	public void setListaComuni(List<CodificaFin> listaComuni) {
		this.listaComuni = listaComuni;
	}

	public List<CodificaFin> getListaClasseSoggetto() {
		return listaClasseSoggetto;
	}

	public void setListaClasseSoggetto(List<CodificaFin> listaClasseSoggetto) {
		this.listaClasseSoggetto = listaClasseSoggetto;
	}

	public List<CodificaFin> getListaGiuridicaSoggetto() {
		return listaGiuridicaSoggetto;
	}

	public void setListaGiuridicaSoggetto(List<CodificaFin> listaGiuridicaSoggetto) {
		this.listaGiuridicaSoggetto = listaGiuridicaSoggetto;
	}

	
	
	
	
	
}
