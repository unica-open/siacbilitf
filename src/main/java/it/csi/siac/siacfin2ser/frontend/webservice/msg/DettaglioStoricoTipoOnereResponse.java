/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CausaleEntrata;
import it.csi.siac.siacfin2ser.model.CausaleSpesa;
import it.csi.siac.siacfin2ser.model.TipoOnere;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class DettaglioStoricoTipoOnereResponse extends ServiceResponse {

	//Storico completo degli aggiornamenti
	private List<TipoOnere> tipiOnereStorico = new ArrayList<TipoOnere>(); 
	
	private List<TipoOnere> tipiOnere = new ArrayList<TipoOnere>();
	private List<CausaleEntrata> causaliEntrata = new ArrayList<CausaleEntrata>();
	private List<CausaleSpesa> causaliSpesa = new ArrayList<CausaleSpesa>();
	private List<Soggetto> soggetti = new ArrayList<Soggetto>();
	
	

	/**
	 * @return the tipiOnere
	 */
	public List<TipoOnere> getTipiOnere() {
		return tipiOnere;
	}

	/**
	 * @param tipiOnere the tipiOnere to set
	 */
	public void setTipiOnere(List<TipoOnere> tipiOnere) {
		this.tipiOnere = tipiOnere;
	}

	/**
	 * @return the tipiOnereStorico
	 */
	public List<TipoOnere> getTipiOnereStorico() {
		return tipiOnereStorico;
	}

	/**
	 * @param tipiOnereStorico the tipiOnereStorico to set
	 */
	public void setTipiOnereStorico(List<TipoOnere> tipiOnereStorico) {
		this.tipiOnereStorico = tipiOnereStorico;
	}

	/**
	 * @return the causaliEntrata
	 */
	public List<CausaleEntrata> getCausaliEntrata() {
		return causaliEntrata;
	}

	/**
	 * @param causaliEntrata the causaliEntrata to set
	 */
	public void setCausaliEntrata(List<CausaleEntrata> causaliEntrata) {
		this.causaliEntrata = causaliEntrata;
	}

	/**
	 * @return the cusaliSpesa
	 */
	public List<CausaleSpesa> getCausaliSpesa() {
		return causaliSpesa;
	}

	/**
	 * @param cusaliSpesa the cusaliSpesa to set
	 */
	public void setCausaliSpesa(List<CausaleSpesa> cusaliSpesa) {
		this.causaliSpesa = cusaliSpesa;
	}

	/**
	 * @return the soggetti
	 */
	public List<Soggetto> getSoggetti() {
		return soggetti;
	}

	/**
	 * @param soggetti the soggetti to set
	 */
	public void setSoggetti(List<Soggetto> soggetti) {
		this.soggetti = soggetti;
	}

	

	
	
	
}
