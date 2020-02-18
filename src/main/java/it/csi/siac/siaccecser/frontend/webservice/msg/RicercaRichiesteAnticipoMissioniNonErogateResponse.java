/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.RichiestaEconomale;
import it.csi.siac.siaccorser.model.ServiceResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaRichiesteAnticipoMissioniNonErogateResponse extends ServiceResponse {
	
	@XmlElements({
		@XmlElement(name="richiestaEconomale", type=RichiestaEconomale.class)
	})
	@XmlElementWrapper(name = "richiesteEconomali")
	private List<RichiestaEconomale> richiesteEconomali = new ArrayList<RichiestaEconomale>();

	/**
	 * @return the richiesteEconomali
	 */
	@XmlTransient
	public List<RichiestaEconomale> getRichiesteEconomali() {
		return richiesteEconomali;
	}

	/**
	 * @param richiesteEconomali the richiesteEconomali to set
	 */
	public void setRichiesteEconomali(List<RichiestaEconomale> richiesteEconomali) {
		// Evitiamo un errore su Sonar
//		if(richiesteEconomali==null){
//			richiesteEconomali = new ArrayList<RichiestaEconomale>();
//		}
		this.richiesteEconomali = richiesteEconomali != null ? richiesteEconomali : new ArrayList<RichiestaEconomale>();
	}
	
	/**
	 * Adds the richiesta economale.
	 *
	 * @param richiestaEconomale the richiesta economale
	 */
	public void addRichiestaEconomale(RichiestaEconomale richiestaEconomale){
		getRichiesteEconomali().add(richiestaEconomale);
	}
	
	

	

}
