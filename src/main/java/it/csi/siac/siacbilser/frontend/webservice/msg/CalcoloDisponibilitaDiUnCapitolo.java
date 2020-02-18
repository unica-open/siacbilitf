/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.FaseEStatoAttualeBilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.CapitoloService.calcoloDisponibilitaDiUnCapitolo()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class CalcoloDisponibilitaDiUnCapitolo extends ServiceRequest {

	private Ente ente;
	private Bilancio bilancio;
	private FaseEStatoAttualeBilancio fase;
	private int annoCapitolo;
	private int numroCapitolo;
	private String tipoDisponibilitaRichiesta;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public FaseEStatoAttualeBilancio getFase() {
		return fase;
	}

	public void setFase(FaseEStatoAttualeBilancio fase) {
		this.fase = fase;
	}

	public int getAnnoCapitolo() {
		return annoCapitolo;
	}

	public void setAnnoCapitolo(int annoCapitolo) {
		this.annoCapitolo = annoCapitolo;
	}

	public int getNumroCapitolo() {
		return numroCapitolo;
	}

	public void setNumroCapitolo(int numroCapitolo) {
		this.numroCapitolo = numroCapitolo;
	}

	public String getTipoDisponibilitaRichiesta() {
		return tipoDisponibilitaRichiesta;
	}

	public void setTipoDisponibilitaRichiesta(String tipoDisponibilitaRichiesta) {
		this.tipoDisponibilitaRichiesta = tipoDisponibilitaRichiesta;
	}

}
